//Level 3, Question 1: Take a 3-digit number and check if all digits are distinct.
//A distinct digit is a number that appears only once in a given set of digits. - In the number 123,
// all three digits are distinct because each digit appears only once in the number. 

public class Main21{
    public static void main(String args[]){
        int number = 121;

        int a , b , c;

        c = number%10; //1              //nikal last digit
        a = number/100; // 1           //kart the digit voh tak jaha tak tuj chiye
        b = (number/10) % 10; //2      //mide number nikal na 

       if(a==b || b==c || c==a){
        System.out.println("Digits are not distinct");

        }else{
            System.out.println("All digits are distinct");
        }

        //altervative codintion approch

        if(a!=b && b!=c && c!=a){
        System.out.println("All digits are distinct");

        }else{
            System.out.println("Digits are not distinct");
        }

        
    }
}