/*    */ package checknoprint.base.PrintableModel;
/*    */ 
/*    */ import checknoprint.aligment_position_serialize;
/*    */ import checknoprint.base.Model.PrintingContent;
/*    */ import checknoprint.base.Model.PrintingObject;
/*    */ import checknoprint.base.Model.PrintingObject.PRINTTYPE;
/*    */ import checknoprint.print;
/*    */ import java.awt.print.PrinterException;
/*    */ import java.awt.print.PrinterJob;
/*    */ import java.util.List;
/*    */ import javax.swing.JOptionPane;
/*    */ import org.apache.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class PrintChequeNo
/*    */ {
/* 23 */   private static final Logger LOG = Logger.getLogger(print.class.getName());
/*    */   private PrintingObject printData;
/* 25 */   private int maxLimitCount = 0;
/*    */   
/*    */   public PrintChequeNo(PrintingObject printData)
/*    */   {
/* 29 */     this.printData = printData;
/*    */   }
/*    */   
/*    */   public void print()
/*    */   {
/* 34 */     PrinterJob job = PrinterJob.getPrinterJob();
/* 35 */     job.getPrintService();
/* 36 */     addlineSperatorForOranzarionName();
/* 37 */     if (this.printData.getPrinttype().equals(PrintingObject.PRINTTYPE.DIRECTPRINT)) {
/* 38 */       job.setPrintable(new PrintDirectCheque(this.printData.getPrintingContent()));
/*    */     } else
/* 40 */       job.setPrintable(new PrintAlternate(this.printData.getPrintingContent()));
/* 41 */     if (job.printDialog()) {
/*    */       try {
/* 43 */         job.print();
/* 44 */         JOptionPane.showMessageDialog(null, "Success");
/*    */       } catch (PrinterException ex) {
/* 46 */         LOG.error(ex);
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */   private void addlineSperatorForOranzarionName() {
/* 52 */     if (this.printData.getPrintingContent() == null)
/*    */     {
/* 54 */       return;
/*    */     }
/* 56 */     this.maxLimitCount = Integer.parseInt(((aligment_position_serialize)((PrintingContent)this.printData.getPrintingContent().get(0)).getAli_ser().get(0)).getOrgCharLen());
/* 57 */     int currentCount = 0;
/* 58 */     for (PrintingContent printContent : this.printData.getPrintingContent())
/*    */     {
/* 60 */       String[] Accorg = printContent.getAccOrganisation().split(" ");
/* 61 */       int count = Accorg.length;
/* 62 */       for (int i = 0; i < count; i++)
/*    */       {
/* 64 */         currentCount += Accorg[i].length();
/* 65 */         if ((currentCount > this.maxLimitCount) && (i > 0))
/*    */         {
/* 67 */           Accorg[(i - 1)] = Accorg[(i - 1)].concat(System.lineSeparator());
/* 68 */           this.maxLimitCount += this.maxLimitCount;
/*    */         }
/*    */       }
/*    */       
/* 72 */       printContent.setAccOrganisation(convertToString(Accorg));
/*    */     }
/*    */   }
/*    */   
/*    */   private String convertToString(String[] strArr) {
/* 77 */     StringBuilder sb = new StringBuilder();
/* 78 */     for (String str : strArr)
/*    */     {
/* 80 */       if (!str.contains("\n")) sb.append(str).append(" "); else
/* 81 */         sb.append(str);
/*    */     }
/* 83 */     return sb.toString();
/*    */   }
/*    */ }


/* Location:              F:\MICR Printing\dist\checknoprint.jar!\checknoprint\base\PrintableModel\PrintChequeNo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */