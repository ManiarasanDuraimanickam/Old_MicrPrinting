/*     */ package checknoprint;
/*     */ 
/*     */ import com.mysql.jdbc.Statement;
/*     */ import java.awt.Color;
/*     */ import java.awt.Font;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.KeyEvent;
/*     */ import java.sql.ResultSet;
/*     */ import java.util.logging.Level;
/*     */ import javax.swing.GroupLayout;
/*     */ import javax.swing.GroupLayout.Alignment;
/*     */ import javax.swing.GroupLayout.ParallelGroup;
/*     */ import javax.swing.GroupLayout.SequentialGroup;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JPasswordField;
/*     */ import javax.swing.JTextField;
import javax.swing.UIManager;
/*     */ import javax.swing.UIManager.LookAndFeelInfo;
/*     */ 
/*     */ public class Login extends javax.swing.JFrame
/*     */ {
/*  23 */   private static org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(Login.class.getName());
/*     */   private JButton btnClose;
/*     */   private JButton btnLogin;
/*     */   
/*  27 */   public Login() { try { initComponents();
/*  28 */       TitleImage();
/*     */     }
/*     */     catch (Exception ex) {}
/*     */   }
/*     */   
/*     */   private JLabel jLabel1;
/*     */   private JLabel jLabel2;
/*     */   private JLabel jLabel3;
/*     */   private void initComponents() {
/*  37 */     this.jPanel1 = new JPanel();
/*  38 */     this.jLabel1 = new JLabel();
/*  39 */     this.jLabel2 = new JLabel();
/*  40 */     this.jLabel3 = new JLabel();
/*  41 */     this.jLabel4 = new JLabel();
/*  42 */     this.jLabel5 = new JLabel();
/*  43 */     this.jLabel6 = new JLabel();
/*  44 */     this.txtUsername = new JTextField();
/*  45 */     this.btnLogin = new JButton();
/*  46 */     this.btnClose = new JButton();
/*  47 */     this.txtPassword = new JPasswordField();
/*     */     
/*  49 */     setDefaultCloseOperation(3);
/*  50 */     setTitle("LOGIN");
/*  51 */     setBackground(new Color(111, 166, 255));
/*  52 */     setCursor(new java.awt.Cursor(0));
/*  53 */     setFont(new Font("Times New Roman", 0, 14));
/*  54 */     setForeground(new Color(1, 78, 127));
/*  55 */     setUndecorated(true);
/*  56 */     setResizable(false);
/*     */     
/*  58 */     this.jPanel1.setBackground(new Color(111, 166, 255));
/*  59 */     this.jPanel1.setForeground(new Color(1, 78, 127));
/*  60 */     this.jPanel1.setToolTipText("Enter Username and Password");
/*  61 */     this.jPanel1.setFocusCycleRoot(true);
/*  62 */     this.jPanel1.setFont(new Font("Times New Roman", 0, 14));
/*  63 */     this.jPanel1.setName("");
/*     */     
/*  65 */     this.jLabel1.setFont(new Font("Times New Roman", 0, 22));
/*  66 */     this.jLabel1.setForeground(new Color(255, 255, 255));
/*  67 */     this.jLabel1.setText("Login");
/*  68 */     this.jLabel1.setToolTipText("Enter Username");
/*     */     
/*  70 */     this.jLabel2.setFont(new Font("Times New Roman", 0, 14));
/*  71 */     this.jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iMAGE/specific.png")));
/*     */     
/*  73 */     this.jLabel3.setFont(new Font("Times New Roman", 0, 18));
/*  74 */     this.jLabel3.setForeground(new Color(248, 248, 248));
/*  75 */     this.jLabel3.setText("Welcome To Cheque Print");
/*  76 */     this.jLabel3.setToolTipText("Greeting");
/*     */     
/*  78 */     this.jLabel4.setFont(new Font("Times New Roman", 0, 14));
/*  79 */     this.jLabel4.setForeground(new Color(1, 78, 127));
/*  80 */     this.jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iMAGE/login_footer.png")));
/*  81 */     this.jLabel4.setToolTipText("Enter Username");
/*     */     
/*  83 */     this.jLabel5.setFont(new Font("Times New Roman", 0, 18));
/*  84 */     this.jLabel5.setForeground(new Color(255, 255, 255));
/*  85 */     this.jLabel5.setText("Username");
/*     */     
/*  87 */     this.jLabel6.setFont(new Font("Times New Roman", 0, 18));
/*  88 */     this.jLabel6.setForeground(new Color(255, 255, 255));
/*  89 */     this.jLabel6.setText("Password");
/*     */     
/*  91 */     this.btnLogin.setBackground(new Color(255, 255, 255));
/*  92 */     this.btnLogin.setFont(new Font("Times New Roman", 0, 18));
/*  93 */     this.btnLogin.setForeground(new Color(111, 166, 255));
/*  94 */     this.btnLogin.setText("Login");
/*  95 */     this.btnLogin.setToolTipText("Click Here");
/*  96 */     this.btnLogin.addActionListener(new java.awt.event.ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/*  98 */         Login.this.btnLoginActionPerformed(evt);
/*     */       }
/*     */       
/* 101 */     });
/* 102 */     this.btnClose.setBackground(new Color(255, 255, 255));
/* 103 */     this.btnClose.setFont(new Font("Times New Roman", 0, 18));
/* 104 */     this.btnClose.setForeground(new Color(111, 166, 255));
/* 105 */     this.btnClose.setText("Close");
/* 106 */     this.btnClose.addActionListener(new java.awt.event.ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/* 108 */         Login.this.btnCloseActionPerformed(evt);
/*     */       }
/*     */       
/* 111 */     });
/* 112 */     this.txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
/*     */       public void keyPressed(KeyEvent evt) {
/* 114 */         Login.this.txtPasswordKeyPressed(evt);
/*     */       }
/*     */       
/* 117 */     });
/* 118 */     GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
/* 119 */     this.jPanel1.setLayout(jPanel1Layout);
/* 120 */     jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(this.jLabel3).addGap(137, 137, 137)).addGroup(jPanel1Layout.createSequentialGroup().addGap(97, 97, 97).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel6).addComponent(this.jLabel5).addComponent(this.jLabel1, -2, 61, -2)).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(33, 33, 33).addComponent(this.btnLogin).addGap(35, 35, 35).addComponent(this.btnClose)).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addGap(21, 21, 21).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.txtUsername, -1, 178, 32767).addComponent(this.txtPassword)))).addContainerGap(-1, 32767)).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jLabel2, GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(this.jLabel4, -1, -1, 32767)).addContainerGap()));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 150 */     jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addComponent(this.jLabel2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jLabel3).addGap(30, 30, 30).addComponent(this.jLabel1).addGap(21, 21, 21).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jLabel5).addGap(35, 35, 35).addComponent(this.jLabel6).addGap(20, 20, 20)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.txtUsername, -2, 33, -2).addGap(18, 18, 18).addComponent(this.txtPassword, -2, 31, -2).addGap(18, 18, 18))).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.btnLogin).addComponent(this.btnClose)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, 32767).addComponent(this.jLabel4, -2, 27, -2)));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 177 */     GroupLayout layout = new GroupLayout(getContentPane());
/* 178 */     getContentPane().setLayout(layout);
/* 179 */     layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel1, GroupLayout.Alignment.TRAILING, -2, 492, 32767));
/*     */     
/*     */ 
/*     */ 
/* 183 */     layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel1, -1, -1, 32767));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/* 188 */     pack();
/* 189 */     setLocationRelativeTo(null);
/*     */   }
/*     */   
/*     */   private void btnCloseActionPerformed(ActionEvent evt) {
/*     */     try {
/* 194 */       log.info("Application Closed.");
/* 195 */       System.exit(0);
/*     */     } catch (Exception e) {
/* 197 */       log.error("error==" + e.getMessage());
/*     */     }
/*     */   }
/*     */   
/*     */   private void btnLoginActionPerformed(ActionEvent evt) {
/*     */     try {
/* 203 */       String userid = this.txtUsername.getText();
/* 204 */       String pass = this.txtPassword.getText();
/* 205 */       CheckCredential(userid, pass);
/*     */     } catch (Exception e) {
/* 207 */       log.error("error---" + e.getMessage());
/*     */     }
/*     */   }
/*     */   
/*     */   private void txtPasswordKeyPressed(KeyEvent evt) {
/*     */     try {
/* 213 */       if (evt.getKeyCode() == 10) {
/* 214 */         String userid = this.txtUsername.getText();
/* 215 */         String pass = this.txtPassword.getText();
/* 216 */         CheckCredential(userid, pass);
/*     */       }
/*     */     } catch (Exception e) {
/* 219 */       log.error("error---" + e.getMessage());
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public void CheckCredential(String userid, String pass)
/*     */   {
/*     */     try
/*     */     {
/* 228 */       String query = "select * from credentials where UserId='" + userid + "' and Password='" + pass + "'";
/*     */       
/* 230 */       String access = null;
/* 231 */       Statement stm = (Statement)dbconnect.connectionadmin.opencon().createStatement();
/* 232 */       ResultSet rs = stm.executeQuery(query);
/* 233 */       while (rs.next()) {
/* 234 */         access = rs.getString("UserId");
/*     */       }
/* 236 */       if (access != null)
/*     */       {
/*     */ 
/* 239 */         new print().setVisible(true);
/* 240 */         dispose();
/*     */       } else {
/* 242 */         javax.swing.JOptionPane.showMessageDialog(null, "Wrong Username or Password..!");
/*     */       }
/* 244 */       rs.close();
/* 245 */       stm.close();
/*     */     }
/*     */     catch (Exception e) {
/* 248 */       log.error("error--" + e.getMessage());
/*     */     }
/*     */   }
/*     */   
/*     */   public void TitleImage()
/*     */   {
/*     */     try
/*     */     {
/* 256 */       getRootPane().setWindowDecorationStyle(8);
/* 257 */       java.util.List imageList = new java.util.ArrayList();
/* 258 */       imageList.add(javax.imageio.ImageIO.read(getClass().getResource("/iMAGE/Durkesh_Title.png")));
/* 259 */       setIconImages(imageList);
/*     */     }
/*     */     catch (java.io.IOException e) {}
/*     */   }
/*     */   
/*     */   private JLabel jLabel4;
/*     */   private JLabel jLabel5;
/*     */   private JLabel jLabel6;
/*     */   private JPanel jPanel1;
/*     */   private JPasswordField txtPassword;
/*     */   private JTextField txtUsername;
/*     */   public static void main(String[] args)
/*     */   {
/*     */     try
/*     */     {
/* 274 */       for (UIManager.LookAndFeelInfo info :  UIManager.getInstalledLookAndFeels()) {
/* 275 */         if ("Nimbus".equals(info.getName())) {
/* 276 */           javax.swing.UIManager.setLookAndFeel(info.getClassName());
/* 277 */           break;
/*     */         }
/*     */       }
/*     */     } catch (ClassNotFoundException ex) {
/* 281 */       java.util.logging.Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
/*     */     } catch (InstantiationException ex) {
/* 283 */       java.util.logging.Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
/*     */     } catch (IllegalAccessException ex) {
/* 285 */       java.util.logging.Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
/*     */     } catch (javax.swing.UnsupportedLookAndFeelException ex) {
/* 287 */       java.util.logging.Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
/*     */     }
/*     */     
/*     */ 
/*     */ 
/* 292 */     java.awt.EventQueue.invokeLater(new Runnable()
/*     */     {
/*     */       public void run() {
/* 295 */         new Login().setVisible(true);
/*     */       }
/*     */     });
/*     */   }
/*     */ }


/* Location:              F:\MICR Printing\dist\checknoprint.jar!\checknoprint\Login.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */