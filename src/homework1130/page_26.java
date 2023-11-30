package homework1130;

public class page_26 {
public static void main(String[] args){	//P26
		
		Car1 car1s[]=new Car1[2];
		
		car1s[0]=new Car1();
		car1s[1]=new RacingCar1();
		
		for(int i=0;i<car1s.length;i++) {
			Class cl = car1s[i].getClass();
			System.out.println("第"+(i+1)+"個物件的類別是"+cl);
		}
		
	}
}
