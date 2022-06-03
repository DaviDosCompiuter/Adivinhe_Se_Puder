import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.io.*;

public class Wordle {
  private ArrayList <String> listaPalavras;
  private Scanner in, arquivoPalavras;
  private Random rand;
  private String wordle;
  private char[][] tabela;
  private String[] keyboard;
  private int palpiteCount;
  private boolean solved;

  /**
  * Inicializa a lista de palavras.
  */
  public Wordle (int tamanhoPalavra,int tentativas) throws IOException {
    listaPalavras = new ArrayList<>();
    in = new Scanner(System.in);
    arquivoPalavras = new Scanner(new File("dicionario/"+tamanhoPalavra+".txt"));
    rand = new Random();
    tabela = new char[tentativas][tamanhoPalavra];
    palpiteCount = 0;
    solved = false;
    keyboard = new String[26];
    for (int i = 0; i <= 25; i++)
      keyboard[i] = Character.toString((char) (i + 65));

    while (arquivoPalavras.hasNextLine()) {
      listaPalavras.add(arquivoPalavras.nextLine());
    }

    wordle = listaPalavras.get(rand.nextInt(listaPalavras.size())).toUpperCase();
  }

  /**
  * Retorna a palavra wordle
  * @return String wordle
  */
  public String getWordle () {
    return wordle;
  }

  /**
  * Verifica se a entrada fornecida é um palpite válido
  * @return Booleano válido
  */
  public boolean palpiteValido (String palpite) {
    for (int i = 0; i < listaPalavras.size(); i++)
      if (palpite.toLowerCase().equals(listaPalavras.get(i))) return true;
    return false;
  }

  /**
  * Adiciona a palavra à tabela e verifica se é a solução
  */
  public void palpiteWord (String palpite) {
    for (int i = 0; i <= (wordle.length()-1); i++)
      tabela[palpiteCount][i] = palpite.toUpperCase().charAt(i);
    palpiteCount++;
    if (palpite.toUpperCase().equals(wordle)) solved = true;
  }

  /**
  * Decidir se permite outro palpite
  * @return boolean de repetição
  */
  public boolean repeat (int tentativas) {
    if (palpiteCount >= tentativas) return false;
    else if (solved) return false;
    return true;
  }

  /**
  * Imprime "Vencedor!" se o usuário adivinhou a palavra correta
  * Senão imprime a palavra correta
  */
  public void endGame () {
    if (solved) System.out.println("Você Venceu!");
    else System.out.println("A palavra era " + wordle);
  }

  /**
  * Imprime a tabela de adivinhações anteriores
  */
  public void printTabela (int tentativas) {
    String temp = "";
    for (int row = 0; row <= (tentativas-1); row++) {
      for (int col = 0; col <= (wordle.length()-1); col++) {
        if (tabela[row][col] == wordle.charAt(col)) {
          System.out.print("\u001B[32m");
          temp = keyboard[(int) tabela[row][col] - 65];
          keyboard[(int) tabela[row][col] - 65] = "\u001B[32m" + 
            temp.substring(temp.length() - 1);
        } else if (wordle.contains(Character.toString(tabela[row][col]))) {
          System.out.print("\u001B[31m");
          temp = keyboard[(int) tabela[row][col] - 65];
          if (temp.length() == 1 || ! temp.substring(0,3).equals("\u001B[32"))
            keyboard[(int) tabela[row][col] - 65] = "\u001B[31m" + 
              temp.substring(temp.length() - 1);
        } else {
          System.out.print("\u001B[0m");
          if ((int) tabela[row][col] != 0) {
            temp = keyboard[(int) tabela[row][col] - 65];
            keyboard[(int) tabela[row][col] - 65] = "\u001B[90m" + temp;
          }
        }
        System.out.print(tabela[row][col] + " ");
      }
      System.out.println("\u001B[0m");
    }
    System.out.println();
  }

  /**
  * Imprime todas as letras do teclado
  */
  public void printKeyboard () {
    for (int i = 1; i <= 100; i++)
      System.out.println();
    for (int i = 0; i <= 25; i++) {
      if ((i - 1) % 9 == 8) System.out.println();
      System.out.print("\u001B[0m" + " " + keyboard[i] + " ");
    }
    System.out.println("\n");
  }
}