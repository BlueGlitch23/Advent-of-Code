import java.util.*;
import java.io.*;
public class CalorieCount
{
   public static void main (String[]args) throws IOException
   {
      Scanner f = new Scanner(new File("CalorieCountList"));
      
      //variables
      int elfCount=0;   int elfTotal=0;
      int bigest=0;     int bigElf=0;
      int secBigest=0;     int towElf=0;
      int thrBigest=0;     int threeElf=0;
      List<String> calorieList = new ArrayList<String>();
      List<Integer> calorieTotal = new ArrayList<Integer>();
      List<Integer> blankLine = new ArrayList<Integer>();
      
      
      //takes items from list and seprates by blank lines
      while(f.hasNext()) 
         { 
           calorieList.add(f.nextLine());
         }
      //loop to update variables 
      for(int i=1;i<=calorieList.size();i++)
      {
         String temp=calorieList.get(i-1);
         if(temp.equals(""))
         {
            //ends loop for that elf
            calorieTotal.add(elfTotal);
            elfTotal=0;
            elfCount++;
            blankLine.add(i-1);
         }
         else
         {
            // adds the numbers together till blank area
            elfTotal = elfTotal + Integer.parseInt(calorieList.get(i-1));
            
         } 
      }
      // finds big 3 from total
      for(int y=0;y<=1;y++);
         for(int x=0;x<calorieTotal.size();x++)
         {
            
          
            if(calorieTotal.get(bigElf)<calorieTotal.get(x))
            {
               bigest=calorieTotal.get(x);      bigElf=x;
            }
            else if(calorieTotal.get(towElf)<calorieTotal.get(x))
            {
               secBigest=calorieTotal.get(x);      towElf=x;
            }
            else if(calorieTotal.get(threeElf)<calorieTotal.get(x))
            {
               thrBigest=calorieTotal.get(x);      threeElf=x;
            }
         }
      
      
      
   System.out.println();
   System.out.println("Elf #"+(bigElf+1)+" "+bigest+" Calories");
   System.out.println(blankLine.get(bigElf));
   System.out.println("Elf #"+(towElf+1)+" "+secBigest+" Calories");
   System.out.println(blankLine.get(towElf));
   System.out.println("Elf #"+(threeElf+1)+" "+thrBigest+" Calories");
   System.out.println(blankLine.get(threeElf));
   System.out.println(bigest+secBigest+thrBigest+" Calories total among the top 3");
 
   }
}
