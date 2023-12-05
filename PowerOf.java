import java.util.Scanner;

public class PowerOf{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
 
    int b = sc.nextInt();
    System.out.println("base= " + b);

    int e = sc.nextInt();
    System.out.println("exponent= " + e);

    int calculatepower =(int)Math.pow(b,e);
    
    System.out.println("Result= " + calculatepower );
    
    }
} 