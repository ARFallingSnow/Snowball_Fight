/*
Name: Core
Author: Alex, R
Purpose: Core object acting as the main platform for the rest of the project. 
Details: All manager and handler objects report to the core. 
*/



package Logic;

import java.util.*;

import UI.*;

public class Core {
    
    Scanner input; //Allows input to be taken over CLI
    InterfaceManager im; 
    Loop loop;
    
    
    /**
     * Core object constructor 
     */
    public Core(){
        loop = new Loop(this);
        input = new Scanner(System.in);
        im = new InterfaceManager(this); 
    }
    /**
     * Performs initial functions and value setting
     */
    public void setup(){
        im.setup();
    }

    /**
     * Method to be called when all pre-start conditions are met and application is ready to execute 
     */
    public void start(){
        loop.startGameThread();
        
        
    }


    //================ interaction ====================

    public void passKey(String key){
            System.out.println(key);
    }

    public void passCommand(){}

    public void updateTick(int tick){
        im.updateTick(tick);
    }
}
