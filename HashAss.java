/*
Gr No : 22020272
Roll no: 223083
Name: Gaurav Sonar
*/

import java.io.*;
import java.util.*;
public class HashAss 
{
    public static Hashtable <Character,LinkedList<String>> hash=new Hashtable <>();
    public static void fileCreate()
    {
        char ch;
        do
        {
            System.out.println("Enter a MeaningFull string:\t");
            Scanner sc=new Scanner(System.in);
            String str=sc.nextLine();
            char f=str.charAt(0);
            
            if(hash.get(f)==null)
            {
                LinkedList <String> nl=new  LinkedList <String>();
                nl.add(str);
                hash.put(f, nl);
            }
            else
            {
                LinkedList <String> old=hash.get(f);
                old.add(str);
            }
            System.out.println("The hash table Is :"+hash);
            System.out.println("You Enter Another then Enter Y : y/n \n");
            ch=sc.next().charAt(0);
            
        }while(ch!='n');
        
        try {
            FileOutputStream fo=new FileOutputStream("isSpell.txt");
            ObjectOutputStream obj=new ObjectOutputStream(fo);
            obj.writeObject(hash);
            obj.close();
            System.out.println("Done !!!");
            
        } 
        catch (FileNotFoundException ex)
        {
            System.out.print(ex);
        } 
        catch (IOException ex) 
        {
                        System.out.print(ex);

        }
        
    }
    
    public static int isSpell() throws FileNotFoundException, IOException, ClassNotFoundException
    {
        Scanner sc=new Scanner(System.in);
        String input="";
        System.out.println("Enter a MeaningFull string: \t");
        input=sc.next();
        char c=input.charAt(0);
        
        FileInputStream ff=new FileInputStream("isSpell.txt");
        ObjectInputStream ois=new ObjectInputStream(ff);
        Hashtable <Character,LinkedList<String>> nh=(Hashtable <Character,LinkedList<String>>) ois.readObject();
        LinkedList <String> list=nh.get(c);
        ArrayList <String> match=new ArrayList<>();
        if(list==null)
        {
            System.out.println("NOT FOUND!!!");
            return 0;
        }
        int n=list.size();
        int i;
        for(i=0;i<n;i++)
        {
            String wrd=list.get(i);
            if(wrd.contains(input))
            {
                match.add(wrd);
            }
        }
        if(match.size()==0)
        {
            System.out.println("NOT FOUND!!!");
        }
        else
        {
            System.out.println("You Entered string is Means :"+match);
        }
        return 0;
    }
    
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        do
        {
            System.out.println("\n 1.Creating Hash Table \n 2.Check \n 3.EXIT");
            Scanner s=new Scanner(System.in);
            int x=s.nextInt();
            int f=1;
            switch(x)
            {
                case 1:
                        fileCreate();
                        break;
                case 2:
                        isSpell();
                        break;
                        
                case 3:
                        System.exit(0);
            }
        }while(true);
    }
  
}
/*Output

 1.Creating Hash Table 
 2.Check 
 3.EXIT
1
Enter a MeaningFull string:	
Eat
The hash table Is :{E=[Eat]}
You Enter Another then Enter Y : y/n 

y
Enter a MeaningFull string:	
Drink
The hash table Is :{E=[Eat], D=[Drink]}
You Enter Another then Enter Y : y/n 

n
Done !!!

 1.Creating Hash Table 
 2.Check 
 3.EXIT
2
Enter a MeaningFull string: 	
Eat
You Entered string is Means :[Eat]

 1.Creating Hash Table 
 2.Check 
 3.EXIT
3

*/



