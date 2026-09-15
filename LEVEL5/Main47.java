//Level 5, Question 7: Take a 3-digit number and check if the sum of the first 
// and last digit equals the middle digit.
public class Main47{
    public static void main(String args[]){
        int num = 121 ;

        int lastdigit= num%10;

        int firstdigit = num/100; //(to remove the first digit you dont need to use %, you ned to use /)

        num = num/10;
        int Middle = num%10;
       // another way to get the mid  ---- // int Middle = (num/10)%10; int middle = (num / 10) % 10;


        if(firstdigit + lastdigit == Middle ){
            System.out.println("Match found! First + Last = Middle");
        }else{
            System.out.println("Not Equal");
        }
    }
}