package br.com.ufc.dao;

import br.com.ufc.exception.LJCException;
import br.com.ufc.exception.LNEException;
import br.com.ufc.model.Livros;
import java.util.ArrayList;
import java.util.List;

public class BibliotecariaDAO {
    
    private static List<Livros> livros = new ArrayList<Livros>();
    
    public void addLivros (Livros livro) throws LJCException{
        
        /* verifica se o livro foi adicinado, se ele ja estiver sido ele vai para a tela
           de exceção, se não ele adiciona
        */
        try{
            pesquisar(livro.getIsbn());
            throw new LJCException();
            
        }catch(LNEException ex){
            
            livros.add(livro);
        }
    }
    
    public void removeLivros (int ISBN) throws LNEException{
        
        //para remover ele verifia se na lista se há livro, se tiver ele remove 
        livros.remove(pesquisar(ISBN));
    }
    
    public List<Livros> retornarLivros() {
        
        return livros;
    }
    
    public List<Livros> disponiveis() {
        
        //funcao que verifica se os livros estao emprestados
        
        List<Livros> disponiveis = new ArrayList<Livros>();
        
        //se o livro nao estiver emprestado ele adiciona como disponivel
        for(Livros lvr : livros){
            if(lvr.getEmprestimo() == null) {
                disponiveis.add(lvr);
                
            }
            
        }
        
        return disponiveis;
    }
    
    public List<Livros> emprestados() {
        
        List<Livros> emprestados = new ArrayList<Livros>();
        //se o emprestimo nao estiver vazio, entao o livro esta emprestado
        for(Livros lvr : livros){
            if(lvr.getEmprestimo()!= null) {
                emprestados.add(lvr);
            }
            
        }
        
        return emprestados;
    }
    
    public Livros pesquisarTitulo(String Titulo) throws LNEException{
        
        for(Livros l : livros){
           
           if(l.getTituloLivro().equals(Titulo)) return l;
       }
        
       throw new LNEException();
    }
    
    public Livros pesquisar(int ISBN) throws LNEException{
        
       for(Livros l : livros){
           
           if(l.getIsbn() == ISBN) return l;
       }
        
        throw new LNEException();
        
    }
}
