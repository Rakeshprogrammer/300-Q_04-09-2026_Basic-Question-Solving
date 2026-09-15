//Level 5, Question 3: Take day and 
// month and check if it forms a valid calendar date (ignoring leap years).

public class Main43 {
    public static void main(String args[]) {
        // Testing inputs
        int day = 15;
        int month = 100;  

        // Sabse pehla Guard Clause (Basic Range Check)
        if (day > 0 && day <= 31 && month > 0 && month <= 12) {
            
            switch (month) {
                                                       // 31 Days wale months
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    System.out.println("Valid Date! This month has 31 days.");
                    break;

                                                          // 30 Days wale months
                case 4: case 6: case 9: case 11:
                                                          
                    if (day <= 30) { 
                        System.out.println("Valid Date! This month has 30 days.");
                    } else {
                        System.out.println("Invalid Date! This month only has 30 days.");
                    }
                    break;

                                                    // February (Ignoring Leap Year)
                case 2:
                                                                 
                    if (day <= 28) {
                        System.out.println("Valid Date! Feb has 28 days.");
                    } else {
                        System.out.println("Invalid Date! Feb only has 28 days (ignoring leap year).");
                    }
                    break;
            }
            
        } else {
                                                     // Agar day 0 se kam, 31 se zyada, ya month 12 se bada ho
            System.out.println("Invalid Date! Check day or month range.");
        }
    }
}