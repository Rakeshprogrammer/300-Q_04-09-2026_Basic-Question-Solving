//Question 5: Take income and age, and check if eligible for tax (age > 18 and income > 5 L).
public class Main35{
    public static void main(String args[]){
        int age = 15;
        int income = 10000;
        if(age>18 && income>500000){
            System.out.println("You are eligible to pay tax.");
        }else{
            System.out.println("No tax needed. Chill!");
        }
    }
}