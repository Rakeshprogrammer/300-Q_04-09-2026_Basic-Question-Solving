//Question 7: Check if an amount can be evenly divided into 2000, 500, and 100 currency notes.

public class Main27 {
    public static void main(String[] args) {
         
        int amount = -1200;

        // Check if amount is a multiple of 100
        if (amount <= 0 || amount % 100 != 0) {
            System.out.println("Invalid amount! Amount 100 ke multiple mein hona chahiye.");
        } else {
            // 2000 ke notes calculate karna
            int notes2000 = amount / 2000;
            amount = amount % 2000;

            // 500 ke notes calculate karna
            int notes500 = amount / 500;
            amount = amount % 500;

            // 100 ke notes calculate karna
            int notes100 = amount / 100;
            // amount = amount % 100; // Ye end mein 0 ho jayega

            System.out.println("Notes breakdown:");
            System.out.println("2000 ke notes: " + notes2000);
            System.out.println("500 ke notes: " + notes500);
            System.out.println("100 ke notes: " + notes100);
        }
        
       
    }
}