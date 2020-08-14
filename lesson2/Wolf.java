public class Wolf {

	private String name = "Wolf";
	private String color = "Gray";
	private int age = 5;
	private double weight = 25.5;
	private char sex = 'M';

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 8) {
			System.out.println("Wrong age");
		} else {
			this.age = age;
		}
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public void move() {

	}

	public void sit() {

	}

	public void run() {

	}

	public void shout() {

	}

	public void hunt() {

	}
}