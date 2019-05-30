package Behörighet3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import StartPaket.Validering;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Admin
 */
public class ÄndraKursInfo extends javax.swing.JFrame {

    private final InfDB idb;
    
    /**
     * Creates new form ÄndraKursInfo
     */
    public ÄndraKursInfo(InfDB idb) {
        initComponents();

        this.idb =idb;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        namn = new javax.swing.JTextField();
        amne = new javax.swing.JTextField();
        kursnamn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fornamn = new javax.swing.JTextField();
        kursstart = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        startDatum = new com.toedter.calendar.JDateChooser();
        slutDatum = new com.toedter.calendar.JDateChooser();
        efternamn = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        kursNamn = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tabortKursKnapp = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("KURS ID");

        jLabel2.setText("Nytt Kurs Namn");

        kursnamn.setText("ÄNDRA");
        kursnamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursnamnActionPerformed(evt);
            }
        });

        jLabel3.setText("Kurs Start");

        jLabel4.setText("Kurs Slut");

        jLabel5.setText("Ämne");

        kursstart.setText("ÄNDRA");
        kursstart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursstartActionPerformed(evt);
            }
        });

        jButton3.setText("ÄNDRA");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("ÄNDRA");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("ÄNDRA");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel6.setText("jLabel6");

        jLabel7.setText("Lärar Förnamn");

        jLabel9.setText("Lärar Efternamn");

        jLabel10.setText("Kurs Namn");

        tabortKursKnapp.setForeground(new java.awt.Color(255, 51, 51));
        tabortKursKnapp.setText("Tabort kurs");
        tabortKursKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabortKursKnappActionPerformed(evt);
            }
        });

        jLabel8.setText("<- Tillbaka");
        jLabel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel11.setText("Ändra Kurs Infro");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tabortKursKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(startDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(slutDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6)
                                        .addComponent(namn, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(amne, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(95, 95, 95)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(83, 83, 83)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(kursNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton4)
                                .addComponent(jButton3)
                                .addComponent(kursstart)
                                .addComponent(kursnamn)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(efternamn, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(42, 42, 42)
                                            .addComponent(jButton5))
                                        .addComponent(fornamn, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(102, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(158, 158, 158))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(kursNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kursnamn, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(namn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(startDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(kursstart))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addComponent(jLabel4))
                        .addGap(2, 2, 2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(slutDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fornamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(efternamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tabortKursKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //GetMetod för att hämta id till de andra metoderna
    public String getID() throws InfException {
     

         // Validerar inmatningsfält
        // deklarerar variabler och validering använder toUppercase metod
        String knamn = Validering.storBokstav(kursNamn.getText());
        //hämtar id från databas från kursnamn
          String kid = idb.fetchSingle("SELECT KURS_ID from KURS WHERE KURSNAMN=" + "'" + knamn + "'");
        // retunerar kursID
        
         return kid;
        
    }
    private void kursnamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursnamnActionPerformed
        //Validering kollar inmatningsrutorna   
        if (Validering.textNamnHarVarde(namn, kursNamn)) {
            try {
                //Deklarerar variabler
                String knamn = Validering.storBokstav(namn.getText());
                if (getID() == null) {
                    JOptionPane.showMessageDialog(null, "Kunde inte hitta kurs");
                } else {
                    //Om id finns i listan uppdaterar kursnamnet
                    idb.update("UPDATE KURS SET KURSNAMN=" + "'" + knamn + "'" + "where KURS_ID=" + "'" + getID() + "'");
                    JOptionPane.showMessageDialog(null, " Kursnamn är nu ändrat");
                }
            } catch (InfException ex) {
                Logger.getLogger(ÄndraKursInfo.class.getName()).log(Level.SEVERE, null, ex);
            }
            //Meddelar att ändring har gjorts


        }
    }//GEN-LAST:event_kursnamnActionPerformed

    private void kursstartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursstartActionPerformed
            if(Validering.textFaltHarVarde(kursNamn)){
        try {
            //Kollar att kurs finns
            if (getID() == null) {
                //stoppar programmet om kursen inte finns
                JOptionPane.showMessageDialog(null, "Kunde inte hitta kurs!");
            } else {
                // deklarerar variabler och importerar simpeldateformat för att kunna använda Datepicker
                String till = idb.fetchSingle("Select KURSSLUT FROM KURS WHERE KURS_ID=" + getID());
                SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
                String fran = sdf1.format(startDatum.getDate());
                SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
                SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd");
                Date date1 = format.parse(fran);
                Date date2 = format2.parse(till);

                //Kontrollerar att start datum inte är efter slutdatum
                if (date1.after(date2)) {
                    JOptionPane.showMessageDialog(null, "Kontrollera datumet: Start efter Slutdatum");
                } else {
                    //uppdaterar kursstart i databasen
                    idb.update("UPDATE KURS SET KURSSTART=" + "'" + fran + "'" + "where KURS_ID=" + "'" + getID() + "'");
                    //meddelar att ändring har gjorts
                    JOptionPane.showMessageDialog(null, " Kursstart är nu ändrat");
                }

            }
        } catch (ParseException | InfException ex) {
            Logger.getLogger(ÄndraKursInfo.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Något gick fel!");
        }
            }
    }//GEN-LAST:event_kursstartActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(Validering.textFaltHarVarde(kursNamn)){
        try {
            //Kollar om kurs finns
            if (getID() == null) {
                //stoppar programmet och skickar felmeddelande
                JOptionPane.showMessageDialog(null, "Kunde inte hitta kurs!");
            } else {
              //deklarerar variabler och hämtar SimpleDateFormat för datepickern
                String fran = idb.fetchSingle("Select KURSSTART FROM KURS WHERE KURS_ID=" + getID());
                SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
                String till = sdf1.format(slutDatum.getDate());
                SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
                SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd");
                Date date1 = format.parse(fran);
                Date date2 = format2.parse(till);

                //Kontrollerar att start datum inte är efter slutdatum
                if (date1.after(date2)) {
                    JOptionPane.showMessageDialog(null, "Kontrollera datumet: Kursslut innan start!");
                } else {
                    //uppdaterar kursens slutdatum
                    idb.update("UPDATE KURS SET KURSSLUT=" + "'" + till + "'" + "where KURS_ID=" + "'" + getID() + "'");
                    JOptionPane.showMessageDialog(null, " Kursslut är nu ändrat");
                }
            }

        } catch (ParseException | InfException ex) {
            Logger.getLogger(ÄndraKursInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //Validering av inmatningsfält
        if (Validering.textNamnHarVarde(amne, kursNamn)){
        String amnet = Validering.storBokstav(amne.getText());

        boolean ok = true;

        try {
            //SQL fråga hittar ämnes id
            String aid = idb.fetchSingle("SELECT AMNE_ID FROM AMNE WHERE AMNESNAMN=" + "'" + amnet + "'");
            //Skapar en list över alla ämnen
            ArrayList<String> amneLista = idb.fetchColumn("SELECT AMNE_ID from AMNE");
            //kontrollerar att valt ämne finns i listan, annars skriver ut felmeddelande
            if (!amneLista.contains(aid)) {
                ok = false;
                JOptionPane.showMessageDialog(null, "Ämne finns ej ");
            } else {
                //kontrollerar att kurs finns
                if (getID() == null) {
                    JOptionPane.showMessageDialog(null, "Kunde inte hitta kurs!");
                } else {
                    //Uppdaterar kursens ämnes tillhörighet
                    idb.update("UPDATE KURS SET AMNESTILLHORIGHET =" + "'" + aid + "'" + "where KURS_ID=" + "'" + getID() + "'");

                    JOptionPane.showMessageDialog(null, " Ämne är nu ändrat");
                }
            }
        
        } catch (InfException ex) {
            Logger.getLogger(ÄndraKursInfo.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Något gick fel!");
        }}
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        //Validering av Inmatningsrutor
        if (Validering.textNamnHarVarde(fornamn, efternamn) && Validering.textFaltHarVarde(kursNamn)) {
            try {
                //deklarerar variabler och använder toUppercase metod
                String fnamn = Validering.storBokstav(fornamn.getText());
                String enamn = Validering.storBokstav(efternamn.getText());
                //hämtar Lärar id op förnamn och efternamn
                String lid = idb.fetchSingle("SELECT LARAR_ID FROM LARARE WHERE FORNAMN=" + "'" + fnamn + "'"
                        + "and EFTERNAMN=" + "'" + enamn + "'");

                boolean ok = true;
                //kollar om kurs finns
                if (getID() == null) {
                    JOptionPane.showMessageDialog(null, "Kurs finns ej ");
                } else {
                   //Skapar en lista över alla lärare
                    ArrayList<String> lararLista = idb.fetchColumn("SELECT LARAR_ID from LARARE");
                    //kollar om Läraren finns i listan
                    if (!lararLista.contains(lid)) {
                        ok = false;
                        //om läraren inte finns i listan så skickas felmeddelande
                        JOptionPane.showMessageDialog(null, " Lärare finns ej ");
                    } else {
                        //uppdaterar kursens lärare
                        idb.update("UPDATE KURS SET KURSLARARE =" + "'" + lid + "'" + "where KURS_ID=" + "'" + getID() + "'");

                        JOptionPane.showMessageDialog(null, " Ansvarig Lärare är nu ändrat");
                    }
                }

            } catch (InfException ex) {
                Logger.getLogger(ÄndraKursInfo.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Något gick fel!");
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void tabortKursKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabortKursKnappActionPerformed

        //Ger felmeddeland vid tomma inmatningsrutor
        if(Validering.textFaltHarVarde(kursNamn)){

        try{
         
                //Kontrollerar att kursen finns
                if (getID() == null) {
                    JOptionPane.showMessageDialog(null, "Hittade inte kurs!");
                } else {
                    if (JOptionPane.showConfirmDialog(null, "Vill du ta bort kursen: " + kursNamn.getText(), "",
                            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                        // Kollar om kursen har elevbetyg listade, om ja tar bort dessa

                        String a = idb.fetchSingle("Select KURS_ID from HAR_BETYG_I where KURS_ID=" + "'" + getID() + "'");
                        if (!(null == a)) {
                            idb.delete("delete from HAR_BETYG_I WHERE KURS_ID=" + "'" + getID() + "'");

                        }
                        //Kollar om det finns några elever registrerade på kursen, om ja tar bort dessa
                        String b = idb.fetchSingle("Select KURS_ID from REGISTRERAD_PA where KURS_ID=" + "'" + getID() + "'");
                        if (!(null == b)) {

                            idb.delete("delete from REGISTRERAD_PA WHERE KURS_ID=" + "'" + getID() + "'");
                        }

                        // Tar bort kursen, visar meddelande att kursen är borttagen
                        idb.delete("Delete from kurs where KURS_ID=" + "'" + getID() + "'");

                        JOptionPane.showMessageDialog(null, "  Kursen " + kursNamn.getText() + " är borttagen");

                    }
                }
            } catch (Exception ex) {
                Logger.getLogger(ÄndraKursInfo.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Något gick fel! Kontrollera inmatningen");

            }
        }
    }//GEN-LAST:event_tabortKursKnappActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel8MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amne;
    private javax.swing.JTextField efternamn;
    private javax.swing.JTextField fornamn;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField kursNamn;
    private javax.swing.JButton kursnamn;
    private javax.swing.JButton kursstart;
    private javax.swing.JTextField namn;
    private com.toedter.calendar.JDateChooser slutDatum;
    private com.toedter.calendar.JDateChooser startDatum;
    private javax.swing.JButton tabortKursKnapp;
    // End of variables declaration//GEN-END:variables
}
