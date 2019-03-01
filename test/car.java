package test;

public class car extends vehicle {

	private boolean powerSteer = true;
	private boolean radio = false;

	public car(String name, String color, String model, String company, String engine, boolean powerSteer,
			boolean radio) {
		super(name,color,model,company,engine);
		this.powerSteer = powerSteer;
		this.radio = radio;

	}
	
	public String getName() {
		return "you vehivle is" + super.getName(); 
	}

	
	
	public void setpowerSteer(boolean S) {

		this.powerSteer = S;

	}

	public void setradio(boolean r) {
		this.radio = r;
	}

	public boolean getradio() {
		return this.radio;
	}

	public boolean getpowerSteer() {
		return this.powerSteer;
	}
	public String info() {
		return "this is a car";
	}
}
