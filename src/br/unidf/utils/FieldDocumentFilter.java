package br.unidf.utils;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

public class FieldDocumentFilter
        extends DocumentFilter {

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
}
