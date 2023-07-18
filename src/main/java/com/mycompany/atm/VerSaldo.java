/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.atm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JPanel;

/**
 *
 * @author Vee Pabuence
 */
public class VerSaldo extends javax.swing.JPanel {
    int id_cliente;
    JPanel contenedorPN = new JPanel();
    /**
     * Creates new form VerSaldo
     */
    public VerSaldo(int ID, JPanel pn) {
        initComponents();
        id_cliente = ID;
        contenedorPN = pn;
        setSize(800, 460);
        setVisible(true);
        
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3308/bd_atm", "vee", "123");
            PreparedStatement pst2 = cn.prepareStatement("SELECT * FROM lista_clientes WHERE ID = " + id_cliente);
            ResultSet rs = pst2.executeQuery();

            if (rs.next()) {
                label_nombre.setText(label_nombre.getText() + rs.getString("Nombre"));
                label_saldo.setText(label_saldo.getText()+rs.getString("Saldo")+"$");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        label_nombre = new javax.swing.JLabel();
        btn_Aceptar = new javax.swing.JButton();
        label_saldo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Unispace", 0, 26)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Visualización de saldo");

        label_nombre.setFont(new java.awt.Font("Unispace", 0, 24)); // NOI18N
        label_nombre.setForeground(new java.awt.Color(0, 0, 0));
        label_nombre.setText("Hola ");

        btn_Aceptar.setBackground(new java.awt.Color(255, 255, 255));
        btn_Aceptar.setFont(new java.awt.Font("Unispace", 2, 16)); // NOI18N
        btn_Aceptar.setForeground(new java.awt.Color(0, 0, 0));
        btn_Aceptar.setText("Aceptar");
        btn_Aceptar.setBorder(null);
        btn_Aceptar.setBorderPainted(false);
        btn_Aceptar.setContentAreaFilled(false);
        btn_Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AceptarActionPerformed(evt);
            }
        });

        label_saldo.setFont(new java.awt.Font("Unispace", 0, 24)); // NOI18N
        label_saldo.setForeground(new java.awt.Color(0, 0, 0));
        label_saldo.setText("Tienes un saldo de: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(214, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(235, 235, 235))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_Aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label_saldo)
                                .addGap(95, 95, 95))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(label_nombre)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(label_nombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addComponent(label_saldo)
                .addGap(46, 46, 46)
                .addComponent(btn_Aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AceptarActionPerformed
        Menu v1 = new Menu(contenedorPN);
        
        contenedorPN.removeAll();
        contenedorPN.setLocation(0, 0);
        contenedorPN.setSize(800,460);
        contenedorPN.add(v1);
        contenedorPN.revalidate();
        contenedorPN.repaint();
    }//GEN-LAST:event_btn_AceptarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Aceptar;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel label_nombre;
    private javax.swing.JLabel label_saldo;
    // End of variables declaration//GEN-END:variables
}
