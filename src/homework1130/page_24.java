package homework1130;

public class page_24 {
public static void main(String[] args){	//P24
		
		Car1 car1=new Car1();
		car1.setCar1(1234, 20.5);
		System.out.println(car1);
	}
}

class Car1
{
	protected int num;
	protected double gas;
	
	public Car1()
	{
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
	
	public void setCar1(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("將車號設為"+num+"，汽油量設為"+gas);
	}
	
	public String toString() 
	{
		String str = "車號"+num+"汽油量"+gas;
		return str;
	}
}

class RacingCar1 extends Car1
{
	public RacingCar1()
	{
		System.out.println("生產了賽車");
	}
}