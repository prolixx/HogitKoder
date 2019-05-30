package Behörighet3;
import StartPaket.Validering;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/*
 * Klass för att lägga upp en ny lärare
 */
/**
 *
 * @author Gabriel
 */
public class NyLarare extends javax.swing.JFrame {

    private InfDB idb;

    /**
     * Creates new form NyElev
     */
    public NyLarare(InfDB idb) {
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

        fornamn = new javax.swing.JTextField();
        efternamn = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        skapaKnapp = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Lärares Förnamn");

        skapaKnapp.setText("OK");
        skapaKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skapaKnappActionPerformed(evt);
            }
        });

        jLabel2.setText("Lärares Efternamn");

        jLabel4.setText("Skapa ny lärare");

        jLabel5.setText("<- Tillbaka");
        jLabel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(skapaKnapp)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(efternamn, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                        .addComponent(fornamn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 163, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(fornamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(efternamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(skapaKnapp)
                .addGap(54, 54, 54)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void skapaKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skapaKnappActionPerformed
        // Kollar inmatningsrutorna så de har ett värde
        if (Validering.textNamnHarVarde(fornamn, efternamn) && Validering.ingaSiffror(efternamn)
                && Validering.ingaSiffror(fornamn)){
     

            try {
                // Skapar variabler och använder en toUpperCase metod
                String fnamn = Validering.storBokstav(fornamn.getText());
                String enamn = Validering.storBokstav(efternamn.getText());
                String nextID = idb.getAutoIncrement("larare", "larar_id");
                //Kollar om det redan finns en lärare registrerarad med samm för och efternamn
                String id = idb.fetchSingle("SELECT LARAR_ID FROM LARARE where fornamn=" + "'" + fnamn + "'"
                        + "and efternamn=" + "'" + enamn + "'");
                //Om id hittas, skriv ut felmeddelande 
                if (!(id == null)) {
                    JOptionPane.showMessageDialog(null, " Registrering ej möjlig lärare med samma för "
                            + "och efternamn finns redan");
                } else {

                    // confirmdialog ger möjligheten att avbryta vid evenutella fel
                    if (JOptionPane.showConfirmDialog(null, "Lägg till lärare: " + fnamn + " " + enamn + " " + "Lösenord:0000", "Nylärare",
                            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                        // Lägger till lärare med skickat namn och efternamn, samt genererat id och standar lösenord
                        idb.insert("insert into larare values" + "(" + "'" + nextID + "'" + "," + "'" + fnamn
                                + "'" + "," + "'" + enamn + "'" + "," + "'0000'" + "," + "'F')");
                        JOptionPane.showMessageDialog(null, "Ny larare tilllaggd");
                    }
                }
            } catch (InfException ex) {
                Logger.getLogger(NyLarare.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, " Något gick fel, kontrollera inmatningen");
            }

        }


    }//GEN-LAST:event_skapaKnappActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel5MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField efternamn;
    private javax.swing.JTextField fornamn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JToggleButton skapaKnapp;
    // End of variables declaration//GEN-END:variables
}
