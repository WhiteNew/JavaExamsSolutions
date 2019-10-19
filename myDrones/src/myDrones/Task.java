package myDrones;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


/**
* @Description: Enjoy life.
* @Author: bx
* @Date:2019-10-14
* 
*/
public class Task {
	public static double clock =0;
	public static double unitClock =1;
    public static double takeOffTime=10.0;
    public static double landOffTime=10.0;
    public static double remainDistance=0;
    public static double dangerDistance=0;
    public static double TotalDistance=0;
    public static double landOffDistance=50.0;
    public static double  predictingTime=0;
    public static double  fixHight=100;
    public static boolean flag=true;
 //   static Barrier  b1;
	public static void updateClock()
	{
		clock=clock+1;
	}
	

	public static boolean judgeDanger(Drone d, Barrier b)
	{
		if(dangerDistance<0)
		{
			return false;
		}
		else
		{
			if(dangerDistance<=30)
				return true;
			else 
				return false;
		
		}
	
	}
	public static void updateDrone(Drone d, Position dest)
	{
		d.p.setX(d.p.getX()+d.getXspeed()*1);
		d.p.setY(d.p.getY()+d.getYspeed()*1);
		d.p.setZ(d.p.getZ()+d.getZspeed()*1);
		remainDistance= dest.getX()-d.p.getX();
	
		
	}
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       Position  start=new Position(0.0,0.0,0.0);
       
       Position  destination =new Position(8500.01,0,0);
       TotalDistance=destination.getX()-start.getX();
       remainDistance=TotalDistance;
       
       Drone d1=new Drone(0,0,0);
       predictingTime=remainDistance/d1.maxSpeed;
       String outputfile = "D:\\研究\\无人机\\DataSet\\data2.txt";
       FileWriter output = new FileWriter(outputfile);
	   BufferedWriter wout = new BufferedWriter(output);
       while(remainDistance>0)
       {
    		  
    	  if(clock<10.0 && d1.height<fixHight)
    	  {
    		  d1.setXspeed(10);
    		  d1.setZspeed(10);
    		  
    	  }
    	  if(clock>=10.0 && clock<predictingTime && remainDistance>100)
    	  {
    		  d1.setZspeed(0);
    		  d1.setXspeed(30);
    	  }
    	  if(remainDistance<=100 && d1.p.getZ()>0)
    	  {
    		  d1.setZspeed(-10);
    		  d1.setXspeed(10);
    	  }
    	  
    	  updateClock();
    	  updateDrone(d1,destination);
    	  wout.write(d1.p.getX()+"\t"+d1.p.getY()+"\t"+d1.p.getZ()+"\n");
    	  
    	  
       }
       wout.close();
	}

}
