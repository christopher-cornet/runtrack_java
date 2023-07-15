import java.util.Scanner;

public class Swap {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Entrez une première chaine de caractères :");
    String chaine1 = input.nextLine();
    System.out.println("Entrez une deuxième chaine de caractères :");
    String chaine2 = input.nextLine();

    chaine1 = chaine1.concat(chaine2);

    chaine2 = chaine1.substring(0, chaine1.length() - chaine2.length());

    chaine1 = chaine1.substring(chaine2.length());

    System.out.println("chaine1 = " + chaine1);
    System.out.println("chaine2 = " + chaine2);

    input.close();
  }
}