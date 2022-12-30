
package DTO;


public class ProfessoresDTO{
    private int id_professor;
    private String nome, dataNascimento, sexo, cpf, telefone, end, funcao, turno;
    private float salario;
    private int horasTrab;

    public ProfessoresDTO(int id_professor, String nome, String dataNascimento, String sexo, String cpf, String telefone, String end, String funcao, String turno, float salario, int horasTrab) {
        this.id_professor = id_professor;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.cpf = cpf;
        this.telefone = telefone;
        this.end = end;
        this.funcao = funcao;
        this.turno = turno;
        this.salario = salario;
        this.horasTrab = horasTrab;
    }

    public int getId_professor() {
        return id_professor;
    }

    public void setId_professor(int id_professor) {
        this.id_professor = id_professor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getHorasTrab() {
        return horasTrab;
    }

    public void setHorasTrab(int horasTrab) {
        this.horasTrab = horasTrab;
    }

  
    
}
