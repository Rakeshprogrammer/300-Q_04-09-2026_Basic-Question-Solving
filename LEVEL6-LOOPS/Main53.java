//Phase 2, Level 1, Question 3: Print all odd numbers between 1 and 100.
public class Main53{
    public static void main(String args[]){
        for(int i = 1 ; i<=100 ; i++){
            if(i%2!=0){
                System.out.print(i + " ");
            }
        }
    }
}