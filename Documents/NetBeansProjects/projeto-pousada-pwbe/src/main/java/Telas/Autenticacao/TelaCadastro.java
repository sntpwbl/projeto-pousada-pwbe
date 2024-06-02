package Telas.Autenticacao;
import java.sql.*;
import Dal.Conexao;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TelaCadastro extends javax.swing.JFrame {
    Connection conexao = Conexao.conectar();
    PreparedStatement instrucaoSql = null;
    ResultSet resultadoQuery = null;
    
    public TelaCadastro() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblCadastro = new javax.swing.JLabel();
        txtCadastroEmail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lblVoltarLogin = new javax.swing.JLabel();
        lblCadastroConfirma = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        lblCadastroSenha = new javax.swing.JLabel();
        lblCadastroEmail = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtCadastroSenha = new javax.swing.JPasswordField();
        txtCadastroConfirma = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro");
        setBackground(new java.awt.Color(25, 63, 99));
        setMinimumSize(new java.awt.Dimension(380, 679));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(25, 63, 99));

        lblCadastro.setFont(new java.awt.Font("sansserif", 1, 30)); // NOI18N
        lblCadastro.setForeground(new java.awt.Color(255, 255, 255));
        lblCadastro.setText("Cadastro");

        txtCadastroEmail.setMaximumSize(new java.awt.Dimension(64, 22));
        txtCadastroEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCadastroEmailActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("A senha deve conter:");

        lblVoltarLogin.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblVoltarLogin.setForeground(new java.awt.Color(255, 255, 255));
        lblVoltarLogin.setText("Já possui uma conta? Fazer login");
        lblVoltarLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblVoltarLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVoltarLoginMouseClicked(evt);
            }
        });

        lblCadastroConfirma.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lblCadastroConfirma.setForeground(new java.awt.Color(255, 255, 255));
        lblCadastroConfirma.setText("Confirme a sua senha");

        btnCadastrar.setBackground(new java.awt.Color(47, 135, 185));
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("Cadastre-se");
        btnCadastrar.setBorder(null);
        btnCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        lblCadastroSenha.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lblCadastroSenha.setForeground(new java.awt.Color(255, 255, 255));
        lblCadastroSenha.setText("Senha");

        lblCadastroEmail.setBackground(new java.awt.Color(255, 255, 255));
        lblCadastroEmail.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        lblCadastroEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblCadastroEmail.setText("Email");

        jLabel7.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("- Entre 8 a 24 caracteres;");

        jLabel8.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("- Uma letra minúscula;");

        jLabel9.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("- Uma letra maiúscula;");

        jLabel10.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("- Um número;");

        jLabel11.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("- Um caracter especial.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(lblCadastro))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCadastroEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(lblCadastroEmail)
                            .addComponent(lblCadastroSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCadastroConfirma)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)))
                            .addComponent(txtCadastroSenha)
                            .addComponent(txtCadastroConfirma))))
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 88, Short.MAX_VALUE)
                .addComponent(lblVoltarLogin)
                .addGap(87, 87, 87))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lblCadastro)
                .addGap(30, 30, 30)
                .addComponent(lblCadastroEmail)
                .addGap(15, 15, 15)
                .addComponent(txtCadastroEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(lblCadastroSenha)
                .addGap(15, 15, 15)
                .addComponent(txtCadastroSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(lblCadastroConfirma)
                .addGap(15, 15, 15)
                .addComponent(txtCadastroConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addGap(15, 15, 15)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(20, 20, 20)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(lblVoltarLogin)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCadastroEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCadastroEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCadastroEmailActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        cadastrar(txtCadastroEmail.getText(), txtCadastroSenha.getText(), txtCadastroConfirma.getText());
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void lblVoltarLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVoltarLoginMouseClicked
        this.dispose();
    }//GEN-LAST:event_lblVoltarLoginMouseClicked

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCadastro;
    private javax.swing.JLabel lblCadastroConfirma;
    private javax.swing.JLabel lblCadastroEmail;
    private javax.swing.JLabel lblCadastroSenha;
    private javax.swing.JLabel lblVoltarLogin;
    private javax.swing.JPasswordField txtCadastroConfirma;
    private javax.swing.JTextField txtCadastroEmail;
    private javax.swing.JPasswordField txtCadastroSenha;
    // End of variables declaration//GEN-END:variables

    public void cadastrar(String email, String senha, String confirmaSenha){
        try{
            instrucaoSql = conexao.prepareStatement("INSERT INTO tbl_usuarios(email_usuario, senha_usuario) VALUES(?, ?)");
            
            if(!email.contains("@")){
                JOptionPane.showMessageDialog(null, "Email digitado é inválido. Tente novamente.");
            }else{
                instrucaoSql.setString(1, email);
            }
            
            senha = verificarSenha(senha, confirmaSenha);
            if(senha!=null) instrucaoSql.setString(2, senha);
            
            instrucaoSql.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso.");
            limpar(txtCadastroEmail, txtCadastroSenha, txtCadastroConfirma);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Não foi possível realizar o cadastro.");
        }
    }
    public static void limpar(JTextField email, JTextField senha, JTextField confirmaSenha){
        email.setText("");
        senha.setText("");
        confirmaSenha.setText("");
    }
    
    public static String verificarSenha(String senha, String confirmaSenha){
        String caracteresMin = "abcdefghijklmnopqrstuvwxyz";
        String caracteresMaiusc = caracteresMin.toUpperCase();
        String numeros = "0123456789";
        String caracteresEsp = "!@#$%&*()+=-*./";
        
        boolean temMinuscula = false;
        boolean temMaiuscula = false;
        boolean temNumero = false;
        boolean temEspecial = false;
        
        if(!senha.equals(confirmaSenha)){
            JOptionPane.showMessageDialog(null, "As senhas digitadas não coincidem. Tente novamente.");
            return null;
        }else{
            if(senha.length()<8 || senha.length()>24){
                JOptionPane.showMessageDialog(null, "O tamanho da senha é inválido. Tente novamente.");
                return null;
            }else{
                for (char c : senha.toCharArray()) {
                    if (caracteresMin.contains(String.valueOf(c))) {
                        temMinuscula = true;
                    } else if (caracteresMaiusc.contains(String.valueOf(c))) {
                        temMaiuscula = true;
                    } else if (numeros.contains(String.valueOf(c))) {
                        temNumero = true;
                    } else if (caracteresEsp.contains(String.valueOf(c))) {
                        temEspecial = true;
                    }
                }
                if(!temMinuscula || !temMaiuscula || !temNumero || !temEspecial){
                    JOptionPane.showMessageDialog(null, "A senha não contém os caracteres especificados. Tente novamente.");
                    return null;
                }
            }
        }
        return senha;
    }

}

