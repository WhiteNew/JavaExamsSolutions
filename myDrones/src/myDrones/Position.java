package myDrones;
/**
* @Description: Enjoy life.
* @Author: bx
* @Date:2019-10-14
* 
*/
public class Position {
	private double x;
	private double y;
	private double z;
	
	 public Position() {
		// TODO Auto-generated constructor stub
	}
	 public Position(double x, double y,double z)
	 {
		 this.x=x;
		 this.y=y;
		 this.z=z;
		 
	 }
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	 
	

}
