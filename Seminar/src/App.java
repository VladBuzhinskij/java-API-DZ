
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class App {
    public static void mergeSort(int[] array, int low, int high) {
        if (high <= low)
            return;

        int mid = (low + high) / 2;
        mergeSort(array, low, mid);
        mergeSort(array, mid + 1, high);
        merge(array, low, mid, high);
    }

    public static void merge(int[] array, int low, int mid, int high) {
        int leftArray[] = new int[mid - low + 1];
        int rightArray[] = new int[high - mid];
        for (int i = 0; i < leftArray.length; i++)
            leftArray[i] = array[low + i];
        for (int i = 0; i < rightArray.length; i++)
            rightArray[i] = array[mid + i + 1];
        int leftIndex = 0;
        int rightIndex = 0;
        for (int i = low; i < high + 1; i++) {
            if (leftIndex < leftArray.length && rightIndex < rightArray.length) {
                if (leftArray[leftIndex] < rightArray[rightIndex]) {
                    array[i] = leftArray[leftIndex];
                    leftIndex++;
                } else {
                    array[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            } else if (leftIndex < leftArray.length) {
                array[i] = leftArray[leftIndex];
                leftIndex++;
            } else if (rightIndex < rightArray.length) {
                array[i] = rightArray[rightIndex];
                rightIndex++;
            }
        }
    }
    public static void chet(int[] array) {
        ArrayList <Integer> res = new ArrayList <Integer>();
        for (int i : array)
            if (i % 2 != 0){
                res.add(i);
            }
  
        Integer[] out = res.toArray(Integer[]::new);
        System.out.println(Arrays.toString(out));
        return ;}
 
    public static void main(String[] args) throws Exception {
        // Реализовать алгоритм сортировки слиянием(метод взять из Интернета)
        System.out.println("Задание 1");
        int[] array = new int[] { 13, 17, 37, 12, 64, 31, 27 };
        System.out.println(Arrays.toString(array));
        mergeSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));

        // Пусть дан произвольный список целых чисел, удалить из него четные числа
        System.out.println("Задание 2");
        int[] array2 = new int[] { 13, 17, 37, 12, 64, 31, 27 }; 
        System.out.println(Arrays.toString(array2));
        chet(array2);
        // Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
        System.out.println("Задание 3");
        ArrayList <Integer> array3 = new ArrayList <Integer>();
        for (int i : array2)
            array3.add(i);
        
           

        Integer maxim = Collections.max(array3);
        Integer minim = Collections.min(array3);
        Integer sum=0;
        for (int i : array3)
            sum+=i;
        System.out.println("Среднее: "+sum/array3.size());
        System.out.println("Максимум: "+maxim);
        System.out.println("Минимум: "+minim);



        
    }
}
