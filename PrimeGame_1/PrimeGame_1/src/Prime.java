
import java.util.Random;
import javax.swing.JOptionPane;
public class Prime extends javax.swing.JFrame {
static int score=0;
    static int count=0;
    Random r=new Random();
    int randomNum;
    public Prime() {
        initComponents();
        randomNum=r.nextInt(50);
        lblNumber.setText(String.valueOf(randomNum));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lblNumber = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblScore = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Prime");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Not Prime");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        lblNumber.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblNumber.setForeground(new java.awt.Color(255, 0, 51));
        lblNumber.setText("jLabel1");

        jLabel2.setText("Score");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jButton1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblScore, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(60, 60, 60))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblScore, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(13, 13, 13)))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       count=count+1;
       int num=Integer.parseInt(lblNumber.getText());
       if(count==10)
       {
        int a=1;
        int c=0;
        while(a<=num)
        {
            if(num%a==0)
            {
                c=c+1;
                a=a+1;
            }
            else
            {
                a=a+1;
            }
        }//end of while block
        if(c==2)
        {
            score=score+1;
            lblScore.setText(String.valueOf(score));
            randomNum=r.nextInt(50);
        }
        else
        {
            randomNum=r.nextInt(100);
            lblNumber.setText(String.valueOf(randomNum));
               
        }
         JOptionPane.showMessageDialog(this,"Your score is: "+score+"/10");
           count=0;
           score=0;
           lblScore.setText("");
           randomNum=r.nextInt(50);
           lblNumber.setText(String.valueOf(randomNum));
       }
       else{
           int a=1;
        int c=0;
        while(a<=num)
        {
            if(num%a==0)
            {
                c=c+1;
                a=a+1;
            }
            else
            {
                a=a+1;
            }
        }//end of while block
        if(c==2)
        {
               score=score+1;
               lblScore.setText(String.valueOf(score));
               randomNum=r.nextInt(50);
               lblNumber.setText(String.valueOf(randomNum));
               
           }else{
               randomNum=r.nextInt(50);
               lblNumber.setText(String.valueOf(randomNum));
           }
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       count=count+1;
       int num=Integer.parseInt(lblNumber.getText());
       if(count==10)
       {
        int a=1;
        int c=0;
        while(a<=num)
        {
            if(num%a==0)
            {
                c=c+1;
                a=a+1;
            }
            else
            {
                a=a+1;
            }
        }//end of while block
        if(c!=2)
        {
            score=score+1;
            lblScore.setText(String.valueOf(score));
            randomNum=r.nextInt(50);
        }
        else
        {
            randomNum=r.nextInt(50);
            lblNumber.setText(String.valueOf(randomNum));
               
        }
         JOptionPane.showMessageDialog(this,"Your score is: "+score+"/10");
           count=0;
           score=0;
           lblScore.setText("");
           randomNum=r.nextInt(50);
           lblNumber.setText(String.valueOf(randomNum));
       }
       else{
           int a=1;
        int c=0;
        while(a<=num)
        {
            if(num%a==0)
            {
                c=c+1;
                a=a+1;
            }
            else
            {
                a=a+1;
            }
        }//end of while block
        if(c!=2)
        {
               score=score+1;
               lblScore.setText(String.valueOf(score));
               randomNum=r.nextInt(50);
               lblNumber.setText(String.valueOf(randomNum));
               
           }else{
               randomNum=r.nextInt(50);
               lblNumber.setText(String.valueOf(randomNum));
           }
       }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Prime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Prime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Prime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Prime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Prime().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblNumber;
    private javax.swing.JLabel lblScore;
    // End of variables declaration//GEN-END:variables
}
