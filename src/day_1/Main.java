package day_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //EEEJ 1
//
        Scanner read = new Scanner(System.in);
//        System.out.println("Enter your name: ");
//String name= read.nextLine();
//        System.out.println("Enter your last name: ");
//String lastName=read.nextLine();
//        System.out.println("Enter your age: ");
//int age= read.nextInt();
//
//        System.out.println("Your name is: " + name + " " + lastName + "\n" + "Your age is: " + age);


        //EEEEJ 2
//        System.out.println(welcome("Heyyyy, welcome to my program"));


        //EEEEEJ 3
//
//        System.out.println("Enter a number: ");
//        int number = read.nextInt();
//        System.out.println("Enter a number: ");
//        int number2 = read.nextInt();
//        System.out.println("Enter a number: ");
//        int number3 = read.nextInt();
//
////        int max = Math.max(number, Math.max(number2, number3));
////        System.out.println(max);
//        int max = number ;
//
//        if (number2 > max) {
//            max = number2;
//        }
//        if (number3 > max) {
//            max = number3;
//        }
//        System.out.println("the max number is: " +max);



        //EEEEEJ 4

//        System.out.println("Enter a number: ");
//        int number = read.nextInt();
//
//        if (number % 2 == 0) {        //aca comparamos el resto de numero, si el resto es igual a 0 entonces es par
//            System.out.println(number + " is an even number");
//        } else {
//            System.out.println(number + " is an odd number");
//        }


        //EJJJJJ 5

//        System.out.println("enter a phrase");
//        String phrase = read.nextLine();
//        System.out.println(phrase.toUpperCase());
//        System.out.println("enter another phrase");
//        String phrase2 = read.nextLine();
//        System.out.println(phrase2.toUpperCase());


        //EJJJJJJ 6
//        System.out.println("Enter a number: ");
//        int number = read.nextInt();
//        boolean result = isPrime(number);
//        if (result) {
//            System.out.println("The number " + number + " is prime.");
//        } else {
//            System.out.println("The number " + number + " is not prime.");
//        }



        //EJJJJJJJ 7
//        int [] numbers= {1,2,3,4,5,6,7,8,9,10};
//       int sumNotPair = sumNotPairs(numbers);
//        System.out.println("the sum of not pair numbers is: " + sumNotPair);

        //EJJJJJJJJJ 8
//        int [] numbers= {1,2,3,4,5,6,7,8,9,10};
//
//        printPairs(numbers);
//        int sumPrime= sumPrimes(numbers);
//        System.out.println("the sum of prime numbers is: " + sumPrime);







    }



    //EEEEJ 2
//esto seria una funcion con nombre welcome. le puse string porq va a retornar un string. si pongo void no retorna y solo pongo print ln

//    public static String welcome (String message){
//        return message + " byeee";
//    }


    //EEEEJ 6
//    public static boolean isPrime (int number){
//        if (number <= 1) {
//            return false; //0 y 1 no son números primos
//        }
//
//        for (int i = 2; i <= Math.sqrt(number); i++) {
//            if (number % i == 0) {
//                return false;   // Encontramos un divisor, no es primo
//            }
//        }
//        return true;   // No encontramos divisores, es primo
//    }

    //EJJJJJJ 7

//    public static int sumNotPairs (int []array){
//        int sum=0;
//        for (int num:array){
//            if (num % 2 == 0){  //para ver si es par
//                sum+=num;
//            }
//        }
//        return sum;
//    }


    //EJJJJJJJ 8

//    public static void printPairs (int []array){
//        System.out.println("the pairs are: ");
//        for (int num:array){
//            if (num % 2 == 0){  //para ver si es par
//                System.out.println(num + " ");
//            }
//        }
//        System.out.println();
//    }
//
//    public static int sumPrimes (int []array){
//        int sum=0;
//        for (int num:array){
//            if (isPrime(num)){  //para ver si es par
//                sum+=num;
//            }
//        }
//        return sum;
//    }
//
//    public static boolean isPrime (int number){
//        if (number <= 1) {
//            return false; //0 y 1 no son números primos
//        }
//
//        for (int i = 2; i <= Math.sqrt(number); i++) {
//            if (number % i == 0) {
//                return false;   // Encontramos un divisor, no es primo
//            }
//        }
//        return true;   // No encontramos divisores, es primo
//    }
}




