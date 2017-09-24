/*     */ package checknoprint;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class aligment_position_serialize
/*     */   implements Serializable
/*     */ {
/*  15 */   private static long serialVersionUID = 1L;
/*     */   
/*     */   private String _sd_Addr_leg11;
/*     */   
/*     */   private String _sd_Addr_heg12;
/*     */   
/*     */   private String _sd_Addr_spa13;
/*     */   
/*     */   private String _cn_Addr_leg11;
/*     */   
/*     */   private String _cn_Addr_heg12;
/*     */   
/*     */   private String _cn_Addr_spa123;
/*     */   
/*     */   private String _chquenum_img_leg11;
/*     */   
/*     */   private String _chequenum_img_heg12;
/*     */   
/*     */   private String _chequenum_len11;
/*     */   
/*     */   private String _chequenum_heg12;
/*     */   
/*     */   private String _chequenum_img2_len11;
/*     */   
/*     */   private String _chequenum_img2_heg12;
/*     */   
/*     */   private String _bankcode_9dig_len11;
/*     */   
/*     */   private String _bankcode_9dig_heg12;
/*     */   private String _bankcode_img_len11;
/*     */   private String _bankcode_img_heg12;
/*     */   private String _bankcode_6dig_len11;
/*     */   private String _bankcode_6dig_heg12;
/*     */   private String _bankcode_img2_len11;
/*     */   private String _bankcode_img2_heg12;
/*     */   private String _bankcode_2dig_len11;
/*     */   private String _bankcode_2dig_heg12;
/*     */   private String AccNo_len;
/*     */   private String AccNo_heg;
/*     */   private String AccHolderName_len;
/*     */   private String AccHolderName_heg;
/*     */   private String AccOrganisationName_len;
/*     */   private String AccOrganisationName_heg;
/*     */   private String AccountType_len;
/*     */   private String AccountType_heg;
/*     */   private String orgCharLen;
/*     */   
/*     */   public String getSd_Addr_leg11()
/*     */   {
/*  64 */     return this._sd_Addr_leg11;
/*     */   }
/*     */   
/*     */   public void setSd_Addr_leg11(String sd_Addr_leg11) {
/*  68 */     this._sd_Addr_leg11 = sd_Addr_leg11;
/*     */   }
/*     */   
/*     */   public String getSd_Addr_heg12() {
/*  72 */     return this._sd_Addr_heg12;
/*     */   }
/*     */   
/*     */   public void setSd_Addr_heg12(String sd_Addr_heg12) {
/*  76 */     this._sd_Addr_heg12 = sd_Addr_heg12;
/*     */   }
/*     */   
/*     */   public String getSd_Addr_spa13() {
/*  80 */     return this._sd_Addr_spa13;
/*     */   }
/*     */   
/*     */   public void setSd_Addr_spa13(String sd_Addr_spa13) {
/*  84 */     this._sd_Addr_spa13 = sd_Addr_spa13;
/*     */   }
/*     */   
/*     */   public String getCn_Addr_leg11() {
/*  88 */     return this._cn_Addr_leg11;
/*     */   }
/*     */   
/*     */   public void setCn_Addr_leg11(String cn_Addr_leg11) {
/*  92 */     this._cn_Addr_leg11 = cn_Addr_leg11;
/*     */   }
/*     */   
/*     */   public String getCn_Addr_heg12() {
/*  96 */     return this._cn_Addr_heg12;
/*     */   }
/*     */   
/*     */   public void setCn_Addr_heg12(String cn_Addr_heg12) {
/* 100 */     this._cn_Addr_heg12 = cn_Addr_heg12;
/*     */   }
/*     */   
/*     */   public String getCn_Addr_spa123() {
/* 104 */     return this._cn_Addr_spa123;
/*     */   }
/*     */   
/*     */   public void setCn_Addr_spa123(String cn_Addr_spa123) {
/* 108 */     this._cn_Addr_spa123 = cn_Addr_spa123;
/*     */   }
/*     */   
/*     */   public String getChquenum_img_leg11() {
/* 112 */     return this._chquenum_img_leg11;
/*     */   }
/*     */   
/*     */   public void setChquenum_img_leg11(String chquenum_img_leg11) {
/* 116 */     this._chquenum_img_leg11 = chquenum_img_leg11;
/*     */   }
/*     */   
/*     */   public String getChequenum_img_heg12() {
/* 120 */     return this._chequenum_img_heg12;
/*     */   }
/*     */   
/*     */   public void setChequenum_img_heg12(String chequenum_img_heg12) {
/* 124 */     this._chequenum_img_heg12 = chequenum_img_heg12;
/*     */   }
/*     */   
/*     */   public String getChequenum_len11() {
/* 128 */     return this._chequenum_len11;
/*     */   }
/*     */   
/*     */   public void setChequenum_len11(String chequenum_len11) {
/* 132 */     this._chequenum_len11 = chequenum_len11;
/*     */   }
/*     */   
/*     */   public String getChequenum_heg12() {
/* 136 */     return this._chequenum_heg12;
/*     */   }
/*     */   
/*     */   public void setChequenum_heg12(String chequenum_heg12) {
/* 140 */     this._chequenum_heg12 = chequenum_heg12;
/*     */   }
/*     */   
/*     */   public String getChequenum_img2_len11() {
/* 144 */     return this._chequenum_img2_len11;
/*     */   }
/*     */   
/*     */   public void setChequenum_img2_len11(String chequenum_img2_len11) {
/* 148 */     this._chequenum_img2_len11 = chequenum_img2_len11;
/*     */   }
/*     */   
/*     */   public String getChequenum_img2_heg12() {
/* 152 */     return this._chequenum_img2_heg12;
/*     */   }
/*     */   
/*     */   public void setChequenum_img2_heg12(String chequenum_img2_heg12) {
/* 156 */     this._chequenum_img2_heg12 = chequenum_img2_heg12;
/*     */   }
/*     */   
/*     */   public String getBankcode_9dig_len11() {
/* 160 */     return this._bankcode_9dig_len11;
/*     */   }
/*     */   
/*     */   public void setBankcode_9dig_len11(String bankcode_9dig_len11) {
/* 164 */     this._bankcode_9dig_len11 = bankcode_9dig_len11;
/*     */   }
/*     */   
/*     */   public String getBankcode_9dig_heg12() {
/* 168 */     return this._bankcode_9dig_heg12;
/*     */   }
/*     */   
/*     */   public void setBankcode_9dig_heg12(String bankcode_9dig_heg12) {
/* 172 */     this._bankcode_9dig_heg12 = bankcode_9dig_heg12;
/*     */   }
/*     */   
/*     */   public String getBankcode_img_len11() {
/* 176 */     return this._bankcode_img_len11;
/*     */   }
/*     */   
/*     */   public void setBankcode_img_len11(String bankcode_img_len11) {
/* 180 */     this._bankcode_img_len11 = bankcode_img_len11;
/*     */   }
/*     */   
/*     */   public String getBankcode_img_heg12() {
/* 184 */     return this._bankcode_img_heg12;
/*     */   }
/*     */   
/*     */   public void setBankcode_img_heg12(String bankcode_img_heg12) {
/* 188 */     this._bankcode_img_heg12 = bankcode_img_heg12;
/*     */   }
/*     */   
/*     */   public String getBankcode_6dig_len11() {
/* 192 */     return this._bankcode_6dig_len11;
/*     */   }
/*     */   
/*     */   public void setBankcode_6dig_len11(String bankcode_6dig_len11) {
/* 196 */     this._bankcode_6dig_len11 = bankcode_6dig_len11;
/*     */   }
/*     */   
/*     */   public String getBankcode_6dig_heg12() {
/* 200 */     return this._bankcode_6dig_heg12;
/*     */   }
/*     */   
/*     */   public void setBankcode_6dig_heg12(String bankcode_6dig_heg12) {
/* 204 */     this._bankcode_6dig_heg12 = bankcode_6dig_heg12;
/*     */   }
/*     */   
/*     */   public String getBankcode_img2_len11() {
/* 208 */     return this._bankcode_img2_len11;
/*     */   }
/*     */   
/*     */   public void setBankcode_img2_len11(String bankcode_img2_len11) {
/* 212 */     this._bankcode_img2_len11 = bankcode_img2_len11;
/*     */   }
/*     */   
/*     */   public String getBankcode_img2_heg12() {
/* 216 */     return this._bankcode_img2_heg12;
/*     */   }
/*     */   
/*     */   public void setBankcode_img2_heg12(String bankcode_img2_heg12) {
/* 220 */     this._bankcode_img2_heg12 = bankcode_img2_heg12;
/*     */   }
/*     */   
/*     */   public String getBankcode_2dig_len11() {
/* 224 */     return this._bankcode_2dig_len11;
/*     */   }
/*     */   
/*     */   public void setBankcode_2dig_len11(String bankcode_2dig_len11) {
/* 228 */     this._bankcode_2dig_len11 = bankcode_2dig_len11;
/*     */   }
/*     */   
/*     */   public String getBankcode_2dig_heg12() {
/* 232 */     return this._bankcode_2dig_heg12;
/*     */   }
/*     */   
/*     */   public void setBankcode_2dig_heg12(String bankcode_2dig_heg12) {
/* 236 */     this._bankcode_2dig_heg12 = bankcode_2dig_heg12;
/*     */   }
/*     */   
/*     */   public String getAccNo_len() {
/* 240 */     return this.AccNo_len;
/*     */   }
/*     */   
/*     */   public void setAccNo_len(String AccNo_len) {
/* 244 */     this.AccNo_len = AccNo_len;
/*     */   }
/*     */   
/*     */   public String getAccNo_heg() {
/* 248 */     return this.AccNo_heg;
/*     */   }
/*     */   
/*     */   public void setAccNo_heg(String AccNo_heg) {
/* 252 */     this.AccNo_heg = AccNo_heg;
/*     */   }
/*     */   
/*     */   public String getAccHolderName_len() {
/* 256 */     return this.AccHolderName_len;
/*     */   }
/*     */   
/*     */   public void setAccHolderName_len(String AccHolderName_len) {
/* 260 */     this.AccHolderName_len = AccHolderName_len;
/*     */   }
/*     */   
/*     */   public String getAccHolderName_heg() {
/* 264 */     return this.AccHolderName_heg;
/*     */   }
/*     */   
/*     */   public void setAccHolderName_heg(String AccHolderName_heg) {
/* 268 */     this.AccHolderName_heg = AccHolderName_heg;
/*     */   }
/*     */   
/*     */   public String getAccOrganisationName_len() {
/* 272 */     return this.AccOrganisationName_len;
/*     */   }
/*     */   
/*     */   public void setAccOrganisationName_len(String AccOrganisationName_len) {
/* 276 */     this.AccOrganisationName_len = AccOrganisationName_len;
/*     */   }
/*     */   
/*     */   public String getAccOrganisationName_heg() {
/* 280 */     return this.AccOrganisationName_heg;
/*     */   }
/*     */   
/*     */   public void setAccOrganisationName_heg(String AccOrganisationName_heg) {
/* 284 */     this.AccOrganisationName_heg = AccOrganisationName_heg;
/*     */   }
/*     */   
/*     */   public String getAccountType_len() {
/* 288 */     return this.AccountType_len;
/*     */   }
/*     */   
/*     */   public void setAccountType_len(String AccountType_len) {
/* 292 */     this.AccountType_len = AccountType_len;
/*     */   }
/*     */   
/*     */   public String getAccountType_heg() {
/* 296 */     return this.AccountType_heg;
/*     */   }
/*     */   
/*     */   public void setAccountType_heg(String AccountType_heg) {
/* 300 */     this.AccountType_heg = AccountType_heg;
/*     */   }
/*     */   
/*     */   public String getOrgCharLen() {
/* 304 */     return this.orgCharLen;
/*     */   }
/*     */   
/*     */   public void setOrgCharLen(String orgCharLen) {
/* 308 */     this.orgCharLen = orgCharLen;
/*     */   }
/*     */ }


/* Location:              F:\MICR Printing\dist\checknoprint.jar!\checknoprint\aligment_position_serialize.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */