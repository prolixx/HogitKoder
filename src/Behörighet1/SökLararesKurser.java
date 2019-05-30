/*
 *Tar fram kurser en lärare haft mellan två datum.
 */
package Behörighet1;


import StartPaket.Validering;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import oru.inf.InfDB;
import oru.inf.InfException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 */
public class SökLararesKurser extends javax.swing.JFrame {

        private final InfDB idb;
        
    public SökLararesKurser(InfDB idb) {
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

        efternamn = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultat = new javax.swing.JTextArea();
        fornamn = new javax.swing.JTextField();
        sok = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fDatum = new com.toedter.calendar.JDateChooser();
        tDatum = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Agency FB", 0, 14)); // NOI18N

        resultat.setColumns(20);
        resultat.setRows(5);
        jScrollPane1.setViewportView(resultat);

        sok.setText("Sök");
        sok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sokActionPerformed(evt);
            }
        });

        jLabel3.setText("Lärare Efternamn");

        jLabel4.setText("Larare Förnamn");

        jLabel1.setText("Från");

        jLabel2.setText("Till");

        jLabel5.setText("Sök kurser");

        jLabel6.setText("<- Tillbaka");
        jLabel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(117, Short.MAX_VALUE)
                                .addComponent(sok)
                                .addGap(58, 58, 58))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(efternamn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fornamn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(fornamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(efternamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(fDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(tDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(sok)
                                .addGap(64, 64, 64))))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sokActionPerformed
        // Kontrollerar att inmatningens rutorn inte är tomma
        if (Validering.textNamnHarVarde(fornamn, efternamn)) {

            try {
                //deklarerar variabler samt importerar datumFormat till datepickern
                SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
                SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
                String fran = sdf1.format(fDatum.getDate());
                String till = sdf2.format(tDatum.getDate());

                SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

                Date date1 = format.parse(fran);
                Date date2 = format.parse(till);
                
                //Kontrollerar att start datum inte är efter slutdatum
                if (date1.after(date2)) {
                    JOptionPane.showMessageDialog(null, "Kontrollera datum följden");
                } else {
                    
                    //Deklarerar variabler och to Uppercase metod
                    String fnamn = Validering.storBokstav(fornamn.getText());
                    String enamn = Validering.storBokstav(efternamn.getText());
                    try {
                        
                        //Hämta lärar id utifrån inmatat för och efternamn
                        String lid = idb.fetchSingle("select larar_id from larare where fornamn=" + "'" + fnamn + "'"
                                + "and efternamn=" + "'" + enamn + "'");
                        //Kontrollerar att läraren finns, om inte skriver ut felmeddelande
                        if (lid == null) {
                            JOptionPane.showMessageDialog(null, "Kunde inte hitta lärare");
                        } else {
                            //Hämtar kurser med inmatad lärare samt inom valt datuminterall 
                            ArrayList<String> kurser = idb.fetchColumn("SELECT  KURSNAMN from KURS where KURSLARARE="
                                    + "'" + lid + "'" + "and"
                                    + " KURSSTART   >=" + "'" + fran + "'" + "and Kursslut <=" + "'" + till + "'");
                            // Om inga kurser funna, skriv ut felmeddelande
                            if (kurser == null) {
                                JOptionPane.showMessageDialog(null, "Kunde inte finna kurser för läraren innom tidsramen!");
                            } else {
                                //Om en eller fler kurser funna, sätter ihop en string presenterar svaret
                                String svar = "";

                                for (String s : kurser) {
                                    svar += s + "\t";
                                }

                                resultat.setText(svar);
                            }
                        }
                    } catch (InfException ex) {
                        Logger.getLogger(SökLararesKurser.class.getName()).log(Level.SEVERE, null, ex);
                        JOptionPane.showMessageDialog(null, " Något gick fel, kontrollera inmatningen");

                    }
                }
            } catch (ParseException ex) {
                Logger.getLogger(SökLararesKurser.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, " Något gick fel, kontrollera inmatningen");
            }

        }
    }//GEN-LAST:event_sokActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        //Går tillbaka till meny
        dispose();
    }//GEN-LAST:event_jLabel6MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField efternamn;
    private com.toedter.calendar.JDateChooser fDatum;
    private javax.swing.JTextField fornamn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea resultat;
    private javax.swing.JButton sok;
    private com.toedter.calendar.JDateChooser tDatum;
    // End of variables declaration//GEN-END:variables
}
