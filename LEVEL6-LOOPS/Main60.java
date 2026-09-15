//Phase 2, Level 1, Question 10: Print the product of digits of a given number.
public class Main60{
    public static void main(String args[]){
        int num = 432 ;
        int product = 1 ;
        while(num>0){
            int lastdigit = num%10; //you take out the lastdigit.
            product = lastdigit * product; //and you did the product. after taking put the lastdigit.
            num= num/10;
        }
        System.out.println(product);
    }
}