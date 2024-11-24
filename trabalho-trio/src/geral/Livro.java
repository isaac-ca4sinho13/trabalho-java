package geral;

public class Livro extends Obra {
    private String autor_a;
    private String qtdPaginas;

    public Livro(String nome, String paisOrigem, String genero, String classificacaoIndicativa, String qtdPaginas,String autor_a){
        super(nome, paisOrigem, genero,classificacaoIndicativa);

        this.qtdPaginas = qtdPaginas;
        this.autor_a = autor_a;
    }

    public String getAutor_a() {
        return autor_a;
    }

    public void setAutor_a(String autor_a) {
        this.autor_a = autor_a;
    }

    public String getQtdPaginas() {
        return qtdPaginas;
    }

    public void setqtdPaginas(String qtdPaginas) {
        this.qtdPaginas = qtdPaginas;
    }

    public void imprimirInformacoes() {
        System.out.println("Título: " + getNome());
        System.out.println("País de origem: " + getPaisOrigem());
        System.out.println("genero: " + getGenero());
        System.out.println("Classificação indicativa: " + getClassificacaoIndicativa());
        System.out.println("Autor: " + getAutor_a());
        System.out.println("Número de Páginas: " + getQtdPaginas());
        System.out.println("---------//--------//---------");
    }

}
