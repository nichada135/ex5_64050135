package bound;

import java.util.Scanner;

public class ScoreBound {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Subscriber Sub1 = new Subscriber();
        Subscriber Sub2 = new Subscriber();
        ScoreEvent Sub3 = new ScoreEvent();
        
        Sub3.addPropertyChangeListener(Sub1);
        Sub3.addPropertyChangeListener(Sub2);

        String line;
        do
        {
            System.out.print("Enter Score ");
            line = sc.nextLine();
            if(line.length() > 0)
            {
                Sub3.setScoreLine(line);
            }
        } 
        while(line.length() > 0);
    }
    
}
