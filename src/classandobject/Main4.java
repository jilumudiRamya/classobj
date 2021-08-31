package classandobject;
import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		
				Innings i=new Innings();
				Scanner sc=new Scanner(System.in);
				System.out.println("enter Inning number");
				String number=sc.next();
				System.out.println("enter batting team");
				String battingTeam=sc.next();
				System.out.println("enter runs scored");
				Long runs=sc.nextLong();
				i.setnumber(number);
				i.setbattingTeam(battingTeam);
				i.setruns(runs);
				System.out.println("Inning Details");
				System.out.println("Inning number:"+i.getnumber());
				System.out.println("battingTeam:"+i.getbattingTeam());
				System.out.println("runs:"+i.getruns());
			}

		


	}


