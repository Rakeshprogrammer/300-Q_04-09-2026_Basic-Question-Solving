///Phase 2, Level 1, Question 8: Print the sum of all odd numbers up to n.

public class Main58 {
    public static void main(String args[]) {
        int num = 10;
        int sum_odd = 0;
       

        for (int i = 1; i <= num; i++) {
            
            
            if (i % 2 != 0) { // IMPORTANT: We check 'i', not 'num'! - I%2==0 TAHST CORRECT!
                              // 'num' is just the upper limit/boundary, whereas 'i' is the running counter changing every iteration.
                sum_odd = sum_odd + i;   
            }
            
        }  

         
      
        System.out.println("The Sum of odd numbers is: " + sum_odd);
    }
}