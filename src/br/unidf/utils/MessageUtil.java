package br.unidf.utils;

import javax.swing.JOptionPane;

public class MessageUtil {

    private MessageUtil() {
    }

    public static void showMessage(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }
    
    public static int showConfirmDialog(final String message, final String title){
       return JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
    }
}
