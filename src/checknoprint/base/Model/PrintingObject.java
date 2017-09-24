/*    */ package checknoprint.base.Model;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class PrintingObject
/*    */ {
/*    */   private PRINTTYPE printtype;
/*    */   
/*    */   public PRINTTYPE getPrinttype()
/*    */   {
/* 18 */     return this.printtype;
/*    */   }
/*    */   
/*    */   public void setPrinttype(PRINTTYPE printtype) {
/* 22 */     this.printtype = printtype;
/*    */   }
/*    */   
/*    */   public static enum PRINTTYPE
/*    */   {
/* 27 */     DIRECTPRINT,  ALTERNATEPRINT;
/*    */     
/*    */     private PRINTTYPE() {} }
/*    */   
/* 31 */   private List<PrintingContent> printingContent = new ArrayList();
/*    */   
/*    */   public List<PrintingContent> getPrintingContent() {
/* 34 */     return this.printingContent;
/*    */   }
/*    */   
/*    */   public void setPrintingContent(List<PrintingContent> printingContent) {
/* 38 */     this.printingContent = printingContent;
/*    */   }
/*    */ }


/* Location:              F:\MICR Printing\dist\checknoprint.jar!\checknoprint\base\Model\PrintingObject.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */