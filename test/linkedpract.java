package test;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedpract {
	int val;
	linkedpract next;
	public linkedpract(int v, linkedpract n) {
		val = v;
		next = n;
	}
	public static void main(String[] args) {
		linkedpract t2 = new linkedpract(3,null);
		linkedpract t1 = new linkedpract(5,t2);
		linkedpract head1 = new linkedpract(1,t1);
		
		linkedpract l2 = new linkedpract(6,null);
		linkedpract l1 = new linkedpract(5,l2);
		linkedpract head2 = new linkedpract(4,l1);
		
	}
	
	public linkedpract sum(linkedpract head1, linkedpract head2) {
		return null;
	}

}
