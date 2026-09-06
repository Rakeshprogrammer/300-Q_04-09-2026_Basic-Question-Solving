//Question 10: Take a month number (1-12) and 
// print the number of days in that month (ignore leap years). 

public class Main20{
    public static void main(String args[]){
        int month_number = 10;
        switch(month_number){
            case 1 :    
            case 3 :    
            case 5 :     
            case 7 :    
            case 8 :    
            case 10 :    
            case 12 :
                 System.out.println("31 days");
                 break;

            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days");
                break;

            case 2:
                System.out.println("28 days");
                break;
            
            default:
                System.out.println("Invalid Number Choosen");
        }
        
    }
}