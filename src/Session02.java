import java.util.Scanner;

public class Session02 {

    public static void main(String[] args) {
   /*     Scanner helal = new Scanner(System.in);

        System.out.println("please enter your age :");
        int age = helal.nextInt();
//        helal.nextLine(); // Consume the newline character
        System.out.println("Please enter your name : ");
        String name = helal.next();
        System.out.println("Hello " + name);

        System.out.println("Hello " + name + " you are " + age + " years old");


*/









        /*
        * switch(experssion){
        * case value :
        * block of code
        * break;
        * case value2 :
        * block of code
        * break;
        * default :
        * block of code
        * break;
        * }
        *
        *
        *
        *
        * */


        // 1 -> saturday
        // 2 -> sunday
        // 3 -> monday
        // 4 -> tuesday
        // 5 -> wednesday
        // 6 -> thursday
        // 7 -> friday

/*        Scanner scanner = new Scanner(System.in);
      *//*  System.out.println("Please enter a number between 1 and 7 : ");
        int day = scanner.nextInt();
        switch (day){
            case 1:
                System.out.println("saturday");
                break;
            case 3,70,8,9:
                System.out.println("monday");
            case 2:
                System.out.println("sunday");
                break;
            case 4:
                System.out.println("tuesday");
                break;
            case 5:
                System.out.println("wednesday");
                break;
            case 6:
                System.out.println("thursday");
                break;
            case 7:
                System.out.println("friday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
*//*

        System.out.println("Please enter First number");
        double num1 = scanner.nextInt();  // 5

        System.out.println("Please enter an operator like + - / *");
//        String dummyString = scanner.next(); //+
        char operator = scanner.next().charAt(0); //+

        System.out.println("Please enter second number");
        double num2 = scanner.nextInt();//8


        switch (operator){
            case '+':
                System.out.println( num1 + " + "+num2 +" = "+(num1+num2));// 5 + 8 = 13
            break;
            case '-':
                System.out.println(num1+ " - "+num2+" = "+(num1-num2));
                break;
            case '/':
                if (num2 == 0){
                    System.out.println("second number mustn't be zero");
                }else {
                    System.out.println(num1+" / "+num2+" = "+(num1/num2));
            }


        }*/



        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your age : ");
        int age = input.nextInt();
/*
        String result = "";

        if (age >= 18){
            result = "Adult";
        }else {
            result = "Minor";
        }
*/

//        System.out.println(result);


        String result = age >= 18 ? "Adult" : "Minor";

        System.out.println(result);



        int num1 = 30;
        int num2 = 20;
        int max = num2 > num1 ? num2 : num1;

        System.out.println("Max is "+ max);













    }
}
