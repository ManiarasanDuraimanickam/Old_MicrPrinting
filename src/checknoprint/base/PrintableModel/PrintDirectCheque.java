/*     */ package checknoprint.base.PrintableModel;
/*     */ 
/*     */ import checknoprint.aligment_position_serialize;
/*     */ import checknoprint.base.Model.PrintingContent;
/*     */ import java.awt.Font;
/*     */ import java.awt.Graphics;
/*     */ import java.awt.Graphics2D;
/*     */ import java.awt.Image;
/*     */ import java.awt.print.PageFormat;
/*     */ import java.awt.print.Printable;
/*     */ import java.awt.print.PrinterException;
/*     */ import java.io.PrintStream;
/*     */ import java.util.List;
/*     */ import javax.swing.ImageIcon;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class PrintDirectCheque
/*     */   implements Printable
/*     */ {
/*     */   private List<PrintingContent> printingContentList;
/*     */   private PrintingContent printContent;
/*     */   private int[] value;
/*     */   private int[] pagebreak;
/*     */   
/*     */   public PrintDirectCheque(List<PrintingContent> printingContent)
/*     */   {
/*  31 */     this.printingContentList = printingContent;
/*     */   }
/*     */   
/*     */ 
/*     */   public void initprocess()
/*     */   {
/*  37 */     this.printContent = ((PrintingContent)this.printingContentList.get(0));
/*  38 */     int from = Integer.parseInt(this.printContent.getNofrom());
/*  39 */     int to = Integer.parseInt(this.printContent.getNumto());
/*  40 */     int value_diff = to - from;
/*  41 */     int loop_end = value_diff + 1;
/*  42 */     this.value = new int[loop_end];
/*  43 */     System.out.println("size:==" + this.value.length);
/*  44 */     System.out.println(value_diff + "  " + loop_end);
/*  45 */     for (int i = 0; i < loop_end; i++)
/*     */     {
/*  47 */       this.value[i] = from;
/*     */       
/*  49 */       from += 1;
/*     */     }
/*  51 */     System.out.println("size:==" + this.value.length);
/*     */   }
/*     */   
/*     */   public int print(Graphics g, PageFormat pf, int pageindex) throws PrinterException
/*     */   {
/*  56 */     initprocess();
/*     */     
/*  58 */     int linesperpage = 3;
/*  59 */     int numbreakes = (this.value.length - 1) / linesperpage;
/*  60 */     System.out.println("num breaks" + numbreakes);
/*  61 */     this.pagebreak = new int[numbreakes];
/*     */     
/*  63 */     for (int j = 0; j < numbreakes; j++) {
/*  64 */       this.pagebreak[j] = ((j + 1) * linesperpage);
/*     */     }
/*     */     
/*  67 */     System.out.print(" length: " + this.pagebreak.length);
/*  68 */     if (pageindex > this.pagebreak.length) {
/*  69 */       return 1;
/*     */     }
/*  71 */     Font f1 = new Font("Arial", 0, 8);
/*  72 */     Font f2 = new Font("MICR", 0, 10);
/*  73 */     Font f3 = new Font("Arial", 1, 8);
/*  74 */     Font f4 = new Font("Arial", 1, 11);
/*  75 */     Graphics2D g2d = (Graphics2D)g;
/*  76 */     g2d.translate(pf.getImageableX(), pf.getImageableY());
/*  77 */     ImageIcon imgico = new ImageIcon(this.printContent.getUrlimage1());
/*  78 */     ImageIcon imgico1 = new ImageIcon(this.printContent.getUrlimage2());
/*  79 */     Image img = imgico.getImage();
/*  80 */     Image img1 = imgico1.getImage();
/*  81 */     int side_x = 0;int side_y = 0;int center_x = 0;int center_y = 0;int micr_x = 0;int micr_y = 0;int Acc_len = 0;
/*  82 */     side_x = Integer.parseInt(((aligment_position_serialize)this.printContent.getAli_ser().get(0)).getSd_Addr_leg11());
/*  83 */     side_y = Integer.parseInt(((aligment_position_serialize)this.printContent.getAli_ser().get(0)).getSd_Addr_heg12());
/*  84 */     int side_gap = Integer.parseInt(((aligment_position_serialize)this.printContent.getAli_ser().get(0)).getSd_Addr_spa13());
/*  85 */     center_x = Integer.parseInt(((aligment_position_serialize)this.printContent.getAli_ser().get(0)).getCn_Addr_leg11());
/*  86 */     center_y = Integer.parseInt(((aligment_position_serialize)this.printContent.getAli_ser().get(0)).getCn_Addr_heg12());
/*  87 */     int center_gap = Integer.parseInt(((aligment_position_serialize)this.printContent.getAli_ser().get(0)).getCn_Addr_spa123());
/*  88 */     micr_x = Integer.parseInt(((aligment_position_serialize)this.printContent.getAli_ser().get(0)).getChequenum_len11());
/*  89 */     micr_y = Integer.parseInt(((aligment_position_serialize)this.printContent.getAli_ser().get(0)).getChequenum_heg12());
/*  90 */     Acc_len = Integer.parseInt(((aligment_position_serialize)this.printContent.getAli_ser().get(0)).getAccNo_len());
/*  91 */     int Acc_heg = Integer.parseInt(((aligment_position_serialize)this.printContent.getAli_ser().get(0)).getAccNo_heg());
/*  92 */     int Org_len = Integer.parseInt(((aligment_position_serialize)this.printContent.getAli_ser().get(0)).getAccOrganisationName_len());
/*  93 */     int Org_length = this.printContent.getAccOrganisation().length();
/*  94 */     Org_len = Org_len - Org_length - 1;
/*  95 */     int Org_heg = Integer.parseInt(((aligment_position_serialize)this.printContent.getAli_ser().get(0)).getAccOrganisationName_heg());
/*  96 */     int HolderName_len = Integer.parseInt(((aligment_position_serialize)this.printContent.getAli_ser().get(0)).getAccHolderName_len());
/*  97 */     int HolderName_length = this.printContent.getAccHolderName().length();
/*  98 */     HolderName_len = HolderName_len - HolderName_length - 1;
/*  99 */     int HolderName_heg = Integer.parseInt(((aligment_position_serialize)this.printContent.getAli_ser().get(0)).getAccHolderName_heg());
/* 100 */     int AccType_len = Integer.parseInt(((aligment_position_serialize)this.printContent.getAli_ser().get(0)).getAccountType_len());
/* 101 */     int AccType_length = this.printContent.getAccountType().length();
/* 102 */     AccType_len = AccType_len - AccType_length - 1;
/* 103 */     int AccType_heg = Integer.parseInt(((aligment_position_serialize)this.printContent.getAli_ser().get(0)).getAccountType_heg());
/* 104 */     int micrstart_y = 234;
/* 105 */     int repeart_y = 264;
/* 106 */     int micrstart_imgy = 226;
/*     */     
/* 108 */     g.setFont(f1);
/* 109 */     g.drawString(this.printContent.getSideaddress1(), side_x, side_y);
/* 110 */     g.drawString(this.printContent.getSideaddress2(), side_x, side_y + side_gap);
/* 111 */     g.setFont(f3);
/* 112 */     g.drawString(this.printContent.getCenteraddress1(), center_x, center_y);
/* 113 */     int center_y1 = center_y + center_gap;
/* 114 */     g.drawString(this.printContent.getCenteraddress2(), center_x, center_y1);
/* 115 */     int center_y2 = center_y1 + center_gap;
/* 116 */     g.drawString(this.printContent.getCenteraddress3(), center_x, center_y2);
/* 117 */     int center_y3 = center_y2 + center_gap;
/* 118 */     g.drawString(this.printContent.getCenteraddress4(), center_x, center_y3);
/* 119 */     g.setFont(f4);
/* 120 */     g.drawString(this.printContent.getAccNo(), Acc_len, Acc_heg);
/* 121 */     g.setFont(f3);
/* 122 */     int newLineCount = Org_heg;
/* 123 */     for (String newLine : this.printContent.getAccOrganisation().split("\n")) {
/* 124 */       g.drawString(newLine, Org_len, newLineCount);
/* 125 */       newLineCount += 10;
/*     */     }
/* 127 */     g.drawString(this.printContent.getAccHolderName(), HolderName_len, HolderName_heg);
/* 128 */     g.setFont(f3);
/* 129 */     g.drawString(this.printContent.getAccountType(), AccType_len, AccType_heg);
/*     */     
/* 131 */     int micr_x4 = micr_x + 77;
/* 132 */     g.setFont(f2);
/* 133 */     int micr_x5 = micr_x4 + 85;
/* 134 */     if (this.printContent.getBankcode() != null) {
/* 135 */       g.drawString(this.printContent.getBankcode(), micr_x4, micrstart_y);
/* 136 */       g.drawImage(img1, micr_x5, micrstart_imgy, 7, 8, null);
/*     */     }
/* 138 */     int micr_x6 = micr_x5 + 12;
/* 139 */     int micr_x7 = micr_x6 + 59;
/* 140 */     if ((this.printContent.getBankcode1() != null) && (this.printContent.getBankcode1().length() > 0)) {
/* 141 */       g.drawString(this.printContent.getBankcode1(), micr_x6, micrstart_y);
/* 142 */       g.drawImage(img, micr_x7, micrstart_imgy, 7, 8, null);
/*     */     }
/* 144 */     int micr_x8 = micr_x7 + 17;
/* 145 */     g.drawString(this.printContent.getBankcode2(), micr_x8, micrstart_y);
/*     */     
/* 147 */     g.setFont(f1);
/* 148 */     int side_y1 = side_y + repeart_y;
/* 149 */     g.drawString(this.printContent.getSideaddress1(), side_x, side_y1);
/* 150 */     g.drawString(this.printContent.getSideaddress2(), side_x, side_y1 + side_gap);
/* 151 */     g.setFont(f3);
/* 152 */     int center_2y = center_y + repeart_y;
/* 153 */     g.drawString(this.printContent.getCenteraddress1(), center_x, center_2y);
/* 154 */     int center_2y1 = center_2y + center_gap;
/* 155 */     g.drawString(this.printContent.getCenteraddress2(), center_x, center_2y1);
/* 156 */     int center_2y2 = center_2y1 + center_gap;
/* 157 */     g.drawString(this.printContent.getCenteraddress3(), center_x, center_2y2);
/* 158 */     int center_2y3 = center_2y2 + center_gap;
/* 159 */     g.drawString(this.printContent.getCenteraddress4(), center_x, center_2y3);
/*     */     
/* 161 */     g.setFont(f4);
/*     */     
/* 163 */     g.drawString(this.printContent.getAccNo(), Acc_len, Acc_heg + repeart_y);
/* 164 */     g.setFont(f3);
/* 165 */     int newLineCount1 = Org_heg + repeart_y;
/* 166 */     for (String newLine : this.printContent.getAccOrganisation().split("\n")) {
/* 167 */       g.drawString(newLine, Org_len, newLineCount1);
/* 168 */       newLineCount1 += 10;
/*     */     }
/*     */     
/* 171 */     g.drawString(this.printContent.getAccHolderName(), HolderName_len, HolderName_heg + repeart_y);
/* 172 */     g.setFont(f3);
/* 173 */     g.drawString(this.printContent.getAccountType(), AccType_len, AccType_heg + repeart_y);
/*     */     
/* 175 */     g.setFont(f2);
/* 176 */     int micrstart_y2 = micrstart_y + repeart_y;
/* 177 */     int micrstart_imgy2 = micrstart_imgy + repeart_y;
/* 178 */     if (this.printContent.getBankcode() != null) {
/* 179 */       g.drawString(this.printContent.getBankcode(), micr_x4, micrstart_y2);
/* 180 */       g.drawImage(img1, micr_x5, micrstart_imgy2, 7, 8, null);
/*     */     }
/* 182 */     if ((this.printContent.getBankcode1() != null) && (this.printContent.getBankcode1().length() > 0)) {
/* 183 */       g.drawString(this.printContent.getBankcode1(), micr_x6, micrstart_y2);
/* 184 */       g.drawImage(img, micr_x7, micrstart_imgy2, 7, 8, null);
/*     */     }
/* 186 */     g.drawString(this.printContent.getBankcode2(), micr_x8, micrstart_y2);
/*     */     
/* 188 */     g.setFont(f1);
/* 189 */     int side_y2 = side_y1 + repeart_y;
/* 190 */     g.drawString(this.printContent.getSideaddress1(), side_x, side_y2);
/* 191 */     g.drawString(this.printContent.getSideaddress2(), side_x, side_y2 + side_gap);
/* 192 */     g.setFont(f3);
/* 193 */     int center_3y = center_2y + repeart_y;
/* 194 */     g.drawString(this.printContent.getCenteraddress1(), center_x, center_3y);
/* 195 */     int center_3y1 = center_3y + center_gap;
/* 196 */     g.drawString(this.printContent.getCenteraddress2(), center_x, center_3y1);
/* 197 */     int center_3y2 = center_3y1 + center_gap;
/* 198 */     g.drawString(this.printContent.getCenteraddress3(), center_x, center_3y2);
/* 199 */     int center_3y3 = center_3y2 + center_gap;
/* 200 */     g.drawString(this.printContent.getCenteraddress4(), center_x, center_3y3);
/*     */     
/* 202 */     g.setFont(f4);
/* 203 */     g.drawString(this.printContent.getAccNo(), Acc_len, Acc_heg + repeart_y * 2);
/* 204 */     g.setFont(f3);
/* 205 */     int newLineCount2 = Org_heg + repeart_y * 2;
/* 206 */     for (String newLine : this.printContent.getAccOrganisation().split("\n")) {
/* 207 */       g.drawString(newLine, Org_len, newLineCount2);
/* 208 */       newLineCount2 += 10;
/*     */     }
/* 210 */     g.drawString(this.printContent.getAccHolderName(), HolderName_len, HolderName_heg + repeart_y * 2);
/* 211 */     g.setFont(f3);
/* 212 */     g.drawString(this.printContent.getAccountType(), AccType_len, AccType_heg + repeart_y * 2);
/*     */     
/* 214 */     g.setFont(f2);
/* 215 */     int micrstart_y3 = micrstart_y2 + repeart_y;
/* 216 */     int micrstart_imgy3 = micrstart_imgy2 + repeart_y;
/* 217 */     if (this.printContent.getBankcode() != null) {
/* 218 */       g.drawString(this.printContent.getBankcode(), micr_x4, micrstart_y3);
/* 219 */       g.drawImage(img1, micr_x5, micrstart_imgy3, 7, 8, null);
/*     */     }
/* 221 */     if ((this.printContent.getBankcode1() != null) && (this.printContent.getBankcode1().length() > 0)) {
/* 222 */       g.drawString(this.printContent.getBankcode1(), micr_x6, micrstart_y3);
/* 223 */       g.drawImage(img, micr_x7, micrstart_imgy3, 7, 8, null);
/*     */     }
/* 225 */     g.drawString(this.printContent.getBankcode2(), micr_x8, micrstart_y3);
/*     */     
/* 227 */     int start = pageindex == 0 ? 0 : this.pagebreak[(pageindex - 1)];
/* 228 */     int end = pageindex == this.pagebreak.length ? this.value.length : this.pagebreak[pageindex];
/* 229 */     g.setFont(f2);
/*     */     
/* 231 */     for (int line = start; line < end; line++) {
/* 232 */       g.drawImage(img, micr_x, micrstart_imgy, 7, 8, null);
/* 233 */       int micr_x1 = micr_x + 6;
/* 234 */       g.drawString("" + String.format("%06d", new Object[] { Integer.valueOf(this.value[line]) }), micr_x1, micrstart_y);
/* 235 */       int micr_x2 = micr_x1 + 57;
/* 236 */       g.drawImage(img, micr_x2, micrstart_imgy, 7, 8, null);
/* 237 */       micrstart_imgy += 264;
/* 238 */       micrstart_y += 264;
/*     */     }
/* 240 */     return 0;
/*     */   }
/*     */ }


/* Location:              F:\MICR Printing\dist\checknoprint.jar!\checknoprint\base\PrintableModel\PrintDirectCheque.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */