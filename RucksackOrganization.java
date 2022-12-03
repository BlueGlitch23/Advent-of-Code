import java.util.*;
import java.io.*;
public class RucksackOrganization
{
   public static void main (String[]args) throws IOException
   {
      
      char letterToSearch ='a';    int total=0;
      String elf1,elf2,elf3;       int elfNumber=0;
      boolean foundSame=false;     char output=0;
      int elfMin =0;
        
      Scanner f = new Scanner(new File("RucksackItems"));
      

      while(f.hasNext()) 
      { 
         
         
         elf1=f.next();
         elf2=f.next();
         elf3=f.next();
         
         if (elf1.length() <= elf2.length() && elf1.length() <= elf3.length()) 
            {elfMin = elf1.length(); 
            elfNumber=1;}
         else if (elf2.length() <= elf3.length() && elf2.length() <= elf1.length()) 
            {elfMin = elf2.length(); 
            elfNumber=2;}
         else 
            {elfMin = elf3.length(); 
            elfNumber=3;}
         
         foundSame=false;
         for(int x=0;(x<elfMin&&!foundSame);x++)
         {
            
               
               if(elfNumber==1)
                  letterToSearch=elf1.charAt(x);
               else if(elfNumber==2)
                  letterToSearch=elf2.charAt(x);
               else
                  letterToSearch=elf3.charAt(x);
            
            
               
            if((elf2.indexOf(letterToSearch)!=-1)&&((elf1.indexOf(letterToSearch)!=-1)&& (elf3.indexOf(letterToSearch)!=-1)))
            {
               
               foundSame=true;
               output=letterToSearch;
               
               
            }
            
            
         }
         if(foundSame)
            if(97<=output||output>=122)
               total+=(output-96);
            else
               total+=(output-38);
         
            
         
         
      }
      System.out.println(total);
   }
}