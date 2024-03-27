
import java.util.*;
import java.io.*;
import java.util.Scanner;

public class BuzzNumber {
  static boolean checkNumber(int number){
        if(number % 10 == 7 || number % 7 == 0){
            return true;
        } else 
        return false;
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n1,n2;
        n1 = sc.nextInt();
    
        if(checkNumber(n1)){
            System.out.println(n1+"Is a Buzz number");
        }
        else{
            System.out.println(n1+"is not a buzz number");
        }
    }
}

