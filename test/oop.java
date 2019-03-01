package test;

public class oop {
	
	public static void main(String[] args) {
		
		
		shape s1 = new circle();
		s1.draw();
		
		vehicle v1 = new vehicle();
		System.out.println(v1.getColor());
		
		vehicle v2  = new vehicle("civic" , "black","zxi","honda","800");
		System.out.println(v2.getModel());
		
		v1.setName("BMW");
		v2.setName("xx");
		
		System.out.println(v1.getName());
		System.out.println(v2.getName());
		
		System.out.println(v2.speed());
		System.out.println(vehicle.count);
		
		car c1 = new car("civic1" , "black","zxi","honda","800" ,true,false);
		System.out.println(c1.getName());
		System.out.println(c1.getpowerSteer());
		System.out.println(c1.getName());
		
		vehicle v4 = new vehicle("civic" , "black","zxi","honda","800");
		vehicle v5 = new car ("civic1" , "black","zxi","honda","800" ,true,false);
	System.out.println(v5.info());
		
	}

}
