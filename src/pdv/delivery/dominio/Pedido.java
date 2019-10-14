/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdv.delivery.dominio;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;

/**
 *
 * @author roberto
 */
public class Pedido {
    private Long id;
    private Cliente cliente;
    private Usuario usuario;
    private Vendedor vendedor;
    private ArrayList<ItenDoPedido> itensDoPedido;
    private java.sql.Date data;
    private java.sql.Time hora;
    
    public Pedido(){
    }

    public Pedido(Long id, Cliente cliente, Usuario usuario, Vendedor vendedor, ArrayList<ItenDoPedido> itensDoPedido, Date data, Time hora) {
        this.id = id;
        this.cliente = cliente;
        this.usuario = usuario;
        this.vendedor = vendedor;
        this.itensDoPedido = itensDoPedido;
        this.data = data;
        this.hora = hora;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public ArrayList<ItenDoPedido> getItensDoPedido() {
        return itensDoPedido;
    }

    public void setItensDoPedido(ArrayList<ItenDoPedido> itensDoPedido) {
        this.itensDoPedido = itensDoPedido;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }
    
    
}
