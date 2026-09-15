//Level 5, Question 1: Take coordinates (x, y) and check if the point lies on the X-axis, 
// Y-axis, or at the origin.

public class Main41{
    public static void main(String args[]){
        int x = 10;
        int y=10;
        if(x==0 && y==0){
             System.out.println("point lies on the origin");
        }
        if(x!=0 && y==0){
            System.out.println("point lies on the X-axis");
        }else if(x==0 && y!=0){
             System.out.println("point lies on the Y-axis");
        }else{
             System.out.println("Point is somewhere in the middle (Quadrant)!");
        }
    }
}