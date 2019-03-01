package collection;

class con<T extends Number>

{
	T value;

	public void display() {

		System.out.println(value.getClass().getName());

	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

}

public class generics {
	public static void main(String[] args) {

		con<Integer> obj = new con<>();

		obj.setValue(21); 

		obj.display();

	}

}
