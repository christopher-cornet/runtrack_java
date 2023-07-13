import java.util.Scanner;

public class Hours {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Entrez une durée en minutes : ");
    int minutes = input.nextInt();
    int hours = minutes / 60;
    int remainingMinutes = minutes % 60;
    System.out.printf(minutes + " minutes est équivalent à " + hours + " heures " + "et " + remainingMinutes + " minutes.");
    input.close();
  }
}