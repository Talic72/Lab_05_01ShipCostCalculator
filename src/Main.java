import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            Scanner in = new Scanner(System.in);

            double FEE_PRICE = .02;
            int comparor = 100;

            System.out.println("What is the price of your item:");
            double beforeCost = in.nextDouble();

            if(beforeCost >= comparor) {
                System.out.println("Your final cost is $" + beforeCost + " since your item totals more then 100 no fee is applied.");
            }
            else {
                double outCost = beforeCost + (beforeCost * FEE_PRICE);
                System.out.println("Your final cost with the under 100 fee applied is $" + outCost);
            }

    }
}