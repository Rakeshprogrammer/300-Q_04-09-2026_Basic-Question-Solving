//Question 10: Take a character and 
// check whether it's uppercase, lowercase, a digit, or a special character.

public class Main10{
    public static void main(String args[]){
        char ch = '1';
        if(ch >= 'A' && ch <= 'Z'){
            System.out.println("Uppercase");
        }
        else if(ch >= 'a' && ch <= 'z'){
            System.out.println("lowercase");
        }
        else if(ch >='0' && ch <='9'){
            System.out.println("Digit");
        }
        else{
            System.out.println("Special");
        }
        
    }
}