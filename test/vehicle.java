package test;

public class vehicle {

	private String name = "";
	private String color = "";
	private String model = "";
	private String company = "";
	private String engine = "800";
	public static int count = 0;

	public vehicle() {

		count++;

	}

	public vehicle(String name, String color, String model, String company, String engine) {

		this.name = name;
		this.color = color;
		this.model = model;
		this.company = company;
		this.engine = engine;

		count++;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getName() {
		return this.name;
	}

	public String getColor() {
		return this.color;
	}

	public String getModel() {
		return this.model;
	}

	public String getCompany() {
		return this.company;
	}

	private String getEngine() {
		return this.engine;
	}

	public int speed() {
		String s = getEngine();

		if (s == "800") {
			return 90;
		} else
			return 210;

	}
	
	public String info() {
		return "this is a vehicle";
	}

}
