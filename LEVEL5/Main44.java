//Level 5, Question 4: Take time (hours and minutes) 
// and print the smaller angle between the hour and minute hands.

 
public class Main44 {
    public static void main(String args[]) {
        double hours = 1;        // int ki jagah double best rahega yahan
        double minutes = 00;
        double minAngle;
        double hourAngle;
        double angle;                          // Java case-sensitive hai, small 'a' use kar

        // Badi Suyi
        minAngle = minutes * 6;

        // Chhoti Suyi
        hourAngle = (hours * 30) + (minutes * 0.5);

        // Dono ka difference
        angle = hourAngle - minAngle;

        // Agar angle negative (minus) mein aaye, toh usko positive banao
        if (angle < 0) {
            angle = angle * (-1); 
        }

        //another way by using Math.abs() , Agar angle negative (minus) mein aaye, toh usko positive banao

        angle = Math.abs(hourAngle - minAngle);

        // Smaller angle nikalne ki condition
        if (angle > 180) {
            angle = 360 - angle; // 360 mein se minus karna hai!
            System.out.println("The angle is: " + angle);
        } else {
            // Agar 180 se chhota hai, toh yahi sahi answer hai!
            System.out.println("The angle is: " + angle);
        }
    }
}