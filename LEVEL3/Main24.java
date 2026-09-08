//Question 4: Check whether a given integer is single-digit, double-digit, or multi-digit.
// 

public class Main24{
    public static void main(String args[]){
        int number = -100;

        if(number<0){
            number = (number * -1); //-tive number nahi chiye
        }

        if(number < 10){
            System.out.println("its a Single-digit");
        }
        else if(number< 100){
             System.out.println("its a Double-digit");
        }else{
             System.out.println("its a Multi-digit");
        }

    }
}