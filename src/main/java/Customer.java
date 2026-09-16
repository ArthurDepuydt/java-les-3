public class Customer {
    String name;
    SuperMarket superMarket;

    public Customer(String name){
        this.name = name;
    }

    public void goToSuperMarket(SuperMarket superMarket){
        this.superMarket = superMarket;
    }

    public void buyItem(String productName, int amount){
        if (this.superMarket == null){
            System.out.println("Select a supermarket to go to first");
        }
        else {
            for (int i = 0; i < superMarket.products.size(); i++) {
                if (superMarket.products.get(i).name.equalsIgnoreCase(productName)){
                    superMarket.buyItem(superMarket.products.get(i), amount);
                    return;
                }
            }
            System.out.println(superMarket.name + " does not sell " + productName);
        }
    }
}
