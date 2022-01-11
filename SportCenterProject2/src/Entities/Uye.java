package Entities;


public class Uye {

private int id;

private String ad;

private String soyad;

private String brans;

private String telNo;


//constructor
    public Uye(int id, String ad, String soyad, String brans, String telNo) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.brans = brans;
        this.telNo = telNo;
    }

//getter and setter (encapsulation)

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }



    
}
