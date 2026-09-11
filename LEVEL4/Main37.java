//Question 7: Take a single digit (0-9) and print its word form ("Zero" to "Nine").
public class Main37{
    public static void main(String args[]){
        int num = 1 ;
        if(num==0){
            System.out.println("Zero");
        }

        else if(num==1){
            System.out.println("ONE");
        }

         else if(num==2){
            System.out.println("Two");
        }

         else if(num==3){
            System.out.println("Three");
        }

         else if(num==4){
            System.out.println("Four");
        }

         else if(num==5){
            System.out.println("Five");
        }
        
         else if(num==6){
            System.out.println("Six");
        }

          else if(num==7){
            System.out.println("Seven");
        }

        else if(num==8){
            System.out.println("Eight");
        }

        else if(num==9){
            System.out.println("Nine");
        }

        else{
            System.out.println("invalid digit");
        }
        
//another way - using Swtich
        switch(num){
            case 1 :
                 System.out.println("ONE");
                 break;
            case 2 :
                System.out.println("two");
                 break;

            case 3:
                System.out.println("three");
                 break;

            case 4:
                System.out.println("four");
                 break;

           case 5 :
            System.out.println("five");
                 break;

            case 6:
                System.out.println("six");
                 break;

            case 7 :
                System.out.println("seven");
                 break;

            case 8:
                System.out.println("Eight");
                 break;

            case 9 :
                System.out.println("Nine");
                 break;

            default :
            System.out.println("Digit not Invalid");
            
        }

    }
}