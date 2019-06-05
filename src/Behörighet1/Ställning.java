/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Behörighet1;

import java.io.File;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Gabriel
 */
public class Ställning {  
    
     private InfDB idb;
     
public Ställning() throws InfException{
    
      File fil = new File("HOGDB.FDB");
        String path = fil.getAbsolutePath();
        idb = new InfDB(path);
    
}

    
    public  void sePoang(JTextArea visaStallning) {
         try {
             ArrayList<String> hem = idb.fetchColumn("SELECT ELEVHEMSNAMN from ELEVHEM");
             
             ArrayList<String> poäng = idb.fetchColumn("SELECT HUSPOANG from ELEVHEM");
             
             String svar = "";
             //sätter i hopp svaret i en string
             for (int i = 0; i < hem.size(); i++) {
                 svar += hem.get(i) + " " + poäng.get(i) + "\n";
                 //visar resultatet i ett jTextarea
                 visaStallning.setText(svar);
             }        } catch (InfException ex) {
             Logger.getLogger(Ställning.class.getName()).log(Level.SEVERE, null, ex);
         }
}
}