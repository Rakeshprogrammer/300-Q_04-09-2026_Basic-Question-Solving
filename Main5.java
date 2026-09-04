//Question 5: Check if a given year is a leap year.
public class Main5{
    public static void main(String args[]){
        int year = 2001;
        
        if(year % 400 == 0 || ( year % 4 == 0 && year % 100 != 0)){
            System.out.println("Leap year");

        }else{
            System.out.println("Not leap year");
        }
    }
}