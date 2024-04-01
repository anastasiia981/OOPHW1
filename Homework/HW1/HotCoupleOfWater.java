package Homework.HW1;

import java.util.Objects;

public class HotCoupleOfWater extends BottleOfWater  {
    private double temperature;

    public HotCoupleOfWater(String name, double cost, int volume, double temperature){
        super(name, cost, volume);
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HotCoupleOfWater{" +
                "name='" + super.getName() + '\'' +
                ", cost=" + super.getCost() +
                ", volume='" + super.getVolume() + '\'' +
                ", temperature=" + temperature +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        HotCoupleOfWater that = (HotCoupleOfWater) o;
        return super.getName().equalsIgnoreCase(that.getName())
                && super.getCost() == that.getCost()
                && super.getVolume() == that.getVolume()
                && Double.compare(that.temperature, temperature) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(temperature);
    }
}
