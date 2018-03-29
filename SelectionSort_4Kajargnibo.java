// Presentation Project
// by Darius Kafayi, Max Jardetzky, and Jack Gnibus
import java.util.Arrays;

public class SelectionSort_4Kajargnibo {
   public static void main(String[] args) {
      int[] arr = { 4, 9, 2, 5, 1, 6, 3, 4 };
      sort(arr);
   }
   
   public static void sort(int[] arr) {
      int rangeMin = 0;
      int minIndex;
      int swapTemp;
      while (rangeMin < arr.length) {
         System.out.println(Arrays.toString(arr));
         minIndex = findMinIndex(arr, rangeMin);
         if (rangeMin != minIndex) {
            swapTemp = arr[rangeMin];
            arr[rangeMin] = arr[minIndex];
            arr[minIndex] = swapTemp;
         }
         rangeMin++;
      } 
   }
   
   public static int findMinIndex(int[] arr, int min) {
      int minIndex = min;
      for (int i = min + 1; i < arr.length; i++) {
         if (arr[i] < arr[minIndex])
            minIndex = i;
      }
      return minIndex;
   }
}