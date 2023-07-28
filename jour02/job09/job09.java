public class job09 {
  public static void main(String[] args) {
    int number = 1234;
    int first = 0;
    int last = number % 10;

    while(number > 0) {
        first = number % 10;
        number = number / 10;
    }

    System.out.println("Le premier chiffre de 1234 est : " + first);

    System.out.println("Le dernier chiffre de 1234 est : " + last);
  }
}