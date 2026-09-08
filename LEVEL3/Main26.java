//Take coordinates (x, y) and determine which quadrant the point lies in.

public class Main26{
    public static void main(String args[]){
        int x = 0;
        int y = 0;
        if(x>0 && y>0){
              System.out.println("It is in  1st Quadrant");
        }
        else if(x<0 && y>0){
            System.out.println("It is in 2 Quadrant");
        }
        else if(x<0 && y<0){
            System.out.println("It is in 3 Quadrant");
        }
        else if(x>0 && y<0){
             System.out.println("It is in 4 Quadrant");
            
        }
        else{
            System.out.println("ON the origin");
        }


    }
}