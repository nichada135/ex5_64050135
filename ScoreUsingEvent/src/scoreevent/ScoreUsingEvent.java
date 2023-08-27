package scoreevent;

import java.util.Scanner;

public class ScoreUsingEvent
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
   
        Subscriber Scone = new Subscriber();
        Subscriber Sctwo = new Subscriber();
        Subscriber Scthree = new Subscriber();

        ScoreSource scoresource = new ScoreSource();
        
        scoresource.addObserver(Scone);
        scoresource.addObserver(Sctwo);
        scoresource.addObserver(Scthree);
        
        scoresource.removeObserver(Scone);

        String line;
        do
        {
            System.out.print("Enter Score ");
            line = sc.nextLine();
            if(line.length() > 0)
            {
                scoresource.setScoreLine(line);
            }
        } 
        while(line.length() > 0);
    }
}
