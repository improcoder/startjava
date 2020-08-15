public class WolfTest {

	public static void main(String[] args) {
		Wolf wolf = new Wolf();

		wolf.setName("Gray Wolf");
		wolf.setColor("Darkgray");
		wolf.setAge(3);
		wolf.setWeight(21.5);
		wolf.setSex('M');
		
		System.out.println(wolf.getName());
		System.out.println(wolf.getColor());
		System.out.println(wolf.getAge());
		System.out.println(wolf.getWeight());
		System.out.println(wolf.getSex());

		wolf.move();
		wolf.sit();
		wolf.run();
		wolf.shout();
		wolf.hunt();
	}
}