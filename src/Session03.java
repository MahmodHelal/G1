import java.util.Scanner;

public class Session03 {
    public static void main(String[] args) {

        // Loops
        // for
        // while
        // do while



        // from 1 to  5
   /*     System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);*/
        /*
        * for(initialization;  condition ; increment/decrement){
        * block of code ;}
        * */

        // i++ -> i = i+1
/*                for (int i = 1;i <= 5;i++){
                    System.out.println(i);
                }
        System.out.println("*******************");
                for (int i =5 ; i>=1 ; i-- ){
                    System.out.println(i);
                }
                */

/*
                /// ///////////////
        for (int i = 1;i <= 5; System.out.println("Value of i++ from loop : " + (i++))){
            System.out.println("i : "+i);
        }
        System.out.println("*******************");
// 1 - 5
        for (int i = 1;i <= 5;System.out.println("Value of ++i from loop : " + (++i))){
            System.out.println("i : "+i);
        }*/


        // ask user for enter 10 numbers
        // then print sum of them
        // then print count of evens and count of odds
      /*  int sum = 0;
        int evenCount = 0;
        int oddCount = 0;
      for (int i = 0 ; i<=3 ; i++){
          System.out.println("Please enter "+(i+1)+" number : ");
          int number = input.nextInt();
          //           sum = sum + number; // X++ /X = X + 1 // X+=1  // S+=NUMBER
          sum += number;

           if (number % 2 ==0 ){
//               evenCount = evenCount +1; // x++ // X+=1
               evenCount++;
//               "increase count of evens by one"
           }else {
//               oddCount = oddCount +1;
               oddCount++;
//               "increase count of odds by one"
           }
      }
        System.out.println("Sum of numbers : "+sum);
        System.out.println("Count of evens : "+evenCount);
        System.out.println("Count of odds : "+oddCount);
*/


        // print multiplication table of 4

        // 1 x 4 = 1
        // 2 x 4 = 8
        // 3 x 4 = 12
        //...
        // 10 x 4 = 40
        // 11 x 4 = 44
        // 12 x 4 = 48
/*        int number = 4;

        System.out.println("******************");
            for (int j = 2 ; j <= 4 ; j++){

                for (int i = 1 ; i<= 12 ; i++){
                    System.out.println(i+" x "+ j +" = "+(i* j));
                }

                System.out.println("******************");
            }*/

/*        System.out.println("* * * *");
        System.out.println("* * * *");
        System.out.println("* * * *");
        System.out.println("* * * *");*/


//         * * * *
//         * * * *
//         * * * *
//         * * * *
// using         System.out.print("* ");

/*for (int j = 0 ; j <=3; j++){
    for (int i = 0 ; i<= 3 ; i++){
        System.out.print("* ");
    }
    System.out.println();


    Scanner input = new Scanner(System.in);*/

/*
    System.out.println("Please enter a traffic light color : ");
    String color = input.nextLine();
    switch ( color ){
        case "red","Red" :
            System.out.println("Stop");
            break;
        case "green" :
            System.out.println("Go");
            break;

        case "yellow" :
            System.out.println("Wait");
            break;
        default:
            System.out.println("Invalid Color");
    }
    System.out.println("Thank You ^=^");

*/

/*        for (int row = 0 ; row <=3; row++) {

            for (int col = 0; col <= row; col++) {

                System.out.print("* ");

            }

            System.out.println();
        }*/

        //  While

        /*
        * while (condition){
        *
        * block of code
        * }
        * */

        // 1 -> 5
/*        System.out.println("For Loop values : ");
        int num = 1;
        for (; num <=5 ; ){
            System.out.println(num);
            num++;
        }
        System.out.println("**************");*/

        System.out.println("While Loop values : ");
        int number = 1;
        while (number <=5){
            System.out.println(number);
            number++;
        }
        while (number <=5){
            System.out.println(number);
            number++;
        }
        System.out.println(number);






        // store a secrete number
        // ask user for enter a value
        // if user entered greater than secret number -> print "too high"
        // if user entered less than secret number -> print "too low"
        // if user entered equal to secret number -> print "congratulations"
        // like it
        // secret number = 10
        // ask user for enter a value
        // enter 11 -> print "too high"
        // ask user for enter a value again
        // enter 9 -> print "too low"
        // ask user for enter a value again
        // enter 10 -> print "congratulations"
        /*
        int secretNumber = 10;
        int enteredNumber = 0;

        while (secretNumber != enteredNumber){
            System.out.println("Please enter a number");
            enteredNumber = input.nextInt();

            if (enteredNumber  > secretNumber){
                System.out.println("too high");
            }else if (enteredNumber < secretNumber){
                System.out.println("too low");
            }else {
                System.out.println("congratulations");
            }
        }
*/


//        int x = 10;
//        int x = 10;


/*         for (int i = 1; i< 5; i++){
             System.out.println(i);
         }
        System.out.println("**************");
        for (int i = 1; i< 5; i++){
            System.out.println(i);
        }*/


//        System.out.println(i);

/*
* store username and password
* ask user for enter username and password
*if user enter any credentials wrong -> print "Invalid Credentials" and try again
* till 3 times then print account locked
* else -> print "login successful"
*
* */
        Scanner input = new Scanner(System.in);
        String PASSWORD = "HELAL98";
        String USERNAME = "HELAL";
        int MAX_ATTEMPTS = 3;
        int attempt = 0;
        boolean loggedIn = false;
        while (attempt < MAX_ATTEMPTS){
            System.out.println("please enter username");
            String enteredUsername = input.nextLine();
            System.out.println("please enter password");
            String enteredPassword = input.nextLine();
            if (enteredUsername.equals(USERNAME) && PASSWORD.equals(enteredPassword)){
                loggedIn = true;
                break;
            }
            attempt++;
            if (attempt < MAX_ATTEMPTS){
                System.out.println("Invalid Credentials");
                System.out.println("Remaining attempts is : "+ (MAX_ATTEMPTS - attempt));
            }
        }
        if (loggedIn){
            System.out.println("login successful");
        }else {
            System.out.println("account locked");
        }



//




    }

     }
/*
*
* *
* * *
* * * *
*/
