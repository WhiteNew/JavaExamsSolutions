package myDrones;
/**
* @Description: Enjoy life.
* @Author: bx
* @Date:2019-10-14
* 
*/
public class Drone {

	
	Position p;
	public static double maxSpeed=30;
	public static double  height;
//	public double  xacc;
//	public double  yacc;
//	public double  zacc;
	public double xspeed;
	public double yspeed;
	public double zspeed;
	
	public Drone()
	{
		
	}
	public Drone( double xspeed, double yspeed,double zspeed)
	{    
		p=new Position(0,0,0);
		this.xspeed=xspeed;
		this.yspeed=yspeed;
		this.zspeed=zspeed;
	}
	
	public double getXspeed() {
		return xspeed;
	}
	public void setXspeed(double xspeed) {
		this.xspeed = xspeed;
	}
	public double getYspeed() {
		return yspeed;
	}
	public void setYspeed(double yspeed) {
		this.yspeed = yspeed;
	}
	public double getZspeed() {
		return zspeed;
	}
	public void setZspeed(double zspeed) {
		this.zspeed = zspeed;
	}
	
	

}
