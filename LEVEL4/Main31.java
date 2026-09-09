//Question 1: Take a character and check if it is a letter, a digit, or neither. 
public class Main31{
    public static void main(String args[]){
        char ch = 'A';
        if(ch>='A' && ch<='Z' || ch>='a' && ch<='z'){
            System.out.println("its a Letter");
        }

        else if(ch>='0' && ch<='9'){
            System.out.println("its a digit");
        }

        else{
            System.out.println("neither");
        }
    }
}