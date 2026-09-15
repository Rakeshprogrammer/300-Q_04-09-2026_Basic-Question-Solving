//Phase 2, Level 1, Question 6: Print the sum of first n natural numbers.
//if n = 5 hai toh 1+2+3+4+5 = ?

public class Main56{
    public static void main(String args[]){
        int n = 5;
        int sum = 0 ;
        for(int i = 1 ; i<=n ; i++){
            sum = sum + i ;
            System.out.println(sum);


        }
        System.out.println("Sum of n nauturanol number :" + sum);
    }
}