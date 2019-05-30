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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nytt namn:");

        jLabel2.setText("Nytt efternamn:");

        jLabel4.setText("Återställ Lösenord: 0000");

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

        andraKnapp3.setText("Återställ");
        andraKnapp3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                andraKnapp3ActionPerformed(evt);
            }
        });

        jLabel6.setText("Namn:");

        jLabel7.setText("Efternamn:");

        jLabel8.setText("Vilken lärare vill du ändra?");

        jLabel9.setText("Fyll informationen du vill ändra.");

        jLabel3.setText("<- Tillbaka");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Ge Läraren Admin behöringhet:");

        taBortLarare.setForeground(new java.awt.Color(255, 0, 51));
        taBortLarare.setText("Ta bort Lärare");
        taBortLarare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taBortLarareActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(taBortLarare, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(32, 32, 32)
                                .addComponent(andraFornamn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(andraKnapp1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(andraEfternamn, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(andraKnapp2)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(andraKnapp3)
                                            .addComponent(jButton1)))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6)
                                .addGap(5, 5, 5)
                                .addComponent(fornamn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(efternamn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 182, Short.MAX_VALUE)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(taBortLarare)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void andraKnapp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_andraKnapp1ActionPerformed
        //validerar inmatningsrutor
        if (Validering.textNamnHarVarde(fornamn, efternamn) && Validering.textFaltHarVarde(andraFornamn)) {
            //deklarerar variabler samt ger textfältet toUppercase
            String fnamn = Validering.storBokstav(andraFornamn.getText());

            try {
                //kollar att läraren finns
                if (getID() == null) {
                    JOptionPane.showMessageDialog(null, "läraren finns inte!");
                } else {
                    //uppdaterar fornamnet
                    idb.update("UPDATE LARARE SET FORNAMN=" + "'" + fnamn + "'" + "WHERE LARAR_ID=" + "'" + getID() + "'");
                    JOptionPane.showMessageDialog(null, "Namnet är nu uppdaterat!");
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
            String nyttEfternamn = Validering.storBokstav(andraEfternamn.getText());
            try {
                //kollar att läraren finns
                if (getID() == null) {
                    JOptionPane.showMessageDialog(null, "läraren finns inte!");
                } else {
                    //uppdaterar efternamn
                    idb.update("UPDATE LARARE SET EFTERNAMN=" + "'" + nyttEfternamn + "'" + "WHERE LARAR_ID=" + "'" + getID() + "'");
                    JOptionPane.showMessageDialog(null, "namnet är nu uppdaterat!");
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
                        Logger.getLogger(GeAdminStatus.class.getName()).log(Level.SEVERE, null, ex);
                        JOptionPane.showMessageDialog(null, " Något gick fel");
                    }
                }
            }
        } catch (HeadlessException | NumberFormatException | InfException ex) {
            JOptionPane.showMessageDialog(null, " Något gick fel");
            Logger.getLogger(GeAdminStatus.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void taBortLarareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taBortLarareActionPerformed
        if (Validering.textNamnHarVarde(fornamn, efternamn)) {
            boolean ok = true;

            try {
                // Kontrollerar om läraren har listad kompetens och tar i så fall bort denna
                if (JOptionPane.showConfirmDialog(null, "vill du tabort lärare: " + fornamn.getText()
                        + " " + efternamn.getText() + " " + getID(), "",
                        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
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
                                JOptionPane.showMessageDialog(null, " Läraran är elevhemsföreståndare välj ny föreståndare innan borttag");
                            }

                            if (c == null) {
                                //Tar bort läraren ut tabellen
                                idb.delete("DELETE from LARARE where LARAR_ID=" + "'" + getID() + "'");
                                {
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

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField andraEfternamn;
    private javax.swing.JTextField andraFornamn;
    private javax.swing.JButton andraKnapp1;
    private javax.swing.JButton andraKnapp2;
    private javax.swing.JButton andraKnapp3;
    private javax.swing.JTextField efternamn;
    private javax.swing.JTextField fornamn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
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
