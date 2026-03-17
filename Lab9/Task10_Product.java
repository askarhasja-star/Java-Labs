class Product {
    String name;
    double price;

    Product(String n, double p) {
        name = n;
        price = p;
    }

    void showPrice() {
        System.out.println(name + ": " + price + " тг");
    }
}

class Food extends Product {
    Food(String n, double p) { super(n, p); }
}

class Electronics extends Product {
    Electronics(String n, double p) { super(n, p); }
}

class Clothes extends Product {
    Clothes(String n, double p) { super(n, p); }
}

public class Task10_Product {
    public static void main(String[] args) {
        Product p = new Food("Хлеб", 200);
        p.showPrice();
    }
}