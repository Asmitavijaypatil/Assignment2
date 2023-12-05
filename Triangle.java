public class Triangle{
    public static void main(String[] args) {
    
    int a = 10;
    System.out.println("Enter Length of 1st side= "+a);  

    int b = 10;
    System.out.println("Enter Length of 2nd side= "+b); 

    double hypoteneous = Math.sqrt((a*a) + (b*b));
    System.out.println("Hypoteneous= "+ hypoteneous);
    }
}