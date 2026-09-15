//Level 5, Question 2: Take three numbers and check if they can form a Pythagorean triplet.
//Ek right-angled triangle mein: Base^2 + Perpendicular^2 = Hypotenuse^2,
//Humein teeno possibilities check karni padengi
//a^2 + b^2 = c^2 || a^2 + c^2 = b^2 || c^2 + b^2 = a^2

public class Main42{
    public static void main(String args[]){
        int a = 3;
        int b = 4 ;
        int c = 5;
        if( (a*a + b*b == c*c) || (c*c + b*b == a*a) || (a*a + c*c == b*b) ){
            System.out.println("It is a Pythagorean Triplet!");
        }else{
            System.out.println("Not a Triplet.");
        }


    }
}