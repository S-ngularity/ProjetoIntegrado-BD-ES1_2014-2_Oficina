/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oficina.classes;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class OrdemDeServico
{
    private int    codigoOs;
    private String placaCarro;
    private String cpfCliente;
    private int codCliente;
    private String kmEntrada, kmSaida;
    private String dataInicio, dataFim;
    private String horaInicio, horaFim;
    private String estado;
    private String valorTotal;
    public List<Servico> servicos;
    
    
    public OrdemDeServico()
    {
        servicos = new LinkedList<>();
    }

    /**
     * @return the codigoOs
     */
    public int getCodigoOs()
    {
        return codigoOs;
    }

    /**
     * @param codigo the codigoOs to set
     */
    public void setCodigoOs(int codigo)
    {
        this.codigoOs = codigo;
    }

    /**
     * @return the kmEntrada
     */
    public String getKmEntrada()
    {
        return kmEntrada;
    }

    /**
     * @param kmEntrada the kmEntrada to set
     */
    public void setKmEntrada(String kmEntrada)
    {
        this.kmEntrada = kmEntrada;
    }

    /**
     * @return the kmSaida
     */
    public String getKmSaida()
    {
        return kmSaida;
    }

    /**
     * @param kmSaida the kmSaida to set
     */
    public void setKmSaida(String kmSaida)
    {
        this.kmSaida = kmSaida;
    }

    /**
     * @return the horaInicio
     */
    public String getHoraInicio()
    {
        return horaInicio;
    }

    /**
     * @param horaInicio the horaInicio to set
     */
    public void setHoraInicio(String horaInicio)
    {
        this.horaInicio = horaInicio;
    }

    /**
     * @return the horaFim
     */
    public String getHoraFim()
    {
        return horaFim;
    }

    /**
     * @param horaFim the horaFim to set
     */
    public void setHoraFim(String horaFim)
    {
        this.horaFim = horaFim;
    }

    /**
     * @param tipo the tipo to set
     */
  
    /**
     * @return the estado
     */
    public String getEstado()
    {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado)
    {
        this.estado = estado;
    }

    /**
     * @return the placaCarro
     */
    public String getPlacaCarro()
    {
        return placaCarro;
    }

    /**
     * @param placaCarro the placaCarro to set
     */
    public void setPlacaCarro(String placaCarro)
    {
        this.placaCarro = placaCarro;
    }

    /**
     * @return the codCliente
     */
    public String getCpfCliente()
    {
        return cpfCliente;
    }

    /**
     * @param codCliente the codCliente to set
     */
    public void setCpfCliente(String cpfCliente)
    {
        this.cpfCliente = cpfCliente;
    }

    /**
     * @return the dataInicio
     */
    public String getDataInicio()
    {
        return dataInicio;
    }

    /**
     * @param dataInicio the dataInicio to set
     */
    public void setDataInicio(String dataInicio)
    {
        this.dataInicio = dataInicio;
    }

    /**
     * @return the dataFim
     */
    public String getDataFim()
    {
        return dataFim;
    }

    /**
     * @param dataFim the dataFim to set
     */
    public void setDataFim(String dataFim)
    {
        this.dataFim = dataFim;
    }
    
    public String getValorTotal(){
        return this.valorTotal;
    }
    
    public void setValorTotal(String valorTotal){
        this.valorTotal = valorTotal;
    }
    
    public int getCodigoCliente(){
        return this.codCliente;
    }
    
    public void setCodCliente(int codigo){
        this.codCliente = codigo;
    }
}
