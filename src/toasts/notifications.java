package toasts;

import javax.swing.JOptionPane;

public class notifications {

    String message;

    //this is just to demostrate that i can make use of setters and getters, in this instance my methods returns void. it can be changed to getters
    public void setmsg(String msg){
        this.message = msg;
    }

    //methods for showing error, success, info, warning messaging, can be called anyway
    //these methods can be changed to receive any passed arguments.

    public void errorMsg(){
        JOptionPane.showMessageDialog(null,this.message,"Error",JOptionPane.ERROR_MESSAGE);
    }

    public void warning(){
        JOptionPane.showMessageDialog(null, this.message,"Warning",JOptionPane.WARNING_MESSAGE);
    }
}
