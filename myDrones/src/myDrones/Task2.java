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
public class Task2 {
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
    static Barrier  b1;
	public static void updateClock()
	{
		clock=clock+1;
	}
	
//	public static void findBarrier(Drone d, Barrier b)
//	{
//		d.p.setX(d.p.getX()+d.getXspeed()*1);
//		d.p.setY(d.p.getY()+d.getYspeed()*1);
//		d.p.setZ(d.p.getZ()+d.getZspeed()*1);
//		remainDistance= b.p.getX()-d.p.getX();
//		
//		
//	}
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
	public static void updateDrone(Drone d, Position dest, Barrier b)
	{
		d.p.setX(d.p.getX()+d.getXspeed()*1);
		d.p.setY(d.p.getY()+d.getYspeed()*1);
		d.p.setZ(d.p.getZ()+d.getZspeed()*1);
		remainDistance= dest.getX()-d.p.getX();
		dangerDistance= b.p.getX()-d.p.getX()-b.chang;
		
	}
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       Position  start=new Position(0.0,0.0,0.0);
       
       Position  destination =new Position(8500.01,0,0);
       b1=new Barrier(destination.getX()*2/3, 0.0, 100, 30,30,30);
       TotalDistance=destination.getX()-start.getX();
       remainDistance=TotalDistance;
       
   //  System.out.println(remainDistance);
       Drone d1=new Drone(0,0,0);
       predictingTime=remainDistance/d1.maxSpeed;
       dangerDistance=b1.p.getX()-d1.p.getX();
       String outputfile = "D:\\研究\\无人机\\DataSet\\data1.txt";
       FileWriter output = new FileWriter(outputfile);
	   BufferedWriter wout = new BufferedWriter(output);
	   boolean dangerFlag;
       while(remainDistance>0)
       {
    	   dangerFlag=judgeDanger(d1,b1);
    	//   System.out.println(d1.p.getX()+"\t"+d1.p.getY()+"\t"+d1.p.getZ());
    	   if(dangerFlag==true)
    	   {
    		   
    		   d1.setYspeed(5);
    		  
    		   
    	   }
    	    
    	  
    		  
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
    	  updateDrone(d1,destination,b1);
    	  wout.write(d1.p.getX()+"\t"+d1.p.getY()+"\t"+d1.p.getZ()+"\n");
    	  
    	  
       }
       wout.close();
	}

}
