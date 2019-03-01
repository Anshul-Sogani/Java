package test;
import java.lang.*;
import java.io.*;
import java.util.*;


public class binary {
	
	public static void main(String ab[]) {

	int a =10;
	
	StringBuilder sb =  new StringBuilder();
	
	String s = Integer.toBinaryString(a);
	
	sb.append(s);
	System.out.println(sb);
	sb.reverse();
	
	System.out.println(sb);
	
	String str = sb.toString();
	
	int q = Integer.parseInt(str,2);
	
	System.out.println(q);
	

	
	}
	
	
	
}
