package Homework.HW1;

public interface VendingMachine {
    void initVendingMachine();
    Product getProduct(String name) throws IllegalStateException;
}
