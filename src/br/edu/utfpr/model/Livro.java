package br.edu.utfpr.model;

//Classe para representar objeto do tipo livro
public class Livro {
    // Atributos desse objeto
    String titulo;
    String autor;
    int numeroPaginas;
    int anoPublicacao;

    //Método construtor, usado para criar um objeto livro
    public Livro(String titulo, String autor, int numeroPaginas, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.anoPublicacao = anoPublicacao;
    }

    // exemplo de método
    public int verificaSeculo() {
        return anoPublicacao / 100 + 1;
    }

    //
    public void imprimirLivro() {
        System.out.println("Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numeroPaginas=" + numeroPaginas +
                ", anoPublicacao=" + anoPublicacao +
                "}");
    }
}
