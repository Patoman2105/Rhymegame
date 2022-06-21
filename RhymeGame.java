import java.util.*;

public class RhymeGame {

static int[] songs = new int[] {4,7,22,69,420,911};

   public static void main(String[] args) {
      System.out.println("Would You like to play?");
      Scanner console = new Scanner(System.in);  
        if(console.nextLine().startsWith("y")){ 
              System.out.println("Welcome to bosu");
              System.out.println("Choose a song");
              System.out.println("1. anima");
              System.out.println("2. purupurupurin");
              System.out.println("3. lin nas x");
              System.out.println("4. For the Motherland!");
              System.out.println("5. Smoke weed everyday");
              System.out.println("6. Helikopter helikopter");              
              int notes = songs[console.nextInt() - 1];
              int count= 0;
              int combo= 0;
              console.nextLine();
                for(int i = 0; i < notes; i++) { 
                     System.out.println("Do you want to hit the note???");
                     if(console.nextLine().startsWith("y")){ 
                        System.out.println("Are you sure?");
                        if(console.nextLine().startsWith("y")){ 
                            System.out.println("Good job");
                            count++;
                            combo++;
                            
                        } else {combo=0;}
                  }
                  
                  else {combo=0;}
                   System.out.println("Do you want to see your current combo?");
                     if(console.nextLine().startsWith("y")){ 
                        System.out.println("Are you sure?");
                        if(console.nextLine().startsWith("y")){ 
                            System.out.println("combo:"+ combo);                        }
                  }

            }
            
            System.out.println("Score:"+ count+ "/"+notes);
        }  
           
             System.out.println("Game Over");
             System.out.println("");
             System.out.println("See you next time!");
        
      }
}
