public class SuperMarket {
    Product bread;
    Product fruit;
    Product toiletPaper;
    Product cheese;

    public SuperMarket(Product bread, Product fruit, Product toiletPaper, Product cheese){
        this.bread = bread;
        this.fruit = fruit;
        this.toiletPaper = toiletPaper;
        this.cheese = cheese;
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

    public void buyBread(int amount){
        buyItem(this.bread, amount);
    }

    public void buyFruit(int amount){
        buyItem(this.fruit, amount);
    }

    public void buyCheese(int amount){
        buyItem(this.cheese, amount);
    }

    public void buyToiletPaper(int amount){
        buyItem(this.toiletPaper, amount);
    }
}
