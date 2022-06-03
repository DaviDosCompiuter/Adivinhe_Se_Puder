import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.io.*;

public class Davi {
  public static void main (String[] args) throws IOException {
    Scanner in = new Scanner(System.in);
    String palpite;
    int tamanhoPalavra;
    int tentativas;
    System.out.println("Davi Juvêncio\n");
    System.out.println("Projeto:\n");
    System.out.println("Adivinhe Se Puder!\n");
    System.out.print("Digite o Tamanho da Palavra: ");
    tamanhoPalavra = in.nextInt();
    while (tamanhoPalavra < 2 || tamanhoPalavra > 23){
      System.out.print("Digite o Tamanho Entre 2 e 23 da Palavra: ");
      tamanhoPalavra = in.nextInt();
    }
    System.out.print("Digite a Quantidade de Tentativas: ");
    tentativas = in.nextInt();
    Wordle W = new Wordle(tamanhoPalavra,tentativas);
    while (W.repeat(tentativas)) {
      System.out.print("Digite sua Palavra: ");
      palpite = in.next();
      while (! W.palpiteValido(palpite)) {
        System.out.print("Não é uma palavra de "+tamanhoPalavra+" letras válida.\nDigite sua Palavra: ");
        palpite = in.next();
      }
      W.palpiteWord(palpite);
      W.printTabela(tentativas);
      W.printKeyboard();
      W.printTabela(tentativas);
    }
    W.endGame();
  }
}