public class Subclass1 extends AbstractHorse implements Comparable {

    protected int x, y, startNbr, speed;
    
    public Subclass1(int x, int y, int startNbr) {
        
        this.startNbr = startNbr;
        this.x = x;
        this.y = y;
        this.speed = 1;
    }
    
   @Override
   public int getSpeed(){
       return speed;
   }

    
    @Override
    public void forward(int speed){
        x = x+ speed;
        
    }
    
    
    @Override
    public int compareTo(AbstractHorse other) {
        int FASTER = 1;
        int EQUAL = 0;
        int SLOWER = -1;
        
        if(this.speed < other.getSpeed()){
            return SLOWER;
        }else if(this.speed > other.getSpeed()){
            return FASTER;
        }else{
            return EQUAL;
        }
    }
    @Override
    public int getX() {
       return x;
    }

    @Override
    public int getY() {
        return y;
    }

}