/*     */ package checknoprint;
/*     */ 
/*     */ import java.awt.Font;
/*     */ import java.awt.Graphics;
/*     */ import java.awt.Graphics2D;
/*     */ import java.awt.Image;
/*     */ import java.awt.print.PageFormat;
/*     */ import java.awt.print.Printable;
/*     */ import java.net.URL;
/*     */ import javax.swing.ImageIcon;
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
/*     */ class printpage
/*     */   implements Printable
/*     */ {
/*  24 */   String side_address1 = null;
/*  25 */   String side_address2 = null;
/*  26 */   String center_address1 = null;
/*  27 */   String center_address2 = null;
/*  28 */   String center_address3 = null;
/*  29 */   String center_address4 = null;
/*  30 */   String no_from = null;
/*  31 */   String num_to = null;
/*  32 */   URL urlimage1 = null;
/*  33 */   URL urlimage2 = null;
/*  34 */   String bank_code = null;
/*  35 */   String bank_code1 = null;
/*  36 */   String bank_code2 = null;
/*  37 */   String side_length = null; String side_height = null; String side_space = null; String center_length = null; String center_height = null; String center_space = null; String chequeNum_len = null; String chequeNum_heg = null;
/*     */   int[] value;
/*     */   int[] pagebreak;
/*     */   
/*     */   printpage(String sideaddress1, String sideaddress2, String centeraddress1, String centeraddress2, String centeraddress3, String centeraddress4, String nofrom, String numto, String bankcode, String bankcode1, String bankcode2, String sidelength, String sideheight, String sidespace, String centerlength, String centerheight, String centerspace, String chequeNumlen, String chequeNumheg, URL urlimage1, URL urlimage2) {
/*  42 */     this.side_address1 = sideaddress1;
/*  43 */     this.side_address2 = sideaddress2;
/*  44 */     this.center_address1 = centeraddress1;
/*  45 */     this.center_address2 = centeraddress2;
/*  46 */     this.center_address3 = centeraddress3;
/*  47 */     this.center_address4 = centeraddress4;
/*  48 */     this.no_from = nofrom;
/*  49 */     this.num_to = numto;
/*  50 */     this.bank_code = bankcode;
/*  51 */     this.bank_code1 = bankcode1;
/*  52 */     this.bank_code2 = bankcode2;
/*  53 */     this.side_length = sidelength;
/*  54 */     this.side_height = sideheight;
/*  55 */     this.side_space = sidespace;
/*  56 */     this.center_length = centerlength;
/*  57 */     this.center_height = centerheight;
/*  58 */     this.center_space = centerspace;
/*  59 */     this.chequeNum_len = chequeNumlen;
/*  60 */     this.chequeNum_heg = chequeNumheg;
/*  61 */     this.urlimage1 = urlimage1;
/*  62 */     this.urlimage2 = urlimage2;
/*     */   }
/*     */   
/*     */   public void initprocess() {
/*  66 */     int from = Integer.parseInt(this.no_from);
/*  67 */     int to = Integer.parseInt(this.num_to);
/*  68 */     int value_diff = to - from;
/*  69 */     int loop_end = value_diff + 1;
/*  70 */     this.value = new int[loop_end];
/*     */     
/*     */ 
/*  73 */     for (int i = 0; i < loop_end; i++)
/*     */     {
/*  75 */       this.value[i] = from;
/*     */       
/*  77 */       from += 1;
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public int print(Graphics g, PageFormat pf, int pageindex)
/*     */   {
/*  85 */     initprocess();
/*     */     
/*  87 */     int linesperpage = 3;
/*  88 */     int numbreakes = (this.value.length - 1) / linesperpage;
/*     */     
/*  90 */     this.pagebreak = new int[numbreakes];
/*     */     
/*  92 */     for (int j = 0; j < numbreakes; j++) {
/*  93 */       this.pagebreak[j] = ((j + 1) * linesperpage);
/*     */     }
/*     */     
/*     */ 
/*  97 */     if (pageindex > this.pagebreak.length) {
/*  98 */       return 1;
/*     */     }
/* 100 */     Font f1 = new Font("Arial", 0, 8);
/* 101 */     Font f2 = new Font("MICR", 0, 10);
/* 102 */     Font f3 = new Font("Arial", 1, 8);
/* 103 */     Graphics2D g2d = (Graphics2D)g;
/* 104 */     g2d.translate(pf.getImageableX(), pf.getImageableY());
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 113 */     ImageIcon imgico = new ImageIcon(this.urlimage1);
/* 114 */     ImageIcon imgico1 = new ImageIcon(this.urlimage2);
/* 115 */     Image img = imgico.getImage();
/* 116 */     Image img1 = imgico1.getImage();
/*     */     
/* 118 */     int side_x = 0;int side_y = 0;int center_x = 0;int center_y = 0;int micr_x = 0;int micr_y = 0;
/* 119 */     side_x = Integer.parseInt(this.side_length);
/* 120 */     side_y = Integer.parseInt(this.side_height);
/* 121 */     int side_gap = Integer.parseInt(this.side_space);
/* 122 */     center_x = Integer.parseInt(this.center_length);
/* 123 */     center_y = Integer.parseInt(this.center_height);
/* 124 */     int center_gap = Integer.parseInt(this.center_space);
/* 125 */     micr_x = Integer.parseInt(this.chequeNum_len);
/* 126 */     micr_y = Integer.parseInt(this.chequeNum_heg);
/* 127 */     int micrstart_y = 234;
/* 128 */     int repeart_y = 264;
/* 129 */     int micrstart_imgy = 226;
/*     */     
/* 131 */     g.setFont(f1);
/* 132 */     g.drawString(this.side_address1, side_x, side_y);
/* 133 */     g.drawString(this.side_address2, side_x, side_y + side_gap);
/* 134 */     g.setFont(f3);
/* 135 */     g.drawString(this.center_address1, center_x, center_y);
/* 136 */     int center_y1 = center_y + center_gap;
/* 137 */     g.drawString(this.center_address2, center_x, center_y1);
/* 138 */     int center_y2 = center_y1 + center_gap;
/* 139 */     g.drawString(this.center_address3, center_x, center_y2);
/* 140 */     int center_y3 = center_y2 + center_gap;
/* 141 */     g.drawString(this.center_address4, center_x, center_y3);
/*     */     
/* 143 */     int micr_x4 = micr_x + 77;
/* 144 */     g.setFont(f2);
/* 145 */     g.drawString(this.bank_code, micr_x4, micrstart_y);
/* 146 */     int micr_x5 = micr_x4 + 85;
/* 147 */     g.drawImage(img1, micr_x5, micrstart_imgy, 7, 8, null);
/* 148 */     int micr_x6 = micr_x5 + 12;
/* 149 */     g.drawString(this.bank_code1, micr_x6, micrstart_y);
/* 150 */     int micr_x7 = micr_x6 + 59;
/* 151 */     g.drawImage(img, micr_x7, micrstart_imgy, 7, 8, null);
/* 152 */     int micr_x8 = micr_x7 + 17;
/* 153 */     g.drawString(this.bank_code2, micr_x8, micrstart_y);
/*     */     
/* 155 */     g.setFont(f1);
/* 156 */     int side_y1 = side_y + repeart_y;
/* 157 */     g.drawString(this.side_address1, side_x, side_y1);
/* 158 */     g.drawString(this.side_address2, side_x, side_y1 + side_gap);
/* 159 */     g.setFont(f3);
/* 160 */     int center_2y = center_y + repeart_y;
/* 161 */     g.drawString(this.center_address1, center_x, center_2y);
/* 162 */     int center_2y1 = center_2y + center_gap;
/* 163 */     g.drawString(this.center_address2, center_x, center_2y1);
/* 164 */     int center_2y2 = center_2y1 + center_gap;
/* 165 */     g.drawString(this.center_address3, center_x, center_2y2);
/* 166 */     int center_2y3 = center_2y2 + center_gap;
/* 167 */     g.drawString(this.center_address4, center_x, center_2y3);
/*     */     
/* 169 */     g.setFont(f2);
/*     */     
/* 171 */     int micrstart_y2 = micrstart_y + repeart_y;
/* 172 */     int micrstart_imgy2 = micrstart_imgy + repeart_y;
/* 173 */     g.drawString(this.bank_code, micr_x4, micrstart_y2);
/* 174 */     g.drawImage(img1, micr_x5, micrstart_imgy2, 7, 8, null);
/* 175 */     g.drawString(this.bank_code1, micr_x6, micrstart_y2);
/* 176 */     g.drawImage(img, micr_x7, micrstart_imgy2, 7, 8, null);
/* 177 */     g.drawString(this.bank_code2, micr_x8, micrstart_y2);
/*     */     
/* 179 */     g.setFont(f1);
/* 180 */     int side_y2 = side_y1 + repeart_y;
/* 181 */     g.drawString(this.side_address1, side_x, side_y2);
/* 182 */     g.drawString(this.side_address2, side_x, side_y2 + side_gap);
/* 183 */     g.setFont(f3);
/* 184 */     int center_3y = center_2y + repeart_y;
/* 185 */     g.drawString(this.center_address1, center_x, center_3y);
/* 186 */     int center_3y1 = center_3y + center_gap;
/* 187 */     g.drawString(this.center_address2, center_x, center_3y1);
/* 188 */     int center_3y2 = center_3y1 + center_gap;
/* 189 */     g.drawString(this.center_address3, center_x, center_3y2);
/* 190 */     int center_3y3 = center_3y2 + center_gap;
/* 191 */     g.drawString(this.center_address4, center_x, center_3y3);
/*     */     
/* 193 */     g.setFont(f2);
/* 194 */     int micrstart_y3 = micrstart_y2 + repeart_y;
/* 195 */     int micrstart_imgy3 = micrstart_imgy2 + repeart_y;
/* 196 */     g.drawString(this.bank_code, micr_x4, micrstart_y3);
/* 197 */     g.drawImage(img1, micr_x5, micrstart_imgy3, 7, 8, null);
/* 198 */     g.drawString(this.bank_code1, micr_x6, micrstart_y3);
/* 199 */     g.drawImage(img, micr_x7, micrstart_imgy3, 7, 8, null);
/* 200 */     g.drawString(this.bank_code2, micr_x8, micrstart_y3);
/*     */     
/* 202 */     int start = pageindex == 0 ? 0 : this.pagebreak[(pageindex - 1)];
/* 203 */     int end = pageindex == this.pagebreak.length ? this.value.length : this.pagebreak[pageindex];
/*     */     
/*     */ 
/* 206 */     g.setFont(f2);
/*     */     
/* 208 */     for (int line = start; line < end; line++) {
/* 209 */       g.drawImage(img, micr_x, micrstart_imgy, 7, 8, null);
/* 210 */       int micr_x1 = micr_x + 6;
/* 211 */       g.drawString("" + String.format("%06d", new Object[] { Integer.valueOf(this.value[line]) }), micr_x1, micrstart_y);
/* 212 */       int micr_x2 = micr_x1 + 57;
/* 213 */       g.drawImage(img, micr_x2, micrstart_imgy, 7, 8, null);
/*     */       
/* 215 */       micrstart_imgy += 264;
/* 216 */       micrstart_y += 264;
/*     */     }
/* 218 */     return 0;
/*     */   }
/*     */ }


/* Location:              F:\MICR Printing\dist\checknoprint.jar!\checknoprint\printpage.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */