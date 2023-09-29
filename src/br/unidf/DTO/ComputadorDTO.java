/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unidf.DTO;

/**
 *
 * @author profe
 */
public class ComputadorDTO
{
    private Integer comId;
    private Integer comTamanhoMonitor;
    private Integer comVelocidade;

    public ComputadorDTO() {
    }

    public ComputadorDTO(Integer comId, Integer comTamanhoMonitor, Integer comVelocidade) {
        this.comId = comId;
        this.comTamanhoMonitor = comTamanhoMonitor;
        this.comVelocidade = comVelocidade;
    }

    public Integer getComId() {
        return comId;
    }

    public void setComId(Integer comId) {
        this.comId = comId;
    }

    public Integer getComTamanhoMonitor() {
        return comTamanhoMonitor;
    }

    public void setComTamanhoMonitor(Integer comTamanhoMonitor) {
        this.comTamanhoMonitor = comTamanhoMonitor;
    }

    public Integer getComVelocidade() {
        return comVelocidade;
    }

    public void setComVelocidade(Integer comVelocidade) {
        this.comVelocidade = comVelocidade;
    }
    
}
