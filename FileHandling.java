/*
Topic : File Hadnling 
Roll no:223083          Gr no 22020272
name: Gaurav Sonar      Division:'C'
*/
import java.io.*;
import java.io.IOException;
import java.util.*;
class FileHandling
{
	public static void main(String[] args) throws IOException
	{
	    int character;
		Scanner s = new Scanner (System.in);
	    System.out.println("****Writing File****");

		System.out.println("Enter Data that you write in file: ");
		String str =s.nextLine();

		FileWriter fwrite=new FileWriter("output.txt");

		for (int i = 0; i < str.length(); i++)
		{
			fwrite.write(str.charAt(i));
		}
		System.out.println("Writing successful");
		fwrite.close();
	
        System.out.println("****Reading File****");
        FileReader fread=null;
        try
        {
            fread = new FileReader("output.txt");
        }
        catch(FileNotFoundException fe)
        {
            System.out.println("File not found");
        }
        while ((character=fread.read())!=-1)
            System.out.print((char)character);

        fread.close();
	}
}



/*
****Writing File****
Enter Data that you write in file: 
gaurav sonar roll no 223083 gr no 22020272
Writing successful
****Reading File****
gaurav sonar roll no 223083 gr no 22020272


*/
