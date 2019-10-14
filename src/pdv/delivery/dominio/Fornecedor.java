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
public class Fornecedor {

    private Long id;
    private String nomeFantasia;
    private String rasaoSocial;
    private String cnpj;
    private String telefone1;
    private String telefone2;
    private String enderecoNumero;
    private String enderecoComplemento;
    private String enderecoBairro;
    private String enderecoCidade;
    private String enderecoEstado;
    private String enderecoPontoDeReferencia;
    private String email;
    
    public Fornecedor(){}

    public Fornecedor(Long id, String nomeFantasia, String rasaoSocial, String cnpj, String telefone1, String telefone2, String enderecoNumero, String enderecoComplemento, String enderecoBairro, String enderecoCidade, String enderecoEstado, String enderecoPontoDeReferencia, String email) {
        this.id = id;
        this.nomeFantasia = nomeFantasia;
        this.rasaoSocial = rasaoSocial;
        this.cnpj = cnpj;
        this.telefone1 = telefone1;
        this.telefone2 = telefone2;
        this.enderecoNumero = enderecoNumero;
        this.enderecoComplemento = enderecoComplemento;
        this.enderecoBairro = enderecoBairro;
        this.enderecoCidade = enderecoCidade;
        this.enderecoEstado = enderecoEstado;
        this.enderecoPontoDeReferencia = enderecoPontoDeReferencia;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getRasaoSocial() {
        return rasaoSocial;
    }

    public void setRasaoSocial(String rasaoSocial) {
        this.rasaoSocial = rasaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTelefone1() {
        return telefone1;
    }

    public void setTelefone1(String telefone1) {
        this.telefone1 = telefone1;
    }

    public String getTelefone2() {
        return telefone2;
    }

    public void setTelefone2(String telefone2) {
        this.telefone2 = telefone2;
    }

    public String getEnderecoNumero() {
        return enderecoNumero;
    }

    public void setEnderecoNumero(String enderecoNumero) {
        this.enderecoNumero = enderecoNumero;
    }

    public String getEnderecoComplemento() {
        return enderecoComplemento;
    }

    public void setEnderecoComplemento(String enderecoComplemento) {
        this.enderecoComplemento = enderecoComplemento;
    }

    public String getEnderecoBairro() {
        return enderecoBairro;
    }

    public void setEnderecoBairro(String enderecoBairro) {
        this.enderecoBairro = enderecoBairro;
    }

    public String getEnderecoCidade() {
        return enderecoCidade;
    }

    public void setEnderecoCidade(String enderecoCidade) {
        this.enderecoCidade = enderecoCidade;
    }

    public String getEnderecoEstado() {
        return enderecoEstado;
    }

    public void setEnderecoEstado(String enderecoEstado) {
        this.enderecoEstado = enderecoEstado;
    }

    public String getEnderecoPontoDeReferencia() {
        return enderecoPontoDeReferencia;
    }

    public void setEnderecoPontoDeReferencia(String enderecoPontoDeReferencia) {
        this.enderecoPontoDeReferencia = enderecoPontoDeReferencia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
