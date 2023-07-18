/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.atm;

import javax.swing.JPanel;

/**
 *
 * @author Vee Pabuence
 */
public class Menu extends javax.swing.JPanel {
    JPanel contenedorPN = new JPanel();
    /**
     * Creates new form Menu
     */
    public Menu(JPanel pn) {
        initComponents();
        setSize(800,460);
        setVisible(true);
        contenedorPN = pn;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btn_movimientos = new javax.swing.JButton();
        btn_Retirar = new javax.swing.JButton();
        btn_ingresar = new javax.swing.JButton();
        btn_saldo = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Unispace", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Bienvenide al ATM de Bambolonvia");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, -1));

        btn_movimientos.setBackground(new java.awt.Color(255, 255, 255));
        btn_movimientos.setFont(new java.awt.Font("Unispace", 2, 14)); // NOI18N
        btn_movimientos.setForeground(new java.awt.Color(0, 0, 0));
        btn_movimientos.setText("Ver movimientos");
        btn_movimientos.setBorder(null);
        btn_movimientos.setBorderPainted(false);
        btn_movimientos.setContentAreaFilled(false);
        btn_movimientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_movimientosActionPerformed(evt);
            }
        });
        add(btn_movimientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 380, 170, 40));

        btn_Retirar.setBackground(new java.awt.Color(255, 255, 255));
        btn_Retirar.setFont(new java.awt.Font("Unispace", 2, 14)); // NOI18N
        btn_Retirar.setForeground(new java.awt.Color(0, 0, 0));
        btn_Retirar.setText("Retirar Dinero");
        btn_Retirar.setBorder(null);
        btn_Retirar.setBorderPainted(false);
        btn_Retirar.setContentAreaFilled(false);
        btn_Retirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RetirarActionPerformed(evt);
            }
        });
        add(btn_Retirar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 170, 40));

        btn_ingresar.setBackground(new java.awt.Color(255, 255, 255));
        btn_ingresar.setFont(new java.awt.Font("Unispace", 2, 14)); // NOI18N
        btn_ingresar.setForeground(new java.awt.Color(0, 0, 0));
        btn_ingresar.setText("Ingresar Dinero");
        btn_ingresar.setBorder(null);
        btn_ingresar.setBorderPainted(false);
        btn_ingresar.setContentAreaFilled(false);
        btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarActionPerformed(evt);
            }
        });
        add(btn_ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 170, 40));

        btn_saldo.setBackground(new java.awt.Color(255, 255, 255));
        btn_saldo.setFont(new java.awt.Font("Unispace", 2, 14)); // NOI18N
        btn_saldo.setForeground(new java.awt.Color(0, 0, 0));
        btn_saldo.setText("Ver Saldo");
        btn_saldo.setBorder(null);
        btn_saldo.setBorderPainted(false);
        btn_saldo.setContentAreaFilled(false);
        btn_saldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saldoActionPerformed(evt);
            }
        });
        add(btn_saldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 310, 170, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed
        ValidacionATM rd = new ValidacionATM(contenedorPN, 0);
        
        contenedorPN.removeAll();
        contenedorPN.setLocation(0, 0);
        contenedorPN.setSize(800,460);
        contenedorPN.add(rd);
        contenedorPN.revalidate();
        contenedorPN.repaint();
    }//GEN-LAST:event_btn_ingresarActionPerformed

    private void btn_RetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RetirarActionPerformed
        ValidacionATM rd = new ValidacionATM(contenedorPN, 1);
        
        contenedorPN.removeAll();
        contenedorPN.setLocation(0, 0);
        contenedorPN.setSize(800,460);
        contenedorPN.add(rd);
        contenedorPN.revalidate();
        contenedorPN.repaint();
    }//GEN-LAST:event_btn_RetirarActionPerformed

    private void btn_saldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saldoActionPerformed
        ValidacionATM rd = new ValidacionATM(contenedorPN, 2);
        
        contenedorPN.removeAll();
        contenedorPN.setLocation(0, 0);
        contenedorPN.setSize(800,460);
        contenedorPN.add(rd);
        contenedorPN.revalidate();
        contenedorPN.repaint();
    }//GEN-LAST:event_btn_saldoActionPerformed

    private void btn_movimientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_movimientosActionPerformed
        ValidacionATM rd = new ValidacionATM(contenedorPN, 3);
        
        contenedorPN.removeAll();
        contenedorPN.setLocation(0, 0);
        contenedorPN.setSize(800,460);
        contenedorPN.add(rd);
        contenedorPN.revalidate();
        contenedorPN.repaint();
    }//GEN-LAST:event_btn_movimientosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Retirar;
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JButton btn_movimientos;
    private javax.swing.JButton btn_saldo;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
