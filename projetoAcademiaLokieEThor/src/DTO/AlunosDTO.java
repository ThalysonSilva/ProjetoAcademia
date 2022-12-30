package DTO;

public class AlunosDTO {
    private String nome;
    private String cpf;
    private String end;
    private String sexo;
    private String dataNascimento;
    private String telefone;
    private int mensalidade;
    private int multa;
    private int id_aluno;
    private String modalidade;
    private String datCadastro;
    private String situacao;

    public AlunosDTO(String nome, String cpf, String end, String sexo, String dataNascimento, String telefone, int mensalidade, int multa, int id_aluno, String modalidade, String datCadastro, String situacao) {
        this.nome = nome;
        this.cpf = cpf;
        this.end = end;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.mensalidade = mensalidade;
        this.multa = multa;
        this.id_aluno = id_aluno;
        this.modalidade = modalidade;
        this.datCadastro = datCadastro;
        this.situacao = situacao;
        this.multa = multa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(int mensalidade) {
        this.mensalidade = mensalidade;
    }

    public int getMulta() {
        return multa;
    }

    public void setMulta(int multa) {
        this.multa = multa;
    }

    public int getId_aluno() {
        return id_aluno;
    }

    public void setId_aluno(int id_aluno) {
        this.id_aluno = id_aluno;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public String getDatCadastro() {
        return datCadastro;
    }

    public void setDatCadastro(String datCadastro) {
        this.datCadastro = datCadastro;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

   

}
