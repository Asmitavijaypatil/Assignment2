import java.util.Scanner;

public class LastDigitSum{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter a five digit number: ");
    int number = sc.nextInt();
    
     int firstdigit = number / 10000;
     int lastdigit = (number / 10) % 10;

     int output = firstdigit + lastdigit;
     System.out.println("output: "+ firstdigit + " + " + lastdigit + "=" + output);
    
    }
} 
