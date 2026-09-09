//Question 4: Take 24-hour time (hours and minutes) and print whether it is AM or PM.
public class Main34{
    public static void main(String args[]){
        int hour = 12;
        int min = 05;

        if(hour >= 0 && hour <= 23 && min >= 0 && min <= 59){
            if(hour<12){
                System.out.println("AM");
            }else{
                System.out.println("PM");
            }
        }    
         
    }
}