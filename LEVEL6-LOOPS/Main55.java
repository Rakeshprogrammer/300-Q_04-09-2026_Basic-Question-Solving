//Phase 2, Level 1, Question 5: Print the table of a given number (n x 1 to n x 10).
public class Main55{
    public static void main(String args[]){
        int table = 5 ;
        int table1;
        for(int i = 1 ; i<=10 ; i++){
            table1 = table * i;
            System.out.println("The table is :" + table + "*" + i + "=" + table1);
        }
    }
}