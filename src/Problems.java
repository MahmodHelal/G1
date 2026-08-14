import java.util.Scanner;

public class Problems {
    public static void main(String[] args) {

        diamondPattern();

    }


    public static void fizzBuzz(){
        for (int i = 1 ; i <= 100; i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("fizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("fizz");
            }else if (i % 5 == 0){
                System.out.println("buzz");
            }else {
                System.out.println(i);
            }

        }

    }
    public static void reverseNumber(){
        int number = 1200;
        int reverse = 0;

        while (number > 0){

            int lastDigit = number % 10;// 12345 % 10 = 5// 1234 % 10 = 4 // 123 % 10 = 3 // 12 % 10 = 2 // 1 % 10 = 1
            reverse = reverse * 10 + lastDigit ;//= 0 * 10 + 5 = 5 // 5 * 10 + 4 = 54 // 540 + 3 = 543 // 5430 + 2 = 5432 // 54320 + 1 = 54321
            number = number / 10;//12345 / 10 = 1234 // 123 // 12 // 1 // 0

        }

        System.out.println("Reversed number : "+reverse);





    }
    public static void numberPyramid(){

        Scanner input = new Scanner(System.in);
        int numberOfRows;
        while (true){
            System.out.println("Please enter number pf rows");
            numberOfRows = input.nextInt();
            if (numberOfRows >= 1 && numberOfRows <= 9){
                break;
            }
            System.out.println("Invalid input, try again");
        }

        for (int row = 1 ; row<= numberOfRows ; row++){
            for (int col = 1 ; col <= row; col++){
                System.out.print(row);
            }
            System.out.println();
        }


 /*       System.out.println("Please enter number pf rows");
        int number = input.nextInt();

        while (number < 1 || number > 9){
            System.out.println("Invalid input, try again");
            number = input.nextInt();
        }*/




//* * * *
//* * * *
//* * * *
//* * * *


    }
    public static void diamondPattern(){
        int number = 5;
        for ( int row = 1 ; row <= number ; row+=2){
            int spaces = (number - row) / 2;
            for (int i = 1; i <= spaces ; i++){
                System.out.print(" ");
            }
            for (int i = 1; i <= row; i++){
                System.out.print("*");
            }
            System.out.println();
        }
        for ( int row = number - 2 ; row >= 1 ; row-=2){
            int spaces = (number - row) / 2;
            for (int i = 1; i<= spaces; i++){
                System.out.print(" ");
            }
            for (int i = 1 ; i <= row; i++){
                System.out.print("*");
            }
            System.out.println();


        }
    }


}
