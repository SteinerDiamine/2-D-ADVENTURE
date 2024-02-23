package main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {
    public boolean upPressed, downPressed, leftPressed, rightPressed;
    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {

        int code = keyEvent.getKeyCode();
        if(code== keyEvent.VK_W){
            upPressed= true;

        }
        if(code== keyEvent.VK_S){
            downPressed= true;

        }
        if(code== keyEvent.VK_A){
            leftPressed= true;

        }
        if(code== keyEvent.VK_D){
            rightPressed=true;

        }

    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
        int code= keyEvent.getKeyCode();
        if(code== keyEvent.VK_W){
            upPressed= false;

        }
        if(code== keyEvent.VK_S){
            downPressed= false;

        }
        if(code== keyEvent.VK_A){
            leftPressed= false;

        }
        if(code== keyEvent.VK_D){
            rightPressed=false;

        }


    }
}
