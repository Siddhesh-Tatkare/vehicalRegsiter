package Client;
import Service.rto;

import java.sql.SQLException;
import java.util.Scanner;

import Service.Pune;
public class Menu {
	
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		rto obj1=new Pune();
		
		
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("Welcome to vehicle registeration system:");
		System.out.println("1.register information \n2.view information\n3.update information");
		System.out.println("Enter your choice......");
		int no=sc.nextInt();
		switch(no) {
		
		case 1:
				obj1.reg();
				break;
		case 2:
				obj1.view();
				break;
				
		case 3:	obj1.update();
				break;
				
				
		default:
				System.out.println("Option is not availble:");
		}
	
		
	}

}
}