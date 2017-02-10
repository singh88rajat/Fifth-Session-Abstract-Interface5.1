
public class PerimeterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Circle cobj=new Circle(4.4);
  cobj.findArea();
  cobj.findPerimeter();
  System.out.println();
  Rectangle robj=new Rectangle(3.5, 2.5);
  robj.findArea();
  robj.findPerimeter();
  System.out.println();
  Traingle tobj=new Traingle(4.4);
  tobj.findPerimeter();
  Traingle tobj1=new Traingle(4.4,3.2);
  tobj1.findArea();
 
	}

}
