package StartPaket;



/*
Startsidan ger användaren möjligheten att loggain 
eller använda funktioner med lågbehörighet
 */


import Behörighet1.ListaEleverpåElevhem;
import Behörighet1.Ställning;
import Behörighet1.SökKurserElevLäst;
import Behörighet1.SökLararesKurser;
import Behörighet1.SökPrefekt;
import Behörighet1.VisaKursBetyg;
import Behörighet2.Larare;
import Behörighet3.Admin;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Gabriel
 */
public class Startsida extends javax.swing.JFrame {

    public InfDB idb;
    
    /**
     * Creates new form Startsida
     */
    public Startsida(InfDB idb) {
        initComponents();
        this.idb=idb;
       
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        user = new javax.swing.JTextField();
        loggInKnapp = new javax.swing.JToggleButton();
        password = new javax.swing.JPasswordField();
        elevHemslistaKnapp = new javax.swing.JButton();
        lästaKurserKnapp = new javax.swing.JButton();
        läraresKurserKnapp = new javax.swing.JButton();
        visaBetygKnapp = new javax.swing.JButton();
        visaPrefektKnapp = new javax.swing.JButton();
        pokalenKnapp = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultat = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        user.setText("Lärar ID");
        user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userMouseClicked(evt);
            }
        });
        getContentPane().add(user);
        user.setBounds(70, 320, 100, 20);

        loggInKnapp.setText("Logga in");
        loggInKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loggInKnappActionPerformed(evt);
            }
        });
        getContentPane().add(loggInKnapp);
        loggInKnapp.setBounds(310, 320, 90, 23);

        password.setText("oooooooo");
        password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordMouseClicked(evt);
            }
        });
        getContentPane().add(password);
        password.setBounds(180, 320, 122, 20);

        elevHemslistaKnapp.setText("Elevhems Lista");
        elevHemslistaKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elevHemslistaKnappActionPerformed(evt);
            }
        });
        getContentPane().add(elevHemslistaKnapp);
        elevHemslistaKnapp.setBounds(0, 0, 140, 30);

        lästaKurserKnapp.setText("Lästa Kurser");
        lästaKurserKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lästaKurserKnappActionPerformed(evt);
            }
        });
        getContentPane().add(lästaKurserKnapp);
        lästaKurserKnapp.setBounds(0, 30, 140, 30);

        läraresKurserKnapp.setText("Lärares Kurser");
        läraresKurserKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                läraresKurserKnappActionPerformed(evt);
            }
        });
        getContentPane().add(läraresKurserKnapp);
        läraresKurserKnapp.setBounds(0, 60, 140, 30);

        visaBetygKnapp.setText("Visa Betyg");
        visaBetygKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visaBetygKnappActionPerformed(evt);
            }
        });
        getContentPane().add(visaBetygKnapp);
        visaBetygKnapp.setBounds(0, 90, 140, 30);

        visaPrefektKnapp.setText("Visa Prefekt");
        visaPrefektKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visaPrefektKnappActionPerformed(evt);
            }
        });
        getContentPane().add(visaPrefektKnapp);
        visaPrefektKnapp.setBounds(0, 120, 140, 30);

        pokalenKnapp.setText("Elevhems Pokalen");
        pokalenKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pokalenKnappActionPerformed(evt);
            }
        });
        getContentPane().add(pokalenKnapp);
        pokalenKnapp.setBounds(0, 150, 140, 30);

        resultat.setBackground(new java.awt.Color(243, 225, 183));
        resultat.setColumns(10);
        resultat.setRows(4);
        jScrollPane1.setViewportView(resultat);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(160, 140, 129, 90);

        setBounds(0, 0, 442, 388);
    }// </editor-fold>//GEN-END:initComponents

    private void loggInKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loggInKnappActionPerformed
        //kontrollerar inmatningsrutorna
        if (Validering.textFaltHarVarde(user) && (Validering.textFaltHarVarde(password))) {
            try {
                // deklarerar variabler
                String larare = user.getText();
                String pass = password.getText();
                // Sql frågor hämtar Lösenord och ID    från Lösenordet som inmatas
                String fraga = idb.fetchSingle("SELECT LOSENORD from LARARE where Larar_ID=" + "'" + larare + "'");
//                String fraga2 = idb.fetchSingle("SELECT Larar_ID from LARARE where LOSENORD=" + "'" + fraga + "'");
                //Sql fråga för att stämma av om läraren är Admin
                String a = idb.fetchSingle("SELECT ADMINISTRATOR from LARARE where LARAR_ID=" + larare);
                //Loggin för admin kontrollerar inmating gentemot Sql-frågorna.
                if (!(fraga.equals(pass))) {
                    JOptionPane.showMessageDialog(null, "Fyll i ID och lösenord korrekt!");
                } else {
                    if (a.startsWith("T")) // om Användaren är Administratör kommer den skickas till Admin Klassen
                    {
                        new Admin(idb).setVisible(true);
                        dispose();
                    } //Pass och ID kontrolleras mot sql-frågorna.
                    else {
                        // för lärare utan administratörs status öppnas larare-klassen            
                        new Larare(idb).setVisible(true);
                        dispose();

                    } //Vid fel lösenord eller användarnamn kommer ett felmeddelande

                }

            } catch (InfException ex) {
                Logger.getLogger(Startsida.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Något gick fel!");

            }

        }
    }//GEN-LAST:event_loggInKnappActionPerformed

    private void pokalenKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pokalenKnappActionPerformed
        try { 
             //skapar ett objekt av Ställning och använder dess metod sePoäng
            new Ställning().sePoang(resultat);
        } catch (InfException ex) {
            Logger.getLogger(Startsida.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_pokalenKnappActionPerformed

    private void elevHemslistaKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elevHemslistaKnappActionPerformed
        //Öppnar funktionen list elever på elevhem
        new ListaEleverpåElevhem(idb).setVisible(true);
    }//GEN-LAST:event_elevHemslistaKnappActionPerformed

    private void lästaKurserKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lästaKurserKnappActionPerformed
        // öppnar funktionen sökkurser elever har läst
        new SökKurserElevLäst(idb).setVisible(true);
    }//GEN-LAST:event_lästaKurserKnappActionPerformed

    private void läraresKurserKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_läraresKurserKnappActionPerformed
        // Öppnar funktionen sök lärares kurser
        new SökLararesKurser(idb).setVisible(true);
    }//GEN-LAST:event_läraresKurserKnappActionPerformed

    private void visaPrefektKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visaPrefektKnappActionPerformed
        // Öppnar visa prefekt
        new SökPrefekt(idb).setVisible(true);
    }//GEN-LAST:event_visaPrefektKnappActionPerformed

    private void visaBetygKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visaBetygKnappActionPerformed
        //  Öpnnar visa betyg för elever
        new VisaKursBetyg(idb).setVisible(true);
    }//GEN-LAST:event_visaBetygKnappActionPerformed

    private void userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMouseClicked
    //Tömmer Användar textfältet
        user.setText("");
    }//GEN-LAST:event_userMouseClicked

    private void passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordMouseClicked
       //tömmer lösenord fältet
       password.setText("");
    }//GEN-LAST:event_passwordMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton elevHemslistaKnapp;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton loggInKnapp;
    private javax.swing.JButton läraresKurserKnapp;
    private javax.swing.JButton lästaKurserKnapp;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton pokalenKnapp;
    private javax.swing.JTextArea resultat;
    private javax.swing.JTextField user;
    private javax.swing.JButton visaBetygKnapp;
    private javax.swing.JButton visaPrefektKnapp;
    // End of variables declaration//GEN-END:variables
}
