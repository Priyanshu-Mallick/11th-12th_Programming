import jaco.mp3.player.MP3Player;
import java.io.File;
import java.util.Random;
import javax.swing.JOptionPane;
public class NumberPrime extends javax.swing.JFrame {
static int score=0;
    static int count=0;
    Random r=new Random();
    int randomNum;
    public NumberPrime() {
        initComponents();
        randomNum=r.nextInt(50);
        lblNumber.setText(String.valueOf(randomNum));
    }
public static final String SONG="C:\\Users\\hp\\Desktop\\icons\\game\\Sound effect\\Correct-Answer-3-Sound-Effect_0ZQ-Lk--ILE.mp3";
MP3Player mp3player=new MP3Player(new File(SONG));
public static final String Song2="C:\\Users\\hp\\Desktop\\icons\\game\\Sound effect\\Game-Over-Sound-Effect-HD_NN_8vfN0HP4.mp3";
MP3Player mp3player2=new MP3Player(new File(Song2));
public static final String Song3="C:\\Users\\hp\\Desktop\\icons\\game\\Sound effect\\Buzzer-Wrong-Answer-Gaming-Sound-Effect-HD_FRpq7o1mKXY.mp3";
MP3Player mp3player3=new MP3Player(new File(Song3));
public static final String SONG4="C:\\Users\\hp\\Desktop\\icons\\game\\Sound effect\\Mouse-Click-Sound-Effect-HD_h6_8SlZZwvQ.mp3";
MP3Player mp3player4=new MP3Player(new File(SONG4));
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblNumber = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lblScore = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("1-");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        lblNumber.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblNumber.setForeground(new java.awt.Color(0, 255, 255));
        getContentPane().add(lblNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 122, 46));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 0));
        jLabel2.setText("Enter the number of prime between above");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 510, 40));

        jButton1.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jButton1.setText("Check");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 90, 40));

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 130, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Score");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, -1, -1));

        lblScore.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblScore.setForeground(new java.awt.Color(255, 255, 0));
        getContentPane().add(lblScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 128, 32));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PRE.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/etapa-triangulo-humo-luz-neon-purpura-fondo-futurista-abstracto_33739-194.jpg"))); // NOI18N
        jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 0), 5, true));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       count=count+1;
       int num=Integer.parseInt(lblNumber.getText());
       if(count==10)
       {
           int c=0,i,j;
           for(i=1;i<=num;i++)
           {
               for(j=2;j<i;j++)
                   if(i%j==0)
                   break;
                   if(i==j)
                   c++;
           }
             int x=Integer.parseInt(jTextField1.getText());
             if(x==c)
             {
                   score=score+1;
                   randomNum=r.nextInt(20);
                   lblScore.setText(String.valueOf(score));
                    jTextField1.setText("");
                   
        }
        else
        {
            randomNum=r.nextInt(20);
            lblNumber.setText(String.valueOf(randomNum));
             jTextField1.setText("");
               
        }
         JOptionPane.showMessageDialog(this,"Your score is: "+score+"/10");
           count=0;
           score=0;
           lblScore.setText("");
           randomNum=r.nextInt(20);
           lblNumber.setText(String.valueOf(randomNum));
            jTextField1.setText("");
      }
      else
       {
           
           int c=0,i,j;
           for(i=1;i<=num;i++)
           {
               for(j=2;j<i;j++)
                   if(i%j==0)
                   break;
                   if(i==j)
                   c++;
           }
             int x=Integer.parseInt(jTextField1.getText());
             if(x==c)
             {
                   score=score+1;
                   randomNum=r.nextInt(20);
                   lblScore.setText(String.valueOf(score));
                   lblNumber.setText(String.valueOf(randomNum));
                   jTextField1.setText("");
        }
        else
        {
            randomNum=r.nextInt(20);
            lblNumber.setText(String.valueOf(randomNum));
                jTextField1.setText("");
        }
       }
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        mp3player4.play();
        int a=JOptionPane.showConfirmDialog(null,"Do you really want to stop playing","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
            new PrimeSelection().setVisible(true);
            setVisible(false);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(NumberPrime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NumberPrime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NumberPrime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NumberPrime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NumberPrime().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblNumber;
    private javax.swing.JLabel lblScore;
    // End of variables declaration//GEN-END:variables
}
