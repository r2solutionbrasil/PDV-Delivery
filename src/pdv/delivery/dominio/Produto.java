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
public class Produto {
    private Long id;
    private String descricao;
    private Fornecedor fornecedor;
    private CategoriaDeProduto categoriaDeProduto;
    private Float precoDeCompra;
    private Float precoDeVenda;
}
