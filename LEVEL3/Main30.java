//Question 10: Check whether a number 
// is a perfect square (without using the square root function).
//2*2=4
//3*3 = 9
//4*4 = 16

//Optimal Code //best way. alway see this !

public class Main30{
    public static void main(String args[]){
        boolean isSquare = false;     //it is import for checking it and making the flag for behaving like on / off swtich.
        int num = 4 ;

        for(int i = 1 ; i*i<=num ;i++){
           if(i*i==num){       //new varibale create kar te aur phir usko store kar te, int sq = i*i,, isko -> i*i == num,  voh dirct hi kar diya , withou creating the new variable.
              isSquare = true;
             break;
           }
            
        }

        if(isSquare==true){
            System.out.println("Perfect Square");
        }else{
                System.out.println("NOT Perfect Square");
        }


    }
}


 
//Not a good code see, See the Optimal Code
/*
public class Main30{
    public static void main(String args[]){
        int number = 4;
        int originalnumber = number;
        int sq = 1 ;
        for(int i=1 ; i<=number ; i++){
             sq = i * i;
        
        if(sq==originalnumber){
            break;
        } 

        }

    if (sq == originalnumber) {
    System.out.println("It is a Perfect Square");
} else {
    System.out.println("Not a Perfect Square");
}

    }
}*/