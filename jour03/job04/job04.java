package jour03.job04;

public class job04 {
  public static void main(String[] args) {
    int[] table = {3, 7, 3, 9, 8};
    int[] occurrences = new int[10];

    for (int i = 0; i < table.length; i++) {
      occurrences[table[i]]++;
    }

    for (int i = 0; i < occurrences.length; i++) {
      if (occurrences[i] > 0) {
        System.out.println(i + " : " + occurrences[i]);
      }
    }
  }
}
