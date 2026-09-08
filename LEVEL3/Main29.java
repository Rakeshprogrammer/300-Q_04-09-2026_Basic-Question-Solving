//Question 9: Take two angles of a triangle and compute the third angle.
//Bachpan ki geometry yaad kar! Ek valid triangle chahe jaisa bhi dikhta ho, 
// uske teeno andar ke angles (kono) ka sum hamesha 180 degrees hota hai.
// Agar humare paas 3 angles $a$, $b$, aur $c$ hain, toh universal equation banti hai:
// a + b + c = 180


public class Main29{
    public static void main(String args[]){
        int a = 10 ;
        int b = 70 ;
        int c ;
                                //or // if(a>0 && b>0 && (a+b)<=180) //Guard Clause
        if(a+b>0 && a+b<=180){
        c = 180 - (a+b);   // formula say = a + b + c = 180 - angles of trinagle is 180
        System.out.println("The 3rd angle is : " + " " +c);
    }else{
        System.out.println("Invalid triangle");
    }

    }

}