package br.unidf.BLL;

import br.unidf.DTO.ComputadorDTO;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ComputarModel
        extends AbstractTableModel {

    private final List<ComputadorDTO> computadorDTOs;
    private final String[] colunas = {"ID", "Tamanho do Monitor", "Velocidade"};

    public ComputarModel(List<ComputadorDTO> computadorDTOs) {
        this.computadorDTOs = computadorDTOs;
    }
    
    
    @Override
    public int getRowCount() {
        return this.computadorDTOs.size();
    }

    @Override
    public int getColumnCount() {
        return this.colunas.length;
    }

    @Override
    public String getColumnName(int column) {
        return this.colunas[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        final ComputadorDTO dado = this.computadorDTOs.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return dado.getComId();
            case 1:
                return dado.getComTamanhoMonitor();
            case 2:
                return dado.getComVelocidade();
            default:
                return null;
        }
    }

}
