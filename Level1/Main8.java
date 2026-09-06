//Question 8: Take a temperature value and print "Cold", "Warm", or "Hot" 
// using range conditions.

public class Main8{
    public static void main(String args[]){
        int temp = 100;
        if(temp<20){
            System.out.println("Cold");
        }
        else if(temp>=20 && temp<=30){
            System.out.println("Warm");

        }else{
            System.out.println("Hot");
        }
    }
}
