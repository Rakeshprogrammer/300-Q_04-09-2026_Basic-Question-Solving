//Question 5: Take the hour of the day (0-23) and print "Good Morning", 
// "Good Afternoon", "Good Evening", or "Good Night".
public class Main15{
    public static void main(String args[]){
        int time = 12 ;
        /*Hardcore approch
        if(time >=0 && time < 12){
            System.out.println("Good Morning");
        }
        else if (time >= 13 && time <= 16){
            System.out.println("Good Afternoon");
        }
        else if(time >= 15 && time <= 17){
            System.out.println("Good Evening");
        }
        else{
            System.out.println("Good Night");
        }*/

        //smarty Core approch

        if(time<12){
             System.out.println("Good Morning");

        }
        else if(time<17){
              System.out.println("Good Afternoon");
        }
        else if(time<21){
                System.out.println("Good Evening");

        }
        else{
            System.out.println("Good Night");
        }


    }
}
