/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Memo;
import java.awt.BorderLayout;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JPanel;


import javax.swing.ImageIcon;
import javax.swing.JButton;

public class go extends javax.swing.JFrame {

    private SC sourcer = new SC();
    private boolean arriba = false;
    private ImageIcon im1;
    private ImageIcon im2;
    private JButton[] jbutt = new JButton[2];
    private boolean carta1 = false;
    public go() {
        initComponents();
        setCards();
    }

    
    private void setCards(){
    int[] numbers = sourcer.getCardNumbers();
    b1.setDisabledIcon(new ImageIcon(getClass().getResource("/Memo/i"+numbers[0]+".png")));
    b2.setDisabledIcon(new ImageIcon(getClass().getResource("/Memo/i"+numbers[1]+".png")));
    b3.setDisabledIcon(new ImageIcon(getClass().getResource("/Memo/i"+numbers[2]+".png")));
    b4.setDisabledIcon(new ImageIcon(getClass().getResource("/Memo/i"+numbers[3]+".png")));
    b5.setDisabledIcon(new ImageIcon(getClass().getResource("/Memo/i"+numbers[4]+".png")));
    b6.setDisabledIcon(new ImageIcon(getClass().getResource("/Memo/i"+numbers[5]+".png")));
    b7.setDisabledIcon(new ImageIcon(getClass().getResource("/Memo/i"+numbers[6]+".png")));
    b8.setDisabledIcon(new ImageIcon(getClass().getResource("/Memo/i"+numbers[7]+".png")));
    b9.setDisabledIcon(new ImageIcon(getClass().getResource("/Memo/i"+numbers[8]+".png")));
    b10.setDisabledIcon(new ImageIcon(getClass().getResource("/Memo/i"+numbers[9]+".png")));
    b11.setDisabledIcon(new ImageIcon(getClass().getResource("/Memo/i"+numbers[10]+".png")));
    b12.setDisabledIcon(new ImageIcon(getClass().getResource("/Memo/i"+numbers[11]+".png")));
    b13.setDisabledIcon(new ImageIcon(getClass().getResource("/Memo/i"+numbers[12]+".png")));
    b14.setDisabledIcon(new ImageIcon(getClass().getResource("/Memo/i"+numbers[13]+".png")));
    b15.setDisabledIcon(new ImageIcon(getClass().getResource("/Memo/i"+numbers[14]+".png")));
    b16.setDisabledIcon(new ImageIcon(getClass().getResource("/Memo/i"+numbers[15]+".png")));
       
    }
    private void PresionadoEnabled(JButton b)
    {
    if (!arriba){
        b.setEnabled(false);
        im1 = (ImageIcon) b.getDisabledIcon();
        jbutt[0] = b;
        
        arriba = true;
       carta1=false;
    } 
     else  {
    b.setEnabled(false);
    im2 = (ImageIcon) b.getDisabledIcon();
    jbutt[1]=b;
    carta1=true;
    }
   }
      private void  compare(){
         if(arriba && carta1)   {
      
           if(im1.getDescription().compareTo(im2.getDescription()) !=0) {
      jbutt[0].setEnabled(true);
      jbutt[1].setEnabled(true);
          }
          arriba = false;
      }
      }
            
 
    @SuppressWarnings("unchecked")
    private void b1ActionPerformed(java.awt.event.ActionEvent evt)     
    {PresionadoEnabled(b1);
    }
    
