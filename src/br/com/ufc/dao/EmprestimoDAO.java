
package br.com.ufc.dao;

import br.com.ufc.exception.ENEException;
import br.com.ufc.exception.EJCException;
import br.com.ufc.exception.EJRException;
import br.com.ufc.exception.LLUException;
import br.com.ufc.model.Emprestimo;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author savio
 */
public class EmprestimoDAO {
    
    private static List<Emprestimo> emprestimos = new ArrayList<>();
    
    public void adicionar(Emprestimo emprestimo) throws ENEException, LLUException, EJCException {
        
        if(emprestimo.getAluno().getEmprestimos().size() == 4) {
            throw new LLUException();
        } else if (emprestimo.getLivro().getEmprestimo() != null) {
            throw new EJCException();
        }
        
        else {
            
            try {
            Emprestimo e = buscarPorId(emprestimo.getId());
            throw new ENEException();
        } catch (ENEException ex) {
            emprestimo.getAluno().getEmprestimos().add(emprestimo);
            emprestimo.getLivro().setEmprestimo(emprestimo);
            emprestimos.add(emprestimo);
        }
    }
    }
    
    public void remover(int id) throws ENEException {
        try {
            Emprestimo e = buscarPorId(id);
            emprestimos.remove(e);
        } catch (ENEException ex) {
            throw new ENEException();
        }
    }
    
    public List<Emprestimo> mostrarTodos() {
        return emprestimos;
    }
    
    public Emprestimo buscarPorId(int id) throws ENEException {
        for(Emprestimo e : emprestimos) {
            if(e.getId() == id) return e;
        }
        throw new ENEException();
    }
    
    public void renovarEmprestimo(Emprestimo emprestimo) throws EJRException{
        
        if(!emprestimo.isRenovacao()) {
            emprestimo.setRenovacao(true);
            Date date = emprestimo.getDataDevolucao();
            date.setDate(date.getDate() + 7);
            emprestimo.setDataDevolucao(date);
        } else 
            throw new EJRException();
    }
}
