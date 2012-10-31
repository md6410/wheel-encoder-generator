/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * AuthenticationForm.java
 *
 * Created on Jan 7, 2011, 11:00:32 PM
 */

package com.botthoughts;

import java.awt.Frame;

/**
 *
 * @author Michael Shimniok
 */
public class AuthenticationDialog extends javax.swing.JDialog {

    private boolean failed = false;

    public static final int LOGIN_OPTION = 1;
    public static final int CANCEL_OPTION = 0;
    private int answer = CANCEL_OPTION;

    /** Creates new form AuthenticationForm */
    public AuthenticationDialog(Frame frame, String title) {
        super(frame, title);
        initComponents();
    }

    @Override
    public void setVisible(boolean visible) {
        authFailedText.setVisible(failed);
        super.setVisible(visible);
    }

    public String getUsername() {
        return usernameField.getText();
    }

    public String getPassword() {
        return new String(passwordField.getPassword());
    }

    public int getAnswer() {
        return this.answer;
    }

    public void setFailed(boolean failed) {
        this.failed = failed;
        passwordField.setText("");
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        jPanel4 = new javax.swing.JPanel();
        authFailedText = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        loginButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(275, 140));
        setModal(true);
        setName("Google Authentication"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setName("jPanel1"); // NOI18N
        jPanel1.setLayout(new java.awt.GridBagLayout());

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(wheelencodergenerator.WheelEncoderGeneratorApp.class).getContext().getResourceMap(AuthenticationDialog.class);
        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel1.setName("jLabel1"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 20;
        jPanel1.add(jLabel1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(jPanel1, gridBagConstraints);

        jPanel2.setName("jPanel2"); // NOI18N

        jLabel2.setFont(resourceMap.getFont("jLabel2.font")); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabel2.setName("jLabel2"); // NOI18N
        jPanel2.add(jLabel2);

        usernameField.setMaximumSize(new java.awt.Dimension(150, 20));
        usernameField.setMinimumSize(new java.awt.Dimension(150, 20));
        usernameField.setName("usernameField"); // NOI18N
        usernameField.setPreferredSize(new java.awt.Dimension(150, 20));
        jPanel2.add(usernameField);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(jPanel2, gridBagConstraints);

        jPanel3.setName("jPanel3"); // NOI18N

        jLabel3.setFont(resourceMap.getFont("jLabel3.font")); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabel3.setName("jLabel3"); // NOI18N
        jPanel3.add(jLabel3);

        passwordField.setMaximumSize(new java.awt.Dimension(150, 20));
        passwordField.setMinimumSize(new java.awt.Dimension(150, 20));
        passwordField.setName("passwordField"); // NOI18N
        passwordField.setPreferredSize(new java.awt.Dimension(150, 20));
        jPanel3.add(passwordField);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(jPanel3, gridBagConstraints);

        jPanel4.setName("jPanel4"); // NOI18N

        authFailedText.setForeground(resourceMap.getColor("authFailedText.foreground")); // NOI18N
        authFailedText.setText(resourceMap.getString("authFailedText.text")); // NOI18N
        authFailedText.setName("authFailedText"); // NOI18N
        jPanel4.add(authFailedText);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(jPanel4, gridBagConstraints);

        jPanel5.setName("jPanel5"); // NOI18N

        loginButton.setText(resourceMap.getString("loginButton.text")); // NOI18N
        loginButton.setName("loginButton"); // NOI18N
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login(evt);
            }
        });
        jPanel5.add(loginButton);

        cancelButton.setText(resourceMap.getString("cancelButton.text")); // NOI18N
        cancelButton.setName("cancelButton"); // NOI18N
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel(evt);
            }
        });
        jPanel5.add(cancelButton);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(jPanel5, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void login(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login
        this.answer = LOGIN_OPTION;
        setVisible(false);
    }//GEN-LAST:event_login

    private void cancel(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel
        this.answer = CANCEL_OPTION;
        passwordField.setText("");
        setVisible(false);
    }//GEN-LAST:event_cancel


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel authFailedText;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables

}