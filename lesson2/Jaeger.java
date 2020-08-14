public class Jaeger {

    private String name;
    private double height;
    private double weight;
    private int armor;
    private int strength;

    public Jaeger() {
    }

    public Jaeger(String name, double height, double weight, int armor, int strength) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.armor = armor;
        this.strength = strength;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getArmor() {
        return armor;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }
}
