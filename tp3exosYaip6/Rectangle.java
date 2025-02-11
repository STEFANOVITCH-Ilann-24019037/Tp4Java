package tp3exosYaip6;

public abstract class Rectangle {
	private double width ;
	private double length;
	 public Rectangle(double width,double length) {
		 this.length = length;
		 this.width = width;
	 }
	 
	 public String toString() {
		 return "Rectangle [ width : "+ width+", length : "+ length +" ]" ;
	 }
	 
	 public double getArea() {
		 return length*width;
	 }
	 public double getPerimeter () {
		 return 2*length+2*width;
	 }
}
