package Telas.Autenticacao;
import Telas.Autenticacao.TelaCadastro;
import java.sql.*;
import Dal.Conexao;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TelaRedefinir extends javax.swing.JFrame {
    Connection conexao = Conexao.conectar();
    PreparedStatement instrucaoSql = null;
    ResultSet resultadoQuery = null;
    
    public TelaRedefinir() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        lblRed = new javax.swing.JLabel();
        lblRedEmail = new javax.swing.JLabel();
        txtRedEmail = new javax.swing.JTextField();
        lblRedSenha = new javax.swing.JLabel();
        lblRedConf = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnRedefinir = new javax.swing.JButton();
        lblRedCadastrar = new javax.swing.JLabel();
        txtRedSenha = new javax.swing.JPasswordField();
        txtRedConfirma = new javax.swing.JPasswordField();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Redefinir senha");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(25, 63, 99));
        setMinimumSize(new java.awt.Dimension(380, 712));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(25, 63, 99));

        lblRed.setFont(new java.awt.Font("sansserif", 1, 30)); // NOI18N
        lblRed.setForeground(new java.awt.Color(255, 255, 255));
        lblRed.setText("Redefinir senha");

        lblRedEmail.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lblRedEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblRedEmail.setText("Email");

        txtRedEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRedEmailActionPerformed(evt);
            }
        });

        lblRedSenha.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lblRedSenha.setForeground(new java.awt.Color(255, 255, 255));
        lblRedSenha.setText("Nova senha");

        lblRedConf.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lblRedConf.setForeground(new java.awt.Color(255, 255, 255));
        lblRedConf.setText("Confirme a sua senha");

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("A senha deve conter:");

        jLabel6.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("- Entre 8 a 24 caracteres;");

        jLabel7.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("- Uma letra minúscula;");

        jLabel8.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("- Uma letra maiúscula;");

        jLabel9.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("- Um número;");

        jLabel10.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("- Um caracter especial.");

        btnRedefinir.setBackground(new java.awt.Color(47, 135, 185));
        btnRedefinir.setForeground(new java.awt.Color(255, 255, 255));
        btnRedefinir.setText("Redefinir");
        btnRedefinir.setBorder(null);
        btnRedefinir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRedefinir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRedefinirActionPerformed(evt);
            }
        });

        lblRedCadastrar.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblRedCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        lblRedCadastrar.setText("Ainda não possui uma conta? Cadastre-se");
        lblRedCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRedCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRedCadastrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(lblRed)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(txtRedEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblRedEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblRedConf, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblRedSenha))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtRedConfirma, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                            .addComponent(txtRedSenha, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 55, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblRedCadastrar)
                    .addComponent(btnRedefinir, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lblRed)
                .addGap(30, 30, 30)
                .addComponent(lblRedEmail)
                .addGap(15, 15, 15)
                .addComponent(txtRedEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(lblRedSenha)
                .addGap(15, 15, 15)
                .addComponent(txtRedSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(lblRedConf)
                .addGap(15, 15, 15)
                .addComponent(txtRedConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(20, 20, 20)
                .addComponent(btnRedefinir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(lblRedCadastrar)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRedefinirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRedefinirActionPerformed
        redefinir(txtRedEmail.getText(), txtRedSenha.getText(), txtRedConfirma.getText());
    }//GEN-LAST:event_btnRedefinirActionPerformed

    private void txtRedEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRedEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRedEmailActionPerformed

    private void lblRedCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRedCadastrarMouseClicked
        new TelaCadastro().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblRedCadastrarMouseClicked

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaRedefinir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRedefinir;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JLabel lblRed;
    private javax.swing.JLabel lblRedCadastrar;
    private javax.swing.JLabel lblRedConf;
    private javax.swing.JLabel lblRedEmail;
    private javax.swing.JLabel lblRedSenha;
    private javax.swing.JPasswordField txtRedConfirma;
    private javax.swing.JTextField txtRedEmail;
    private javax.swing.JPasswordField txtRedSenha;
    // End of variables declaration//GEN-END:variables

    private void redefinir(String email, String senha, String confirmaSenha) {
        try {
            instrucaoSql = conexao.prepareStatement("SELECT * FROM tbl_usuarios WHERE email_usuario=?");
            instrucaoSql.setString(1, email);
            
            resultadoQuery = instrucaoSql.executeQuery();
            if(!resultadoQuery.next()){
                JOptionPane.showMessageDialog(null, "Nenhum email foi cadastrado com esse email. Tente novamente.");
            }else{
                instrucaoSql = conexao.prepareStatement("UPDATE tbl_usuarios SET senha_usuario=? WHERE email_usuario=?");
                
                senha = TelaCadastro.verificarSenha(senha, confirmaSenha);
                if(senha!=null) instrucaoSql.setString(1, senha);
                
                instrucaoSql.setString(2, email);
                
                instrucaoSql.executeUpdate();
                JOptionPane.showMessageDialog(null, "Redefinição de senha realizada com sucesso.");
                TelaCadastro.limpar(txtRedEmail, txtRedSenha, txtRedConfirma);
            }
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível redefinir a senha.\n" + ex.getMessage());
        }
    }
}
