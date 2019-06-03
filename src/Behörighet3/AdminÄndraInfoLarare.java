package Behörighet3;

/*
 * Klass för att andra information om lärare
 */



import StartPaket.Validering;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Dator
 */
public class AdminÄndraInfoLarare extends javax.swing.JFrame {
    private InfDB idb;
    
    
    
    
    /**
     * Creates new form RegNyElev
     */
    public AdminÄndraInfoLarare(InfDB idb){
        initComponents();
        this.idb = idb;
        
    }
      public String getID() throws InfException{
          //deklarerar variabler
        String fnamn = Validering.storBokstav(fornamn.getText());
        String enamn = Validering.storBokstav(efternamn.getText());
        //hämtar id från för och efternamn
        String id = idb.fetchSingle("SELECT LARAR_ID FROM LARARE WHERE FORNAMN=" + "'" + fnamn + "'"
                + "AND EFTERNAMN =" + "'" + enamn + "'");
    
        return id;

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        andraFornamn = new javax.swing.JTextField();
        andraEfternamn = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        andraKnapp1 = new javax.swing.JButton();
        andraKnapp2 = new javax.swing.JButton();
        andraKnapp3 = new javax.swing.JButton();
        fornamn = new javax.swing.JTextField();
        efternamn = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        taBortLarare = new javax.swing.JButton();
        föreståndareKnapp = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        elevhemCombo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nytt Förnamn");

        jLabel2.setText("Nytt Efternamn");

        jLabel4.setText("Återställ Lösenord 0000");

        andraKnapp1.setText("Ändra");
        andraKnapp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                andraKnapp1ActionPerformed(evt);
            }
        });

        andraKnapp2.setText("Ändra");
        andraKnapp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                andraKnapp2ActionPerformed(evt);
            }
        });

        andraKnapp3.setText("Ändra");
        andraKnapp3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                andraKnapp3ActionPerformed(evt);
            }
        });

        jLabel6.setText("Förnamn");

        jLabel7.setText("Efternamn");

        jLabel8.setText("Vilken lärare vill du ändra?");

        jLabel9.setText("Fyll informationen du vill ändra");

        jLabel3.setText("<- Tillbaka");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jButton1.setText("Ändra");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Ge Läraren Admin behöringhet");

        taBortLarare.setForeground(new java.awt.Color(255, 0, 51));
        taBortLarare.setText("Ta bort Lärare");
        taBortLarare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taBortLarareActionPerformed(evt);
            }
        });

        föreståndareKnapp.setText("Ändra");
        föreståndareKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                föreståndareKnappActionPerformed(evt);
            }
        });

        jLabel10.setText("Gör Till Föreståndare");

        elevhemCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elevhem", "Gryffindor", "Hufflepuff", "Ravenclaw", "Slytherin" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(187, 187, 187)
                                .addComponent(taBortLarare)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(107, 107, 107)
                                        .addComponent(jLabel8))
                                    .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel6)
                                        .addGap(5, 5, 5)
                                        .addComponent(fornamn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(efternamn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(39, 39, 39)))
                                        .addGap(9, 9, 9)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(andraKnapp3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(93, 93, 93)
                                                .addComponent(elevhemCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(andraEfternamn)
                                                    .addComponent(andraFornamn))))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(39, 39, 39)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(andraKnapp2, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                                                    .addComponent(andraKnapp1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(38, 38, 38)
                                                .addComponent(föreståndareKnapp, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)))))))
                        .addGap(148, 148, 148)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fornamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(efternamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(andraFornamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(andraKnapp1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(andraEfternamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(andraKnapp2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(andraKnapp3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(föreståndareKnapp)
                    .addComponent(elevhemCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(taBortLarare, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void andraKnapp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_andraKnapp1ActionPerformed
        //validerar inmatningsrutor
        if (Validering.textNamnHarVarde(fornamn, efternamn) && Validering.textFaltHarVarde(andraFornamn)) {
            //deklarerar variabler samt ger textfältet toUppercase
            String nyttfnamn = Validering.storBokstav(andraFornamn.getText());

            try {
                //kollar att läraren finns
                if (getID() == null) {
                    JOptionPane.showMessageDialog(null, "läraren finns inte!");
                } else {
                    //kollar att namnet inte är upptaget
                    String id = idb.fetchSingle("SELECT LARAR_ID FROM LARARE where fornamn=" + "'" + nyttfnamn + "'"
                            + "and efternamn=" + "'" + Validering.storBokstav(efternamn.getText()) + "'");
                    //Om id hittas, skriv ut felmeddelande 
                    if (!(id == null)) {
                        JOptionPane.showMessageDialog(null, " Registrering ej möjlig larare med samma för "
                                + "och efternamn finns redan");
                    } else {
                        //uppdaterar fornamnet
                        idb.update("UPDATE LARARE SET FORNAMN=" + "'" + nyttfnamn + "'" + "WHERE LARAR_ID=" + "'" + getID() + "'");
                        JOptionPane.showMessageDialog(null, "Namnet är nu uppdaterat");
                    }
                }
            } catch (InfException ex) {
                Logger.getLogger(AdminÄndraInfoLarare.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, " Något gick fel");
            }
        }

    }//GEN-LAST:event_andraKnapp1ActionPerformed

    private void andraKnapp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_andraKnapp2ActionPerformed
        //validerar inmatningsrutor
        if (Validering.textFaltHarVarde(andraEfternamn) && Validering.textNamnHarVarde(fornamn, efternamn)) {
            //deklarerar variabler samt ger textfältet toUppercase
            String nyttEnamn = Validering.storBokstav(andraEfternamn.getText());
            try {
                //kollar att läraren finns
                if (getID() == null) {
                    JOptionPane.showMessageDialog(null, "läraren finns inte!");
                } else {
                    //kollar att namnet inte är upptaget
                    String id = idb.fetchSingle("SELECT LARAR_ID FROM LARARE where efternamn=" + "'" + nyttEnamn + "'"
                            + "and fornamn=" + "'" + Validering.storBokstav(fornamn.getText()) + "'");
                    //Om id hittas, skriv ut felmeddelande 
                    if (!(id == null)) {
                        JOptionPane.showMessageDialog(null, " Registrering ej möjlig larare med samma för "
                                + "och efternamn finns redan");
                    } else {
                        //uppdaterar efternamn
                        idb.update("UPDATE LARARE SET EFTERNAMN=" + "'" + nyttEnamn + "'" + "WHERE LARAR_ID="
                                + "'" + getID() + "'");
                        JOptionPane.showMessageDialog(null, "Namnet är nu uppdaterat");
                    }
                }
            } catch (InfException ex) {
                Logger.getLogger(AdminÄndraInfoLarare.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, " Något gick fel");
            }
        }

    }//GEN-LAST:event_andraKnapp2ActionPerformed

    private void andraKnapp3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_andraKnapp3ActionPerformed
        //validerar inmatningsrutor
        if (Validering.textNamnHarVarde(fornamn, efternamn)) {
            try {
                //kollar att läraren finns
                if (getID() == null) {
                    JOptionPane.showMessageDialog(null, "läraren finns inte!");
                } else {
                    //återställer lösenord till defualt: 0000
                    idb.update("update larare set losenord= '0000' where larar_ID =" + "'" + getID() + "'");
                    JOptionPane.showMessageDialog(null, "Lösenordet är uppdaterat");
                }
            } catch (InfException ex) {
                Logger.getLogger(AdminÄndraInfoLarare.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, " Något gick fel");
            }

        }
    }//GEN-LAST:event_andraKnapp3ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//validerar inmatningsrutor
        if (Validering.textNamnHarVarde(fornamn, efternamn)) {
        try {
            //deklarerar variabler
            String setToAdmin = "'T'";
            //kollar om läraren finns
            if (getID() == null) {
                JOptionPane.showMessageDialog(null, "läraren finns inte!");
            } else {
                // om läraren finns vill vi göra den till admin
                String a = idb.fetchSingle("SELECT ADMINISTRATOR from LARARE where LARAR_ID=" + getID());
                // men om läraren redan är administratör skickas meddelande ut
                if (a.startsWith("T")) {
                    JOptionPane.showMessageDialog(null, " Läraren är redan administratör");
                } else {
                    try {
                        // ConfirmDialog ger användaren alternativ att avbryta
                        if (JOptionPane.showConfirmDialog(null, "Ge admin till: " + fornamn.getText() + " " + efternamn.getText() + " " + getID(), "Admin",
                                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                            idb.update("UPDATE LARARE SET ADMINISTRATOR=" + setToAdmin + "where LARAR_ID=" + getID());
                            // om användaren väljer att fortsätta skickas bekräfftelse meddelande
                            JOptionPane.showMessageDialog(null, " Behörighet nu updaterad");
                        }
                    } catch (InfException ex) {
                        Logger.getLogger(AdminÄndraInfoLarare.class.getName()).log(Level.SEVERE, null, ex);
                        JOptionPane.showMessageDialog(null, " Något gick fel");
                    }
                }
            }
        } catch (HeadlessException | NumberFormatException | InfException ex) {
            JOptionPane.showMessageDialog(null, " Något gick fel");
            Logger.getLogger(AdminÄndraInfoLarare.class.getName()).log(Level.SEVERE, null, ex);
        }}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void taBortLarareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taBortLarareActionPerformed
        if (Validering.textNamnHarVarde(fornamn, efternamn)) {
            boolean ok = true;

            try {
                // Kontrollerar om läraren har listad kompetens och tar i så fall bort denna
                if (getID() == null) {
                    JOptionPane.showMessageDialog(null, "Läraren finns inte!");
                } else {
                    String a = idb.fetchSingle("Select LARAR_ID from HAR_KOMPETENS_I where LARAR_ID=" + "'" + getID() + "'");
                    if (!(null == a)) {
                        ok = false;
                    }
                    {
                        idb.delete("delete from HAR_KOMPETENS_I WHERE LARAR_ID=" + "'" + getID() + "'");
                        ok = true;
                    }

                    if (ok = true) {
                        //Kontrollerar om läraren är ansvarig för en kurs, och skickar i så fall felmeddelande att borttag ej möjligt
                        String b = idb.fetchSingle("Select KURSLARARE from KURS where KURSLARARE=" + "'" + getID() + "'");
                        if (!(null == b)) {
                            JOptionPane.showMessageDialog(null, " Läraran ansvarar för en kurs välj ny kursansvarig innan borttag");
                        }

                        if (b == null) {
                            //Kontrollerar om läraren är föreståndare för ett elevhem och skickar i så fall felmeddelande att borttag ej möjligt
                            String c = idb.fetchSingle("Select FORESTANDARE from ELEVHEM where FORESTANDARE=" + "'" + getID() + "'");
                            if (!(null == c)) {
                                JOptionPane.showMessageDialog(null, " Läraren är elevhemsföreståndare välj ny föreståndare innan borttag");
                            }

                            if (c == null) {
                                if (JOptionPane.showConfirmDialog(null, "Vill du ta bort lärare: " + fornamn.getText()
                                        + " " + efternamn.getText() + " " + getID(), "",
                                        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                                    //Tar bort läraren ut tabellen
                                    idb.delete("DELETE from LARARE where LARAR_ID=" + "'" + getID() + "'");

                                    JOptionPane.showMessageDialog(null, "  Läraren är nu borttagen");
                                }
                            }
                        }
                    }
                }

            } catch (InfException ex) {
                Logger.getLogger(AdminÄndraInfoLarare.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, " Något gick fel");
            }

        }

    }//GEN-LAST:event_taBortLarareActionPerformed

    private void föreståndareKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_föreståndareKnappActionPerformed
        // Ger felmeddelande vid tomma inmatningsrutor
        if (Validering.textNamnHarVarde(fornamn, efternamn)) {
            try {
                //Deklarerar variabler
                String hem = elevhemCombo.getSelectedItem().toString();
                String fnamn = Validering.storBokstav(fornamn.getText());
                String enamn = Validering.storBokstav(efternamn.getText());

                //Skapa en ArrayLista med alla elevhems namn
                ArrayList<String> h = idb.fetchColumn("SELECT ELEVHEMSNAMN from ELEVHEM");
                //Kontrollerar att inmatat namn finns i listan,  om inte skickar felmeddelande
                if (!(h.contains(hem))) {
                    JOptionPane.showMessageDialog(null, "Elevhemmet finns inte, kontrollera stavningen");
                } else {
                    // Hämta Lärar id för inmatat för och efternamn
                    String id = idb.fetchSingle("SELECT LARAR_ID FROM LARARE where fornamn=" + "'" + fnamn + "'" + "and efternamn=" + "'" + enamn + "'");
                    //Kontrollerar så att idet finns, om inte skickar felmeddelande
                    if (id == null) {
                        JOptionPane.showMessageDialog(null, " Läraren finns inte");
                    } //Kollar om läraren redan är föreståndare och skikcar i så fall felmeddelande
                    else {
                        String finns = idb.fetchSingle("SELECT FORESTANDARE FROM ELEVHEM where forestandare =" + id);
                        if (!(finns == null)) {
                            JOptionPane.showMessageDialog(null, " Läraren är redan föreståndare för ett elevhem");
                        } else {
                            //Om idet finns sätts detta som föreståndare för angivet elevhem
                            idb.update("UPDATE ELEVHEM SET FORESTANDARE=" + id + "where ELEVHEMSNAMN=" + "'" + hem + "'");
                            //Meddelar att uppdateringen är gjord
                            JOptionPane.showMessageDialog(null, hem + "s föreståndare är nu updaterad");
                        }
                    }
                }

            } catch (HeadlessException | NumberFormatException | InfException e) {
                JOptionPane.showMessageDialog(null, "Något gick fel! Kontrollera inmatningen");
                System.out.println("Internt felmeddelande" + e.getMessage());
            }

        }

    }//GEN-LAST:event_föreståndareKnappActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField andraEfternamn;
    private javax.swing.JTextField andraFornamn;
    private javax.swing.JButton andraKnapp1;
    private javax.swing.JButton andraKnapp2;
    private javax.swing.JButton andraKnapp3;
    private javax.swing.JTextField efternamn;
    private javax.swing.JComboBox<String> elevhemCombo;
    private javax.swing.JTextField fornamn;
    private javax.swing.JButton föreståndareKnapp;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton taBortLarare;
    // End of variables declaration//GEN-END:variables
}
