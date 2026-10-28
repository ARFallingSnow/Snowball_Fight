package Logic;

public abstract class Manager {
    private String ID; 
    public Manager(){}

    public void setID(String id){
        this.ID = id;
    }
    public String getID(){
        return this.ID; 
    }
    public abstract void passCommand(String command);
    public abstract void updateTick(int gameTick);
    

}
