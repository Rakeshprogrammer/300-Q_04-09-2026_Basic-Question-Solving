//Level 2, Question 1: Take three sides and check if they form a valid triangle.
public class Main11{
    public static void main(String args[]){
        int a = 10;
        int b = 20;
        int c = 30;
        if(a+b>c && b+c>a && c+a>b){
            System.out.println("its a valid Triangle");
        }else{
            System.out.println("its Not a valid Triangle");
        }
    }
}