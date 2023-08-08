package jour03.job06;

public class job06 {
  public static void main(String[] args) {
    int[] array = new int[10];

    // Create an object of class java.util.Random to generate random numbers
    java.util.Random random = new java.util.Random();

    // Fill the array with random numbers between 0 and 99
    for (int i = 0; i < array.length; i++) {
      array[i] = random.nextInt(100);
    }

    System.out.println("Le tableau contient les valeurs suivantes : ");
    for (int value : array) {
      System.out.print(value + " ");
    }
  }
}
