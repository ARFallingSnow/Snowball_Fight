/*
Name: InputHandler
Author: Alex, R
Purpose: allows extened functionality to interface
Details: sets debounce 
*/



package UI; 

public class InputHandler {
    boolean uplock,downlock,leftlock,rightlock,elock,qlock;
    KeyHandler kh;
    InterfaceManager im;  
    
    /**
     * 
     * 
     * @param im
     * @param kh
     */
    public InputHandler(InterfaceManager im, KeyHandler kh){
        this.im = im; 
        this.kh = kh;
        setStartVars();
    }
    
    /**
     * 
     * 
     * 
     */
    public void setStartVars(){
    uplock = false;
    downlock = false;
    leftlock = false;
    rightlock = false;
    elock = false; 
    qlock = false;  
    }
    
    /**
     * 
     * 
     */
    public void updateInputs(){
        //============= input and debounce ======================
            if ((kh.upPressed)&&(!uplock)){
                uplock = true;
                actionTick("w");
            }else if ((kh.upPressed)&&(uplock)){uplock = true;
            }else if ((!kh.upPressed)&&(uplock)){uplock = false;}

            if ((kh.downPressed)&&(!downlock)){
                downlock = true;
                actionTick("s");
            }else if ((kh.downPressed)&&(downlock)){downlock = true;
            }else if ((!kh.downPressed)&&(downlock)){downlock = false;}

            if ((kh.leftPressed)&&(!leftlock)){
                leftlock = true;
                actionTick("a");
            }else if ((kh.leftPressed)&&(leftlock)){leftlock = true;
            }else if ((!kh.leftPressed)&&(leftlock)){leftlock = false;}

            if ((kh.rightPressed)&&(!rightlock)){
                rightlock = true;
                actionTick("d");
            }else if ((kh.rightPressed)&&(rightlock)){rightlock = true;
            }else if ((!kh.rightPressed)&&(rightlock)){rightlock = false;}

            if ((kh.ePressed)&&(!elock)){
                elock = true;
                actionTick("e");
            }else if ((kh.ePressed)&&(elock)){elock = true;
            }else if ((!kh.ePressed)&&(elock)){elock = false;}

            if ((kh.qPressed)&&(!qlock)){
                qlock = true;
                actionTick("q");
            }else if ((kh.qPressed)&&(qlock)){qlock = true;
            }else if ((!kh.qPressed)&&(qlock)){qlock = false;}
            //============ contiuned logic=========================
    }
    
    /**
     * 
     * 
     */
    public void actionTick(String cmd){
        //System.out.println(cmd);
        im.keyUpdate(cmd);
    }
}

