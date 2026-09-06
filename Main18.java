//Question 8: Take an alphabet character and check if it lies between 'a' and 'm' or 'n' and 'z'.

public class Main18{
    public static void main(String args[]){
        char alp = 'z';
        if( alp>='a' && alp <= 'm'){
            System.out.println("its in between A & M");
        }else if(alp>='n' && alp <= 'z'){
             System.out.println("its in between N & Z");
        }else{
            System.out.println("In Valid input");
        }
    }
}