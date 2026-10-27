/*
Name: Core
Author: Alex, R
Purpose: Core object acting as the main platform for the rest of the project. 
Details: All manager and handler objects report to the core. 
*/



package Logic;

import java.util.*;

public class Core {
    Window window; //Window object to be used as primary interface
    Scanner input = new Scanner(System.in); //Allows input to be taken over CLI
    
    
    /**
     * Core object constructor 
     */
    public Core(){
        window = new Window();
    }
    /**
     * Performs initial functions and value setting
     */
    public void setup(){
        
    }

    /**
     * Method to be called when all pre-start conditions are met and application is ready to execute 
     */
    public void start(){
        window.showWindow();
        
    }
}
