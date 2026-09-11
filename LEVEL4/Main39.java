//Question 9: Take electricity units consumed and calculate the bill as per slabs (using if-else).
//1. Logic Class (Slabs ko kaise todein?)
//Maan le sarkar ne yeh rules banaye hain:

//Slab 1: Agar units 100 ya usse kam hain, toh rate hai ₹5 per unit.

//Slab 2: Agar units 100 se zyada aur 200 tak hain, toh rate hai ₹7 per unit.

//Slab 3: Agar units 200 se zyada hain, toh rate hai ₹10 per unit.

///Asli Real-World Catch (Dhyan se samajh):
//Agar tune 150 units jalaye, toh tera bill seedha 150 * 7 nahi hoga!
//Slab system mein pehle 100 units ka bill ₹5 ke hisaab se banega, aur bache hue 50 units ka bill ₹7 ke hisaab se banega.
//Math: (100 * 5) + (50 * 7)



public class Main39{
    public static void main(String args[]){

        int unit = 100 ;
        int bill;
        if(unit<=100){
            bill = unit*5;
            System.out.println("The Unit Consum:" + bill);
        }

        else if(unit<=200){
            bill = 100*5 + ((unit-100)*7);
            System.out.println("The Unit Consum:" + bill);
        }
        else{
             bill = (100*5 )+ (100*7) + ( (unit-200)*10);
               System.out.println("The Unit Consum:" + bill);
        }
    


    //My way - poor way
    

    int units = 100;
    int bill_2;
    int cal;
      if(units<=100){
        bill_2 = units*5;
         System.out.println("The Unit Consum:" + bill_2);
      }
         

    else if(unit<=200){
         
        cal = units - 100;
        bill_2 = 100*5 + cal*7;
        System.out.println("The Unit Consum:" + bill_2);

    }else{
        cal = units-200;
        bill_2= 100*5 + 100*7 + cal*10;
        System.out.println("the Unit Consum:" + bill_2);
    }

}

}

        