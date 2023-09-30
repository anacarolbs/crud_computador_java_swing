package br.unidf.utils;

import javax.swing.JTextField;
import javax.swing.event.DocumentListener;
import javax.swing.text.PlainDocument;

public final class DocumenUtil {

    public static JTextField getTextField() {
        JTextField txtField = new JTextField(10);
        txtField.setDocument(getPlainDocument(txtField));
        txtField.getDocument().addDocumentListener(getDocumentListener(txtField));
        return txtField;
    }
    
    private static PlainDocument getPlainDocument(JTextField txtField){
        PlainDocument doc = (PlainDocument) txtField.getDocument();
        doc.setDocumentFilter(new FieldDocumentFilter());
        return doc;
    }
    
    private static DocumentListener getDocumentListener(final JTextField txtField){
        return new FieldDocumentListener(txtField);
    }
}
