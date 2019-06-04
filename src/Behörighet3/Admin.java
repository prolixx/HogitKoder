package Behörighet3;



/*
 * Klass för administratörs funktioner
 */


import Behörighet1.ListaEleverpåElevhem;
import Behörighet1.SökKurserElevLäst;
import Behörighet1.SökLararesKurser;
import Behörighet1.SökPrefekt;
import Behörighet1.VisaKursBetyg;
import Behörighet2.Betygsregistrering;
import Behörighet2.NyElev;
import Behörighet2.Poang;
import Behörighet2.RegistreraochAvegistreraElevPåKurs;
import Behörighet2.ÄndraBetyg;
import Behörighet2.ÄndraLosenord;
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
public class Admin extends javax.swing.JFrame {
 
    private InfDB idb;
    
    
    /**
    * Creates new form Larare
     */
    public Admin(InfDB idb) {
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

        loggaUtKnapp = new javax.swing.JButton();
        hanteraLärareKnapp = new javax.swing.JButton();
        nyLarareKnapp = new javax.swing.JButton();
        nyKursKnapp = new javax.swing.JButton();
        elevHemslistaKnapp = new javax.swing.JButton();
        lästaKurserKnapp = new javax.swing.JButton();
        läraresKurserKnapp = new javax.swing.JButton();
        visaBetygKnapp = new javax.swing.JButton();
        visaPrefektKnapp = new javax.swing.JButton();
        ändraHuspoängKnapp = new javax.swing.JButton();
        AndraLosenordKnapp = new javax.swing.JButton();
        RegistreraElevPåKursKnapp = new javax.swing.JButton();
        nyttBetygKnapp = new javax.swing.JButton();
        nyElevKnapp = new javax.swing.JButton();
        ändraBetygKnapp = new javax.swing.JToggleButton();
        ändraElevKnapp = new javax.swing.JButton();
        ändraKursInfoKnapp = new javax.swing.JButton();
        pokalenKnapp = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultat = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        loggaUtKnapp.setText("Logga ut");
        loggaUtKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loggaUtKnappActionPerformed(evt);
            }
        });
        getContentPane().add(loggaUtKnapp);
        loggaUtKnapp.setBounds(0, 290, 129, 51);

        hanteraLärareKnapp.setText("Ändra Lärar Info");
        hanteraLärareKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hanteraLärareKnappActionPerformed(evt);
            }
        });
        getContentPane().add(hanteraLärareKnapp);
        hanteraLärareKnapp.setBounds(320, 270, 150, 30);

        nyLarareKnapp.setText("Registrera Ny Lärare");
        nyLarareKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nyLarareKnappActionPerformed(evt);
            }
        });
        getContentPane().add(nyLarareKnapp);
        nyLarareKnapp.setBounds(320, 240, 150, 30);

        nyKursKnapp.setText("Registrera Ny Kurs");
        nyKursKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nyKursKnappActionPerformed(evt);
            }
        });
        getContentPane().add(nyKursKnapp);
        nyKursKnapp.setBounds(320, 180, 150, 30);

        elevHemslistaKnapp.setText("Elevhems Lista");
        elevHemslistaKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elevHemslistaKnappActionPerformed(evt);
            }
        });
        getContentPane().add(elevHemslistaKnapp);
        elevHemslistaKnapp.setBounds(0, 0, 129, 30);

        lästaKurserKnapp.setText("Lästa Kurser");
        lästaKurserKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lästaKurserKnappActionPerformed(evt);
            }
        });
        getContentPane().add(lästaKurserKnapp);
        lästaKurserKnapp.setBounds(0, 30, 129, 30);

        läraresKurserKnapp.setText("Lärares Kurser");
        läraresKurserKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                läraresKurserKnappActionPerformed(evt);
            }
        });
        getContentPane().add(läraresKurserKnapp);
        läraresKurserKnapp.setBounds(0, 60, 129, 30);

        visaBetygKnapp.setText("Visa Betyg");
        visaBetygKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visaBetygKnappActionPerformed(evt);
            }
        });
        getContentPane().add(visaBetygKnapp);
        visaBetygKnapp.setBounds(0, 90, 129, 30);

        visaPrefektKnapp.setText("Visa Prefekt");
        visaPrefektKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visaPrefektKnappActionPerformed(evt);
            }
        });
        getContentPane().add(visaPrefektKnapp);
        visaPrefektKnapp.setBounds(0, 120, 129, 30);

        ändraHuspoängKnapp.setText("Ändra Huspoäng");
        ändraHuspoängKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ändraHuspoängKnappActionPerformed(evt);
            }
        });
        getContentPane().add(ändraHuspoängKnapp);
        ändraHuspoängKnapp.setBounds(320, 150, 153, 30);

        AndraLosenordKnapp.setText("Ändra Lösenord");
        AndraLosenordKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AndraLosenordKnappActionPerformed(evt);
            }
        });
        getContentPane().add(AndraLosenordKnapp);
        AndraLosenordKnapp.setBounds(320, 300, 153, 30);

        RegistreraElevPåKursKnapp.setText("Registrera På Kurs");
        RegistreraElevPåKursKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistreraElevPåKursKnappActionPerformed(evt);
            }
        });
        getContentPane().add(RegistreraElevPåKursKnapp);
        RegistreraElevPåKursKnapp.setBounds(320, 60, 153, 30);

        nyttBetygKnapp.setText("Registrera Betyg");
        nyttBetygKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nyttBetygKnappActionPerformed(evt);
            }
        });
        getContentPane().add(nyttBetygKnapp);
        nyttBetygKnapp.setBounds(320, 90, 153, 30);

        nyElevKnapp.setText("Registrera Ny Elev");
        nyElevKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nyElevKnappActionPerformed(evt);
            }
        });
        getContentPane().add(nyElevKnapp);
        nyElevKnapp.setBounds(320, 0, 153, 30);

        ändraBetygKnapp.setText("Ändra Betyg");
        ändraBetygKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ändraBetygKnappActionPerformed(evt);
            }
        });
        getContentPane().add(ändraBetygKnapp);
        ändraBetygKnapp.setBounds(320, 120, 150, 30);

        ändraElevKnapp.setText("Ändra Elev Info");
        ändraElevKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ändraElevKnappActionPerformed(evt);
            }
        });
        getContentPane().add(ändraElevKnapp);
        ändraElevKnapp.setBounds(320, 30, 150, 30);

        ändraKursInfoKnapp.setText("Ändra Kurs Info");
        ändraKursInfoKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ändraKursInfoKnappActionPerformed(evt);
            }
        });
        getContentPane().add(ändraKursInfoKnapp);
        ändraKursInfoKnapp.setBounds(320, 210, 150, 30);

        pokalenKnapp.setText("Elevhems Pokalen");
        pokalenKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pokalenKnappActionPerformed(evt);
            }
        });
        getContentPane().add(pokalenKnapp);
        pokalenKnapp.setBounds(0, 150, 130, 30);

        resultat.setBackground(new java.awt.Color(243, 225, 183));
        resultat.setColumns(10);
        resultat.setRows(4);
        jScrollPane1.setViewportView(resultat);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(160, 140, 129, 80);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gabriel\\Documents\\NetBeansProjects\\harry-potter-hogwarts-crest-i67939.jpg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-70, -20, 590, 380);

        setBounds(0, 0, 486, 377);
    }// </editor-fold>//GEN-END:initComponents

    
    private void loggaUtKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loggaUtKnappActionPerformed
     new Startsida(idb).setVisible(true);
        dispose();
    }//GEN-LAST:event_loggaUtKnappActionPerformed

    private void hanteraLärareKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hanteraLärareKnappActionPerformed
        // Öppnar ändra lärar information
        new AdminÄndraInfoLarare(idb).setVisible(true);
        
        
        
   
    }//GEN-LAST:event_hanteraLärareKnappActionPerformed

    private void nyLarareKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nyLarareKnappActionPerformed
       new NyLarare(idb).setVisible(true);
    }//GEN-LAST:event_nyLarareKnappActionPerformed

    private void nyKursKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nyKursKnappActionPerformed
        //Öppnar funktionen skapa ny kurs
        new NyKurs(idb).setVisible(true);
    }//GEN-LAST:event_nyKursKnappActionPerformed

    private void lästaKurserKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lästaKurserKnappActionPerformed
        // öppnar funktionen sökkurser elever har läst
        new SökKurserElevLäst(idb).setVisible(true);
    }//GEN-LAST:event_lästaKurserKnappActionPerformed

    private void läraresKurserKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_läraresKurserKnappActionPerformed
        // Öppnar funktionen sök lärares kurser
        new SökLararesKurser(idb).setVisible(true);
    }//GEN-LAST:event_läraresKurserKnappActionPerformed

    private void visaBetygKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visaBetygKnappActionPerformed
        //  Öpnnar visa betyg för elever
        new VisaKursBetyg(idb).setVisible(true);
    }//GEN-LAST:event_visaBetygKnappActionPerformed

    private void visaPrefektKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visaPrefektKnappActionPerformed
        // Öppnar visa prefekt
        new SökPrefekt(idb).setVisible(true);
    }//GEN-LAST:event_visaPrefektKnappActionPerformed

    private void ändraHuspoängKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ändraHuspoängKnappActionPerformed

        // Öppnar Ge poäng
        new Poang(idb).setVisible(true);
    }//GEN-LAST:event_ändraHuspoängKnappActionPerformed

    private void AndraLosenordKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AndraLosenordKnappActionPerformed
        // öppnar funktion för lösenords ändring
        new ÄndraLosenord(idb).setVisible(true);
    }//GEN-LAST:event_AndraLosenordKnappActionPerformed

    private void RegistreraElevPåKursKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistreraElevPåKursKnappActionPerformed
        // öppnar registrera och avresgistrera elever på kurs
        new RegistreraochAvegistreraElevPåKurs(idb).setVisible(true);
    }//GEN-LAST:event_RegistreraElevPåKursKnappActionPerformed

    private void nyttBetygKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nyttBetygKnappActionPerformed
        // Öppnar funktionen ge nytt betyg
        new Betygsregistrering(idb).setVisible(true);
    }//GEN-LAST:event_nyttBetygKnappActionPerformed

    private void nyElevKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nyElevKnappActionPerformed
        // öppnar funktion för att registrera elevver
        new NyElev(idb).setVisible(true);
    }//GEN-LAST:event_nyElevKnappActionPerformed

    private void ändraBetygKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ändraBetygKnappActionPerformed
        //Öppnar ändra betyg
        new ÄndraBetyg(idb).setVisible(true);

    }//GEN-LAST:event_ändraBetygKnappActionPerformed

    private void ändraKursInfoKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ändraKursInfoKnappActionPerformed
        // Öppnar ändra kurs information
        new ÄndraKursInfo(idb).setVisible(true);
    }//GEN-LAST:event_ändraKursInfoKnappActionPerformed

    private void elevHemslistaKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elevHemslistaKnappActionPerformed
    //Öppnar funktionen list elever på elevhem
        new ListaEleverpåElevhem(idb).setVisible(true);
    }//GEN-LAST:event_elevHemslistaKnappActionPerformed

    private void ändraElevKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ändraElevKnappActionPerformed
        // Öpnnar funktionen AdminÄndraInfoElev
        new AdminÄndraInfoElev(idb).setVisible(true);
    }//GEN-LAST:event_ändraElevKnappActionPerformed

    private void pokalenKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pokalenKnappActionPerformed

        
        try {
            //Skapar två listor av elevhem och elevhemspoäng
            ArrayList<String> hem = idb.fetchColumn("SELECT ELEVHEMSNAMN from ELEVHEM");

            ArrayList<String> poäng = idb.fetchColumn("SELECT HUSPOANG from ELEVHEM");

            String svar = "";
            //sätter i hopp svaret i en string
            for (int i = 0; i < hem.size(); i++) {
                svar += hem.get(i) + " " + poäng.get(i) + "\n";
                //visar resultatet i ett jTextarea
                resultat.setText(svar);
                

            }
        } catch (InfException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
            

        

    }//GEN-LAST:event_pokalenKnappActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AndraLosenordKnapp;
    private javax.swing.JButton RegistreraElevPåKursKnapp;
    private javax.swing.JButton elevHemslistaKnapp;
    private javax.swing.JButton hanteraLärareKnapp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton loggaUtKnapp;
    private javax.swing.JButton läraresKurserKnapp;
    private javax.swing.JButton lästaKurserKnapp;
    private javax.swing.JButton nyElevKnapp;
    private javax.swing.JButton nyKursKnapp;
    private javax.swing.JButton nyLarareKnapp;
    private javax.swing.JButton nyttBetygKnapp;
    private javax.swing.JButton pokalenKnapp;
    private javax.swing.JTextArea resultat;
    private javax.swing.JButton visaBetygKnapp;
    private javax.swing.JButton visaPrefektKnapp;
    private javax.swing.JToggleButton ändraBetygKnapp;
    private javax.swing.JButton ändraElevKnapp;
    private javax.swing.JButton ändraHuspoängKnapp;
    private javax.swing.JButton ändraKursInfoKnapp;
    // End of variables declaration//GEN-END:variables

}
