import java.util.Scanner;

public class job05 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Saisissez votre âge : ");
    int age = input.nextInt();

    if (age < 16) {
      System.out.println("Tu n'as pas l'âge pour travailler.");
    }
    else if (age == 67) {
      System.out.println("Tu es en retraite.");
    }
    else if (age > 55) {
      System.out.println("Tu auras du mal à trouver un emploi.");
    }
    
    input.close();
  }
}