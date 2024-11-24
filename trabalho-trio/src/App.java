import geral.Livro;
import geral.Filme;
import java.util.ArrayList;
import java.util.Scanner;

/*criar código que solicite os dados para cadastro de ao menos 3 instâncias de cada classe,
 e que posteriormente realize a impressão de ao menos 4 informações de cada uma das instâncias */
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        ArrayList <Livro>listaLivros = new ArrayList<>();
        ArrayList <Filme> listaFilmes = new ArrayList<>();

        for(int i = 1;i<=3;i++){
            
            System.out.printf("insira o nome do livro %s: \n",i);
            String nome = scanner.nextLine();

            System.out.printf("insira o país de origem do livro %s: \n",i);
            String pais = scanner.nextLine();

            System.out.printf("insira o genero do livro %s: \n",i);
            String genero = scanner.nextLine();

            System.out.printf("insira a classificaçao indicativa do livro %s: \n",i);
            String classificacao = scanner.nextLine();

            System.out.printf("insira a quantidade de páginas do livro %s: \n",i);
            String qtdPaginas = scanner.nextLine();

            System.out.printf("insira o/a autor/a do livro %s: \n",i);
            String autor_a = scanner.nextLine();

            System.out.println("---------//--------//---------");
            
            listaLivros.add(new Livro(nome, pais, genero, classificacao, qtdPaginas, autor_a));
        

            
                System.out.printf("insira o nome do filme %s: \n",i);
            String nome_filme = scanner.nextLine();

            System.out.printf("insira o país de origem do filme %s: \n",i);
            String pais_filme = scanner.nextLine();

            System.out.printf("insira o genero do filme %s: \n",i);
            String genero_filme = scanner.nextLine();

            System.out.printf("insira a classificaçao indicativa do filme %s: \n",i);
            String classificacao_filme = scanner.nextLine();

            System.out.printf("insira o faturamento do filme %s: \n",i);
            String faturamneto = scanner.nextLine();

            System.out.printf("insira o/a diretor/a do filme %s: \n",i);
            String diretor_a = scanner.nextLine();

            System.out.printf("insira o estúdio do filme %s: \n",i);
            String estudio = scanner.nextLine();

            listaFilmes.add(new Filme(nome_filme, pais_filme, genero_filme, classificacao_filme, faturamneto, diretor_a, estudio));


            
            

        }
        for (Livro livro : listaLivros){
            livro.imprimirInformacoes();
            System.out.println();
        }
        for (Filme filme : listaFilmes){
            filme.imprimirInformacoes();
            System.out.println();
        }
    }
}
