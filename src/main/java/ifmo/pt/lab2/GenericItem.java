package ifmo.pt.lab2;

import java.util.LinkedList;
import ifmo.pt.lab2.Category;

class GenericItem {
    public int ID;
    public LinkedList<Integer> analogIds = new LinkedList<Integer>();
    public String name;
    public float price;
    public Category category = Category.GENERAL;

    GenericItem(int ID, String name, float price, Category category) {
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    void addAnalog(int ID) {
        this.analogIds.push(ID);
    }

    void addAnalog(GenericItem item) {
        this.analogIds.push(item.ID);
    }

    @Override
    public String toString() {
        return String.format("ID: %d | Name: %-20s | Price: %5.2f | Category: %s", ID, name, price, category);
    }

    @Override
    protected Object clone() {
        GenericItem item = new GenericItem(this.ID, this.name, this.price, this.category);
        item.analogIds = (LinkedList<Integer>) this.analogIds.clone();
        return item;
    }

    void printAll() {
        System.out.println(this.toString());
    }

}