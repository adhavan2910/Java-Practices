package LoopingStatements;
import java.util.Scanner;

public class RotateNo {
    public static int isRotate(int n) {
        int result=0;
        int place=1;
        while(n>0){
            int d1=n%10;        
            n/=10;
            if(n>0){
                int d2 = n % 10;    
                n /= 10;
                result = result + (d1 * 10 + d2) * place;
                place *= 100;
            }else{
                result=result+d1*place;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        System.out.println(isRotate(n));
    }
}


