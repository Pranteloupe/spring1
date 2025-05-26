package main;

public class DeliveryDetailsPrinter {
    private final Sorter sorter;

    public DeliveryDetailsPrinter(Sorter sorter) {
        this.sorter = sorter;
    }

    public void printDeliveryDetails() {
        sorter.sortDetails();
        //print them
    }
}
