package Behörighet2;
 
/*
 * Klass för lärares funktioner
 */



import Behörighet1.ListaEleverpåElevhem;
import Behörighet1.SökKurserElevLäst;
import Behörighet1.SökLararesKurser;
import Behörighet1.SökPrefekt;
import Behörighet1.VisaKursBetyg;
import StartPaket.Startsida;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Gabriel
 */
public class Larare extends javax.swing.JFrame {
 
    public InfDB idb;
    
    public Larare(InfDB idb) {
        initComponents();
        this.idb = idb;
    
    
        
        
    
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AndraLosenordKnapp = new javax.swing.JButton();
        ändraHuspoängKnapp = new javax.swing.JButton();
        ändraBetygKnapp = new javax.swing.JToggleButton();
        LoggUtKnapp = new javax.swing.JButton();
        RegistreraElevPåKursKnapp = new javax.swing.JButton();
        visaPrefektKnapp = new javax.swing.JButton();
        visaBetygKnapp = new javax.swing.JButton();
        läraresKurserKnapp = new javax.swing.JButton();
        lästaKurserKnapp = new javax.swing.JButton();
        elevHemslistaKnapp = new javax.swing.JButton();
        nyElevKnapp = new javax.swing.JButton();
        nyttBetygKnapp = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        AndraLosenordKnapp.setText("Ändra Lösenord");
        AndraLosenordKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AndraLosenordKnappActionPerformed(evt);
            }
        });
        getContentPane().add(AndraLosenordKnapp);
        AndraLosenordKnapp.setBounds(310, 160, 153, 30);

        ändraHuspoängKnapp.setText("Ändra Huspoäng");
        ändraHuspoängKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ändraHuspoängKnappActionPerformed(evt);
            }
        });
        getContentPane().add(ändraHuspoängKnapp);
        ändraHuspoängKnapp.setBounds(310, 130, 153, 30);

        ändraBetygKnapp.setText("Ändra Betyg");
        ändraBetygKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ändraBetygKnappActionPerformed(evt);
            }
        });
        getContentPane().add(ändraBetygKnapp);
        ändraBetygKnapp.setBounds(310, 100, 153, 30);

        LoggUtKnapp.setText("Logga Ut");
        LoggUtKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoggUtKnappActionPerformed(evt);
            }
        });
        getContentPane().add(LoggUtKnapp);
        LoggUtKnapp.setBounds(0, 300, 129, 51);

        RegistreraElevPåKursKnapp.setText("Registrera På Kurs");
        RegistreraElevPåKursKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistreraElevPåKursKnappActionPerformed(evt);
            }
        });
        getContentPane().add(RegistreraElevPåKursKnapp);
        RegistreraElevPåKursKnapp.setBounds(310, 30, 153, 37);

        visaPrefektKnapp.setText("Visa Prefekt");
        visaPrefektKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visaPrefektKnappActionPerformed(evt);
            }
        });
        getContentPane().add(visaPrefektKnapp);
        visaPrefektKnapp.setBounds(0, 120, 139, 30);

        visaBetygKnapp.setText("Visa Betyg");
        visaBetygKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visaBetygKnappActionPerformed(evt);
            }
        });
        getContentPane().add(visaBetygKnapp);
        visaBetygKnapp.setBounds(0, 90, 139, 30);

        läraresKurserKnapp.setText("Lärares Kurser");
        läraresKurserKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                läraresKurserKnappActionPerformed(evt);
            }
        });
        getContentPane().add(läraresKurserKnapp);
        läraresKurserKnapp.setBounds(0, 60, 139, 31);

        lästaKurserKnapp.setText("Lästa Kurser");
        lästaKurserKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lästaKurserKnappActionPerformed(evt);
            }
        });
        getContentPane().add(lästaKurserKnapp);
        lästaKurserKnapp.setBounds(0, 30, 139, 32);

        elevHemslistaKnapp.setText("Elevhems Lista");
        elevHemslistaKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elevHemslistaKnappActionPerformed(evt);
            }
        });
        getContentPane().add(elevHemslistaKnapp);
        elevHemslistaKnapp.setBounds(0, 0, 139, 29);

        nyElevKnapp.setText("Registrera Ny Elev");
        nyElevKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nyElevKnappActionPerformed(evt);
            }
        });
        getContentPane().add(nyElevKnapp);
        nyElevKnapp.setBounds(310, 0, 153, 30);

        nyttBetygKnapp.setText("Registrera Betyg");
        nyttBetygKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nyttBetygKnappActionPerformed(evt);
            }
        });
        getContentPane().add(nyttBetygKnapp);
        nyttBetygKnapp.setBounds(310, 60, 153, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gabriel\\Documents\\NetBeansProjects\\Hogwartz.färdig\\harry-potter-hogwarts-crest-i67939.jpg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-70, -10, 550, 390);

        setBounds(0, 0, 482, 393);
    }// </editor-fold>//GEN-END:initComponents

    
    private void AndraLosenordKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AndraLosenordKnappActionPerformed
     // öppnar funktion för lösenords ändring
        new ÄndraLosenord(idb).setVisible(true);
    }//GEN-LAST:event_AndraLosenordKnappActionPerformed

    private void ändraHuspoängKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ändraHuspoängKnappActionPerformed

            // Öppnar Ge poäng
            new Poang(idb).setVisible(true); 
    }//GEN-LAST:event_ändraHuspoängKnappActionPerformed

    private void ändraBetygKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ändraBetygKnappActionPerformed
        //Öppnar ändra betyg
        new ÄndraBetyg(idb).setVisible(true);
  
    }//GEN-LAST:event_ändraBetygKnappActionPerformed

    private void LoggUtKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoggUtKnappActionPerformed
     // loggar ut användaren och kastas till startsidan
        new Startsida(idb).setVisible(true);
     dispose();
    }//GEN-LAST:event_LoggUtKnappActionPerformed

    private void RegistreraElevPåKursKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistreraElevPåKursKnappActionPerformed
        // öppnar registrera och avresgistrera elever på kurs
        new RegistreraochAvegistreraElevPåKurs(idb).setVisible(true);
    }//GEN-LAST:event_RegistreraElevPåKursKnappActionPerformed

    private void visaPrefektKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visaPrefektKnappActionPerformed
        // Öppnar visa prefekt
        new SökPrefekt(idb).setVisible(true);
    }//GEN-LAST:event_visaPrefektKnappActionPerformed

    private void visaBetygKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visaBetygKnappActionPerformed
        //  Öpnnar visa betyg för elever
        new VisaKursBetyg(idb).setVisible(true);
    }//GEN-LAST:event_visaBetygKnappActionPerformed

    private void läraresKurserKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_läraresKurserKnappActionPerformed
        // Öppnar funktionen sök lärares kurser
        new SökLararesKurser(idb).setVisible(true);
    }//GEN-LAST:event_läraresKurserKnappActionPerformed

    private void lästaKurserKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lästaKurserKnappActionPerformed
        // öppnar funktionen sökkurser elever har läst
        new SökKurserElevLäst(idb).setVisible(true);
    }//GEN-LAST:event_lästaKurserKnappActionPerformed

    private void elevHemslistaKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elevHemslistaKnappActionPerformed
        //Öppnar funktionen list elever på elevhem
        new ListaEleverpåElevhem(idb).setVisible(true);
    }//GEN-LAST:event_elevHemslistaKnappActionPerformed

    private void nyElevKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nyElevKnappActionPerformed
        // öppnar funktion för att registrera elevver
        new NyElev(idb).setVisible(true);
    }//GEN-LAST:event_nyElevKnappActionPerformed

    private void nyttBetygKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nyttBetygKnappActionPerformed
        // Öppnar funktionen ge nytt betyg
        new Betygsregistrering(idb).setVisible(true);
    }//GEN-LAST:event_nyttBetygKnappActionPerformed
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AndraLosenordKnapp;
    private javax.swing.JButton LoggUtKnapp;
    private javax.swing.JButton RegistreraElevPåKursKnapp;
    private javax.swing.JButton elevHemslistaKnapp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton läraresKurserKnapp;
    private javax.swing.JButton lästaKurserKnapp;
    private javax.swing.JButton nyElevKnapp;
    private javax.swing.JButton nyttBetygKnapp;
    private javax.swing.JButton visaBetygKnapp;
    private javax.swing.JButton visaPrefektKnapp;
    private javax.swing.JToggleButton ändraBetygKnapp;
    private javax.swing.JButton ändraHuspoängKnapp;
    // End of variables declaration//GEN-END:variables

}
