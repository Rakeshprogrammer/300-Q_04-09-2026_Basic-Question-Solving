//Question 10: Take a password string and check basic rules (length ≥ 8 and contains at least one digit).
public class Main30{
    public static void main(String args[]){
        //First Way : with loop

        String password = "Rakeshyadav100";
        boolean hasDigit = false;

        for(int i = 0 ; i<password.length(); i++){
           char ch = password.charAt(i);
           if (ch >= '0' && ch <= '9') {
           hasDigit = true;
            break; // Emergency brake!
           }
        } 

        if(password.length()>=8 && hasDigit==true){
            System.out.println("Strong Password! Account Created.");
        }else{
            System.out.println("Weak Password! Needs 8 chars and 1 number.");
        }

        //Second way- shortcut trick

        String password_2 = "Rakeshyadav100";
        if(password_2.length()>=8 && password_2.matches(".*\\d.*")) { //.* - Shuru mein chahe kuch bhi likha ho. // 
                                                                      // \\d ->par beech mein kam se kam ek number zaroor hona chahiye...
                                                                      // .* - aur aakhir mein bhi chahe kuch bhi likha ho.
            System.out.println("Strong Password! Account Created");
        }else{
            System.out.println("Weak Password! Needs 8 chars and 1 number.");
        }
    }
}