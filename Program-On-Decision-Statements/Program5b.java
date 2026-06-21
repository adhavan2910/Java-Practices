package ProgramsOnDecisionStatements;
import java.util.Scanner;
public class Program5b{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character:");
        char ch = sc.next().charAt(0);

        if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println("It is an ALPHABET");

            if(ch >= 'A' && ch <= 'Z') {
                System.out.println("Uppercase Letter");
            } 
            else {
                System.out.println("Lowercase Letter");
            }

            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
               ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
                System.out.println("Vowel");
            }
            else {
                System.out.println("Consonant");
            }
        }

        else if(ch >= '0' && ch <= '9') {
            System.out.println("It is a NUMBER");
        }

        else {
            System.out.println("It is a SPECIAL CHARACTER");
        }

        sc.close();
    }
}
