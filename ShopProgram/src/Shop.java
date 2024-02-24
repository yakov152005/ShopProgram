public class Shop {
	private String name;
	private double banana;
	private double apple;
	private double orange;

	public String getName(){
		return name;
	}
	public double getBanana(){
		return banana;
	}
	public double getApple(){
		return apple;
	}
	public double getOrange(){
		return orange;
	}
	//Constructor1
	public Shop (String name, double banana, double apple, double orange){
		this.name = name;
		this.banana = banana;
		this.apple = apple;
		this.orange = orange;
	}

	//Constructor2
	public Shop(){
		this.name = "NA";
		this.banana = 0;
		this.apple = 0;
		this.orange = 0;
	}
	public void setData(String name, double banana, double apple, double orange){
		this.name = name;
		this.banana = banana;
		this.apple = apple;
		this.orange = orange;
	}
	public String toString(){
		return "Shop name: " + name + "\nPrice for KG banana: " + banana +
				"\nPrice for KG apple: " +apple + "\nPrice for KG orange: " +orange;
	}

}
