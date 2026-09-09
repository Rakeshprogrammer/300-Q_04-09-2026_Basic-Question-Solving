//Question 6: Take two numbers and check if both are positive and their sum is less than 100.

public class Main36{
    public static void main(String args[]){
        int a = 10 ;
        int b = 20 ;
        if(a+b<100 && (a >0 && b>0) ){
            System.out.println("Both are Postive & sum is less than 100");
        }else{
              System.out.println("Maybe Postive/Negtive and sum is less or more than 100 - invlaid");
        }
    }
}