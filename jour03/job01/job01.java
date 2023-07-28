package jour03.job01;

import java.util.Arrays;

public class job01 {
  public static void main(String[] args) {
    int[] tableau = {10, 20, 30, 40, 50};
    tableau[0] = 10;
    tableau[2] = 2;
    tableau[4] = 69;
    System.out.println(Arrays.toString(tableau));
    System.out.print(tableau[1]);
  }
}
