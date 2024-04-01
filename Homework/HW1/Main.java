package Homework.HW1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    
//    1. Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
//    2. Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать перегруженный метод getProduct(int name, int volume, int temperature), выдающий продукт соответствующий имени, объёму и температуре
//    3. В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику, заложенную в программе
//    4. Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре

    public static void main(String[] args) {
        HotCoupleOfWater cup1 = new HotCoupleOfWater("Drink1", 10, 1, 45);
        HotCoupleOfWater cup2 = new HotCoupleOfWater("Drink2", 15, 1, 60);
        HotCoupleOfWater cup3 = new HotCoupleOfWater("Drink3", 25, 2, 45);
        HotCoupleOfWater cup4 = new HotCoupleOfWater("Drink1", 14, 2, 30);

        List<HotCoupleOfWater> hotProduct = new ArrayList<>();
        hotProduct.add(cup1); hotProduct.add(cup2); hotProduct.add(cup3); hotProduct.add(cup4);

        HotCoupleOfWaterVendingMachine hotCoupleOfWaterVendingMachine = new HotCoupleOfWaterVendingMachine();
        hotCoupleOfWaterVendingMachine.initVendingMachine(hotProduct);
        String searchProduct = "drink1";
        String searchStr = "";
        if (hotCoupleOfWaterVendingMachine.getProduct(searchProduct) != null) {
            searchStr = hotCoupleOfWaterVendingMachine.getProduct(searchProduct).toString();
        }
        System.out.printf("В автомате ищем %s :\n%s%n", searchProduct, searchStr);
    }
}
