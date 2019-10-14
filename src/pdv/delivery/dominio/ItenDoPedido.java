/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdv.delivery.dominio;

/**
 *
 * @author roberto
 */
public class ItenDoPedido {
    private Long id;
    private Produto produto;
    private Integer quantidade;
    private Float valor;  
    
    public ItenDoPedido(){

    }

    public ItenDoPedido(Long id, Produto produto, Integer quantidade, Float valor) {
        this.id = id;
        this.produto = produto;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }
    
    
}
