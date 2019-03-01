package test;

public class tower {
	
	static void towerOfHanoi(int n , char from_rod,char to_rod,char aux_rod) {
		
		
		if(n==1) {
			
			System.out.println("move the disk 1 form rod "+ from_rod+" to rod "+ to_rod);
			
			return;
		}
		
		towerOfHanoi(n-1, from_rod,aux_rod,to_rod);
		System.out.println("move the disk "+ n +" from rod "+from_rod+" to rod "+to_rod) ;
		towerOfHanoi(n-1, aux_rod, to_rod, from_rod);
		
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
	
	
	int n = 3 ; // number of disks
	
	towerOfHanoi(n,'a','c','b');// rods 
	

}


}