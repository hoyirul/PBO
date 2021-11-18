public class Barrier implements Destroyable{
    private int strength;
    
    public Barrier(int strength) {
        this.strength = strength;
    }
    
    public int getStrength() {
        return strength;
    }
    
    public void setStrength(int strength) {
        this.strength = strength;
    }
    
    public void destroy(){}
    
    public String getBarrierInfo(){
        String text = "Barrier Strength = "+this.strength;
        return text;
    }
    
    @Override
    public void destroyed() {
        this.strength -= (this.strength * 10) / 100;
    }
}