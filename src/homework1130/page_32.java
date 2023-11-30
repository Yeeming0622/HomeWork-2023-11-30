package homework1130;

public class page_32 {
	public static void main(String[] args)	//P32
	{
		Vehicle[] vc=new Vehicle[2];
		
		vc[0]=new Car3(1234, 20.5);		
		vc[1]=new Plane(232);
		
		for(int i=0;i<vc.length;i++)
		{
			if(vc[i]instanceof Car3)
				System.out.println("第"+(i+1)+"個物件是Car3類別");
			else
				System.out.println("第"+(i+1)+"個物件不是Car3類別");
		}
	}
}
