/*
Name: Window
Author: Alex, R
Purpose: Window to pose as main user display and interface
Details: 
*/

package Logic;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class Window extends JFrame {
    private JFrame window; //JFrame used as the window
    private JPanel main; //JPanel used as main display object container
    private JTextArea text; //JTextArea used as main display

    private int windowHeight, windowWidth; //used to control window dimensions 

    private Color bk = new  Color(71,184,188);              //background color. Modify values as needed 
    private Font basic = new Font("Serif", Font.BOLD, 24);  // basic font. Modify as needed
    
    /**
     * Window constructor - instantiates window object instance 
     */
    public Window() {
        window = new JFrame();
        windowHeight = 800;
        windowWidth = 1400;
        window.setSize(windowWidth, windowHeight);
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);
        window.setFocusable(true);
        window.setResizable(false);

        // Creating the JPanel to containerize content 
        main = new JPanel(); 
        main.setBounds(0,0,windowWidth, windowHeight);
        main.setVisible(true);
        main.setBackground(bk);

        // Create and provide initial values for the text area 
        text = new JTextArea(); 
        text.setBounds(3,3,windowWidth-6, windowHeight-6);
        text.setVisible(true);
        text.setOpaque(false);
        text.setFont(basic);
        text.setText("Some absolute nonsense");
        text.setEditable(false);
        text.setLineWrap(true);
        text.setWrapStyleWord(true);
        
        main.add(text); 
        window.add(main);
    }
    /**
     * Sets window visibility true
     */
    public void showWindow(){
        window.setVisible(true);
    }
    /**
     * Sets window visibility false
     */
    public void hideWindow(){
        window.setVisible(false);
    }
    
    /**
     * Sets the given content as the text
     * @param content string given to be displayed on the windows text area 
     */
    public void setText(String content){
        text.setText(content);
    }

    /**
     * Used to controll the windows dimensions 
     * @param width int of the intented window width
     * @param height int of the intended window height
     */

    public void setWindowSize(int width, int height){
        this.windowWidth = width;
        this.windowHeight = height;
        window.setVisible(false);
        text.setBounds(0,0,windowWidth, windowHeight);
        main.setBounds(0,0,windowWidth, windowHeight);
        window.setSize(windowWidth, windowHeight);
        window.setVisible(true);
    }

}
