//Question 7: Take three numbers and print the largest.
public class Main7{
    public static void main(String args[]){
        int a = 10;
        int b = 20;
        int c=30;
        if(a>b && a>c){
            System.out.println("A is Larger");
        }else if(b>c && b>a){
            System.out.println("B is Larger");
        }else{
            System.out.println( "C is Larger");
        }
    }
}