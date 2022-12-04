import java.util.*;
import java.io.*;
public class CampCleanup
{
   public static void main (String[]args) throws IOException
   {
      String Task="";   
      String assignment1;  int part2=0;   int part1=0;
      Scanner f = new Scanner(new File("cleanupList"));
      

      while(f.hasNext()) 
      { 
         //
         String elf1,elf2;
         int elf1task1,elf1task2,elf2task1,elf2task2;
         
         //gets items from file
         assignment1=f.nextLine();
         //splits list in half by ,
         elf1=assignment1.substring(0,assignment1.indexOf(","));
         elf2=assignment1.substring(assignment1.indexOf(",")+1,assignment1.length());
         //splits by -
         elf1task1=Integer.parseInt(elf1.substring(0,elf1.indexOf("-")));
         elf1task2=Integer.parseInt(elf1.substring(elf1.indexOf("-")+1,elf1.length()));
         elf2task1=Integer.parseInt(elf2.substring(0,elf2.indexOf("-")));
         elf2task2=Integer.parseInt(elf2.substring(elf2.indexOf("-")+1,elf2.length()));
         //sorts by if they are == or bigger than the other value 
         if(((elf1task1<=elf2task1)&&(elf1task2>=elf2task2))||((elf1task1>=elf2task1)&&(elf1task2<=elf2task2)))
            {part1++;   part2++; ;}
         else if(elf1task1<=elf2task2 && elf1task2>=elf2task1 )
            part2++; 
        
      }
   System.out.println("part 1 : "+part1);
   System.out.print("part 2 : "+part2);
   }
}