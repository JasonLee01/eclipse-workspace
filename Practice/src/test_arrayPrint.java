// Exercise for array usage - Jan 10,2018

public class test_arrayPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	//constructing	
	Array a1 = new Array();
	
	//array assigning
	int a = 10;
	a1.assignPrtK(a);
	
	//get array
	String[] prtK = a1.getArray();
	
	//print array
	for (int i=0;i<a;i++) System.out.println(prtK[i]);
		
	}
}
