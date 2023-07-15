import java.util.Scanner;

public class Number {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int i = 1;

    System.out.print("Saisissez un nombre entier : ");

    int number = input.nextInt();

    while (i <= number) {
      System.out.println(i);
      i++;
    }

    input.close();
  }
}