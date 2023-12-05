public class CompoundInterest{
    public static void main(String[] args) {
        
        double amount = 8500;
        System.out.println("Enter the principle amount: "+amount);

        double interest= 0.003;
        System.out.println("Interest rate: "+interest);

        int years = 5;
        System.out.println("Time period: "+years);

        double A = amount*(Math.pow(1 + interest / 100, 5));
        System.out.println("output: "+A);
       
    }
}
