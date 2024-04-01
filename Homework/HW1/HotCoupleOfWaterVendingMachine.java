package Homework.HW1;

import java.util.List;

public class HotCoupleOfWaterVendingMachine implements VendingMachine {
    List<HotCoupleOfWater> products;

    @Override
    public void initVendingMachine() {

    }

    public void initVendingMachine(List<HotCoupleOfWater> products) {
        this.products = products;
    }

    @Override
    public Product getProduct(String name) throws IllegalStateException {
        for(HotCoupleOfWater product: products){
            if(product instanceof BottleOfWater){
                if (product.getName().equalsIgnoreCase(name)) {
                    return product;
                }
            }
        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));

    }


    public Product getProduct(String name, int volume, double temperature){

        for(HotCoupleOfWater product: products){
            if(product instanceof BottleOfWater){
                if(product.getName().equalsIgnoreCase(name)
                        && product.getVolume() == volume
                        &&  product.getTemperature() == temperature) {
                    return product;
                }
            }
        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
    }
}
