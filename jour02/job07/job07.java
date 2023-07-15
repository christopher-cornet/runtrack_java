import java.util.Scanner;

public class job07 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Saisissez un nombre.");
    int number = input.nextInt();

    if (number < 0) {
      System.out.println("Le nombre doit être positif.");
    }
    else {
      int factorial = 1;

      for (int i = 1; i <= number; i++) {
          factorial = factorial * i;
      }

      int result = factorial;
      System.out.println("La factorielle du nombre " + number + " est : " + result);
    }

    input.close();
  }
}