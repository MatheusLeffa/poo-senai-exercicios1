/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.senai.exercicios_poo1.GUI;

import com.senai.exercicios_poo1.exercicios.*;

import javax.swing.*;
import java.awt.*;

/**
 * @author mathe
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public MenuPrincipal() {
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

        jLabelExerciciosAula1 = new javax.swing.JLabel();
        btnExercicio1 = new javax.swing.JButton();
        btnExercicio2 = new javax.swing.JButton();
        btnExercicio3 = new javax.swing.JButton();
        btnExercicio4 = new javax.swing.JButton();
        btnExercicio5 = new javax.swing.JButton();
        btnExercicio6 = new javax.swing.JButton();
        btnExercicio7 = new javax.swing.JButton();
        btnExercicio8 = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aula 1");

        jLabelExerciciosAula1.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 18)); // NOI18N
        jLabelExerciciosAula1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelExerciciosAula1.setText("Exercicios Aula 1");

        btnExercicio1.setText("1 - Ler e exibir nome e idade");
        btnExercicio1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnExercicio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExercicio1ActionPerformed(evt);
            }
        });

        btnExercicio2.setText("2 - Area do quadrado");
        btnExercicio2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnExercicio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExercicio2ActionPerformed(evt);
            }
        });

        btnExercicio3.setText("3 - Maior número");
        btnExercicio3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnExercicio3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExercicio3ActionPerformed(evt);
            }
        });

        btnExercicio4.setText("4 - Média do aluno");
        btnExercicio4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnExercicio4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExercicio4ActionPerformed(evt);
            }
        });

        btnExercicio5.setText("5 - Escreva 1 a 100");
        btnExercicio5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnExercicio5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExercicio5ActionPerformed(evt);
            }
        });

        btnExercicio6.setText("6 - Par e ímpar");
        btnExercicio6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnExercicio6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExercicio6ActionPerformed(evt);
            }
        });

        btnExercicio7.setText("7 - Raiz Quadrada");
        btnExercicio7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnExercicio7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExercicio7ActionPerformed(evt);
            }
        });

        btnExercicio8.setText("8 - Calculadora");
        btnExercicio8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnExercicio8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExercicio8ActionPerformed(evt);
            }
        });

        btnFechar.setText("Fechar");
        btnFechar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnFechar)
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabelExerciciosAula1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(6, 6, 6))
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnExercicio1, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                                        .addComponent(btnExercicio2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnExercicio3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnExercicio4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnExercicio5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnExercicio6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnExercicio7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnExercicio8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabelExerciciosAula1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnExercicio1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExercicio2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExercicio3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExercicio4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExercicio5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExercicio6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExercicio7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExercicio8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnFechar)
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExercicio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExercicio1ActionPerformed
        Exercicio1.execute();
    }//GEN-LAST:event_btnExercicio1ActionPerformed

    private void btnExercicio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExercicio2ActionPerformed
        Exercicio2.execute();
    }//GEN-LAST:event_btnExercicio2ActionPerformed

    private void btnExercicio3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExercicio3ActionPerformed
        Exercicio3.execute();
    }//GEN-LAST:event_btnExercicio3ActionPerformed

    private void btnExercicio4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExercicio4ActionPerformed
        Exercicio4.execute();
    }//GEN-LAST:event_btnExercicio4ActionPerformed

    private void btnExercicio5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExercicio5ActionPerformed
        Exercicio5.execute();
    }//GEN-LAST:event_btnExercicio5ActionPerformed

    private void btnExercicio6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExercicio6ActionPerformed
        Exercicio6.execute();
    }//GEN-LAST:event_btnExercicio6ActionPerformed

    private void btnExercicio7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExercicio7ActionPerformed
        Exercicio7.execute();
    }//GEN-LAST:event_btnExercicio7ActionPerformed

    private void btnExercicio8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExercicio8ActionPerformed
        CalculadoraTela.setUpLookAndFeel();
        CalculadoraTela.createAndDisplayForm();
    }//GEN-LAST:event_btnExercicio8ActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExercicio1;
    private javax.swing.JButton btnExercicio2;
    private javax.swing.JButton btnExercicio3;
    private javax.swing.JButton btnExercicio4;
    private javax.swing.JButton btnExercicio5;
    private javax.swing.JButton btnExercicio6;
    private javax.swing.JButton btnExercicio7;
    private javax.swing.JButton btnExercicio8;
    private javax.swing.JButton btnFechar;
    private javax.swing.JLabel jLabelExerciciosAula1;
    // End of variables declaration//GEN-END:variables

    /* Set the Nimbus look and feel */
    public static void setUpLookAndFeel() {
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                 UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    }

    /* Create and display the form */
    public static void createAndDisplayForm() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }
}