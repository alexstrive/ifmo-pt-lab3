package ifmo.pt.lab3;

import java.util.Date;

public class App {

    public static void main(String[] args) {
        var item1 = new GenericItem(1, "shoes", 123.2f, Category.GENERAL);
        var item2 = new GenericItem(2, "t-shirt", 102.5f, Category.DRESS);
        var item3 = new TechnicalItem(3, "computer", 50, Category.GENERAL, (short) 123);
        item1.printAll();
        item2.printAll();
        item3.printAll();
        item3.addAnalog(item2);

        GenericItem[] items = { new FoodItem(4, "snack", 13f, Category.FOOD, new Date(), (short) 23),
                new TechnicalItem(5, "cord", 1.5f, Category.GENERAL, (short) 32) };

        for (var item : items) {
            item.printAll();
        }

        var item4 = (GenericItem) item3.clone();
        System.out.println(item4);
        System.out.println("Analog of item4: " + item4.analogs.get(0));
    }
}
