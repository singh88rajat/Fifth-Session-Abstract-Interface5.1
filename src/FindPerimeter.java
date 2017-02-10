
public abstract class FindPerimeter {
static double dim1;
double area, perimeter;
public FindPerimeter(double dim1) {
	super();
	this.dim1 = dim1;
}
public double getDim1() {
	return dim1;
}
public void setDim1(double dim1) {
	this.dim1 = dim1;
}
abstract void findArea();
abstract void findPerimeter();
}
