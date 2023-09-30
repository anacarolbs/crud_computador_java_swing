package br.unidf.utils;

import javax.swing.JOptionPane;

public class MessageUtil {

    private MessageUtil() {
    }

    public static void showMessage(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }

}
