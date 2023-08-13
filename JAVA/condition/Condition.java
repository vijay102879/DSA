package condition;
import java.util.*;
import java.util.Scanner;
import java.net.PortUnreachableException;

import javax.lang.model.util.ElementScanner14;
import javax.sound.midi.SoundbankResource.*;

public class Condition{
    public static void main(String []Strings){

        System.out.println("Enter First  number");
        Scanner  sc1 = new Scanner(System.in);
        int x  = sc1.nextInt();

        System.out.println("Enter Second  number");
        Scanner  sc2 = new Scanner(System.in);
        int y  = sc2.nextInt();
    
        if (x == y){
            System.out.println("number  is equal");
        }
        else if(x> y){
            System.out.println(" number  is greater");
        }
        else{
            System.out.println(" number  is less");
        }

    
        int n = 3;
        switch(n) {
        case 1 :
            System.out.println("Monday");
            break;
        case 2 :
            System.out.println("Tuesday");
            break;
        case 3 :
            System.out.println("Wednesday");
            break;
        case 4 :
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6 :
            System.out.println("Saturday");
            break;
        default :
            System.out.println("Sunday");
        }
    }
}
