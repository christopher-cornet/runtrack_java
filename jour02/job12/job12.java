public class job12 {
  public static void main(String[] args) {
    int count = 0;
    for (int i = 1; i <= 6; i++) {
      for (int j = 1; j <= 6; j++) {
        for (int k = 1; k <= 6; k++) {
          System.out.println(i + " " + j + " " + k);
          count++;
        }
      }
    }
    System.out.println("Le nombre total de combinations est : " + count);
  }
}