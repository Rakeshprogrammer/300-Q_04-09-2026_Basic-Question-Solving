//Question 3: Take three numbers and print the median value (neither maximum nor minimum).
//1. Logic Class (Beech wala kaise dhoondein?)
//Maan le tere paas teen variables hain: a, b, aur c.

//a median (beech wala) kab kehlayega? Iski do situations ho sakti hain:

//Jab a, b se bada ho AUR c se chhota ho. (Condition: a > b && a < c)

//YA phir jab a, c se bada ho AUR b se chhota ho. (Condition: a > c && a < b)

//Is logic ko hume Logical OR (||) aur Logical AND (&&) dono ko mila kar likhna padega!



public class Main33{
    public static void main(String args[]){

        int num1 = 10 ;
        int num2 = 50 ;
        int num3 = 30;

        if(num1>num2 && num1<num3 || num1>num3 && num1<num2){
            System.out.println("Number 1 is median");
        }

        else if(num2>num1 && num2<num3 || num2>num3 && num2<num1){
            System.out.println("Number 2 is Median");
        }
        else{
               System.out.println("Number 3 is Median");
        }


    }
}