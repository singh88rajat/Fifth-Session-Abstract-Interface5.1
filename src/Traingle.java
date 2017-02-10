
public class Traingle extends FindPerimeter {
	double base, height;
	
	public Traingle(double base, double height) {
		super(dim1);
		this.base = base;
		this.height = height;
	}

	public Traingle(double base) {
		super(dim1);
		this.base = base;
	}

	@Override
	void findArea() {
		// TODO Auto-generated method stub
		area = (base* height)/2;
	      System.out.println("Area of Triangle is: " + area);
	}

	@Override
	void findPerimeter() {
		// TODO Auto-generated method stub
		perimeter=(base* 3);
		System.out.println("Perimeter of Triangle is: " + perimeter);
	}
	

}
