package tp3exosYaip6;



abstract public class Circle implements GeometricObject{
	
	private double raduis;
	
	public Circle(double raduis) {
		this.raduis = raduis;
	}
	
	public String toString() {
		return "Circle [ raduis = "+ raduis+" ]"     ;
	}
	public double getArea() {
		return raduis*raduis*3.14116 ;
	}
	public double getPerimeter () {
		return 2*raduis * 3.14116;
	}

}
