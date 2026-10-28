/*
Name: Input Manager
Author: Alex, R
Purpose: Primary method of user interaction
Details: Provides initial settings for UI suite
*/




package UI;
import Logic.*;



public class InterfaceManager extends Manager{
    Window win;  //
    InputHandler inout;
    KeyHandler kh; 
    StringBuilder sb;
    Core core; 
    /**
     * 
     * 
     * @param core
     */
    public InterfaceManager(Core core){
        this.core = core;
    }

    /**
     * 
     * 
     */
    public void setup(){
        kh = new KeyHandler();
        inout = new InputHandler(this, kh);
        sb = new StringBuilder();
        win = new Window(kh);
        win.showWindow();
    }
    /**
     * 
     * 
     * @param contents
     */
    public void updatePane(String contents){
        win.updateText(contents);
    }
    
    /**
     * 
     * 
     * @param contents
     */
    public void updatePane(String[] contents){
            sb.setLength(0);
        for(String line: contents){
            sb.append(line+"\n");
        }
        win.updateText(sb.toString());
        sb.setLength(0);
    }
    
    /**
     * 
     * 
     * @param cmd
     */
    public void keyUpdate(String cmd){
        //System.out.println(cmd);
        switch(cmd){
            case "":
                break;
            case "w":
                core.passKey("KEY_W");
                break;
            case "a":
                core.passKey("KEY_A");
                break;
            case "s":
                core.passKey("KEY_S");
                break;
            case "d":
                core.passKey("KEY_D");
                break;
            case "q":
                core.passKey("KEY_Q");
                break;
            case "e":
                core.passKey("KEY_E");
                break;
            default:
                break; 
        }
    }
    
    /**
     * 
     * 
     * @return
     */
    public boolean quitProgram(){
        win.setVisible(false);
        return true;
    }

    /**    (non-Javadoc)
     * 
     * 
     * @see Logic.Manager#passCommand(java.lang.String)
     */
    public void passCommand(String command){}
   
    /**    (non-Javadoc)
     * 
     * 
     * 
     * @see Logic.Manager#updateTick(int)
    */
    public void updateTick(int gameTime){
        //System.out.println("tick");
        inout.updateInputs();
    }

}
