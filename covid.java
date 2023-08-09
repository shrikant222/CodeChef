package Covid;
import java.util.*;

public class Registration {
	String firstName, lastName;
	long mobNo, aadharNo;
	int age, regNo=0;
	char gender;
	public static int count=0;
	String vaccinStatus="Not vaccinated";
	String dose1="Not vaccinated";
	String dose2="Not vaccinated";
	Scanner sc = new Scanner(System.in);
	
	public void signUp()
	{
		System.out.println("\n\n\t\t\t\t\t\t\t   *****REGISTRATION FORM*****");
		System.out.print("\n\t\t\t\t\t\tEnter First Name: ");
		firstName=sc.next();
		System.out.print("\t\t\t\t\t\tEnter Last Name: ");
		lastName=sc.next();
		System.out.print("\t\t\t\t\t\tEnter Age: ");
		age=sc.nextInt();
		System.out.print("\t\t\t\t\t\tEnter Gender [Male-M, Female-F]: ");
		gender=sc.next().charAt(0);
		System.out.print("\t\t\t\t\t\tEnter Mobile Number: ");
		mobNo=sc.nextLong();
		System.out.print("\t\t\t\t\t\tEnter Aadhar-Card Number: ");
		aadharNo=sc.nextLong();
		count++;
		regNo=count;
		System.out.println("\n\n\t\t\t\t\t\t\tYour Registration Number is : "+regNo);
		System.out.println("\n\t\t\t\t\t\tYou are Successfully Registered for Covid Vaccination");
	}
	
	
	public void dispDetails()
	{
		System.out.println("\n\t\t\t\t\t\t  Name  : "+firstName+" "+lastName);
		System.out.println("\t\t\t\t\t\t  Age   : "+age);
		System.out.println("\t\t\t\t\t\t  Gender: "+gender);
		System.out.println("\t\t\t\t\t\t  Mobile Number      : "+mobNo);
		System.out.println("\t\t\t\t\t\t  Aadhar-Card Number : "+aadharNo);
		System.out.println("\t\t\t\t\t\t  Registration Number: "+regNo );
		System.out.println("\t\t\t\t\t\t  Vaccination Status : "+vaccinStatus);
		System.out.println("\t\t\t\t\t\t  Vaccination Status of dose 1 : "+dose1);
		System.out.println("\t\t\t\t\t\t  Vaccination Status of dose 2 : "+dose2+"\n");
	}
	
	
	public void listRegister()
	{
		System.out.println("\n\n\t\t\t\t\t"+firstName+" "+lastName+"\t "+gender+"\t\t"+regNo+"\t\t"+vaccinStatus+"\t"+mobNo);
	}
	
	
	public void change()
	{
		
		System.out.println("\n\t\t\t\t\t\t\t1.Dose 1 \n\t\t\t\t\t\t\t2.Dose 2 ");
		System.out.print("\n\t\t\t\t\t\tChoose your Dose: ");
		int num = sc.nextInt();
		
			switch(num)
			{
			case 1:
				dose1();
				vaccinStatus="Vaccinated";
				break;
				
			case 2:
				if(vaccinStatus=="Vaccinated")
				{
					dose2();
				}
				else
				{
					System.out.println("\t\t\t\t\t\tyou have not completed your first dose!!!");
				}
				break;
				
			default:
				System.out.println("\n\t\t\t\t\t\t\tyou have not been vaccinated.");
				break;
			}
	}
	
	
	void dose1()
	{
		System.out.println("\n\t\t\t\t\t\t\t1. COVAXIN \n\t\t\t\t\t\t\t2. COVISHIELD\n");
		System.out.print("\t\t\t\t\t\t#Choose your vaccine: ");
		int op = sc.nextInt();
		switch(op)
		{
			case 1:
			dose1="COVAXIN";
			System.out.println("\n\t\t\t\t\t\t\t***your first vaccine is completed.***");
			break;
			
			case 2:
			dose1="COVISHIELD";
			System.out.println("\t\t\t\t\t\t\t***your second vaccine is completed.***");
			break;
			
			default:
				System.out.println("\t\t\t\t\t\t!!!you have not been vaccinated!!!");
				break;
		}
	}
	void dose2()
	{
		System.out.println("\n\t\t\t\t\t\t\t1. COVAXIN \n\t\t\t\t\t\t\t2. COVISHIELD\n");
		System.out.print("\t\t\t\t\t\t#Choose your vaccine: ");
		int op = sc.nextInt();
		switch(op)
		{
			case 1:
			dose2="COVAXIN";
			System.out.println("\n\t\t\t\t\t\t\t***your first vaccine is completed.***");
			break;
			
			case 2:
			dose2="COVISHIELD";
			System.out.println("\t\t\t\t\t\t\t***your second vaccine is completed.***");
			break;
			
			default:
				System.out.println("\t\t\t\t\t\t!!!you have not been vaccinated!!!");
				break;
		}
	}
}