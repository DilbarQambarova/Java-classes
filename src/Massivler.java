import javax.swing.*;
import java.util.List;

public class Massivler {
    public static void main(String[] args) {
//        int[] array1 = {2, 3, 5, 7, 8, 9};
//        int[] array2 = {1, 2, 4, 6, 7, 9};
//
//        for (int i = 0; i < array1.length; i++) {
//            for (int j = 0; j < array2.length; j++) {
//                if (array1[i] == array2[j]) {
//                    System.out.println(array1[i] + " ");
//                }
//            }


//int[] array = {2, 4, 6, 8, 10};
//int cem = 0;
//
//        for (int i = 0; i < array.length; i++) {
//cem += array[i];
//        }
//
//double ortalama = (double) cem / array.length;
//
////        System.out.println("Array elementlərinin ortalaması: " + ortalama);
//
//
//            int[] array = {2, 4, 6, 8, 10};
//
//            int temp = array[0];
//            array[0] = array[array.length - 1];
//            array[array.length - 1] = temp;
//
//            for (int i = 0; i < array.length; i++) {
//                System.out.print(array[i] + " ");
//            }
//        }


        //Arrayin butun elementlerinin cemi
            int[][] array={{23,54,67,123},
                           {33,54,12,70,9}};

        int cem = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                cem += array[i][j];
            }
        }
        System.out.print(cem);




        //Sətir və sütunların cəmi (ede bilmedim)

//        int[][] array={{46,54,78,126},
//                       {56,54,12,40,91}};
//        int setircem = 0;
//


        


    }
}