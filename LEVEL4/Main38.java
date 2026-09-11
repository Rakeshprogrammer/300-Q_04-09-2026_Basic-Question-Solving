//Question 8: Take a weekday number (1-7) and determine if it is a weekday or weekend.  

public class Main38{
    public static void main(String args[]){
        int number = 5;


        if(number==6 || number == 7 ){
            System.out.println("weekend");
        }

        else if(number>=1 && number<=5){
            System.out.println("weekday");
        }
        else{
            System.out.println("Invalid");
        }

        //using swtich, anonther way

        if(number==6 || number==7){
            switch(number) {

                 case 6 :
                    System.out.println("weekend - Sat");
                    break;

                case 7 :
                    System.out.println("weekend - Sun");
                    break;

            }
                 
        }else{
            switch(number) {

                case 1 :
                    System.out.println("weekday - Mon");
                    break;

                case 2 :
                    System.out.println("weekday - Tuesday");
                    break;
                
                 case 3 :
                    System.out.println("weekday - wed");
                    break;

                case 4 :
                    System.out.println("weekday - thu");
                    break;

                case 5 :
                    System.out.println("weekday - fir");
                    break;

                default :
                    System.out.println("Invalid");
            }
                 
        }

        
    }
}
