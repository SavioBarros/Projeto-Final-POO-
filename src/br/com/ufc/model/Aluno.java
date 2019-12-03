package br.com.ufc.model;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

      private String nome;
      private int matricula;
      private String curso;
      private String cpf;
      private String telefone;
      private String dataNascimento;
      private List<Emprestimo> emprestimos = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula =  matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
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

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome = " + nome + ", matricula = " + matricula + ", curso = " 
        + curso + ", cpf = " + cpf + ", telefone = " + telefone + ", dataNascimento = " + dataNascimento + '}';
    }

    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public void setEmprestimos(List<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }   
}
