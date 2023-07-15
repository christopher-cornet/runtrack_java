public class job06 {
  public static void main(String[] args) {
    int i = 1;
    int max = 100;

    int pair = 0;

    while (i <= max) {
      if (i % 2 == 0) {
        pair += i;
      }
      i++;
    }

    System.out.println("La somme des nombres pairs entre 1 et 100 est : " + pair);
  }
}