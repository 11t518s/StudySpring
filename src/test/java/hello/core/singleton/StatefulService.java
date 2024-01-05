package hello.core.singleton;

public class StatefulService {
    private int price;

    public int order(String name, int price) {
        System.out.println("name = " + name);
        System.out.println("price = " + price);

        return price;
    }

    public int getPrice(int price) {
        return price;
    }
}
