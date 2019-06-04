package StartPaket;

/*
 * Validerings klass för att kolla inmatningsrutorna
inne håller två metoder för att kolla om textfält är tomma
har en metod för att kolla att det är ett heltal
en metod för att hindra användren att använda sifror i textruta
en metod för att kolla inmatnings följden av datepickers.
samt gjorde vi en toUppercase metod här för att göra förstabokstaven stor.
 */


import com.toedter.calendar.JDateChooser;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Gabriel
 */
public class Validering {

    private final InfDB idb;
  
    
    public Validering() throws InfException {
        File fil = new File("HOGDB.FDB");
        String path = fil.getAbsolutePath();
        idb = new InfDB(path);
        

    }

    public static boolean textNamnHarVarde(JTextField rutanAttKolla, JTextField rutanAttKolla2) {

        boolean resultat = true;
        //kollar inmatningsrutorna för två textfält namn och efternamn oftast använd till
        //Ger felmeddelande om rutorna är tomma
        if (rutanAttKolla.getText().isEmpty() || rutanAttKolla2.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Inmatningsrutan är tom!");
            resultat = false;

        }
        return resultat;
    }

    public static boolean textFaltHarVarde(JTextField rutanAttKolla) {

        boolean resultat = true;
        //Kollar inmatningsrutorna för en variabel och skickar felmeddelande om den är tomm
        if (rutanAttKolla.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Inmatningsrutan är tom!");
            resultat = false;

        }
        return resultat;
    }

    public static boolean isHeltal(JTextField rutanAttKolla) {
        boolean resultat = true;

        try {
            //Kollar inmatningsrutorna efter Strings och skickar felmeddelande
            String inStrang = rutanAttKolla.getText();
            Integer.parseInt(inStrang);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Var god ange ett heltal!");

        }

        return resultat;
    }

    public static boolean ingaSiffror(JTextField rutanAttKolla) {
        for (char c : rutanAttKolla.getText().toCharArray()) {       //kollar så att det inte finns några siffror i inmatningsfältet och skickar ut felmeddelande
            if (Character.isDigit(c)) {
                JOptionPane.showMessageDialog(null, " Kontrollera inmatningen inga siffror i namn!");
                return false;
            }

        }
        return true;
    }

    public static String storBokstav(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    public static boolean datumFoljd(JDateChooser start, JDateChooser slut) throws ParseException {
        boolean resultat = true;
        // tar emtot värden från jDateChooser och omvanldar dem först till string
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        String fran = sdf1.format(start.getDate());
        String till = sdf2.format(slut.getDate());
        //Stringarna går till två ny nya Simpelformat som konverteras till Date
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = format.parse(fran);
        Date date2 = format2.parse(till);
        //Kontrollerar att start datum inte är efter slutdatum
        if (date1.after(date2)) {
            resultat = false;
            //skickar ut felmeddelande
            JOptionPane.showMessageDialog(null, "Kontrollera datum följden");
        }

        return resultat;
    }
}
