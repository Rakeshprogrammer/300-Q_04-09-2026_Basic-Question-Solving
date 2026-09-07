//Question 2: Take a 3-digit number and 
// determine if the middle digit is the largest, smallest, or neither.

public class Main22{
    public static void main(String args[]){
        int number = 135;

        int first = number/100;
        int mid = ((number/10) %10 );
        int last = number%10;
        if(mid>first && mid>last){
            System.out.println("Middle digit is the largest");

        }
        else if (mid<first && mid<last){
            System.out.println("Middle digit is the smallest");
        }

        else{
            System.out.println("Middle digit is neither largest nor smallest");
        }

    }
}