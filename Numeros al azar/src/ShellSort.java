import java.util.Random;

public class ShellSort {
  public static void main(String[] args) {
    
        int[] arr = new int[3000];
        for (int i = 0; i < arr.length; i++) {
          arr[i] = i + 1;
        }
        shuffleArray(arr);
       
        for (int i: arr) {
          System.out.print(" " + i);
        }
        
        System.out.println("");

    
        int gap = arr.length / 2;
        while (gap >= 1) {
          System.out.println("gap->" + gap);
          insertionSortNew(arr, gap);
          for (int i: arr) {
            System.out.print(" " + i);
          }
          System.out.println("");
          gap = gap / 2;
        }
  }

  static void insertionSortNew(int[] arr, int gap) {
    for (int k = 0; k < gap; k++) { 
      for (int i = k; i < arr.length; i = i + gap) { 
        for (int j = i; j > k; j = j - gap) { 
          if (arr[j] < arr[j - gap]) {
            int temp = arr[j];
            arr[j] = arr[j - gap];
            arr[j - gap] = temp;
          }
        }
      }
    }
  }

  static void shuffleArray(int[] ar) {
    Random rnd = new Random();
    for (int i = ar.length - 1; i > 0; i--) {
      int index = rnd.nextInt(i + 1);
      int a = ar[index];
      ar[index] = ar[i];
      ar[i] = a;
    }
  }
}
