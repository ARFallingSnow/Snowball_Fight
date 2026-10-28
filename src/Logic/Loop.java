package Logic;
/*
    Add to logic file to implement game threadding default interaction 
    will require the addition of a  updateTick(int gameTick) to be
    added to the controller to determine behavior based on timing 

    the startGameThread() method is called from the controller to 
    begin the loop calling back to the controler with each tick 

    The class can be extened by modifying the update() method 
    within the main loop section
*/

public class Loop implements Runnable{
    Thread gameThread; 
    Core core;
    final private int FPS = 60; 
    private int gameTick =0; 
    
    public Loop(Core core){
        // pass controller information, this will be called within the code 
        this.core = core; 
    }
    
    public void startGameThread() {   //initilizes the game thread 

        gameThread = new Thread(this); // instantiation 
        gameThread.start(); //start
    }
    @Override
    public void run() {
         // gameplay time loop
            double drawInterval = 1000000000/ FPS;
            double delta = 0;
            long lastTime = System.nanoTime();
            long currentTime; 
            long timer = 0;
 
        while(gameThread != null){
            // implements game timer using delta time method 
            currentTime =System.nanoTime();
            delta += (currentTime - lastTime ) / drawInterval;
            timer += (currentTime - lastTime);
            lastTime = currentTime; 
            if(delta >= 1){
                update();
                delta--;
            }
            if(timer >= 1000000000){
                timer = 0; 
            }}
        }
    public void stop(){gameThread = null;}
// =========================== main loop ===================================
    public void update(){
            gameTick++;
            core.updateTick(gameTick);
        }
    
    }
        









