package classandobject;
import java.util.Scanner;
public class Main3 {

	public static void main(String[] args) {
		

			
			DeliveryClass delivery=new DeliveryClass();
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the over");
			Long over=sc.nextLong();
			System.out.println("enter the ball");
			Long ball=sc.nextLong();
			System.out.println("enter the runs");
			Long runs=sc.nextLong();
			System.out.println("enter the batsman name");
			String batsman=sc.next();
			System.out.println("enter the bowlername");
			String bowler=sc.next();
			System.out.println("enter the nonstriker name");
			String nonStriker=sc.next();
			delivery.setover(over);
			delivery.setball(ball);
			delivery.setruns(runs);
			delivery.setbatsman(batsman);
			delivery.setbowler(bowler);
			delivery.setnonStriker(nonStriker);
			System.out.println("Delivery Details");
			System.out.println("over:"+delivery.getover());
			System.out.println("ball:"+delivery.getball());
			System.out.println("runs:"+delivery.getruns());
			System.out.println("batsman:"+delivery.getbatsman());
			System.out.println("bowler:"+delivery.getbowler());
			System.out.println("nonStriker:"+delivery.getnonStriker());
			}

		

	

}
