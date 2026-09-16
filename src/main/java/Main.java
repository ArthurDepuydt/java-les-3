import java.util.*;

public class Main {
    public static void main(String[] args){

        //LIJSTEN
        List<Product> productListHalbert = new ArrayList<>(Arrays.asList(
                new Product("bread", 2.20, 10),
                new Product("fruit", 1.20, 20),
                new Product("cheese", 3.35, 5),
                new Product("toiletPaper", 5.00, 23)
        ));

        List<Product> productListDumbo = new ArrayList<>(Arrays.asList(
                new Product("milk", 1.15, 30),
                new Product("coffee", 6.49, 12),
                new Product("eggs", 2.89, 18),
                new Product("butter", 2.45, 8),
                new Product("pasta", 1.65, 40)
        ));

        List<Product> productListCaldi = new ArrayList<>(Arrays.asList(
                new Product("shampoo", 4.10, 14),
                new Product("soap", 1.75, 25),
                new Product("toothpaste", 3.20, 16),
                new Product("detergent", 7.95, 6)
        ));

        //SUPERMARKTEN
        Map<String, SuperMarket> superMarketMap = new HashMap<>();

        superMarketMap.put("halbert Eijn", new SuperMarket(productListHalbert, "Halbert Eijn"));
        superMarketMap.put("dumbo", new SuperMarket(productListDumbo, "Dumbo"));
        superMarketMap.put("caldi", new SuperMarket(productListCaldi, "Caldi"));

        Customer customer = new Customer("Jan");

        Scanner scanner = new Scanner(System.in);
        String productName;
        String amount;
        System.out.println("\nWhat do you want to do?");
        System.out.println("1 - Pick a supermarket");
        System.out.println("2 - buy a product");
        System.out.println("3 - restock a product");
        System.out.println("4 - exit");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.println("Which supermarket do you want to go to?");
                System.out.println("Pick one of the following:");
                System.out.println("- Halbert Eijn");
                System.out.println("- Dumbo");
                System.out.println("- Caldi");
                String superMarketChoice = scanner.nextLine().toLowerCase();
                customer.superMarket = superMarketMap.get(superMarketChoice);
                break;

            case 2:
                if(customer.superMarket == null) {
                    System.out.println("Pick a supermarket first.");
                    break;
                }
                else{
                    System.out.println("Which product do you want to buy from" +
                            customer.superMarket + "?");
                    String chosenProduct = scanner.nextLine().toLowerCase();

                    System.out.println("How many do you want to buy?");
                    String chosenAmount = scanner.nextLine().toLowerCase();

                    customer.buyItem(chosenProduct, Integer.parseInt(chosenAmount));
                    break;
                }
            case 3:
                System.out.println("Which supermarket do you want to restock?");
                System.out.println("Pick one of the following:");
                System.out.println("- Halbert Eijn");
                System.out.println("- Dumbo");
                System.out.println("- Caldi");
                superMarketChoice = scanner.nextLine().toLowerCase();

                SuperMarket chosenSuperMarket = superMarketMap.get(superMarketChoice);

                System.out.println("Which product do you want to restock in "
                        + superMarketChoice + "?");
                String chosenProductToRestock = scanner.nextLine().toLowerCase();

                System.out.println("How many do you want to add?");
                String chosenAmount = scanner.nextLine().toLowerCase();

                chosenSuperMarket.restockItem(chosenProductToRestock, Integer.parseInt(chosenAmount));

                break;

            case 4:
                System.out.println("Thanks for passing by, see you later!");
                break;

            default:
                System.out.println("This is not a valid input");
        }

    }
}
