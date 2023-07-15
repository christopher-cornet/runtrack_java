import java.util.Scanner;

public class job03 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int i = 0;
    int table_multiplication = 10;

    System.out.println("Saisissez un nombre pour connaître sa table de multiplication : ");

    int number = input.nextInt();

    while (i <= table_multiplication) {
      int result = number * i;
      System.out.println(i + " X " + number + " = " + result);
      i++;
    }
    
    input.close();
  }
}