
package DTO;


public class FuncionariosDTO {
    private String nome; 
    private String cpf;
    private String end;
    private String sexo;
    private String dataNascimento;
    private String telefone;
    private String rg;
    private int id_funcionario;
    private float salario; 
    private String funcao;
    private String celular;
    private String estadocivil;
    private String email;
    private String dataadmissao;
    private String tipo;
    private String turno;

    public FuncionariosDTO(String nome, String cpf, String end, String sexo, String dataNascimento, String telefone, String rg, int id_funcionario, float salario, String funcao, String celular, String estadocivil, String email, String dataadmissao, String tipo, String turno) {
        this.nome = nome;
        this.cpf = cpf;
        this.end = end;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.rg = rg;
        this.id_funcionario = id_funcionario;
        this.salario = salario;
        this.funcao = funcao;
        this.celular = celular;
        this.estadocivil = estadocivil;
        this.email = email;
        this.dataadmissao = dataadmissao;
        this.tipo = tipo;
        this.turno = turno;
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

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public int getId_funcionario() {
        return id_funcionario;
    }

    public void setId_funcionario(int id_funcionario) {
        this.id_funcionario = id_funcionario;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(String estadocivil) {
        this.estadocivil = estadocivil;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataadmissao() {
        return dataadmissao;
    }

    public void setDataadmissao(String dataadmissao) {
        this.dataadmissao = dataadmissao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    
    
}
