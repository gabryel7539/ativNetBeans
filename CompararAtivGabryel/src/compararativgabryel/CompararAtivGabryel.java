/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package compararativgabryel;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class CompararAtivGabryel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner scanner = new Scanner(System.in);
        
        // Informações pessoais
        String meuNome = "Gabryel";
        int minhaIdade = 17;
        double meuPeso = 60.0;
        double minhaAltura = 1.72;
        String minhaSerieFavorita = "La Casa";
        String minhaMusicaFavorita = "Regras da loja";
        String meuJogoFavorito = "Valorant";

        // Quantidade de características iguais
        int caracteristicasIguais = 0;

        // Leitura das informações da pessoa
        System.out.print("Digite o nome da pessoa: ");
        String nomePessoa = scanner.nextLine();
        System.out.print("Digite a idade da pessoa: ");
        int idadePessoa = scanner.nextInt();
        System.out.print("Digite o peso da pessoa (em kg): ");
        double pesoPessoa = scanner.nextDouble();
        System.out.print("Digite a altura da pessoa (em metros): ");
        double alturaPessoa = scanner.nextDouble();
        scanner.nextLine(); // Consome a quebra de linha
        System.out.print("Digite a série favorita da pessoa: ");
        String seriePessoa = scanner.nextLine();
        System.out.print("Digite a música favorita da pessoa: ");
        String musicaPessoa = scanner.nextLine();
        System.out.print("Digite o jogo favorito da pessoa: ");
        String jogoPessoa = scanner.nextLine();

        // Verificação e Comparação das informações da pessoa
        
        if (nomePessoa.equalsIgnoreCase(meuNome)) {
            System.out.println("Pessoa com nome igual.");
            caracteristicasIguais++;
        } else {
            System.out.println("Pessoa com nome diferente.");
        }
        if (idadePessoa == minhaIdade) {
            System.out.println("Idade igual.");
            caracteristicasIguais++;
        } else {
            System.out.println("Idade diferente.");
        }
        if (pesoPessoa == meuPeso) {
            System.out.println("Peso igual.");
            caracteristicasIguais++;
        } else {
            System.out.println("Peso diferente.");
        }
        if (alturaPessoa == minhaAltura) {
            System.out.println("Altura igual.");
            caracteristicasIguais++;
        } else {
            System.out.println("Altura diferente.");
        }
        if (seriePessoa.equalsIgnoreCase(minhaSerieFavorita)) {
            System.out.println("Série favorita igual.");
            caracteristicasIguais++;
        } else {
            System.out.println("Série favorita diferente.");
        }
        if (musicaPessoa.equalsIgnoreCase(minhaMusicaFavorita)) {
            System.out.println("Música favorita igual.");
            caracteristicasIguais++;
        } else {
            System.out.println("Música favorita diferente.");
        }
        if (jogoPessoa.equalsIgnoreCase(meuJogoFavorito)) {
            System.out.println("Jogo favorito igual.");
            caracteristicasIguais++;
 
        } else {
            System.out.println("Jogo favorito diferente.");
        }
        if (caracteristicasIguais >= 3) {
            System.out.println("Esta pessoa é bem parecida comigo!");
        } else {
            System.out.println("Esta pessoa tem algumas diferenças.");
  }
 }   
}

