package test;

public class bike extends vehicle {

	private boolean fourStroke = false;

	public bike(String name, String color, String model, String company, String engine, boolean fourStroke) {

		super(name, color, model, company, engine);
		this.fourStroke = fourStroke;

	}

	public void setfourStroke(boolean f) {
		this.fourStroke = f;
	}
	
	public boolean getfourStroke() {
		return this.fourStroke;
	}
	
	public String info() {
		return "this is a bike";
	}

}
