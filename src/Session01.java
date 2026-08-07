public class Session01 {
    static String name;
    static int number;
    static float price;



    public static void main(String[] args) {

/*        System.out.println("String name is " + name);
        System.out.println("Int number is " + number);
        System.out.println("Float price is " + price);*/

//        // How To Declare Variables
//        // DataType nameOfVariable;  ->   int number;
//        int number;
//        // How To Initialize Variables
//        //NameOfVariable = value; number = 10;
//        number = 10;
//        number = 30;
//        //age =20;
//        // How To Declare and Initialize Variables
//        // DataType nameOfVariable = value; int age = 20;
//        int age = 20;
////        int price  = 10.5;
//// primitive data types
//
//// Data Types
//        // Numeric Types
// // byte - short - int - long
//        // byte -> -128 to 127  -> One Byte
//        byte myByte = 127;
////short -> -32,768 to 32,767 -> Two Bytes
//        short myShort = 32767 ;
////int -> -2,147,483,648 to 2,147,483,647 -> Four Bytes
//        int myInt = 2147483647 ;
////long -> -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 -> Eight Bytes
//        long myLong = 9223372036854775807L ;
////Decimal Types
////float -> 32 bits -> 4 bytes
//        float myFloat = 3.14f ;
////double -> 64 bits -> 8 bytes
//        double myDouble = 3.14159265359 ;
//// boolean  One bit  -> true or false
//        boolean isSuccess = true ;
//// Characters
//// char -> 2 bytes
//        char myChar = 'A' ;
//
//
//
//
//        // non primitive data types
//// String
//String myString = "Hello World" ; // literal
//        // how to create Object
//        // ClassName objectName = new ClassName(constructor);
//        char[] chars = {'H', 'e', 'l', 'l', 'o'};
//        String myStringFromCharArray = new String(chars); // object
//
//
///*        System.out.println("default my String : " + myString);
//        System.out.println(" ****************");
//        System.out.println("myString with built method : " + myString.toUpperCase());
//        */
//
//        String myString1 = "Hello World" ; // literal
//        String myString2 = "Hello World" ; // literal
//        String myString3 = "Hello Helal" ; // literal
//        String myStringAsObject1 = new String("Hello World"); // object
//        String myStringAsObject2 = new String("Hello World"); // object
//        int number1 = 10;
//        int number2 = 10;
//
//        System.out.println("my number is "+ number1);
//        System.out.printf("my number is %d" , number1);
//        System.out.println("***********");
//
////        System.out.println("Comparing Strings : ");
////        System.out.println(myString1 == myString2);
////        System.out.println(myString2 == myString3);
//
//
///*
//
//        System.out.println("*************");
//        System.out.println(myString1 == myStringAsObject1);
//        System.out.println("*************");
//        System.out.println(myString1.equals(myStringAsObject1));
//
//
//        System.out.print("Comparing INT Variables :  ");
//        System.out.println(number1 == number2);
//        System.out.print("Comparing literally by == : ");
//        System.out.println(myString1 == myString2); // references  - address
//        System.out.println("ref of myString1 : "+System.identityHashCode(myString1));
//        System.out.println("ref of myString2 : "+System.identityHashCode(myString2));
//        System.out.print("Comparing Objects by == : ");
//        System.out.println(myStringAsObject1 == myStringAsObject2); // references  - address
//        System.out.println("ref of myStringAsObject1 : "+System.identityHashCode(myStringAsObject1));
//        System.out.println("ref of myStringAsObject2 : "+System.identityHashCode(myStringAsObject2));
//
//*/
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//        // How To Print Variables

  // ++   value +1
  // --   value -1
/*
        // x++  post increment   x = x + 1   display current value and store increment for next statement
        // ++x  pre increment    x = x + 1   store increment and display current value
        int x = 10;
        int y = 10;

        x++; // x now 10 for next statement will be 11
        y++; // y now 10 for next statement will be 11
        ++x; // x now 12
        ++y; // y now 12

        System.out.println("x1 = " + x);//11    12   10  12  -> 12
        System.out.println("y1 = " + y);//11    12   10  12  -> 12

        System.out.println("x2 = " + x++);//11   12   12  12  -> print 12 and for next statement will be 13
        System.out.println("y2 = " + ++y);//12   13   12  13  -> print 13


        System.out.println("x+y = "+(y+x));//24   25  24  26  -> 13 + 13 = 26*/

        // &  &&


        // &&   ||
        int z = 10;
        int w = 20;

        if (z > 50 && (z/0) ==1 ){
            System.out.println("Option 1");
        }else {
            System.out.println("Option 2 from &&");
        }

        System.out.println("=================================");

        if (z > 50  & (z/1) ==1  ){
            System.out.println("Option 1");
        }else {
            System.out.println("Option 2 from &");
        }



    }
}
///*
//* Comment
//* // -> Single Line Comment
//* /* */// -> Multi Line Comment
//
//
///*
//my name is mahmoud Helal
//From KafrShukr
//        My Title is software testing engineer
//*/
