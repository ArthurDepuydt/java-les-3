import java.util.ArrayList;
import java.util.List;

public class SuperMarket {
    List<Product> products;
    String name;

    public SuperMarket(List<Product> products, String name){
        if (products != null){
            this.products = products;
        }
        else {
            this.products = new ArrayList<>();
        }
        this.name = name;
    }

    public void buyItem(Product product, int amount){
        if (amount < product.amount){
            double finalPrice = product.price * amount;
            System.out.println("You bought " + amount + " " + product.name +  " for " + finalPrice + " euro");
        }
        else {
            System.out.println("You cannot buy " + amount + " " + product.name + " , we only have "
                    + amount + " " + product.name + " in stock.");
        }
    }

    public void restockItem(String productName, int amount){
        for (int i = 0; i < this.products.size(); i++) {
            if (productName.equalsIgnoreCase(this.products.get(i).name)){
                this.products.get(i).amount =+ amount;
                return;
            }
            else{
                System.out.println(this.products.get(i).name + " was not found, so it has not been restocked");
            }
        }
    }

}
