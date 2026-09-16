import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Product bread = new Product("bread", 2.20, 10);
        Product fruit = new Product("fruit", 1.20, 20);
        Product cheese = new Product("cheese", 3.35, 5);
        Product toiletPaper = new Product("toiletPaper", 5.00, 23);

        SuperMarket superMarket = new SuperMarket(bread, fruit, cheese, toiletPaper);
        Customer customer = new Customer("Jan");

        Scanner scanner = new Scanner(System.in);
        String productName;
        String amount;

        System.out.println("Which product do you want to buy?");
        productName = scanner.nextLine();

        System.out.println("How many do you want to buy?");
        amount = scanner.nextLine();

        int integerAmount = Integer.parseInt(amount);

        customer.goToSuperMarket(superMarket);

        customer.buyItem(productName, integerAmount);
    }
}
