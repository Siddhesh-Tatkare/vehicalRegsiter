package Service;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import model.Vehicle;
public class Pune implements rto{
	Vehicle obj=new Vehicle();
	private Scanner sc=new Scanner(System.in);
	@Override
	public void reg() {
		System.out.println("Enter reg Id:");
		obj.setRegId(sc.nextInt());
		
		System.out.println("Enter Modelname:");
		sc.nextLine();
		obj.setModelName(sc.nextLine());
		
		System.out.println("Enter Price:");
		obj.setPrice(sc.nextFloat());
		
		System.out.println("Enter Colour:");
		sc.nextLine();
		obj.setColour(sc.nextLine());
		
		System.out.println("Enter Area:");
		obj.setArea(sc.nextLine());
		
		System.out.println("Enter Ownername:");
		obj.setOwnername(sc.nextLine());
		
		System.out.println("Enter Mob No:");
		obj.setMob(sc.nextLong());
		
		System.out.println("Enter Adhar No:");
		obj.setAdhar(sc.nextLong());
		System.out.println("country:"+rto.country);
	}

	@Override
	public void view() {
	System.out.println("RegId:"+obj.getRegId());
	System.out.println("Modelname:"+obj.getModelName());
	System.out.println("Price:"+obj.getPrice());
	System.out.println("Colour:"+obj.getColour());
	System.out.println("Area:"+obj.getArea());
	System.out.println("Ownername:"+obj.getOwnername());
	System.out.println("MobNo:"+obj.getMob());
	System.out.println("Adhar:"+obj.getAdhar());
	System.out.println("Country:"+rto.country);
	}

	@Override
	public void update() {
		System.out.println("Update infomation:");
		System.out.println("1.RegID\n2.Modelname\n3.Price\n4.Colour\n5.Area\n6.Ownername\n7.Mob\n8.Adhar no:");
		System.out.println("Enter your choice:");
		int num=sc.nextInt();
		
		switch(num) {
		
		case 1:
				
				System.out.println("1.RegId:");
				obj.setRegId(sc.nextInt());
				break;
		case 2:
				System.out.println("2.Modelname:");
				obj.setModelName(sc.nextLine());
				break;
		case 3:
				System.out.println("3.price:");
				obj.setPrice(sc.nextFloat());
				break;
		case 4:
				System.out.println("4.Colour:");
				obj.setColour(sc.nextLine());
				break;
		case 5:
				System.out.println("5.area:");
				obj.setArea(sc.nextLine());
				break;
		case 6:	
				System.out.println("6.ownername:");
				obj.setOwnername(sc.nextLine());
				break;
		case 7:
				System.out.println("7.Mob:");
				obj.setMob(sc.nextLong());
				break;
		case 8:
				System.out.println("8.Adhar:");
				obj.setAdhar(sc.nextLong());
				break;
				
		default:
				System.out.println("Information already updated:");
		}
		
		
	}
}
