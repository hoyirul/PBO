public class Zombie implements Destroyable{
    protected int health;
    protected int level;
    
    public void heal(){}
    
    public String getZombieInfo(){
        return "Zombie Data";
    }
    
    @Override
    public void destroyed() {
        
    }
}