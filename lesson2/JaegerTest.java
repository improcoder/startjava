public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger();
        Jaeger jaeger2 = new Jaeger();
        Jaeger jaeger3 = new Jaeger("Stanley", 385.2, 178.5, 4, 5);

        jaeger1.setName("Avenger");
        jaeger1.setHeight(350.5);
        jaeger1.setWeight(150.8);
        jaeger1.setArmor(5);
        jaeger1.setStrength(4);

        jaeger2.setName("Eureka");
        jaeger2.setHeight(370.5);
        jaeger2.setWeight(175.4);
        jaeger2.setArmor(7);
        jaeger2.setStrength(3);

        System.out.println("Robot 1");
        System.out.println("Name: " + jaeger1.getName());
        System.out.println("Height: " + jaeger1.getHeight());
        System.out.println("Weight: " + jaeger1.getWeight());
        System.out.println("Armor: " + jaeger1.getArmor());
        System.out.println("Strength: " + jaeger1.getStrength());

        System.out.println();

        System.out.println("Robot 2");
        System.out.println("Name: " + jaeger2.getName());
        System.out.println("Height: " + jaeger2.getHeight());
        System.out.println("Weight: " + jaeger2.getWeight());
        System.out.println("Armor: " + jaeger2.getArmor());
        System.out.println("Strength: " + jaeger2.getStrength());

        System.out.println();

        System.out.println("Robot 3");
        System.out.println("Name: " + jaeger3.getName());
        System.out.println("Height: " + jaeger3.getHeight());
        System.out.println("Weight: " + jaeger3.getWeight());
        System.out.println("Armor: " + jaeger3.getArmor());
        System.out.println("Strength: " + jaeger3.getStrength());
    }
}
