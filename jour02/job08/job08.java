import java.util.Scanner;

public class job08 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Saisissez un nombre : ");

    int numero = input.nextInt();
    int compteur = 0;

    while (numero != 0) {
        numero /= 10;
        compteur++;
    }

    System.out.println("Le nombre de chiffres dans numero est " + compteur);

    input.close();
  }
}