/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kibat6204
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        userInput = new javax.swing.JTextField();
        calculateButton = new javax.swing.JButton();
        blointoints = new javax.swing.JLabel();
        drobzits = new javax.swing.JLabel();
        clickwits = new javax.swing.JLabel();
        gazoontights = new javax.swing.JLabel();
        frazoints = new javax.swing.JLabel();
        vrobits = new javax.swing.JLabel();
        blointointsOutput = new javax.swing.JTextField();
        drobzitsOutput = new javax.swing.JTextField();
        clickwicksOutput = new javax.swing.JTextField();
        gazoontightsOutput = new javax.swing.JTextField();
        frazointsOutput = new javax.swing.JTextField();
        vrobitsOutput = new javax.swing.JTextField();
        title = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        userInput.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        userInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        calculateButton.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        calculateButton.setText("Calculate");
        calculateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateButtonActionPerformed(evt);
            }
        });

        blointoints.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        blointoints.setText("Blointoints");

        drobzits.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        drobzits.setText("Drobzits");

        clickwits.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        clickwits.setText("Clickwicks");

        gazoontights.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        gazoontights.setText("Gazoontights");

        frazoints.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        frazoints.setText("Frazoints");

        vrobits.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        vrobits.setText("Vrobits");

        blointointsOutput.setEditable(false);
        blointointsOutput.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        blointointsOutput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        blointointsOutput.setText("0");

        drobzitsOutput.setEditable(false);
        drobzitsOutput.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        drobzitsOutput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        drobzitsOutput.setText("0");

        clickwicksOutput.setEditable(false);
        clickwicksOutput.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        clickwicksOutput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        clickwicksOutput.setText("0");

        gazoontightsOutput.setEditable(false);
        gazoontightsOutput.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        gazoontightsOutput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        gazoontightsOutput.setText("0");

        frazointsOutput.setEditable(false);
        frazointsOutput.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        frazointsOutput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        frazointsOutput.setText("0");

        vrobitsOutput.setEditable(false);
        vrobitsOutput.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        vrobitsOutput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        vrobitsOutput.setText("0");

        title.setFont(new java.awt.Font("Stone Sans Sem OS ITCTT", 0, 36)); // NOI18N
        title.setText("$  ZirboinFinancial  $");

        jLabel1.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        jLabel1.setText("Enter a quantity of Vrobits");

        jLabel2.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        jLabel2.setText("The optimal change will be calculated");

        jButton1.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        jButton1.setText("CLEAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(blointoints, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(blointointsOutput))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(drobzits)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(drobzitsOutput)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(clickwits, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(clickwicksOutput))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(gazoontights, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(gazoontightsOutput))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(frazoints, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(frazointsOutput))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(vrobitsOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(vrobits, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addContainerGap())
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(title)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(134, 134, 134)
                                        .addComponent(calculateButton))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(57, 57, 57)
                                        .addComponent(userInput, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(67, 67, 67))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(34, 34, 34)))
                        .addGap(143, 143, 143))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(calculateButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(blointoints)
                    .addComponent(drobzits)
                    .addComponent(clickwits)
                    .addComponent(gazoontights)
                    .addComponent(frazoints)
                    .addComponent(vrobits))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(blointointsOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drobzitsOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clickwicksOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gazoontightsOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(frazointsOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vrobitsOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calculateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateButtonActionPerformed
        
        final int vrobitValue = 1;
        final int blointointValue = 500;
        final int frazointValue = 1000;
        final int gazoontightValue = 10000;
        final int clickwickValue = 50000;
        final int drobzitValue = 100000;
        int numberOfVrobits = 0;
        int numberOfBlointoints = 0;
        int numberOfFrazoints = 0;
        int numberOfGazoontights = 0;
        int numberOfClickwicks = 0;
        int numberOfDrobzits = 0;
        int userInputValue = 0;
        boolean repeat = true;
        
        while(repeat == true)
        {
            try
            {
            userInputValue = Integer.parseInt(userInput.getText());
            }
            catch(Exception e)
            {
                if((userInput.getText()).matches("^[a-zA-Z]*$"))
                {
                    userInput.setText("letters cannot be processed");
                    repeat = true;
                }
                else if((userInput.getText()).matches("^[0-9]*$"))
                {
                    userInput.setText("number is too large");
                    repeat = true;   
                } 
                else
                {
                    userInput.setText("symbols cannot be processed");
                    repeat = true;
                }
            }
            repeat = false;
        }

        repeat = true;
        while(repeat == true)
        {
            if(drobzitValue<=userInputValue)
            {
                userInputValue = userInputValue - drobzitValue;
                numberOfDrobzits = numberOfDrobzits+1;
                repeat = true;
            }
            else
            {
                repeat = false;
            }
        }
        repeat = true;
        while(repeat == true)
        {
            if(clickwickValue<=userInputValue)
            {
                userInputValue = userInputValue - clickwickValue;
                numberOfClickwicks = numberOfClickwicks+1;
                repeat = true;
            }
            else
            {
                repeat = false;
            }
        }
        repeat = true;
        while(repeat == true)
        {
            if(gazoontightValue<=userInputValue)
            {
                userInputValue = userInputValue - gazoontightValue;
                numberOfGazoontights = numberOfGazoontights+1;
                repeat = true;
            }
            else
            {
                repeat = false;
            }
        }
        repeat = true;
        while(repeat == true)
        {
            if(frazointValue<=userInputValue)
            {
                userInputValue = userInputValue - frazointValue;
                numberOfFrazoints = numberOfFrazoints+1;
                repeat = true;
            }
            else
            {
                repeat = false;
            }
        }
        repeat = true;
        while(repeat == true)
        {
            if(blointointValue<=userInputValue)
            {
                userInputValue = userInputValue - blointointValue;
                numberOfBlointoints = numberOfBlointoints+1;
                repeat = true;
            }
            else
            {
                repeat = false;
            }
        }
        repeat = true;
        while(repeat == true)
        {
            if(vrobitValue<=userInputValue)
            {
                userInputValue = userInputValue - vrobitValue;
                numberOfVrobits = numberOfVrobits+1;
                repeat = true;
            }
            else
            {
                repeat = false;
            }
        }
        vrobitsOutput.setText(String.valueOf(numberOfVrobits));
        blointointsOutput.setText(String.valueOf(numberOfBlointoints));
        frazointsOutput.setText(String.valueOf(numberOfFrazoints));
        gazoontightsOutput.setText(String.valueOf(numberOfGazoontights));
        clickwicksOutput.setText(String.valueOf(numberOfClickwicks));
        drobzitsOutput.setText(String.valueOf(numberOfDrobzits));
    }//GEN-LAST:event_calculateButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        userInput.setText("");
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel blointoints;
    private javax.swing.JTextField blointointsOutput;
    private javax.swing.JButton calculateButton;
    private javax.swing.JTextField clickwicksOutput;
    private javax.swing.JLabel clickwits;
    private javax.swing.JLabel drobzits;
    private javax.swing.JTextField drobzitsOutput;
    private javax.swing.JLabel frazoints;
    private javax.swing.JTextField frazointsOutput;
    private javax.swing.JLabel gazoontights;
    private javax.swing.JTextField gazoontightsOutput;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel title;
    private javax.swing.JTextField userInput;
    private javax.swing.JLabel vrobits;
    private javax.swing.JTextField vrobitsOutput;
    // End of variables declaration//GEN-END:variables
}
