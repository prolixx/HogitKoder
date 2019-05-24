/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.regex.Pattern;
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
    
 public Validering() throws InfException{
 
 idb = new InfDB("c:\\db\\hogdb.fdb");
 }

    public static boolean textFaltHarVarde(JTextField rutanAttKolla) {

        boolean resultat = true;

        if (rutanAttKolla.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Inmatningsrutan är tom!");
            resultat = false;
         
        }
        return resultat;
    }


public static boolean isHeltal(JTextField rutanAttKolla)
{
 boolean resultat = true;
 
 try{
     String inStrang = rutanAttKolla.getText();
    Integer.parseInt(inStrang);
 }

catch(NumberFormatException e)
{
  JOptionPane.showMessageDialog(null, "Var god ange ett heltal!");  

}
        
        
 return resultat;
}
  public static boolean kollatecken(JTextField rutanAttKolla ) {
boolean resultat = true;
Pattern kollatecken = Pattern.compile( "0123456789");
if(!kollatecken.matcher(rutanAttKolla.getText()).matches())
{ resultat =false;   JOptionPane.showMessageDialog(null, "Ange namn och efternamn med bokstäver!"); 
  
}
return resultat;
  }}



