
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
import se.bjorknas.graphics.EventWindow;
/*
Här körs själva spelet.
*/
public class Game{
private ArrayList <AbstractHorse> horses;
    public Game(){
        horses = new ArrayList<>();
    }
    /*
    Jämnför hästarna och ger NormalHorse ett litet försprång
    */
    public void setHandicapHorses(){
        if(!horses.isEmpty()){
            
            for(int i = 0; i < horses.size(); i++){
                AbstractHorse h = horses.get(i);
                if(i+1 < horses.size()){

                    if(h.compareTo(horses.get(i+1)) == -1){
                        h.forward(10);
                    }

                }else{
                    if(h.getSpeed() == 1){
                        h.forward(10);
                    }
                }
            }
        }else{
           String msg = "Please create one or more horses \n";
            String msg2 = "Right now there are no horses alive";
            JOptionPane.showMessageDialog(null, msg + msg2); 
        }
    }
    /*
    Här skapas hästarna slumpmässigt.
    */
    public void createHorses(int NbrOfHorses){
          
            for(int i = 0; i < NbrOfHorses; i++){
                Random r_horses = new Random();
                int r = r_horses.nextInt(2);
                switch(r){
                    
                        case 0:
                            
                            System.out.println("häst 1 skapad" + r);
                            horses.add(new NormalHorse(0 , 30*i, i+1));
                            
                        break;
                        case 1: 
                            
                            System.out.println("häst 2 skapad" + r);
                            horses.add(new FastHorse(0 , 30*i, i+1));
                            
                            
                        break;
                        
                }

            }
        
    }
        
    /*
    Skapar en EventWindow frame och kör racet tills hästen går i mål.
    */
    public void runRace(){
        if(!horses.isEmpty()){
        EventWindow win = new EventWindow(400, 200, "Race");
        win.drawRect(350, 0, 1, 200);
        while(raceOn()){
            
            for(AbstractHorse h: horses){
                win.drawCirc(h.getX(), h.getY(), 15);
                h.forward(h.getSpeed());
                
            }
            
            System.out.println("en runda körd");
            
        }}else{
            String msg = "Please create horses \n";
            String msg2 = "Right now there are no horses alive";
            JOptionPane.showMessageDialog(null, msg + msg2); 
        }
        
    }
    /*
    Kontrollerar om en häst gått i mål eller inte.
    */
    private boolean raceOn(){
        boolean b = true;
            for(AbstractHorse h : horses){
                if(h.getX() < 350){
                    b = true;
                }else{
                   return false;
                }
            }
            return b;
        }
}
