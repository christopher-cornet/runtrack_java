package jour03.job05;

public class job05 {
  public static void main(String[] args) {
    int[] table = {3, 7, 3, 9, 8};

    System.out.println("Les valeurs uniques du tableau sont : ");
    for (int i = 0; i < table.length; i++) {
      boolean isUnique = true;
      for (int j = 0; j < table.length; j++) {
        if (i != j && table[i] == table[j]) {
          isUnique = false;
          break;
        }
      }
      if (isUnique) {
        System.out.print(table[i] + " ");
      }
    }
  }
}
