package br.com.ada.itau950.locadora.entidades;

public class PessoaJurica extends Pessoa {

    private String cnpj;
    private String razaoSocial;

    public boolean validarCpf() {
        //validar cpf
        return true;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

}
