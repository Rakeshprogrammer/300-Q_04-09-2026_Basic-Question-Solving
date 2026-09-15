//Phase 2, Level 1, Question 7: Print the sum of all even numbers up to n.

//if n = 10 ; 
//2+4+6+810 =;

public class Main57{
    public static void main(String args[]){
    int num = 10 ;
    int sum = 0 ;
    int i = 1;
    while(i<=num){
        if(i%2==0){
            sum = sum + i ;
        }
        i++;

    }
      System.out.println("The Sum of odd numbers is: " + sum);
        
    }
}