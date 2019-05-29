package Behörighet3;








import StartPaket.Validering;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gabriel
 */
public class NyKurs extends javax.swing.JFrame {
    private InfDB idb;
    /**
     * Creates new form NyElev
     */
    public NyKurs(InfDB idb) {
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

        amne = new javax.swing.JTextField();
        skapaKnapp = new javax.swing.JToggleButton();
        fornamn = new javax.swing.JTextField();
        efternamn = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Slut = new javax.swing.JLabel();
        Lärare = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        kursnamn = new javax.swing.JTextField();
        Namn = new javax.swing.JLabel();
        startd = new com.toedter.calendar.JDateChooser();
        slutd = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        skapaKnapp.setText("OK");
        skapaKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skapaKnappActionPerformed(evt);
            }
        });

        jLabel2.setText("Start:");

        Slut.setText("Slut:");

        Lärare.setText("Lärare förnamn");

        jLabel3.setText("Lärares efternamn ");

        jLabel4.setText("Ämne");

        Namn.setText("Namn:");

        startd.setDateFormatString("yyyy-MM-dd");

        slutd.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(Namn))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(amne, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                            .addComponent(kursnamn))
                        .addGap(70, 70, 70))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(startd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Slut)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(slutd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lärare)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fornamn, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                    .addComponent(efternamn))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(skapaKnapp)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fornamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Lärare)
                        .addComponent(jLabel2))
                    .addComponent(startd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Slut)
                        .addComponent(jLabel3)
                        .addComponent(efternamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(slutd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kursnamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Namn))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(25, 25, 25)
                .addComponent(skapaKnapp)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void skapaKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skapaKnappActionPerformed
        try {   //Validerar inmatningsrutor
            if (Validering.textNamnHarVarde(fornamn, efternamn) && Validering.textFaltHarVarde(kursnamn)
                    && Validering.textFaltHarVarde(amne)) {
                 // Dklarerar variabler och importarar simpelDateFormat till datepickern
                SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
                SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
                String fran = sdf1.format(startd.getDate());
                String till = sdf2.format(slutd.getDate());

                SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

                Date date1 = format.parse(fran);
                Date date2 = format.parse(till);

                //Kontrollerar att start datum inte är efter slutdatum
                if (date1.after(date2)) {
                    JOptionPane.showMessageDialog(null, "Kontrollera datum följden");
                } else {
                    String fnamn = Validering.storBokstav(fornamn.getText());
                    String enamn = Validering.storBokstav(efternamn.getText());
                    String ämne = Validering.storBokstav(amne.getText());
                    String k = Validering.storBokstav(kursnamn.getText());

                    // rader med if och else sattser för att hindra programmet att krascha
                    //vid eventuella fel inmatningar.
                    String nextID = idb.getAutoIncrement("Kurs", "Kurs_id");
                    if (nextID == null) {
                        JOptionPane.showMessageDialog(null, "Kunde inte skapa nytt iD");
                    } else {
                        String idf = idb.fetchSingle("SELECT LARAR_ID FROM LARARE where fornamn=" + "'"
                                + fnamn + "'" + "and efternamn=" + "'" + enamn + "'");
                        if (idf == null) {
                            JOptionPane.showMessageDialog(null, "Kunde inte hitta lärare");
                        } else {
                            String a = idb.fetchSingle("SELECT AMNE_ID FROM AMNE where AMNESNAMN=" + "'" + ämne + "'");
                            if (a == null) {
                                JOptionPane.showMessageDialog(null, "Fann inte tillhörande ämne");
                            } else {
                                // om allt var korrekt inmatat så skapas en nykurs i databasen

                                idb.insert("insert into KURS values" + "(" + "'" + nextID + "'" + "," + "'" + k + "'" + "," + "'" + fran
                                        + "'" + "," + "'" + till + "'" + "," + "'" + idf + "'" + "," + "'" + a + "')");

                                JOptionPane.showMessageDialog(null, "Ny kurs tilllaggd");
                            }
                        }
                    }
                }
            }
        } catch (InfException ex) {
            Logger.getLogger(NyKurs.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Något gick fel");
        } catch (ParseException ex) {
            Logger.getLogger(NyKurs.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_skapaKnappActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lärare;
    private javax.swing.JLabel Namn;
    private javax.swing.JLabel Slut;
    private javax.swing.JTextField amne;
    private javax.swing.JTextField efternamn;
    private javax.swing.JTextField fornamn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField kursnamn;
    private javax.swing.JToggleButton skapaKnapp;
    private com.toedter.calendar.JDateChooser slutd;
    private com.toedter.calendar.JDateChooser startd;
    // End of variables declaration//GEN-END:variables
}
