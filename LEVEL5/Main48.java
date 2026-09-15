//Level 5, Question 8: Take an integer (1-9999) and 
// check if the sum of its digits is greater than the product of its digits.
public class Main48{
    public static void main(String args[]){
        int num = 121;
        
            int firstdigit = num/1000;
            int lastdigit = num%10;
            int secondLastdigit = (num/10)%10;
            int mid = (num/100)%10;

            int sum = firstdigit+mid+secondLastdigit+lastdigit;
            int product = firstdigit*mid*secondLastdigit*lastdigit;

            if(sum>product){
                System.out.println("Sum is greater than Product!");
            }else{
                System.out.println("Product is greater or equal!");
            }
        }
    }


 
 