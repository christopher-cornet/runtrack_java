import java.util.Scanner;

public class job11 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Saisissez la hauteur du triangle : ");
    int height = input.nextInt();

    int number = 1;
    String star = "*";

    while(number <= height) {
      System.out.println(star);
      star = star + "*";
      number += 1;
    }
    
    input.close();
  }
}