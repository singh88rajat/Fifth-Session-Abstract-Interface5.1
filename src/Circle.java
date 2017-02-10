
public class Circle extends FindPerimeter {
	 double pi=3.14159f;
	public Circle(double dim1) {
		super(dim1);
		// TODO Auto-generated constructor stub
	}

	@Override
	void findArea() {
		// TODO Auto-generated method stub
		area= pi*dim1*dim1;
		System.out.println("The area of the circle is:" + area);
	}

	@Override
	void findPerimeter() {
		// TODO Auto-generated method stub
		perimeter= 2 * pi * dim1;
		System.out.println("The Perimeter of the circle is:" + perimeter);
	}

}
