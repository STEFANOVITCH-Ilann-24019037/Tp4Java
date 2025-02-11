package tp3exosYaip6;

public abstract class MovablePoint {
	private int x,y,xSpeed,ySpeed;
	
	public MovablePoint(int x,int y ,int xSpeed,int ySpeed) {
		this.x=x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	public String toString() {
		return "("+x+","+y+") speed ("+xSpeed+","+ySpeed+")";
	}
	public

}
