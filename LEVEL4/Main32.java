//Question 2: Take a number and print "Fizz" if divisible by 3, 
// "Buzz" if divisible by 5, and "FizzBuzz" if divisible by both.

public class Main32{

    public static void main(String args[]){
        int num = 112;
        if(num%3==0 && num%5==0){
            System.out.println("its a FizzBuzz");

        }
        else if(num%3==0){
            System.out.println("Its a Fizz");
        }

        else if(num%5==0){
            System.out.println("its a Buzz");
        }

        else{
             System.out.println("invalid");
        }
    }
}