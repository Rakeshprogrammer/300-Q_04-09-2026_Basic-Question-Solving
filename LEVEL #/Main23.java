//Question 3: Take a 4-digit number and check if the first and last digits are equal.
// 
public class Main23{
    public static void main(String args[]){
        int number = 4254;
        int a = number/1000;
        int b = number%10;
        if(a==b){
            System.out.println("First and last digits are equal");
        }else{
            System.out.println("Not equal");
        }
    }
}