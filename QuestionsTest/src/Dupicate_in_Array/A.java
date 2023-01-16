 package Dupicate_in_Array;

 import java.util.Arrays;

 public class A {

     public static void main(String[] args) {

         int[] a = {1, 8, 2, 1,1,1,1,1,1, 5, 2, 1,1,1,2,4,5,3,1,2,3,2,1,2,3,4};
         System.out.println("Original Array = "+ Arrays.toString(a));
         Arrays.sort(a);
        // System.out.println("Sorted Array = "+ Arrays.toString(a));

         int j = 0;

         for (int i=0; i< a.length-1; i++)
         {
             if (a[i] != a[i+1])
             {
                 a[j++] = a[i];
             }
         }
         a[j++] = a[a.length-1];
         System.out.print("After removing duplicate elements, array: ");
         for(int i=0;i<j;i++) {
             System.out.print(a[i] + " ");

         }
     }
 }

