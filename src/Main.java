import java.util.Scanner;


public class Main {
    //With this method we take the input given by the user and then reverse it and check whether it is a palindrome number or not.
    static boolean isPalindrome(int number){
        int reversedNumber = 0;
        int originalNumber = number;
        while(number !=0 ){
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return originalNumber == reversedNumber;

    }
    public static void main(String[] args) {
     int iNumber = 0;
     Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number equal to or bigger than a two digit number : ");
     iNumber = input.nextInt();
     String number = Integer.toString(iNumber);
     //We check the length of the input string using input.length() to see if it has only one character.
     // We then use Character.isDigit(input.charAt(0)) to check if the first character of the input string is a digit.
     while(number.length() == 1 && Character.isDigit(number.charAt(0))){
         System.out.print("This number is one digit number, please enter bigger digit numbers : ");
         iNumber = input.nextInt();
         number = Integer.toString(iNumber);
     }
       if(isPalindrome(iNumber) == true){
           System.out.print("The number that you've entered is a palindrome number! " + "original number : " + iNumber + " = " + "reversed number : " + number);
       }
       else{
           System.out.print("The number that you've entered is not a palindrome number! " + "original number : " + iNumber + "!=" + "reversed number : " + number);
       }
    }

}