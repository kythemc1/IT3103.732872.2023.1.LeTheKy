package Main.store;

import Main.model.DVD;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<DVD> items = new ArrayList<>();

    public void addItem(DVD dvd) {
        items.add(dvd);
    }

    public void removeItem(int id) {
        items.removeIf(item -> item.getId() == id);
    }

    public void addDigitalVideoDisc(DVD[]listCart){
        items.addAll(List.of(listCart));
    }
    public void displayCart() {
        double totalCost=0;
        System.out.println("\n"+"******************************************FB88******************************************"+"\n");
        for (DVD item : items) {
            System.out.println(item.toString());
            totalCost=totalCost+item.getCost();
        }
        System.out.println("Total cost: "+ totalCost);
        System.out.println("\n"+"******************************************FB88******************************************"+"\n");
    }
}