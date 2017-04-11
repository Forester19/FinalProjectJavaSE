package model;

/**
 * @author Владислав
 * @version 1.0
 *
 * Entity - plane
 */
public class AirCraftType implements Comparable<AirCraftType> {
    private int id;
    private String name;
    private int totalCapacity;
    private int totalCarryCapacity;
    private int maxRageFlying;
    private int fuelConsumptionPer100km;

    public AirCraftType(int id, String name, int totalCapacity, int totalCarryCapacity, int maxRageFlying, int fuelConsumptionPer100km) {
        this.id = id;
        this.name = name;
        this.totalCapacity = totalCapacity;
        this.totalCarryCapacity = totalCarryCapacity;
        this.maxRageFlying = maxRageFlying;
        this.fuelConsumptionPer100km = fuelConsumptionPer100km;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalCapacity() {
        return totalCapacity;
    }

    public void setTotalCapacity(int totalCapacity) {
        this.totalCapacity = totalCapacity;
    }

    public int getTotalCarryCapacity() {
        return totalCarryCapacity;
    }

    public void setTotalCarryCapacity(int totalCarryCapacity) {
        this.totalCarryCapacity = totalCarryCapacity;
    }

    public int getMaxRageFlying() {
        return maxRageFlying;
    }

    public void setMaxRageFlying(int maxRageFlying) {
        this.maxRageFlying = maxRageFlying;
    }

    public int getFuelConsumptionPer100km() {
        return fuelConsumptionPer100km;
    }

    public void setFuelConsumptionPer100km(int fuelConsumptionPer100km) {
        this.fuelConsumptionPer100km = fuelConsumptionPer100km;
    }

    @Override
    public String toString() {
        return id +
                "  " + name +
                "  " + totalCapacity +
                "  " + totalCarryCapacity +
                "  " + maxRageFlying +
                "  " + fuelConsumptionPer100km;
    }


    @Override
    public int compareTo(AirCraftType o) {
        return this.getMaxRageFlying() > o.getMaxRageFlying() ? 1 : -1;
    }
}
