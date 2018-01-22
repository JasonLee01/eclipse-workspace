// First program that I made with my own skill - little bit of pre-references though :)
// 2017 Jan 4th
public class testRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle r1 = new Rectangle();
		
		System.out.println("width = " + r1.getWidth());
		System.out.println("length = " + r1.getLength());
		System.out.println("area = " + r1.getArea());
		System.out.println("perimeter = " + r1.getPerimeter());

		System.out.println(r1.toString());

		System.out.println("");
		
		r1.setLength(10);
		r1.setWidth(20);

		System.out.println("width = " + r1.getWidth());
		System.out.println("length = " + r1.getLength());
		System.out.println("area = " + r1.getArea());
		System.out.println("perimeter = " + r1.getPerimeter());

		System.out.println(r1.toString());		

		
		System.out.println("");
		
		Rectangle r2 = new Rectangle(4,5);

		System.out.println("width = " + r2.getWidth());
		System.out.println("length = " + r2.getLength());
		System.out.println("area = " + r2.getArea());
		System.out.println("perimeter = " + r2.getPerimeter());
				
		System.out.println(r2.toString());

		System.out.println("");
		
		r2.setLength(100);
		r2.setWidth(100);		
		
		System.out.println("width = " + r2.getWidth());
		System.out.println("length = " + r2.getLength());
		System.out.println("area = " + r2.getArea());
		System.out.println("perimeter = " + r2.getPerimeter());
				
		System.out.println(r2.toString());
		
	}

}
