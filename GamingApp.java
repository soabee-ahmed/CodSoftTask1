import java.util.*;
import javax.swing.JOptionPane;
public class GamingApp {
    public static void main(String[] args) {
        int count=0, c=0;
        int round=1;
        int score=20;
        int totalscore=0;
        Random rd=new Random();
        int x=rd.nextInt(100)+1; // randomly generated number
        do{
        if(count==10){
             JOptionPane.showMessageDialog(null,"You exhausted your all attempt , Play again ");
        }
        if(count==0){
            x=rd.nextInt(100)+1;
        }
        count++;    
        c=Integer.parseInt(JOptionPane.showInputDialog("Guess the number : ")); // guessed number
        if(c>x){
            JOptionPane.showMessageDialog(null,"guess lesser number");
        }
        else if(c<x){
            JOptionPane.showMessageDialog(null,"guess greater number");
        }
        else{
            score=score-count;
            JOptionPane.showMessageDialog(null,"you won ! total attempt :: " +count);
            JOptionPane.showMessageDialog(null,"Your Score is :: " +score);
            totalscore+=score;
            String s=(JOptionPane.showInputDialog("Do You want to quit(yes/no) : "));
            if(s.equals("no")){
                score=20;
                count=0;
                round++;
            }
            else{
            JOptionPane.showMessageDialog(null,"Okay you have taken total : "+round+" round, Your Total Score is :: " +totalscore);
            break;
            }
            
        }
        
    }while(count<=10);
   
   }
}
