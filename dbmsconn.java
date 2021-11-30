package connectivity;
import java.sql.*; 
import java.io.*;
import javax.sql.*;

public class Conn 
{
	public static void main(String args[])
	{
		Connection c;
		Statement connectionState; 
		ResultSet rs;
		int ch;
		boolean flag=true; int no;
		try
		{ 
			Class.forName("com.mysql.jdbc.Driver"); 
			c=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee1?","root","");
			System.out.println("Statement object created"); 
			do
			{
				System.out.println(); 
				System.out.println("Menu");
				System.out.println("1. Insert"); 
				System.out.println("2. Update"); 
				System.out.println("3. Delete"); 
				System.out.println("4. Display"); 
				System.out.println("5. Exit"); 
				System.out.println("Enter Your Choice"); 
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				ch = Integer.parseInt(br.readLine()); 
				switch(ch)
				{
					case 1: 
						System.out.println("Enter Employee No"); 
						no = Integer.parseInt(br.readLine()); 
						System.out.println("Enter Employee Name"); 
						String name = br.readLine(); 
						System.out.println("Enter Employee  Salary"); 
						int sal = Integer.parseInt(br.readLine());
						String sql="Insert into employee1 values(?,?,?)"; 
						PreparedStatement p = c.prepareStatement(sql); 
						p.setInt(1,no);
						p.setString(2,name); 
						p.setInt(3,sal);  
						p.executeUpdate(); 
						System.out.println("Record Added"); 
						break;
				
					case 2: 
						connectionState=c.createStatement(); 
						while(flag)
						{
							System.out.println("Enter the Employee No"); 
							no = Integer.parseInt(br.readLine()); 
							System.out.println("Enter new EmployeeName");
  							name = br.readLine();
							System.out.println("Enter new Employee Salary"); 
							sal = Integer.parseInt(br.readLine());
							sql="Update employee1 set employee1.name='"+name+"', employee1.sal='"+sal+"' where employee1.no="+no+""; 
							System.out.println(sql);
							int rows=connectionState.executeUpdate(sql); 
							System.out.println(rows+"rows successfully updated"); 
							System.out.println("Do you want to update more data:y/n:"); 
							String decision=br.readLine().toLowerCase(); 
							if(decision.charAt(0)=='n')
							{
								flag=false;
							}
						
						}
						break;

					case 3: 
						connectionState=c.createStatement(); 
						System.out.println("Enter the Employee No to be deleted"); 
						no = Integer.parseInt(br.readLine());
						sql="Delete from employee1 where employee1.no="+no+""; connectionState.executeUpdate(sql); 
						System.out.println("Record deleted");
						break;

					case 4: 
						connectionState = c.createStatement(); 
						sql = "Select * from employee1";
						rs = connectionState.executeQuery(sql); 
						while(rs.next()) 
						{ 
							System.out.println("\n");
							System.out.println("\t"+rs.getInt(1));
							System.out.println("\t"+rs.getString(2));
							System.out.println("\t"+rs.getInt(3));
						}
						break; 

					case 5:
						System.exit(0); 
				
					default:
						System.out.println("Invalid Choice"); 
					break;
				}
			}while(ch!=4);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}



