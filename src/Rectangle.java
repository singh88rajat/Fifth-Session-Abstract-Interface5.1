
public class Rectangle extends FindPerimeter{
	double length, breadth;
	
	public Rectangle(double length, double breadth) {
		super(dim1);
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	void findArea() {
		// TODO Auto-generated method stub
		area=length * breadth;
		System.out.println("The area of the Rectangle is:" + area);
		
	}

	@Override
	void findPerimeter() {
		// TODO Auto-generated method stub
		perimeter= 2*(length + breadth);
		System.out.println("The Preimeter of the Rectangle is:" + perimeter);
	}

}
