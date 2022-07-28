package activities;
import java.util.Arrays;

public class Activity4 {
    public static void main (String[] args) {

        int[] arr = {3, 7, 4, 10, 2, 8, 6, 5, 9, 1};
        System.out.println("Numbers in Array before");
        for(int i=0; i<arr.length;i++) {

            System.out.println(arr[i]);
        }

            insertionSort(arr);

            System.out.println("Numbers in Array After sorting");
            for(int k=0; k<arr.length;k++) {

                System.out.println(arr[k]);


        }

    }

       static void insertionSort(int array[]){
           int size = array.length, i;

           for(i = 1; i < size; i++){
               int key = array[i];
               int j = i - 1;

               while(j >= 0 && key < array[j]){
                   array[j + 1] = array[j];
                   --j;
               }
               array[j + 1] = key;
           }


        }

       }

