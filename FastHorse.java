public class FastHorse extends AbstractHorse implements Comparable {

    protected int x, y, startNbr, speed;
    /**
     * Konstruktor för klassen FastHorse. Förlänger AbstractHorse och 
     * implementerar Comparable.
     * @param x int med startvärdet för x.
     * @param y int med startvärdet för y.
     * @param startNbr int med startvärdet för StartNbr.
     */
    public FastHorse(int x, int y, int startNbr) {
       
        this.startNbr = startNbr;
        this.x = x;
        this.y = y;
        this.speed = 2;
    }
    
    /**
     * Skickar hästens speed
     * @return returnerar en int för hastighet
     */    
    @Override
    public int getSpeed(){
        return speed;
    }
    
    /**
     * Flyttar hästen framåt givet antal steg.
     * @param speed bestämmer hur snabbt hästen ska förflytta sig.
     */    
    @Override
    public void forward(int speed){
        x = x+speed;
    }
    
    /**
     * Jämför hastigheten mellan hästarna.
     * @param other den andra hästen.
     * @return returnerar 1 om hästen är snabbare än jämförd häst, 0 om de är
     * lika snabba och -1 om den är söligare.
     */
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
    
    /**
     * Hämtar x-värdet från hästen
     * @return returnerar x-värdet.
     */    
    @Override
    public int getX() {
       return x;
    }
    
    /**
     * Hämtar x-värdet från hästen
     * @return returnerar x-värdet.
     */
    @Override
    public int getY() {
        return y;
    }

}