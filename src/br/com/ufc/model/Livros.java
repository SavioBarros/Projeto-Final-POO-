package br.com.ufc.model;


public class Livros {
    
        private String tituloLivro;
        private String autor;
        private int isbn;
        private String descricao;
        private Emprestimo emprestimo;

    public String getTituloLivro() {
        return tituloLivro;
    }

    public void setTituloLivro(String tituloLivro) {
        this.tituloLivro = tituloLivro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Emprestimo getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(Emprestimo emprestimo) {
        this.emprestimo = emprestimo;
    }

    
    
    @Override
    public String toString() {
        return "Livros{" + "tituloLivro = " + tituloLivro + ", autor = " + autor + ", isbn = " + isbn + ", descricao = " + descricao + '}';
    }
    
    
        
}