    private void b2ActionPerformed(java.awt.event.ActionEvent evt)     
    {PresionadoEnabled(b2);
    }
    private void b3ActionPerformed(java.awt.event.ActionEvent evt)     
    {PresionadoEnabled(b3);
    }
    private void b4ActionPerformed(java.awt.event.ActionEvent evt)     
    {PresionadoEnabled(b4);
    }
    private void b5ActionPerformed(java.awt.event.ActionEvent evt)     
    {PresionadoEnabled(b5);
    }
    private void b6ActionPerformed(java.awt.event.ActionEvent evt)     
    {PresionadoEnabled(b6);
    }
    private void b7ActionPerformed(java.awt.event.ActionEvent evt)     
    {PresionadoEnabled(b7);
    }
    private void b8ActionPerformed(java.awt.event.ActionEvent evt)     
    {PresionadoEnabled(b8);
    }
    private void b9ActionPerformed(java.awt.event.ActionEvent evt)     
    {PresionadoEnabled(b9);
    }
    private void b10ActionPerformed(java.awt.event.ActionEvent evt)     
    {PresionadoEnabled(b10);
    }
    private void b11ActionPerformed(java.awt.event.ActionEvent evt)     
    {PresionadoEnabled(b11);
    }
    private void b12ActionPerformed(java.awt.event.ActionEvent evt)     
    {PresionadoEnabled(b12);
    }
    private void b13ActionPerformed(java.awt.event.ActionEvent evt)     
    {PresionadoEnabled(b13);
    }
    private void b14ActionPerformed(java.awt.event.ActionEvent evt)     
    {PresionadoEnabled(b14);
    }
    private void b15ActionPerformed(java.awt.event.ActionEvent evt)     
    {PresionadoEnabled(b15);
    }
    private void b16ActionPerformed(java.awt.event.ActionEvent evt)     
    {PresionadoEnabled(b16);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b10 = new javax.swing.JButton();
        b11 = new javax.swing.JButton();
        b12 = new javax.swing.JButton();
        b13 = new javax.swing.JButton();
        b14 = new javax.swing.JButton();
        b15 = new javax.swing.JButton();
        b16 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setEnabled(false);

        b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Memo/0.png"))); // NOI18N
        b1.setBorder(null);
        b1.setBorderPainted(false);
        b1.setContentAreaFilled(false);
        b1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Memo/pent.png"))); // NOI18N
        b1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Memo/0.png"))); // NOI18N
        b2.setBorder(null);
        b2.setBorderPainted(false);
        b2.setContentAreaFilled(false);
        b2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Memo/pent.png"))); // NOI18N
        b2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b2MouseExited(evt);
            }
        });
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Memo/0.png"))); // NOI18N
        b3.setBorder(null);
        b3.setBorderPainted(false);
        b3.setContentAreaFilled(false);
        b3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Memo/pent.png"))); // NOI18N
        b3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b3MouseExited(evt);
            }
        });

        b4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Memo/0.png"))); // NOI18N
        b4.setBorder(null);
        b4.setBorderPainted(false);
        b4.setContentAreaFilled(false);
        b4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Memo/pent.png"))); // NOI18N
        b4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b4MouseExited(evt);
            }
        });

        b5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Memo/0.png"))); // NOI18N
        b5.setBorder(null);
        b5.setBorderPainted(false);
        b5.setContentAreaFilled(false);
        b5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Memo/pent.png"))); // NOI18N
        b5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b5MouseExited(evt);
            }
        });

        b6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Memo/0.png"))); // NOI18N
        b6.setBorder(null);
        b6.setBorderPainted(false);
        b6.setContentAreaFilled(false);
        b6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Memo/pent.png"))); // NOI18N
        b6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b6MouseExited(evt);
            }
        });

        b7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Memo/0.png"))); // NOI18N
        b7.setBorder(null);
        b7.setBorderPainted(false);
        b7.setContentAreaFilled(false);
        b7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Memo/pent.png"))); // NOI18N
        b7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b7MouseExited(evt);
            }
        });

        b8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Memo/0.png"))); // NOI18N
        b8.setBorder(null);
        b8.setBorderPainted(false);
        b8.setContentAreaFilled(false);
        b8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Memo/pent.png"))); // NOI18N
        b8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b8MouseExited(evt);
            }
        });

        b9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Memo/0.png"))); // NOI18N
        b9.setBorder(null);
        b9.setBorderPainted(false);
        b9.setContentAreaFilled(false);
        b9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Memo/pent.png"))); // NOI18N
        b9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b9MouseExited(evt);
            }
        });
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        b10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Memo/0.png"))); // NOI18N
        b10.setBorder(null);
        b10.setBorderPainted(false);
        b10.setContentAreaFilled(false);
        b10.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Memo/pent.png"))); // NOI18N
        b10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b10MouseExited(evt);
            }
        });
        b10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b10ActionPerformed(evt);
            }
        });

        b11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Memo/0.png"))); // NOI18N
        b11.setBorder(null);
        b11.setBorderPainted(false);
        b11.setContentAreaFilled(false);
        b11.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Memo/pent.png"))); // NOI18N
        b11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b11MouseExited(evt);
            }
        });
        b11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b11ActionPerformed(evt);
            }
        });

        b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Memo/0.png"))); // NOI18N
        b12.setBorder(null);
        b12.setBorderPainted(false);
        b12.setContentAreaFilled(false);
        b12.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Memo/pent.png"))); // NOI18N
        b12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b12MouseExited(evt);
            }
        });

        b13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Memo/0.png"))); // NOI18N
        b13.setBorder(null);
        b13.setBorderPainted(false);
        b13.setContentAreaFilled(false);
        b13.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Memo/pent.png"))); // NOI18N
        b13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b13MouseExited(evt);
            }
        });

        b14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Memo/0.png"))); // NOI18N
        b14.setBorder(null);
        b14.setBorderPainted(false);
        b14.setContentAreaFilled(false);
        b14.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Memo/pent.png"))); // NOI18N
        b14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b14MouseExited(evt);
            }
        });

        b15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Memo/0.png"))); // NOI18N
        b15.setBorder(null);
        b15.setBorderPainted(false);
        b15.setContentAreaFilled(false);
        b15.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Memo/pent.png"))); // NOI18N
        b15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b15MouseExited(evt);
            }
        });

        b16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Memo/0.png"))); // NOI18N
        b16.setBorder(null);
        b16.setBorderPainted(false);
        b16.setContentAreaFilled(false);
        b16.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Memo/pent.png"))); // NOI18N
        b16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b16MouseExited(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Arriesgate");

        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("Si pierdes mueres");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b9)
                    .addComponent(b5)
                    .addComponent(b1)
                    .addComponent(b13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b10)
                    .addComponent(b6)
                    .addComponent(b2)
                    .addComponent(b14))
                .addGap(113, 113, 113)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b11)
                    .addComponent(b7)
                    .addComponent(b3)
                    .addComponent(b15))
                .addGap(162, 162, 162)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b16)
                    .addComponent(b12, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(b8)
                        .addComponent(b4)))
                .addGap(97, 97, 97))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(376, 376, 376)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b1)
                    .addComponent(b2)
                    .addComponent(b3)
                    .addComponent(b4))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b7)
                            .addComponent(b8)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(b5)
                                .addGap(14, 14, 14))
                            .addComponent(b6, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b11)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(b10)
                        .addComponent(b9))
                    .addComponent(b12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b13)
                    .addComponent(b14)
                    .addComponent(b15)
                    .addComponent(b16))
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(53, 53, 53))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(117, 117, 117))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/*
    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        PresionadoEnabled(b1);
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        PresionadoEnabled(b2);    }//GEN-LAST:event_b2ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        PresionadoEnabled(b9);// TODO add your handling code here:
    }//GEN-LAST:event_b9ActionPerformed

    private void b11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b11ActionPerformed
        PresionadoEnabled(b11); // TODO add your handling code here:
    }//GEN-LAST:event_b11ActionPerformed

    private void b10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b10ActionPerformed
        PresionadoEnabled(b10);        // TODO add your handling code here:
    }//GEN-LAST:event_b10ActionPerformed
  
    *//*
    
    private void b1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseExited
        compare();// TODO add your handling code here:
    }//GEN-LAST:event_b1MouseExited

    private void b2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b2MouseExited
       compare(); // TODO add your handling code here:
    }//GEN-LAST:event_b2MouseExited

    private void b3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b3MouseExited
        compare();// TODO add your handling code here:
    }//GEN-LAST:event_b3MouseExited

    private void b5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b5MouseExited
        compare();// TODO add your handling code here:
    }//GEN-LAST:event_b5MouseExited

    private void b6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b6MouseExited
        compare();// TODO add your handling code here:
    }//GEN-LAST:event_b6MouseExited

    private void b7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b7MouseExited
        compare();// TODO add your handling code here:
    }//GEN-LAST:event_b7MouseExited

    private void b8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b8MouseExited
        compare();// TODO add your handling code here:
    }//GEN-LAST:event_b8MouseExited

    private void b9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b9MouseExited
        compare();// TODO add your handling code here:
    }//GEN-LAST:event_b9MouseExited

    private void b10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b10MouseExited
        compare();// TODO add your handling code here:
    }//GEN-LAST:event_b10MouseExited

    private void b11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b11MouseExited
        compare();// TODO add your handling code here:
    }//GEN-LAST:event_b11MouseExited

    private void b12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b12MouseExited
        compare();// TODO add your handling code here:
    }//GEN-LAST:event_b12MouseExited

    private void b13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b13MouseExited
        compare();// TODO add your handling code here:
    }//GEN-LAST:event_b13MouseExited

    private void b14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b14MouseExited
        compare();// TODO add your handling code here:
    }//GEN-LAST:event_b14MouseExited

    private void b15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b15MouseExited
        compare();// TODO add your handling code here:
    }//GEN-LAST:event_b15MouseExited

    private void b16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b16MouseExited
        compare();// TODO add your handling code here:
    }//GEN-LAST:event_b16MouseExited

    private void b4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b4MouseExited
        compare();// TODO add your handling code here:
    }//GEN-LAST:event_b4MouseExited

       

     */ 
    
    private void b1MouseExited(java.awt.event.MouseEvent evt)
    {
    compare();
    }  
    private void b2MouseExited(java.awt.event.MouseEvent evt)
    {
    compare();
    }  
    private void b3MouseExited(java.awt.event.MouseEvent evt)
    {
    compare();
    }  
    private void b4MouseExited(java.awt.event.MouseEvent evt)
    {
    compare();
    }  
    private void b5MouseExited(java.awt.event.MouseEvent evt)
    {
    compare();
    }  
    private void b6MouseExited(java.awt.event.MouseEvent evt)
    {
    compare();
    }  
    private void b7MouseExited(java.awt.event.MouseEvent evt)
    {
    compare();
    }  
    private void b8MouseExited(java.awt.event.MouseEvent evt)
    {
    compare();
    }  
    private void b9MouseExited(java.awt.event.MouseEvent evt)
    {
    compare();
    }  
    private void b10MouseExited(java.awt.event.MouseEvent evt)
    {
    compare();
    }  
    private void b11MouseExited(java.awt.event.MouseEvent evt)
    {
    compare();
    }  
    private void b12MouseExited(java.awt.event.MouseEvent evt)
    {
    compare();
    }  
    private void b13MouseExited(java.awt.event.MouseEvent evt)
    {
    compare();
    }  
    private void b14MouseExited(java.awt.event.MouseEvent evt)
    {
    compare();
    }  
    private void b15MouseExited(java.awt.event.MouseEvent evt)
    {
    compare();
    }  
    private void b16MouseExited(java.awt.event.MouseEvent evt)
    {
    compare();
    }  
    
    
    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(go.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(go.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(go.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(go.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new go().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b10;
    private javax.swing.JButton b11;
    private javax.swing.JButton b12;
    private javax.swing.JButton b13;
    private javax.swing.JButton b14;
    private javax.swing.JButton b15;
    private javax.swing.JButton b16;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
