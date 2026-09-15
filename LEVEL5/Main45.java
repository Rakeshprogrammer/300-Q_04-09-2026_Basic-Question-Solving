//Level 5, Question 5: Take three numbers and check if they are in arithmetic progression.

public class Main45{
    public static void main(String args[]){
        int a = 1;
        int b = 2 ;
        int c = 3 ;
        if(b-a == c-b){
            System.out.println("Numbers are in A.P. (Arithmetic Progression)");
        }else{
            System.out.println("Not in A.P.");
        }
    }
}