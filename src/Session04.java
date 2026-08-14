import java.util.Arrays;
import java.util.Scanner;

public class Session04 {
    public static void main(String[] args) {
//dataType[] arrayName = new dataType[size];

/*
        int[] numbers = new int[5];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        System.out.println(numbers.length);

        int[] numbers2 = new int[3];
        numbers2[0] = 100;
        numbers2[1] = 200;
        numbers2[2] = 300;
        System.out.println(numbers2.length);

        int[] numbers3 = new int[10];
        numbers3[0] = 1000;
        numbers3[1] = 1100;
        numbers3[2] = 1200;
        numbers3[3] = 1300;
        numbers3[4] = 1000;
        numbers3[5] = 1000;
        numbers3[6] = 1600;
        numbers3[7] = 1700;
        numbers3[8] = 1800;
        numbers3[9] = 1900;
        System.out.println(numbers3.length);
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter rang of numbers in array");
//        int size = input.nextInt();

        int arr[] = new int[input.nextInt()];
*/
/*        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;*/
        /*

        for (int i = 0; i < arr.length; i++){
            System.out.println("Please enter "+ (i+1) +" number :");
            arr[i] = input.nextInt();
        }

*/
/*        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);*/
        /*

        System.out.println("********************");
        System.out.println("********************");
        System.out.println("********************");

        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
*/




        int[] numbers5 = {100,200,300,400,500};
        System.out.println(numbers5.length);


        for (int i = 0; i < numbers5.length; i++){
            System.out.println(numbers5[i]);
        }

        System.out.println("*******************");
        System.out.println(Arrays.toString(numbers5));


        /// print sum of array
        ///  print max of array
        /// print min of array
        /// print reversed array
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter rang of numbers in array");
        int size = input.nextInt();
        int arr[] = new int[size];
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            System.out.println("Please enter "+ (i+1) +" number :");
            arr[i] = input.nextInt();
             sum = sum + arr[i];//1 //3 //13
        }
        System.out.println("Sum of array :" + sum);
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i< arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Max of array :" + max);
        System.out.println("Min of array :" + min);
        System.out.println("Reversed array : ");
        for (int i = arr.length-1; i>= 0; i--){
            System.out.println(arr[i]);
        }






    }
}
