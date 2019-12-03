package br.com.ufc.dao;

import br.com.ufc.exception.AJCException;
import br.com.ufc.exception.ANEException;
import br.com.ufc.model.Aluno;
import java.util.ArrayList;
import java.util.List;

public class BibliotecariaDAOAluno {
    
    private static List<Aluno> alunos = new ArrayList<Aluno>();
    
    public void addAluno (Aluno aluno) throws AJCException{
        
        try {
            
            buscarPorMatricula(aluno.getMatricula());
            throw new AJCException();
            
        }catch (ANEException ex) {
            alunos.add(aluno);
        }
    }
    
    public void removeAluno(int matricula) throws ANEException{
        alunos.remove(buscarPorMatricula(matricula));
        
    }
    
    public List<Aluno> retornarAluno(){
        
        return alunos;
    
    }
    
    public Aluno buscarPorMatricula(int matricula) throws ANEException{
        for(Aluno a : alunos) {
            if(a.getMatricula() == matricula) return a;
        }
        throw new ANEException();
    }
    
    public void mostrar(){
        
        for(int i = 0; i < alunos.size();i++){
            
            System.out.println(alunos.get(i));
        }
    }
    
}