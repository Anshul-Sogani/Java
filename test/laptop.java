package test;

public class laptop implements Comparable {

	private String brand;
	private String name;
	private int price;

	public laptop(String brand, String name, int price) {
		this.brand = brand;
		this.name = name;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "laptop [brand=" + brand + ", name=" + name + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Object o) {
		laptop l = (laptop) o;
		if (this.getPrice() > l.getPrice()) {

			return 1;

		}

		return -1;
	}

}
