/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Piskvorky.Piskvorky;
import Piskvorky.PiskvorkyWinner;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import javax.swing.JOptionPane;

/**
 *
 * @author namer
 */
public class AppUI extends javax.swing.JFrame {
    
    private Piskvorky piskvorky;
    
    /**
     * Creates new form AppUI
     */
    public AppUI() {
        initComponents();
        
        initApp();
    }
    
    public void initApp() {
        setLocationRelativeTo(null); //nastavi zobrazovanie na stred obrazovky
        this.setTitle("Hra Piškôrky");
        
        piskvorky = new Piskvorky();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LTPanel = new javax.swing.JPanel();
        MTPanel = new javax.swing.JPanel();
        RTPanel = new javax.swing.JPanel();
        LMPanel = new javax.swing.JPanel();
        MMPanel = new javax.swing.JPanel();
        RMPanel = new javax.swing.JPanel();
        LBPanel = new javax.swing.JPanel();
        MBPanel = new javax.swing.JPanel();
        RBPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(316, 338));
        setMinimumSize(new java.awt.Dimension(316, 338));
        setPreferredSize(new java.awt.Dimension(316, 338));
        setResizable(false);

        LTPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        LTPanel.setAlignmentX(0.0F);
        LTPanel.setAlignmentY(0.0F);
        LTPanel.setMaximumSize(new java.awt.Dimension(100, 100));
        LTPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LTPanelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout LTPanelLayout = new javax.swing.GroupLayout(LTPanel);
        LTPanel.setLayout(LTPanelLayout);
        LTPanelLayout.setHorizontalGroup(
            LTPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 98, Short.MAX_VALUE)
        );
        LTPanelLayout.setVerticalGroup(
            LTPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 98, Short.MAX_VALUE)
        );

        MTPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        MTPanel.setAlignmentX(0.0F);
        MTPanel.setAlignmentY(0.0F);
        MTPanel.setMaximumSize(new java.awt.Dimension(100, 100));
        MTPanel.setMinimumSize(new java.awt.Dimension(100, 100));
        MTPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MTPanelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout MTPanelLayout = new javax.swing.GroupLayout(MTPanel);
        MTPanel.setLayout(MTPanelLayout);
        MTPanelLayout.setHorizontalGroup(
            MTPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 98, Short.MAX_VALUE)
        );
        MTPanelLayout.setVerticalGroup(
            MTPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 98, Short.MAX_VALUE)
        );

        RTPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        RTPanel.setAlignmentX(0.0F);
        RTPanel.setAlignmentY(0.0F);
        RTPanel.setMaximumSize(new java.awt.Dimension(100, 100));
        RTPanel.setMinimumSize(new java.awt.Dimension(100, 100));
        RTPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RTPanelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout RTPanelLayout = new javax.swing.GroupLayout(RTPanel);
        RTPanel.setLayout(RTPanelLayout);
        RTPanelLayout.setHorizontalGroup(
            RTPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 98, Short.MAX_VALUE)
        );
        RTPanelLayout.setVerticalGroup(
            RTPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 98, Short.MAX_VALUE)
        );

        LMPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        LMPanel.setAlignmentX(0.0F);
        LMPanel.setAlignmentY(0.0F);
        LMPanel.setMaximumSize(new java.awt.Dimension(100, 100));
        LMPanel.setMinimumSize(new java.awt.Dimension(100, 100));
        LMPanel.setPreferredSize(new java.awt.Dimension(100, 100));
        LMPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LMPanelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout LMPanelLayout = new javax.swing.GroupLayout(LMPanel);
        LMPanel.setLayout(LMPanelLayout);
        LMPanelLayout.setHorizontalGroup(
            LMPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 98, Short.MAX_VALUE)
        );
        LMPanelLayout.setVerticalGroup(
            LMPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 98, Short.MAX_VALUE)
        );

        MMPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        MMPanel.setAlignmentX(0.0F);
        MMPanel.setAlignmentY(0.0F);
        MMPanel.setMaximumSize(new java.awt.Dimension(100, 100));
        MMPanel.setMinimumSize(new java.awt.Dimension(100, 100));
        MMPanel.setPreferredSize(new java.awt.Dimension(100, 100));
        MMPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MMPanelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout MMPanelLayout = new javax.swing.GroupLayout(MMPanel);
        MMPanel.setLayout(MMPanelLayout);
        MMPanelLayout.setHorizontalGroup(
            MMPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 98, Short.MAX_VALUE)
        );
        MMPanelLayout.setVerticalGroup(
            MMPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 98, Short.MAX_VALUE)
        );

        RMPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        RMPanel.setAlignmentX(0.0F);
        RMPanel.setAlignmentY(0.0F);
        RMPanel.setMaximumSize(new java.awt.Dimension(100, 100));
        RMPanel.setMinimumSize(new java.awt.Dimension(100, 100));
        RMPanel.setPreferredSize(new java.awt.Dimension(100, 100));
        RMPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RMPanelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout RMPanelLayout = new javax.swing.GroupLayout(RMPanel);
        RMPanel.setLayout(RMPanelLayout);
        RMPanelLayout.setHorizontalGroup(
            RMPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 98, Short.MAX_VALUE)
        );
        RMPanelLayout.setVerticalGroup(
            RMPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 98, Short.MAX_VALUE)
        );

        LBPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        LBPanel.setAlignmentX(0.0F);
        LBPanel.setAlignmentY(0.0F);
        LBPanel.setMaximumSize(new java.awt.Dimension(100, 100));
        LBPanel.setMinimumSize(new java.awt.Dimension(100, 100));
        LBPanel.setPreferredSize(new java.awt.Dimension(100, 100));
        LBPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LBPanelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout LBPanelLayout = new javax.swing.GroupLayout(LBPanel);
        LBPanel.setLayout(LBPanelLayout);
        LBPanelLayout.setHorizontalGroup(
            LBPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 98, Short.MAX_VALUE)
        );
        LBPanelLayout.setVerticalGroup(
            LBPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 98, Short.MAX_VALUE)
        );

        MBPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        MBPanel.setAlignmentX(0.0F);
        MBPanel.setAlignmentY(0.0F);
        MBPanel.setMaximumSize(new java.awt.Dimension(100, 100));
        MBPanel.setMinimumSize(new java.awt.Dimension(100, 100));
        MBPanel.setPreferredSize(new java.awt.Dimension(100, 100));
        MBPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MBPanelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout MBPanelLayout = new javax.swing.GroupLayout(MBPanel);
        MBPanel.setLayout(MBPanelLayout);
        MBPanelLayout.setHorizontalGroup(
            MBPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 98, Short.MAX_VALUE)
        );
        MBPanelLayout.setVerticalGroup(
            MBPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 98, Short.MAX_VALUE)
        );

        RBPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        RBPanel.setAlignmentX(0.0F);
        RBPanel.setAlignmentY(0.0F);
        RBPanel.setMaximumSize(new java.awt.Dimension(100, 100));
        RBPanel.setMinimumSize(new java.awt.Dimension(100, 100));
        RBPanel.setPreferredSize(new java.awt.Dimension(100, 100));
        RBPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RBPanelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout RBPanelLayout = new javax.swing.GroupLayout(RBPanel);
        RBPanel.setLayout(RBPanelLayout);
        RBPanelLayout.setHorizontalGroup(
            RBPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 98, Short.MAX_VALUE)
        );
        RBPanelLayout.setVerticalGroup(
            RBPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 98, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LMPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(MMPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(RMPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LBPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(MBPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(RBPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LTPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(MTPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(RTPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LTPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(MTPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LMPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MMPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RMPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(RTPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LBPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MBPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RBPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        MTPanel.getAccessibleContext().setAccessibleName("");
        MTPanel.getAccessibleContext().setAccessibleDescription("");

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LTPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LTPanelMouseClicked
        int xPos = 18;
        int yPos = 41;
        
        switch (this.piskvorky.positionClicked(0, 0)) {
            case 1: // X
                this.drawX(xPos, yPos);
                break;
            case 2: // O
                this.drawCircle(xPos, yPos);
                break;
            default:
                //tu nerob nic je to 0 teda nie je to povoleny tah
                return;
        }
        
        this.checkWinner();
    }//GEN-LAST:event_LTPanelMouseClicked

    private void MTPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MTPanelMouseClicked
        int xPos = 118;
        int yPos = 41;
        switch (this.piskvorky.positionClicked(1, 0)) {
            case 1: // X
                this.drawX(xPos, yPos);
                break;
            case 2: // O
                this.drawCircle(xPos, yPos);
                break;
            default:
                return;
        }
        
        this.checkWinner();
    }//GEN-LAST:event_MTPanelMouseClicked

    private void RTPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RTPanelMouseClicked
        int xPos = 218;
        int yPos = 41;
        switch (this.piskvorky.positionClicked(2, 0)) {
            case 1: // X
                this.drawX(xPos, yPos);
                break;
            case 2: // O
                this.drawCircle(xPos, yPos);
                break;
            default:
                return;
        }
        
        this.checkWinner();
    }//GEN-LAST:event_RTPanelMouseClicked

    private void LMPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LMPanelMouseClicked
        int xPos = 18;
        int yPos = 141;
        switch (this.piskvorky.positionClicked(0, 1)) {
            case 1: // X
                this.drawX(xPos, yPos);
                break;
            case 2: // O
                this.drawCircle(xPos, yPos);
                break;
            default:
                return;
        }
        
        this.checkWinner();
    }//GEN-LAST:event_LMPanelMouseClicked

    private void MMPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MMPanelMouseClicked
        int xPos = 118;
        int yPos = 141;
        switch (this.piskvorky.positionClicked(1, 1)) {
            case 1: // X
                this.drawX(xPos, yPos);
                break;
            case 2: // O
                this.drawCircle(xPos, yPos);
                break;
            default:
                return;
        }
        
        this.checkWinner();
    }//GEN-LAST:event_MMPanelMouseClicked

    private void RMPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RMPanelMouseClicked
        int xPos = 218;
        int yPos = 141;
        switch (this.piskvorky.positionClicked(2, 1)) {
            case 1: // X
                this.drawX(xPos, yPos);
                break;
            case 2: // O
                this.drawCircle(xPos, yPos);
                break;
            default:
                return;
        }
        
        this.checkWinner();
    }//GEN-LAST:event_RMPanelMouseClicked

    private void LBPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LBPanelMouseClicked
        int xPos = 18;
        int yPos = 241;
        switch (this.piskvorky.positionClicked(0, 2)) {
            case 1: // X
                this.drawX(xPos, yPos);
                break;
            case 2: // O
                this.drawCircle(xPos, yPos);
                break;
            default:
                return;
        }
        
        this.checkWinner();
    }//GEN-LAST:event_LBPanelMouseClicked

    private void MBPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MBPanelMouseClicked
        int xPos = 118;
        int yPos = 241;
        switch (this.piskvorky.positionClicked(1, 2)) {
            case 1: // X
                this.drawX(xPos, yPos);
                break;
            case 2: // O
                this.drawCircle(xPos, yPos);
                break;
            default:
                return;
        }
        
        this.checkWinner();
    }//GEN-LAST:event_MBPanelMouseClicked

    private void RBPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RBPanelMouseClicked
        int xPos = 218;
        int yPos = 241;
        switch (this.piskvorky.positionClicked(2, 2)) {
            case 1: // X
                this.drawX(xPos, yPos);
                break;
            case 2: // O
                this.drawCircle(xPos, yPos);
                break;
            default:
                return;
        }
        
        this.checkWinner();
    }//GEN-LAST:event_RBPanelMouseClicked

    public void drawCircle(int xPos, int yPos) {
        Graphics2D g = (Graphics2D) getGraphics();
        g.setStroke(new BasicStroke(2));
        g.drawOval(xPos, yPos, 80, 80);
    }
    
    public void drawX(int xPos, int yPos) {
        Graphics2D g = (Graphics2D) getGraphics();
        g.setStroke(new BasicStroke(2));
        g.drawLine(xPos, yPos, xPos + 80, yPos + 80);
        g.drawLine(xPos, yPos + 80, xPos + 80, yPos);
    }
    
    public void checkWinner() {
        PiskvorkyWinner winner = this.piskvorky.checkWinner();
        //TODO logika kreslenia a tak
        if (winner.winner != 0) { //ak sa nerovna 0 tak niekto vyhral alebo je remiza
            Graphics2D g = (Graphics2D) getGraphics();
            if (winner.winner == 3) { //remiza staci upozornenie
                JOptionPane.showMessageDialog(this.rootPane, "Nastala remíza");
            } 
            else {//niekto vyhral treba vykreslit ciaru a aj dat popup
                g.setColor(Color.RED);
                g.setStroke(new BasicStroke(4));
                int xStart = ( winner.xStart * 100 );
                int yStart = ( winner.yStart * 100 );
                int xEnd = ( winner.xEnd * 100 );
                int yEnd = ( winner.yEnd * 100 );
                
                if (winner.xStart == winner.xEnd) { //Stlpcovy vitaz
                    xStart += 18 + 40;
                    xEnd += 18 + 40;
                    yStart += 41;
                    yEnd += 41 + 80;
                }
                else if (winner.yStart == winner.yEnd) { //Riadkovy vitaz
                    xStart += 18;
                    xEnd += 18 + 80;
                    yStart += 41 + 40;
                    yEnd += 41 + 40;
                }
                else { //Diagonalny vitaz
                    xStart += 18;
                    xEnd += 18 + 80;
                    if (yStart < yEnd) {
                        yStart += 41;
                        yEnd += 41 + 80;
                    }
                    else{
                        yStart += 41 + 80;
                        yEnd += 41;
                    }
                }
                //Vykreslenie ciary
                g.drawLine( xStart, yStart, xEnd, yEnd);
                if (winner.winner == 1) {
                    JOptionPane.showMessageDialog(this.rootPane, "Vyhráva hráč: X");
                }
                else {
                    JOptionPane.showMessageDialog(this.rootPane, "Vyhráva hráč: O");
                } 
            }
            //vycistime hraciu plochu aj grid
            piskvorky.reset();
            this.repaint();
        }
    }
    
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
            java.util.logging.Logger.getLogger(AppUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LBPanel;
    private javax.swing.JPanel LMPanel;
    private javax.swing.JPanel LTPanel;
    private javax.swing.JPanel MBPanel;
    private javax.swing.JPanel MMPanel;
    private javax.swing.JPanel MTPanel;
    private javax.swing.JPanel RBPanel;
    private javax.swing.JPanel RMPanel;
    private javax.swing.JPanel RTPanel;
    // End of variables declaration//GEN-END:variables
}
