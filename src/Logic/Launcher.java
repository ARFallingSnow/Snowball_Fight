/*
Name: Launcher
Author: Alex, R
Purpose: Used as the initial process to being the application
Details: Allows startmode to be configured with a corosponding action based on the set int 
*/


package Logic;

public class Launcher {
    public static void main(String[] arg){
        int mode = 0;
        switch(mode){
            case 0:
                Core core = new Core();
                core.setup();
                core.start();
                break;
            case 1:
                break; 
            default:
                break; 
        }
        
    }
}
