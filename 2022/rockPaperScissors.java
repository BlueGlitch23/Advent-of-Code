import java.util.*;
import java.io.*;
public class rockPaperScissors
{
   public static void main (String[]args) throws IOException
   {
      Scanner f = new Scanner(new File("rpsGuide"));
      int score=0;
      
      List<String> guideList = new ArrayList<String>(); 
      
      while(f.hasNext()) 
      { 
        guideList.add(f.next());
      }
      
      for(int x=0;x<guideList.size();x+=2)
      {
         String opponet=guideList.get(x); String user=guideList.get(x+1);
         //part 1
/*              
         switch (user)
         {
            case "X":
               score+=1; break;
            case "Y":
               score+=2; break;
            case "Z":
               score+=3; break;
         }
         
            //wins
         if( (opponet.equals("A")&& user.equals("Y")) || (opponet.equals("B")&& user.equals("Z")) || (opponet.equals("C")&& user.equals("X")) )
         {
            
            score+=6;
            
            //ties
         }
         else if((opponet.equals("A")&& user.equals("X")) || (opponet.equals("B")&& user.equals("Y")) || (opponet.equals("C")&& user.equals("Z")))
         {
            
            score+=3;
         }    
      }
*/
         if(user.equals("Z"))//wins
         {
            score+=6;
            switch (opponet)
            {
               case "A":// Rock
                  score+=2; break;//Paper
               case "B":// Paper
                  score+=3; break;//Scissors
               case "C":// Scissors
                  score+=1; break;//Rock
            }
            
            
         }
         else if(user.equals("Y"))//tie
         {
            score+=3;
            switch (opponet)
            {
               case "A":// Rock
                  score+=1; break;//Rock
               case "B":// Paper
                  score+=2; break;//Paper
               case "C":// Scissors
                  score+=3; break;//Scissors
            }
         }
            
         else if(user.equals("X"))//loss
         {
            switch (opponet)
            {
               case "A":// Rock
                  score+=3; break;//Scissors
               case "B":// Paper
                  score+=1; break;//Rock
               case "C":// Scissors
                  score+=2; break;//Paper
            }
         }
      }

      System.out.print("Score "+score+" points");
      
   }
}
