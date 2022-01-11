/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;


public class PartTimeEgitmen {

  private String adi; 
  
  private String soyAdi;
  
  private String calismaSaati;
  
  private String telelonNo;

    public PartTimeEgitmen(String adi, String soyAdi, String calismaSaati, String telelonNo) {
        this.adi = adi;
        this.soyAdi = soyAdi;
        this.calismaSaati = calismaSaati;
        this.telelonNo = telelonNo;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyAdi() {
        return soyAdi;
    }

    public void setSoyAdi(String soyAdi) {
        this.soyAdi = soyAdi;
    }

    public String getCalismaSaati() {
        return calismaSaati;
    }

    public void setCalismaSaati(String calismaSaati) {
        this.calismaSaati = calismaSaati;
    }

    public String getTelelonNo() {
        return telelonNo;
    }

    public void setTelelonNo(String telelonNo) {
        this.telelonNo = telelonNo;
    }

  
    
}
