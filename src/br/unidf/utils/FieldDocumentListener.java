package br.unidf.utils;

import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class FieldDocumentListener
        implements DocumentListener {

    private final JTextField textField;

    public FieldDocumentListener(javax.swing.JTextField textField) {
        this.textField = textField;
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        if (!textField.getText().matches("[0-9]*")) {
            textField.setText(textField.getText().replaceAll("[^0-9]", ""));
        }
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
    }
}
