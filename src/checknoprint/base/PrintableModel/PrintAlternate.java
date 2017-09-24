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
/*     */ 
/*     */ public class PrintAlternate
/*     */   implements Printable
/*     */ {
/*     */   private final List<PrintingContent> printingContentList;
/*     */   private PrintingContent printContent;
/*     */   
/*     */   public PrintAlternate(List<PrintingContent> printingContentList)
/*     */   {
/*  30 */     this.printingContentList = printingContentList;
/*     */   }
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
/*     */   public int print(Graphics g, PageFormat pf, int pageIndex)
/*     */     throws PrinterException
/*     */   {
/*     */     try
/*     */     {
/*  90 */       if (pageIndex > 0) {
/*  91 */         return 1;
/*     */       }
/*  93 */       this.printContent = (this.printingContentList.get(0) != null ? (PrintingContent)this.printingContentList.get(0) : null);
/*  94 */       if (this.printContent == null) {
/*  95 */         throw new RuntimeException("Can't Take print out because print Content is null");
/*     */       }
/*     */       
/*  98 */       Font f1 = new Font("Arial", 0, 8);
/*  99 */       Font f2 = new Font("MICR", 0, 10);
/* 100 */       Font f3 = new Font("Arial", 1, 8);
/* 101 */       Font f4 = new Font("Arial", 1, 11);
/* 102 */       Graphics2D g2d = (Graphics2D)g;
/* 103 */       g2d.translate(pf.getImageableX(), pf.getImageableY());
/*     */       
/*     */ 
/*     */ 
/* 107 */       ImageIcon imgico = new ImageIcon(this.printContent.getUrlimage1());
/* 108 */       ImageIcon imgico1 = new ImageIcon(this.printContent.getUrlimage2());
/* 109 */       Image img = imgico.getImage();
/* 110 */       Image img1 = imgico1.getImage();
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 115 */       int side_x = 0;int side_y = 0;int center_x = 0;int center_y = 0;int micr_x = 0;int micr_y = 0;int Acc_len = 0;
/* 116 */       if (this.printContent.getAli_ser().get(0) == null) {
/* 117 */         throw new RuntimeException("Alignment size is null print content of 0th Alignment");
/*     */       }
/* 119 */       side_x = Integer.parseInt(((aligment_position_serialize)this.printContent.getAli_ser().get(0)).getSd_Addr_leg11());
/* 120 */       side_y = Integer.parseInt(((aligment_position_serialize)this.printContent.getAli_ser().get(0)).getSd_Addr_heg12());
/* 121 */       int side_gap = Integer.parseInt(((aligment_position_serialize)this.printContent.getAli_ser().get(0)).getSd_Addr_spa13());
/* 122 */       center_x = Integer.parseInt(((aligment_position_serialize)this.printContent.getAli_ser().get(0)).getCn_Addr_leg11());
/* 123 */       center_y = Integer.parseInt(((aligment_position_serialize)this.printContent.getAli_ser().get(0)).getCn_Addr_heg12());
/* 124 */       int center_gap = Integer.parseInt(((aligment_position_serialize)this.printContent.getAli_ser().get(0)).getCn_Addr_spa123());
/* 125 */       micr_x = Integer.parseInt(((aligment_position_serialize)this.printContent.getAli_ser().get(0)).getChequenum_len11());
/* 126 */       micr_y = Integer.parseInt(((aligment_position_serialize)this.printContent.getAli_ser().get(0)).getChequenum_heg12());
/* 127 */       Acc_len = Integer.parseInt(((aligment_position_serialize)this.printContent.getAli_ser().get(0)).getAccNo_len());
/* 128 */       int Acc_heg = Integer.parseInt(((aligment_position_serialize)this.printContent.getAli_ser().get(0)).getAccNo_heg());
/* 129 */       int Org_len = Integer.parseInt(((aligment_position_serialize)this.printContent.getAli_ser().get(0)).getAccOrganisationName_len());
/* 130 */       int Org_length = this.printContent.getAccOrganisation().length();
/* 131 */       Org_len = Org_len - Org_length - 1;
/* 132 */       int Org_heg = Integer.parseInt(((aligment_position_serialize)this.printContent.getAli_ser().get(0)).getAccOrganisationName_heg());
/* 133 */       int HolderName_len = Integer.parseInt(((aligment_position_serialize)this.printContent.getAli_ser().get(0)).getAccHolderName_len());
/* 134 */       int HolderName_length = this.printContent.getAccHolderName().length();
/* 135 */       HolderName_len = HolderName_len - HolderName_length - 1;
/* 136 */       int HolderName_heg = Integer.parseInt(((aligment_position_serialize)this.printContent.getAli_ser().get(0)).getAccHolderName_heg());
/* 137 */       int AccType_len = Integer.parseInt(((aligment_position_serialize)this.printContent.getAli_ser().get(0)).getAccountType_len());
/* 138 */       int AccType_length = this.printContent.getAccountType().length();
/* 139 */       AccType_len = AccType_len - AccType_length - 1;
/* 140 */       int AccType_heg = Integer.parseInt(((aligment_position_serialize)this.printContent.getAli_ser().get(0)).getAccountType_heg());
/* 141 */       int micrstart_y = 234;
/* 142 */       int repeart_y = 264;
/* 143 */       int micrstart_imgy = 226;
/*     */       
/* 145 */       g.setFont(f1);
/* 146 */       g.drawString(this.printContent.getSideaddress1(), side_x, side_y);
/* 147 */       g.drawString(this.printContent.getSideaddress2(), side_x, side_y + side_gap);
/* 148 */       g.setFont(f3);
/* 149 */       g.drawString(this.printContent.getCenteraddress1(), center_x, center_y);
/* 150 */       int center_y1 = center_y + center_gap;
/* 151 */       g.drawString(this.printContent.getCenteraddress2(), center_x, center_y1);
/* 152 */       int center_y2 = center_y1 + center_gap;
/* 153 */       g.drawString(this.printContent.getCenteraddress3(), center_x, center_y2);
/* 154 */       int center_y3 = center_y2 + center_gap;
/* 155 */       g.drawString(this.printContent.getCenteraddress4(), center_x, center_y3);
/* 156 */       g.setFont(f4);
/* 157 */       g.drawString(this.printContent.getAccNo(), Acc_len, Acc_heg);
/* 158 */       g.setFont(f3);
/* 159 */       g.drawString(this.printContent.getAccOrganisation(), Org_len, Org_heg);
/* 160 */       g.drawString(this.printContent.getAccHolderName(), HolderName_len, HolderName_heg);
/* 161 */       g.setFont(f3);
/* 162 */       g.drawString(this.printContent.getAccountType(), AccType_len, AccType_heg);
/*     */       
/* 164 */       int micr_x4 = micr_x + 77;
/* 165 */       g.setFont(f2);
/* 166 */       g.drawImage(img, micr_x, micrstart_imgy, 7, 8, null);
/* 167 */       int micr_x1 = micr_x + 6;
/* 168 */       g.drawString(this.printContent.getFirstMicr(), micr_x1, micrstart_y);
/* 169 */       int micr_x2 = micr_x1 + 57;
/* 170 */       g.drawImage(img, micr_x2, micrstart_imgy, 7, 8, null);
/*     */       
/* 172 */       g.drawString(this.printContent.getBankcode(), micr_x4, micrstart_y);
/* 173 */       int micr_x5 = micr_x4 + 85;
/* 174 */       g.drawImage(img1, micr_x5, micrstart_imgy, 7, 8, null);
/* 175 */       int micr_x6 = micr_x5 + 12;
/* 176 */       int micr_x7 = micr_x6 + 59;
/* 177 */       if ((this.printContent.getBankcode1() != null) && (this.printContent.getBankcode1().length() > 0))
/*     */       {
/* 179 */         g.drawString(this.printContent.getBankcode1(), micr_x6, micrstart_y);
/* 180 */         g.drawImage(img, micr_x7, micrstart_imgy, 7, 8, null);
/*     */       }
/* 182 */       int micr_x8 = micr_x7 + 17;
/* 183 */       g.drawString(this.printContent.getBankcode2(), micr_x8, micrstart_y);
/*     */       
/*     */ 
/* 186 */       this.printContent = ((PrintingContent)this.printingContentList.get(1));
/* 187 */       g.setFont(f1);
/* 188 */       int side_y1 = side_y + repeart_y;
/* 189 */       g.drawString(this.printContent.getSideaddress1(), side_x, side_y1);
/* 190 */       g.drawString(this.printContent.getSideaddress2(), side_x, side_y1 + side_gap);
/* 191 */       g.setFont(f3);
/* 192 */       int center_2y = center_y + repeart_y;
/* 193 */       g.drawString(this.printContent.getCenteraddress1(), center_x, center_2y);
/* 194 */       int center_2y1 = center_2y + center_gap;
/* 195 */       g.drawString(this.printContent.getCenteraddress2(), center_x, center_2y1);
/* 196 */       int center_2y2 = center_2y1 + center_gap;
/* 197 */       g.drawString(this.printContent.getCenteraddress3(), center_x, center_2y2);
/* 198 */       int center_2y3 = center_2y2 + center_gap;
/* 199 */       g.drawString(this.printContent.getCenteraddress4(), center_x, center_2y3);
/* 200 */       g.setFont(f4);
/* 201 */       g.drawString(this.printContent.getAccNo(), Acc_len, Acc_heg + repeart_y);
/* 202 */       g.setFont(f3);
/* 203 */       g.drawString(this.printContent.getAccOrganisation(), Org_len, Org_heg + repeart_y);
/* 204 */       g.drawString(this.printContent.getAccHolderName(), HolderName_len, HolderName_heg + repeart_y);
/* 205 */       g.setFont(f3);
/* 206 */       g.drawString(this.printContent.getAccountType(), AccType_len, AccType_heg + repeart_y);
/*     */       
/* 208 */       g.setFont(f2);
/*     */       
/*     */ 
/* 211 */       int micrstart_y2 = micrstart_y + repeart_y;
/* 212 */       int micrstart_imgy2 = micrstart_imgy + repeart_y;
/*     */       
/* 214 */       g.drawImage(img, micr_x, micrstart_imgy2, 7, 8, null);
/* 215 */       g.drawString(this.printContent.getFirstMicr(), micr_x1, micrstart_y2);
/* 216 */       g.drawImage(img, micr_x2, micrstart_imgy2, 7, 8, null);
/* 217 */       g.drawString(this.printContent.getBankcode(), micr_x4, micrstart_y2);
/* 218 */       g.drawImage(img1, micr_x5, micrstart_imgy2, 7, 8, null);
/* 219 */       if ((this.printContent.getBankcode1() != null) && (this.printContent.getBankcode1().length() > 0)) {
/* 220 */         g.drawString(this.printContent.getBankcode1(), micr_x6, micrstart_y2);
/* 221 */         g.drawImage(img, micr_x7, micrstart_imgy2, 7, 8, null);
/*     */       }
/* 223 */       g.drawString(this.printContent.getBankcode2(), micr_x8, micrstart_y2);
/*     */       
/*     */ 
/* 226 */       this.printContent = ((PrintingContent)this.printingContentList.get(2));
/* 227 */       g.setFont(f1);
/* 228 */       int side_y2 = side_y1 + repeart_y;
/* 229 */       g.drawString(this.printContent.getSideaddress1(), side_x, side_y2);
/* 230 */       g.drawString(this.printContent.getSideaddress2(), side_x, side_y2 + side_gap);
/* 231 */       g.setFont(f3);
/* 232 */       int center_3y = center_2y + repeart_y;
/* 233 */       g.drawString(this.printContent.getCenteraddress1(), center_x, center_3y);
/* 234 */       int center_3y1 = center_3y + center_gap;
/* 235 */       g.drawString(this.printContent.getCenteraddress2(), center_x, center_3y1);
/* 236 */       int center_3y2 = center_3y1 + center_gap;
/* 237 */       g.drawString(this.printContent.getCenteraddress3(), center_x, center_3y2);
/* 238 */       int center_3y3 = center_3y2 + center_gap;
/* 239 */       g.drawString(this.printContent.getCenteraddress4(), center_x, center_3y3);
/* 240 */       g.setFont(f4);
/* 241 */       g.drawString(this.printContent.getAccNo(), Acc_len, Acc_heg + repeart_y * 2);
/* 242 */       g.setFont(f3);
/* 243 */       g.drawString(this.printContent.getAccOrganisation(), Org_len, Org_heg + repeart_y * 2);
/* 244 */       g.drawString(this.printContent.getAccHolderName(), HolderName_len, HolderName_heg + repeart_y * 2);
/* 245 */       g.setFont(f3);
/* 246 */       g.drawString(this.printContent.getAccountType(), AccType_len, AccType_heg + repeart_y * 2);
/*     */       
/* 248 */       g.setFont(f2);
/* 249 */       int micrstart_y3 = micrstart_y2 + repeart_y;
/* 250 */       int micrstart_imgy3 = micrstart_imgy2 + repeart_y;
/*     */       
/* 252 */       g.drawImage(img, micr_x, micrstart_imgy3, 7, 8, null);
/* 253 */       g.drawString(this.printContent.getFirstMicr(), micr_x1, micrstart_y3);
/* 254 */       g.drawImage(img, micr_x2, micrstart_imgy3, 7, 8, null);
/*     */       
/* 256 */       g.drawString(this.printContent.getBankcode(), micr_x4, micrstart_y3);
/* 257 */       g.drawImage(img1, micr_x5, micrstart_imgy3, 7, 8, null);
/* 258 */       if ((this.printContent.getBankcode1() != null) && (this.printContent.getBankcode1().length() > 0)) {
/* 259 */         g.drawString(this.printContent.getBankcode2(), micr_x6, micrstart_y3);
/* 260 */         g.drawImage(img, micr_x7, micrstart_imgy3, 7, 8, null);
/*     */       }
/* 262 */       g.drawString(this.printContent.getBankcode2(), micr_x8, micrstart_y3);
/*     */     } catch (RuntimeException e) {
/* 264 */       System.out.println("Error on PrintAlternate page===" + e.getMessage());
/*     */     }
/* 266 */     return 0;
/*     */   }
/*     */ }


/* Location:              F:\MICR Printing\dist\checknoprint.jar!\checknoprint\base\PrintableModel\PrintAlternate.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */