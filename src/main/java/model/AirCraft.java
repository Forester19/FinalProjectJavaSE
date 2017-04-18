package model;

/**
 * Created by Владислав on 14.04.2017.
 */
public class AirCraft extends BaseEntity implements Comparable<AirCraft>{
    private int totalCapacity;
    private int totalCarryCapacity;
    private int maxRageFlying;
    private int fuelConsumptionPer100km;
    private Type type;

    public AirCraft(int id, String name,Type type, int totalCapacity, int totalCarryCapacity, int maxRageFlying, int fuelConsumptionPer100km ) {
        super(id, name);
        this.totalCapacity = totalCapacity;
        this.totalCarryCapacity = totalCarryCapacity;
        this.maxRageFlying = maxRageFlying;
        this.fuelConsumptionPer100km = fuelConsumptionPer100km;
        this.type = type;
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

    public Type getType() {
        return type;
    }

    @Override
    public int compareTo(AirCraft o) {
        return this.getMaxRageFlying() > o.getMaxRageFlying() ? 1 : -1;
    }

    @Override
    public String toString() {
        return getId() + " "+ getName() + " " + getTotalCapacity()+" "+getTotalCarryCapacity()+ " " + getMaxRageFlying() + " " + getFuelConsumptionPer100km()
                + " " + getType().write();
    }
}

