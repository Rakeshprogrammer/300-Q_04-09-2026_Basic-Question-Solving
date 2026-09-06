//Agar ek valid triangle ban gaya, toh wo 3 mein se ek type ka ho sakta hai:
// Equilateral (Samabahu): Jiski teeno sides bilkul barabar hon. (Jaise: 10, 10, 10).
// Isosceles (Samdvibahu): Jiski koi bhi do sides barabar hon. (Jaise: 10, 10, 5 ya 5, 10, 10).
// Scalene (Vishamabahu): Jiski teeno sides alag-alag hon. (Jaise: 7, 8, 9).

public class Main12{
    public static void main(String args[]){
        int a = 30;
        int b = 10;
        int c = 10;
        if(a+b>c && b+c>a && c+a>b ){
            System.out.println("its a Valid Triangle" + "Lets Check which type");
            if(a==b && b==c && c==a){
                System.out.println("its a EQuilateral");
            }
            else if(a==b || b==c || c==a){
                System.out.println("its a Isosceles");
            }
            else{
                System.out.println("its a Scalene");
            }
        }else{
            System.out.println("its a not Valid Triangle");
        }
    }
}
