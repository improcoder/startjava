public class WolfTest {

	public static void main(String[] args) {
		
		Wolf wolf = new Wolf();
		
		System.out.println(wolf.name);
		System.out.println(wolf.color);
		System.out.println(wolf.age);
		System.out.println(wolf.weight);
		System.out.println(wolf.sex);

		wolf.move();
		wolf.sit();
		wolf.run();
		wolf.shout();
		wolf.hunt();
	}
}