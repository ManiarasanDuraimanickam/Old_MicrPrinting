/*     */ package checknoprint.base.Model;
/*     */ 
/*     */ import checknoprint.aligment_position_serialize;
/*     */ import java.net.URL;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
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
/*     */ public class PrintingContent
/*     */ {
/*     */   public String getFirstMicr()
/*     */   {
/*  22 */     return this.FirstMicr;
/*     */   }
/*     */   
/*     */   public void setFirstMicr(String FirstMicr) {
/*  26 */     this.FirstMicr = FirstMicr;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*  32 */   private List<aligment_position_serialize> ali_ser = new ArrayList();
/*  33 */   private URL urlimage1 = null;
/*  34 */   private URL urlimage2 = null;
/*     */   
/*  36 */   private String sideaddress1 = null;
/*  37 */   private String sideaddress2 = null;
/*  38 */   private String centeraddress1 = null;
/*  39 */   private String centeraddress2 = null;
/*  40 */   private String centeraddress3 = null;
/*  41 */   private String centeraddress4 = null;
/*  42 */   private String nofrom = null;
/*  43 */   private String numto = null;
/*  44 */   private String bankcode = null;
/*  45 */   private String bankcode1 = null;
/*  46 */   private String bankcode2 = null;
/*  47 */   private String accNo = null;
/*  48 */   private String accHolderName = null;
/*  49 */   private String accOrganisation = null;
/*  50 */   private String AccountType = null;
/*  51 */   private String FirstMicr = null;
/*     */   
/*     */   public String getSideaddress1()
/*     */   {
/*  55 */     return this.sideaddress1;
/*     */   }
/*     */   
/*     */   public void setSideaddress1(String sideaddress1) {
/*  59 */     this.sideaddress1 = sideaddress1;
/*     */   }
/*     */   
/*     */   public String getSideaddress2() {
/*  63 */     return this.sideaddress2;
/*     */   }
/*     */   
/*     */   public void setSideaddress2(String sideaddress2) {
/*  67 */     this.sideaddress2 = sideaddress2;
/*     */   }
/*     */   
/*     */   public String getCenteraddress1() {
/*  71 */     return this.centeraddress1;
/*     */   }
/*     */   
/*     */   public void setCenteraddress1(String centeraddress1) {
/*  75 */     this.centeraddress1 = centeraddress1;
/*     */   }
/*     */   
/*     */   public String getCenteraddress2() {
/*  79 */     return this.centeraddress2;
/*     */   }
/*     */   
/*     */   public void setCenteraddress2(String centeraddress2) {
/*  83 */     this.centeraddress2 = centeraddress2;
/*     */   }
/*     */   
/*     */   public String getCenteraddress3() {
/*  87 */     return this.centeraddress3;
/*     */   }
/*     */   
/*     */   public void setCenteraddress3(String centeraddress3) {
/*  91 */     this.centeraddress3 = centeraddress3;
/*     */   }
/*     */   
/*     */   public String getCenteraddress4() {
/*  95 */     return this.centeraddress4;
/*     */   }
/*     */   
/*     */   public void setCenteraddress4(String centeraddress4) {
/*  99 */     this.centeraddress4 = centeraddress4;
/*     */   }
/*     */   
/*     */   public String getNofrom() {
/* 103 */     return this.nofrom;
/*     */   }
/*     */   
/*     */   public void setNofrom(String nofrom) {
/* 107 */     this.nofrom = nofrom;
/*     */   }
/*     */   
/*     */   public String getNumto() {
/* 111 */     return this.numto;
/*     */   }
/*     */   
/*     */   public void setNumto(String numto) {
/* 115 */     this.numto = numto;
/*     */   }
/*     */   
/*     */   public String getBankcode() {
/* 119 */     return this.bankcode;
/*     */   }
/*     */   
/*     */   public void setBankcode(String bankcode) {
/* 123 */     this.bankcode = bankcode;
/*     */   }
/*     */   
/*     */   public String getBankcode1() {
/* 127 */     return this.bankcode1;
/*     */   }
/*     */   
/*     */   public void setBankcode1(String bankcode1) {
/* 131 */     this.bankcode1 = bankcode1;
/*     */   }
/*     */   
/*     */   public String getBankcode2() {
/* 135 */     return this.bankcode2;
/*     */   }
/*     */   
/*     */   public void setBankcode2(String bankcode2) {
/* 139 */     this.bankcode2 = bankcode2;
/*     */   }
/*     */   
/*     */   public String getAccNo() {
/* 143 */     return this.accNo;
/*     */   }
/*     */   
/*     */   public void setAccNo(String accNo) {
/* 147 */     this.accNo = accNo;
/*     */   }
/*     */   
/*     */   public String getAccHolderName() {
/* 151 */     return this.accHolderName;
/*     */   }
/*     */   
/*     */   public void setAccHolderName(String accHolderName) {
/* 155 */     this.accHolderName = accHolderName;
/*     */   }
/*     */   
/*     */   public String getAccOrganisation() {
/* 159 */     return this.accOrganisation;
/*     */   }
/*     */   
/*     */   public void setAccOrganisation(String accOrganisation) {
/* 163 */     this.accOrganisation = accOrganisation;
/*     */   }
/*     */   
/*     */   public String getAccountType() {
/* 167 */     return this.AccountType;
/*     */   }
/*     */   
/*     */   public void setAccountType(String AccountType) {
/* 171 */     this.AccountType = AccountType;
/*     */   }
/*     */   
/*     */   public URL getUrlimage1() {
/* 175 */     return this.urlimage1;
/*     */   }
/*     */   
/*     */   public void setUrlimage1(URL urlimage1) {
/* 179 */     this.urlimage1 = urlimage1;
/*     */   }
/*     */   
/*     */   public URL getUrlimage2() {
/* 183 */     return this.urlimage2;
/*     */   }
/*     */   
/*     */   public void setUrlimage2(URL urlimage2) {
/* 187 */     this.urlimage2 = urlimage2;
/*     */   }
/*     */   
/*     */   public List<aligment_position_serialize> getAli_ser() {
/* 191 */     return this.ali_ser;
/*     */   }
/*     */   
/*     */   public void setAli_ser(List<aligment_position_serialize> ali_ser) {
/* 195 */     this.ali_ser = ali_ser;
/*     */   }
/*     */ }


/* Location:              F:\MICR Printing\dist\checknoprint.jar!\checknoprint\base\Model\PrintingContent.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */