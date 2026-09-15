//Level 5, Question 9: Take two dates (day and month) 
// and determine which one comes first in the calendar.
public class Main49 {
    public static void main(String args[]) {
        int day1 = 1, month1 = 7;
        int day2 = 1, month2 = 7;

        // Rule 1: Mahina check karo
        if (month1 < month2) {
            System.out.println("First date comes earlier.");
        } 
        
        else if (month2 < month1) {
            System.out.println("Second date comes earlier.");
        } 
        // Rule 2: Agar mahina same hai, toh Din (Day) check karo
        else if (month1 == month2) {
            
            if (day1 < day2) {
                System.out.println("First date comes earlier (Same Month).");
            } else if (day2 < day1) {
                System.out.println("Second date comes earlier (Same Month).");
            } else {
                // Rule 3: Mahina bhi same, Din bhi same!
                System.out.println("Both are the exact same date!");
            }
            
        }
    }
}