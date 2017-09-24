/*    */ package dbconnect;
/*    */ 
/*    */ import com.mysql.jdbc.Connection;
/*    */ import java.sql.DriverManager;
/*    */ import java.sql.SQLException;
/*    */ import org.apache.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class connectionadmin
/*    */ {
/* 18 */   private static Logger log = Logger.getLogger(connectionadmin.class.getName());
/*    */   
/*    */   public static Connection opencon() {
/* 21 */     Connection con = null;
/*    */     try {
/* 23 */       String dburl = "jdbc:mysql://localhost:3306/chequeprint";
/* 24 */       String dbuser = "root";
/*    */       
/* 26 */       String dbpass = "pink";
/*    */       
/* 28 */       con = (Connection)DriverManager.getConnection(dburl, dbuser, dbpass);
/*    */     }
/*    */     catch (SQLException e) {
/* 31 */       log.error(e.getMessage());
/*    */     }
/* 33 */     return con;
/*    */   }
/*    */ }


/* Location:              F:\MICR Printing\dist\checknoprint.jar!\dbconnect\connectionadmin.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */