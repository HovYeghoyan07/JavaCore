package book.chapter12;

public enum Apple {
    JONATHAN,
    GOLDEN_DEL,
    RED_DEL,
    WINESAP,
    CORTLAND;

    private int price;
    Apple(int p){price = p;}
    int getPrice(){return price;}
    Apple(){}
}
