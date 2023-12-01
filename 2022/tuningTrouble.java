import java.util.*;
import java.io.*;

public class tuningTrouble
{
   public static void main(String[]args)  throws IOException
   {
      Scanner packetGrabber = new Scanner(new File("packets"));
      
      String packets=packetGrabber.next();
      List<Character> lookingFor = new ArrayList<Character>();//does the active searching
      
      char currentPacket=' '; boolean part1=false; 
      
      //
      int sizeOfSearch= 14; //change size for diffrent outputs
      //
      //looks for sizeOfSearch charters that have no repeating charters
      for(int search=0;search<packets.length() && !part1;search++)
      {
         currentPacket=packets.charAt(search);
         HashMap<Character, Integer> check = new HashMap();

         
         if(lookingFor.size()<sizeOfSearch)
            {lookingFor.add(currentPacket); ;continue;}
         else
         {
            //used to check for no repeating charters
            for(int x=0;lookingFor.size()>x;x++)
            {
               check.put(lookingFor.get(x),x);
            }
         }           
            //checks if the grabed charters match the ones without dupicates
            if(lookingFor.size()==check.size())
                  {  
                     System.out.println("first marker after character "+search);
                     System.out.print(lookingFor);
                     part1=true;
                  }
                     
                     
            //updates the arraylist
            lookingFor.remove(0);
            lookingFor.add(currentPacket);
            
      }
   }
}
