
import jaco.mp3.player.MP3Player;
import java.io.File;
import java.util.Random;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class ReverseNumber extends javax.swing.JFrame {
static int score=0;
    static int count=0;
    Random r=new Random();
    int randomNum;
    public ReverseNumber() {
        initComponents();
        randomNum=r.nextInt(1000);
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

        lblNumber = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblScore = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNumber.setFont(new java.awt.Font("Gigi", 1, 100)); // NOI18N
        lblNumber.setForeground(new java.awt.Color(204, 255, 0));
        getContentPane().add(lblNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 200, 120));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 102));
        jLabel1.setText("Score");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, -1, -1));

        lblScore.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblScore.setForeground(new java.awt.Color(51, 255, 0));
        getContentPane().add(lblScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 110, 50));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("Check");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rrrrrrrrrrrrrrrrr.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, -1, -1));

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 260, 50));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/3D-Red-Heart-Image.png"))); // NOI18N
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 180, 50, 40));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/3D-Red-Heart-Image.png"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 320, 50, 40));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/3D-Red-Heart-Image.png"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 250, 50, 40));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PRE.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/77quiz banner.jpg"))); // NOI18N
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 255), 7, true));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 530));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        count=count+1;
       
       int num=Integer.parseInt(lblNumber.getText());
      
       if(count==10)
       {
           int rev,s;
           rev=0;
           while(num!=0)
           {
               s=num%10;
               rev=rev*10+s;
               num=num/10;
           }
           int a=Integer.parseInt(jTextField1.getText());
           if(rev==a)
           {
               mp3player.play();
            score=score+1;
            lblScore.setText(String.valueOf(score));
            randomNum=r.nextInt(1000);
            lblNumber.setText(String.valueOf(randomNum));
            jTextField1.setText("");
            
        }
        else
        {
            mp3player3.play();
            randomNum=r.nextInt(1000);
            lblNumber.setText(String.valueOf(randomNum));
             jTextField1.setText("");
               
        }
         JOptionPane.showMessageDialog(this,"Your score is: "+score+"/10");
           count=0;
           score=0;
           lblScore.setText("");
           randomNum=r.nextInt(1000);
           lblNumber.setText(String.valueOf(randomNum));
           jTextField1.setText("");
       }
       else
       {
           int rev,s;
           rev=0;
           while(num!=0)
           {
               s=num%10;
               rev=rev*10+s;
               num=num/10;
           }
           int a=Integer.parseInt(jTextField1.getText());
           if(rev==a)
           {
               mp3player.play();
            score=score+1;
            lblScore.setText(String.valueOf(score));
            randomNum=r.nextInt(1000);
            lblNumber.setText(String.valueOf(randomNum));
            jTextField1.setText("");
            
        }
        else
        {
            mp3player3.play();
            randomNum=r.nextInt(1000);
            lblNumber.setText(String.valueOf(randomNum));
            jTextField1.setText("");
            
        }
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        mp3player4.play();
        new Math().setVisible(true);
        setVisible(false);
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
            java.util.logging.Logger.getLogger(ReverseNumber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReverseNumber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReverseNumber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReverseNumber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReverseNumber().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblNumber;
    private javax.swing.JLabel lblScore;
    // End of variables declaration//GEN-END:variables
}
