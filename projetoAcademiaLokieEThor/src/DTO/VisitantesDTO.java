
package DTO;

public class VisitantesDTO {
    private int id_visitante;
    private String nome, datanascimento, telefone, cpf, sexo, endereco;
    private int valordiaria;

    public VisitantesDTO(int id_visitante, String nome, String datanascimento, String telefone, String cpf, String sexo, String endereco, int valordiaria) {
        this.id_visitante = id_visitante;
        this.nome = nome;
        this.datanascimento = datanascimento;
        this.telefone = telefone;
        this.cpf = cpf;
        this.sexo = sexo;
        this.endereco = endereco;
        this.valordiaria = valordiaria;
    }

    public int getId_visitante() {
        return id_visitante;
    }

    public void setId_visitante(int id_visitante) {
        this.id_visitante = id_visitante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(String datanascimento) {
        this.datanascimento = datanascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getValordiaria() {
        return valordiaria;
    }

    public void setValordiaria(int valordiaria) {
        this.valordiaria = valordiaria;
    }
    
    
    
}
