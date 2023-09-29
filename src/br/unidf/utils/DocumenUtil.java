package br.unidf.utils;

import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import javax.swing.text.PlainDocument;

public final class DocumenUtil {

    public static JTextField getTextField() {
        JTextField textField = new JTextField(10);
        PlainDocument doc = (PlainDocument) textField.getDocument();

        doc.setDocumentFilter(new DocumentFilter() {
            @Override
            public void insertString(FilterBypass fb, int offset, String text, AttributeSet attr)
                    throws BadLocationException {
                if (text.matches("[0-9]+")) {
                    super.insertString(fb, offset, text, attr);
                }
            }

            @Override
            public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs)
                    throws BadLocationException {
                if (text.matches("[0-9]+")) {
                    super.replace(fb, offset, length, text, attrs);
                }
            }
        });

        textField.getDocument().addDocumentListener(new DocumentListener() {
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
        });

        return textField;
    }
}
