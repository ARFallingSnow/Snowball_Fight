/*
Name: Key Handler 
Author: Alex, R
Purpose: to implment key handling functionality 
Details: 

    KeyListener class will trigger on key press while the object is in focus. 
    each key press triggers a key typed event. This object will update a bool 
    corresponding to the key typed. 

    Must be added as a key Listener to the controller and 
    added to the JFrame with the following code 

    // add to JFrame in constructor 
    this.setFocusable(true);
    this.addKeyListener(KeyListenerObjectName);
    //end of JFrame add
*/
package UI; 

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener{ // class uses naitive keylistener class
    public boolean upPressed, downPressed, leftPressed, rightPressed, qPressed, ePressed, pPressed; // booleans to pass for game logic 

    @Override // Not used in this object
    public void keyTyped(KeyEvent e) {} 
    

    @Override //updates bools on key press
    public void keyPressed(KeyEvent e) {
        
        int code = e.getKeyCode(); //KL will return the ascii code of the key that was pressed 
        // check if key pressed matches VK_X where X is the key char from the key board 
        if (code == KeyEvent.VK_W){upPressed = true;}
        if (code == KeyEvent.VK_S){downPressed = true;}
        if (code == KeyEvent.VK_A){leftPressed = true;}
        if (code == KeyEvent.VK_D){rightPressed = true;}
        if (code == KeyEvent.VK_Q){qPressed = true;}
        if (code == KeyEvent.VK_E){ePressed = true;}
        if (code == KeyEvent.VK_P){pPressed = true;}
    }

    @Override //updates bools on key release
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode(); //KL will return the ascii code of the key that was released 
        if (code == KeyEvent.VK_W){upPressed = false;}
        if (code == KeyEvent.VK_S){downPressed = false;}
        if (code == KeyEvent.VK_A){leftPressed = false;}
        if (code == KeyEvent.VK_D){rightPressed = false;}
        if (code == KeyEvent.VK_Q){qPressed = false;}
        if (code == KeyEvent.VK_E){ePressed = false;}
        if (code == KeyEvent.VK_P){pPressed = false;}
    }
}

        
