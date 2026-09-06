//Question 4: Check if one of two given numbers is a multiple of the other. 

public class Main14{
    public static void main(String args[]){
        int a = 10;
        int b = 20 ;
        if(a%b==0 || b%a==0){
            System.out.println("Yes, one is a multiple of the other");
        }else{
            System.out.println("No");
        }
    }
}