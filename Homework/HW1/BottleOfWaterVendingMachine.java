package Homework.HW1;

import java.util.ArrayList;
import java.util.List;

public class BottleOfWaterVendingMachine implements VendingMachine {
    private List<BottleOfWater> products;

    public void initVendingMachine() {
    }

    public void initVendingMachine(List<BottleOfWater> products) {
        this.products = products;
    }

    @Override
    public Product getProduct(String name){
        List<BottleOfWater> result = new ArrayList<>();
        for(BottleOfWater product: products){
            if(product.getName().equalsIgnoreCase(name)){
                result.add(product);
            }
        }
        if (result.size() > 0) {
            return (Product) result;
        } else {
            throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
        }
    }

    public BottleOfWater getProduct(String name, int volume){
        for(BottleOfWater product: products){
            if(product instanceof BottleOfWater){
                if(product.getName().equalsIgnoreCase(name) && product.getVolume() == volume){
                    return product;
                }
            }
        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
    }
}
