package Grade;

import java.util.Scanner;

public class Tasklar {
    public static void main (String[] args) {

        // Tam ədədlər 2 vahid artirmaqla

//        int []digits = {-5,-4,-3,-2,-1,0,1,2,3,4,5,};
//         for (int digit : digits) {
//            if (digit >= 0) {
//                System.out.print((digit + 2) + " ");
//            }
//        }

        //6-ya qaliqsiz bolunen ededlerin cemi
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Massivin uzunluğunu daxil edin:");
//        int n = sc.nextInt();
//
//        int count = 0, sum = 0;
//
//        System.out.println(n + " ədəd daxil edin:");
//        for (int i = 0; i < n; i++) {
//            int num = sc.nextInt();
//            if (num > 0 && num % 6 == 0) {
//                count++;
//                sum += num;
//            }
//        }
//        System.out.println("6-ya tam bölünən müsbət ədədlərin sayı: " + count);
//        System.out.println("6-ya tam bölünən müsbət ədədlərin cəmi: " + sum);

        //Tek ededlerin cemi
//        System.out.println("Ədəd aralığını daxil edin:");
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int sum = 0;
//        for (int i = a; i <= b; i++) {
//            if (i % 2 != 0) {
//                sum += i;
//            }
//        }
//        System.out.println("Tək ədədlərin cəmi: " + sum);


        Scanner sc = new Scanner(System.in);
        System.out.println("Ədədi daxil edin");
        int n = sc.nextInt();

        int count = 0;

        while (n != 1) {
            if (n % 2 == 0)
                n = n / 2;
             else
                n = n + 1;
            
            count++;
        }

        System.out.println("Dəyişiklik sayı: " + count);
    }


    }
