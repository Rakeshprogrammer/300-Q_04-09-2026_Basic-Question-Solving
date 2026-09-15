//Level 5, Question 10: Take a year and 
// print the corresponding century (e.g., "19th century", "20th century").
public class Main50 {
    public static void main(String args[]) {
        int year = 2024; 
        int century; // Ek khali dabba banaya century rakhne ke liye

        if (year % 100 == 0) {
            century = year / 100; // Agar poora divide ho, toh wahi sadi hai
        } else {
            century = (year / 100) + 1; // Agar thoda bach jaye, toh agli sadi hai 
                                        // if 2024 - which is, 2024/100 , 24 out , left with 20 and in that  20 + 1 = 20
        }
 
        System.out.println(century + "th Century");
    }
}
 
