package jour03.job02;

import java.util.Arrays;

public class job02 {
  public static void main(String[] args) {
    int[] monTableau = {12, 6, 76, 89};

    System.out.println(Arrays.toString(monTableau));

    monTableau[0] = 21;
    monTableau[1] = 9;
    monTableau[2] = 67;
    monTableau[3] = 98;

    System.out.println("After values change :");

    System.out.println(Arrays.toString(monTableau));
  }
}
