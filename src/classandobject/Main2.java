package classandobject;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		

		
						Venue v=new Venue();
						Scanner sc=new Scanner(System.in);
						System.out.println("enter venue name");
						String name=sc.next();
						System.out.println("enter city name");
						
						String city=sc.next();
						
						v.setname(name);
						
						v.setcity(city);
						System.out.println("venue details:");				
						System.out.println("venuename :"+v.getname());
						System.out.println("cityname :"+v.getcity());
						

					}


	}


