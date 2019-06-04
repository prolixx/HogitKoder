/*
 * Class som hindrar användaren från att skriva in för lång text i ett textfält
 */
package StartPaket;

import javax.swing.JOptionPane;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author Gabriel
 */
public final class MaxTecken extends PlainDocument {

    private final int limit;

    public MaxTecken(int limit) {
        this.limit = limit;
    }

    @Override
    public void insertString(int offs, String str, AttributeSet a)
            throws BadLocationException {
        if (str == null) {
            return;
        }
        //Användaren kommer att meddelas när förmånga tecken har uppnåtts
        if ((getLength() + str.length()) <= limit) {
            super.insertString(offs, str, a);
        }
        if ((getLength() + str.length()) >= limit) {
            super.insertString(offs, str, a);
            JOptionPane.showMessageDialog(null, "För mycket tecken i textrutan!");
        }
    }
}
