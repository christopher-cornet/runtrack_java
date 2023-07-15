import java.util.Scanner;

public class Somme {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Saisissez deux nombres entiers : ");

    int number = input.nextInt();
    int number2 = input.nextInt();

    System.out.println(number + number2);

    input.close();
  }
}