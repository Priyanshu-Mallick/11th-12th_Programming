
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
public class ReasoningGame extends javax.swing.JFrame {
    static int score=0;
    static int count=0;
    public ReasoningGame() {
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

        jLabel66 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        lblScore = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel66.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("CHECK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1079, 57, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(838, 61, 150, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(838, 126, 150, -1));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(838, 188, 150, -1));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(838, 254, 150, -1));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(838, 322, 150, -1));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(838, 384, 150, -1));
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(838, 508, 150, -1));
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(838, 449, 150, -1));
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(838, 572, 150, -1));
        getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(838, 628, 150, -1));

        jLabel54.setText("Score");
        getContentPane().add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 23, -1, -1));
        getContentPane().add(lblScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 23, 60, 28));

        jButton2.setText("CHECK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1079, 122, -1, -1));

        jButton3.setText("CHECK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1079, 184, -1, -1));

        jButton4.setText("CHECK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1079, 254, -1, -1));

        jButton5.setText("CHECK");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 310, -1, -1));

        jButton6.setText("CHECK");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1079, 380, -1, -1));

        jButton7.setText("CHECK");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 440, -1, -1));

        jButton8.setText("CHECK");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 500, -1, -1));

        jButton9.setText("CHECK");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 560, -1, -1));

        jButton10.setText("CHECK");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 620, -1, -1));

        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 388, -1, -1));

        jLabel55.setText("jLabel2");
        getContentPane().add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 576, -1, -1));

        jLabel56.setText("jLabel2");
        getContentPane().add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 632, -1, -1));

        jLabel57.setText("jLabel2");
        getContentPane().add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 65, -1, -1));

        jLabel60.setText("jLabel2");
        getContentPane().add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 512, -1, -1));

        jLabel63.setText("jLabel2");
        getContentPane().add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 453, -1, -1));

        jLabel64.setText("jLabel2");
        getContentPane().add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 130, -1, -1));

        jLabel65.setText("jLabel2");
        getContentPane().add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 270, -1, -1));

        jLabel67.setText("jLabel2");
        getContentPane().add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 192, -1, -1));

        jLabel68.setText("jLabel2");
        getContentPane().add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 326, -1, -1));

        jLabel69.setText("jLabel2");
        getContentPane().add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 270, -1, -1));

        jLabel70.setText("jLabel2");
        getContentPane().add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 192, -1, -1));

        jLabel71.setText("jLabel2");
        getContentPane().add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 326, -1, -1));

        jLabel72.setText("jLabel2");
        getContentPane().add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 388, -1, -1));

        jLabel73.setText("jLabel2");
        getContentPane().add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 576, -1, -1));

        jLabel74.setText("jLabel2");
        getContentPane().add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 632, -1, -1));

        jLabel75.setText("jLabel2");
        getContentPane().add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 512, -1, -1));

        jLabel76.setText("jLabel2");
        getContentPane().add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 453, -1, -1));

        jLabel77.setText("jLabel2");
        getContentPane().add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 130, -1, -1));

        jLabel78.setText("jLabel2");
        getContentPane().add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 270, -1, -1));

        jLabel79.setText("jLabel2");
        getContentPane().add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 192, -1, -1));

        jLabel80.setText("jLabel2");
        getContentPane().add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 326, -1, -1));

        jLabel81.setText("jLabel2");
        getContentPane().add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 388, -1, -1));

        jLabel82.setText("jLabel2");
        getContentPane().add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 326, -1, -1));

        jLabel83.setText("jLabel2");
        getContentPane().add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 632, -1, -1));

        jLabel84.setText("jLabel2");
        getContentPane().add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 512, -1, -1));

        jLabel85.setText("jLabel2");
        getContentPane().add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 453, -1, -1));

        jLabel86.setText("jLabel2");
        getContentPane().add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 326, -1, -1));

        jLabel87.setText("jLabel2");
        getContentPane().add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 270, -1, -1));

        jLabel88.setText("jLabel2");
        getContentPane().add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 388, -1, -1));

        jLabel89.setText("jLabel2");
        getContentPane().add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 512, -1, -1));

        jLabel90.setText("jLabel2");
        getContentPane().add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 632, -1, -1));

        jLabel91.setText("jLabel2");
        getContentPane().add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 576, -1, -1));

        jLabel92.setText("jLabel2");
        getContentPane().add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 453, -1, -1));

        jLabel93.setText("jLabel2");
        getContentPane().add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 576, -1, -1));

        jLabel94.setText("jLabel2");
        getContentPane().add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 388, -1, -1));

        jLabel95.setText("jLabel2");
        getContentPane().add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 512, -1, -1));

        jLabel96.setText("jLabel2");
        getContentPane().add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 632, -1, -1));

        jLabel97.setText("jLabel2");
        getContentPane().add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 453, -1, -1));

        jLabel98.setText("jLabel2");
        getContentPane().add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 576, -1, -1));

        jLabel99.setText("jLabel2");
        getContentPane().add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(477, 388, -1, -1));

        jLabel100.setText("jLabel2");
        getContentPane().add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(477, 453, -1, -1));

        jLabel101.setText("jLabel2");
        getContentPane().add(jLabel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 453, -1, -1));

        jLabel102.setText("jLabel2");
        getContentPane().add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(477, 512, -1, -1));

        jLabel103.setText("jLabel2");
        getContentPane().add(jLabel103, new org.netbeans.lib.awtextra.AbsoluteConstraints(557, 453, -1, -1));

        jLabel104.setText("jLabel2");
        getContentPane().add(jLabel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(477, 576, -1, -1));

        jLabel105.setText("jLabel2");
        getContentPane().add(jLabel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(477, 632, -1, -1));

        jLabel106.setText("jLabel2");
        getContentPane().add(jLabel106, new org.netbeans.lib.awtextra.AbsoluteConstraints(557, 576, -1, -1));

        jLabel107.setText("jLabel2");
        getContentPane().add(jLabel107, new org.netbeans.lib.awtextra.AbsoluteConstraints(557, 632, -1, -1));

        jLabel108.setText("jLabel2");
        getContentPane().add(jLabel108, new org.netbeans.lib.awtextra.AbsoluteConstraints(557, 512, -1, -1));

        jLabel109.setText("jLabel2");
        getContentPane().add(jLabel109, new org.netbeans.lib.awtextra.AbsoluteConstraints(626, 576, -1, -1));

        jLabel110.setText("jLabel2");
        getContentPane().add(jLabel110, new org.netbeans.lib.awtextra.AbsoluteConstraints(626, 632, -1, -1));

        jLabel111.setText("jLabel2");
        getContentPane().add(jLabel111, new org.netbeans.lib.awtextra.AbsoluteConstraints(626, 512, -1, -1));

        jLabel112.setText("jLabel2");
        getContentPane().add(jLabel112, new org.netbeans.lib.awtextra.AbsoluteConstraints(685, 632, -1, -1));

        jLabel113.setText("jLabel2");
        getContentPane().add(jLabel113, new org.netbeans.lib.awtextra.AbsoluteConstraints(744, 632, -1, -1));

        jLabel114.setText("jLabel2");
        getContentPane().add(jLabel114, new org.netbeans.lib.awtextra.AbsoluteConstraints(679, 576, -1, -1));

        jLabel1.setText("Level 1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       count=count+1;
       int a=Integer.parseInt(jTextField1.getText());
       if(count==10)
       {
           if(a==1)
           {
                score=score+1;
                lblScore.setText(String.valueOf(score));
           }
           JOptionPane.showMessageDialog(this,"Your score is: "+score+"/10");
           count=0;
           score=0;
           lblScore.setText("");
           jTextField1.setText("");
           jTextField2.setText("");
           jTextField3.setText("");
           jTextField4.setText("");
           jTextField5.setText("");
           jTextField6.setText("");
           jTextField7.setText("");
           jTextField8.setText("");
           jTextField9.setText("");
           jTextField10.setText("");
       }
       else
       {
            if(a==1)
           {
                score=score+1;
                lblScore.setText(String.valueOf(score));
           }
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        count=count+1;
       int b=Integer.parseInt(jTextField2.getText());
       if(count==10)
       {
           if(b==2)
           {
                score=score+1;
                lblScore.setText(String.valueOf(score));
           }
           JOptionPane.showMessageDialog(this,"Your score is: "+score+"/10");
           count=0;
           score=0;
           lblScore.setText("");
          jTextField1.setText("");
           jTextField2.setText("");
           jTextField3.setText("");
           jTextField4.setText("");
           jTextField5.setText("");
           jTextField6.setText("");
           jTextField7.setText("");
           jTextField8.setText("");
           jTextField9.setText("");
           jTextField10.setText("");
       }
       else
       {
            if(b==2)
           {
                score=score+1;
                lblScore.setText(String.valueOf(score));
           }
       }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        count=count+1;
       int c=Integer.parseInt(jTextField3.getText());
       if(count==10)
       {
           if(c==3)
           {
                score=score+1;
                lblScore.setText(String.valueOf(score));
           }
           JOptionPane.showMessageDialog(this,"Your score is: "+score+"/10");
           count=0;
           score=0;
           lblScore.setText("");
           jTextField1.setText("");
           jTextField2.setText("");
           jTextField3.setText("");
           jTextField4.setText("");
           jTextField5.setText("");
           jTextField6.setText("");
           jTextField7.setText("");
           jTextField8.setText("");
           jTextField9.setText("");
           jTextField10.setText("");
       }
       else
       {
            if(c==3)
           {
                score=score+1;
                lblScore.setText(String.valueOf(score));
           }
       }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        count=count+1;
       int d=Integer.parseInt(jTextField4.getText());
       if(count==10)
       {
           if(d==4)
           {
                score=score+1;
                lblScore.setText(String.valueOf(score));
           }
           JOptionPane.showMessageDialog(this,"Your score is: "+score+"/10");
           count=0;
           score=0;
           lblScore.setText("");
           jTextField1.setText("");
           jTextField2.setText("");
           jTextField3.setText("");
           jTextField4.setText("");
           jTextField5.setText("");
           jTextField6.setText("");
           jTextField7.setText("");
           jTextField8.setText("");
           jTextField9.setText("");
           jTextField10.setText("");
       }
       else
       {
            if(d==4)
           {
                score=score+1;
                lblScore.setText(String.valueOf(score));
           }
       }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        count=count+1;
       int e=Integer.parseInt(jTextField5.getText());
       if(count==10)
       {
           if(e==5)
           {
                score=score+1;
                lblScore.setText(String.valueOf(score));
           }
           JOptionPane.showMessageDialog(this,"Your score is: "+score+"/10");
           count=0;
           score=0;
           lblScore.setText("");
           jTextField1.setText("");
           jTextField2.setText("");
           jTextField3.setText("");
           jTextField4.setText("");
           jTextField5.setText("");
           jTextField6.setText("");
           jTextField7.setText("");
           jTextField8.setText("");
           jTextField9.setText("");
           jTextField10.setText("");
       }
       else
       {
            if(e==5)
           {
                score=score+1;
                lblScore.setText(String.valueOf(score));
           }
       }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        count=count+1;
       int f=Integer.parseInt(jTextField6.getText());
       if(count==10)
       {
           if(f==6)
           {
                score=score+1;
                lblScore.setText(String.valueOf(score));
           }
           JOptionPane.showMessageDialog(this,"Your score is: "+score+"/10");
           count=0;
           score=0;
           lblScore.setText("");
           jTextField1.setText("");
           jTextField2.setText("");
           jTextField3.setText("");
           jTextField4.setText("");
           jTextField5.setText("");
           jTextField6.setText("");
           jTextField7.setText("");
           jTextField8.setText("");
           jTextField9.setText("");
           jTextField10.setText("");
       }
       else
       {
            if(f==6)
           {
                score=score+1;
                lblScore.setText(String.valueOf(score));
           }
       }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        count=count+1;
       int g=Integer.parseInt(jTextField7.getText());
       if(count==10)
       {
           if(g==7)
           {
                score=score+1;
                lblScore.setText(String.valueOf(score));
           }
           JOptionPane.showMessageDialog(this,"Your score is: "+score+"/10");
           count=0;
           score=0;
           lblScore.setText("");
           jTextField1.setText("");
           jTextField2.setText("");
           jTextField3.setText("");
           jTextField4.setText("");
           jTextField5.setText("");
           jTextField6.setText("");
           jTextField7.setText("");
           jTextField8.setText("");
           jTextField9.setText("");
           jTextField10.setText("");
       }
       else
       {
            if(g==7)
           {
                score=score+1;
                lblScore.setText(String.valueOf(score));
           }
       }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        count=count+1;
       int h=Integer.parseInt(jTextField8.getText());
       if(count==10)
       {
           if(h==8)
           {
                score=score+1;
                lblScore.setText(String.valueOf(score));
           }
           JOptionPane.showMessageDialog(this,"Your score is: "+score+"/10");
           count=0;
           score=0;
           lblScore.setText("");
           jTextField1.setText("");
           jTextField2.setText("");
           jTextField3.setText("");
           jTextField4.setText("");
           jTextField5.setText("");
           jTextField6.setText("");
           jTextField7.setText("");
           jTextField8.setText("");
           jTextField9.setText("");
           jTextField10.setText("");
       }
       else
       {
            if(h==8)
           {
                score=score+1;
                lblScore.setText(String.valueOf(score));
           }
       }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        count=count+1;
       int i=Integer.parseInt(jTextField9.getText());
       if(count==10)
       {
           if(i==9)
           {
                score=score+1;
                lblScore.setText(String.valueOf(score));
           }
           JOptionPane.showMessageDialog(this,"Your score is: "+score+"/10");
           count=0;
           score=0;
           lblScore.setText("");
           jTextField1.setText("");
           jTextField2.setText("");
           jTextField3.setText("");
           jTextField4.setText("");
           jTextField5.setText("");
           jTextField6.setText("");
           jTextField7.setText("");
           jTextField8.setText("");
           jTextField9.setText("");
           jTextField10.setText("");
       }
       else
       {
            if(i==9)
           {
                score=score+1;
                lblScore.setText(String.valueOf(score));
           }
       }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        count=count+1;
       int j=Integer.parseInt(jTextField10.getText());
       if(count==10)
       {
           if(j==10)
           {
                score=score+1;
                lblScore.setText(String.valueOf(score));
           }
           JOptionPane.showMessageDialog(this,"Your score is: "+score+"/10");
           count=0;
           score=0;
           lblScore.setText("");
           jTextField1.setText("");
           jTextField2.setText("");
           jTextField3.setText("");
           jTextField4.setText("");
           jTextField5.setText("");
           jTextField6.setText("");
           jTextField7.setText("");
           jTextField8.setText("");
           jTextField9.setText("");
           jTextField10.setText("");
       }
       else
       {
            if(j==10)
           {
                score=score+1;
                lblScore.setText(String.valueOf(score));
           }
       }
    }//GEN-LAST:event_jButton10ActionPerformed

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
            java.util.logging.Logger.getLogger(ReasoningGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReasoningGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReasoningGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReasoningGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReasoningGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel lblScore;
    // End of variables declaration//GEN-END:variables
}
