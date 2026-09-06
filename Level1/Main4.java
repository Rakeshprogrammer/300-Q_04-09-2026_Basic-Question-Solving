//Question 4: Check if a number is divisible by both 3 and 5.

public class Main4{
    public static void main(String args[]){
        int number = 15;
        if(number%3==0 && number%5==0){
            System.out.println("the gave number is divisible by both 3 and 5");
        }else{
            System.out.println("the gave number is not divisible by 3 & 5");
        }
    }
}