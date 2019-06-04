package StartPaket;



/* Programmets Uppstartings Klass

 */


import java.io.File;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Gabriel
 */
public class Start {

    private static InfDB idb;
 

    //Enda main klassen, Skickar med databasens egenskaper.
public static void main(String[] args) throws InfException
{
   try {
         File fil = new File("HOGDB.FDB");
           String path = fil.getAbsolutePath();
           idb = new InfDB(path);
   }
   catch(InfException ettUndantag) {
   JOptionPane.showMessageDialog(null,"något gick fel!");
   System.out.println("internt felmeddelande" + ettUndantag.getMessage());
   
   }
    
    
    //Skickar dig vidare till startsidan
    
    new Startsida(idb).setVisible(true);
    
}
  
}