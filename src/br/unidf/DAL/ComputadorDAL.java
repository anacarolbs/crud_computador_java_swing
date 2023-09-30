package br.unidf.DAL;

import br.unidf.DTO.ComputadorDTO;
import static br.unidf.utils.MessageUtil.showMessage;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public final class ComputadorDAL
        extends ConexaoMySQL {

    public void incluirComputador(ComputadorDTO computador) {
        final String query = "INSERT INTO computador (comTamanhoMonitor, comVelocidade) VALUES (?, ?)";
        try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setInt(1, computador.getComTamanhoMonitor());
            ps.setInt(2, computador.getComVelocidade());
            ps.executeUpdate();
            showMessage("Computador salvo com sucesso");
        } catch (Exception ex) {
            showMessage( "Erro ao inserir o novo computador");
        }
    }

    public ComputadorDTO selecionarComputadorPorID(Integer comID) {
        final String query = "SELECT * FROM computador WHERE comID = ?";
        try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setInt(1, comID);
            final ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return newInstance(rs);
            }
        } catch (Exception ex) {
            showMessage("Erro ao buscar computador por ID:: " + comID);
        }
        return null;
    }

    public List<ComputadorDTO> selecionarListaComputadores() {
        final String query = "SELECT * FROM computador ORDER BY comID";
        try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(query)) {
            final ResultSet rs = ps.executeQuery();
            final List<ComputadorDTO> listaClientes = new ArrayList();
            while (rs.next()) {
                ComputadorDTO computadorDTO = newInstance(rs);
                listaClientes.add(computadorDTO);
            }
            return listaClientes;
        } catch (Exception ex) {
            showMessage( "Erro ao buscar todos os computadores");
            return new ArrayList<>();
        }
    }

    public void alterarComputador(ComputadorDTO computador) {
        final String query = "UPDATE computador SET comTamanhoMonitor = ?, comVelocidade = ? WHERE comID = ?";
        try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setInt(1, computador.getComTamanhoMonitor());
            ps.setInt(2, computador.getComVelocidade());
            ps.setInt(3, computador.getComId());
            ps.execute();
        } catch (Exception ex) {
            showMessage("Erro ao atualizar os dados do computador");
        }
    }

    public void excluirComputador(Integer comID) {
        final String query = "DELETE FROM computador WHERE comID = ?";
        try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setInt(1, comID);
            ps.execute();
        } catch (Exception ex) {
            showMessage("Erro ao deletar o computador de ID: " + comID);
        }
    }

    private static ComputadorDTO newInstance(ResultSet rs) {
        try {
            ComputadorDTO computadorDTO = new ComputadorDTO();
            computadorDTO.setComId(rs.getInt("comID"));
            computadorDTO.setComTamanhoMonitor(rs.getInt("comTamanhoMonitor"));
            computadorDTO.setComVelocidade(rs.getInt("comVelocidade"));
            return computadorDTO;
        } catch (SQLException ex) {
            showMessage("Erro durante o parse dos dados");
            return null;
        }
    }
    
    public static void main(String[] args) {
        ComputadorDAL dal = new ComputadorDAL();
        dal.getConnection();
    }
}
