//Phase 2, Level 1, Question 9: Print the factorial of a given number.
//5*4*3*2*1 = 120;

public class Main59{
    public static void main(String args[]){
        int num = 5 ;
         int factorial = 1;
         for(int i = 1 ; i<=num ; i++){
            factorial = factorial*i;
             
         }
         System.out.println("the factorial is :" + factorial);
    }
}