package br.unidf.DAL;

import br.unidf.DTO.ComputadorDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public final class ComputadorDAL
        extends ConexaoMySQL {

    public void incluirComputador(ComputadorDTO computador) {
        final String query = "INSERT INTO computador (comTamanhoMonitor, comVelocidade) VALUES (?, ?)";
        try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setInt(1, computador.getComTamanhoMonitor());
            ps.setInt(2, computador.getComVelocidade());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Computador salvo com sucesso");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir o novo computador");
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
            JOptionPane.showMessageDialog(null, "Busca realizada com sucesso");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar computador por ID:: " + comID);
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
            JOptionPane.showMessageDialog(null, "Erro ao buscar todos os computadores");
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
            JOptionPane.showMessageDialog(null, "Erro ao atualizar os dados do computador");
        }
    }

    public void excluirComputador(Integer comID) {
        final String query = "DELETE FROM computador WHERE comID = ?";
        try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setInt(1, comID);
            ps.execute();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar o computador de ID: " + comID);
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
            return null;
        }
    }
    
    public static void main(String[] args) {
        ComputadorDAL dal = new ComputadorDAL();
        dal.getConnection();
    }
}
