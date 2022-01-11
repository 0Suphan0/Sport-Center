package Operations;

import Database.Database;
import Entities.PartTimeEgitmen;
import Entities.Uye;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DatabaseIslemleri {

    private Connection con = null;

    private Statement statement = null;

    private PreparedStatement preparedStatement = null;

    //Eğitmen DB baslat.
    ArrayList<PartTimeEgitmen> egitmenler =null;

    public DatabaseIslemleri() {
        egitmenler=new ArrayList<>();
        //"jdbc:mysql://localhost:3306/demo
        String url = "jdbc:mysql://" + Database.host + ":" + Database.port + "/" + Database.db_ismi + "?useUnicode=true&characterEncoding=utf8";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver bulunamadı..");
        }

        try {
            con = DriverManager.getConnection(url, Database.kullanici_adi, Database.parola);
            System.out.println("Bağlantı başarılı.");
        } catch (SQLException e) {
            System.out.println("Bağlantı başarısız..");
        }

    }

    public boolean girisYap(String kullaniciAdi, String parola) {

// sql sorugusu
        String sorgu = "Select * From adminler where username=? and password=?";

        try {

            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, kullaniciAdi);
            preparedStatement.setString(2, parola);
            //girilen kullanıcı adı ve parola varsa rs ye atar.
            ResultSet rs = preparedStatement.executeQuery();

            // eğer değer yoksa kayıtlı değil false varsa true
            if (rs.next() == false) {

                return false;

            } else {

                return true;

            }

        } catch (SQLException ex) {
            System.out.println(ex);
            return false;

        }

    }

//Tüm üyeleri getirme metodu
    public ArrayList<Uye> uyeleriGetir() {

//gecici olarak tuttuğumuz array list return edeceğimiz arraylist...
        ArrayList<Uye> gecici = new ArrayList<>();

//databaseden tüm verileri almak...
        try {

            String sorgu = "Select * From uyeler";

            preparedStatement = con.prepareStatement(sorgu);

            ResultSet rs = preparedStatement.executeQuery();

            //bitene kadar dön
            while (rs.next()) {

                int id = rs.getInt("id");
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String brans = rs.getString("brans");
                String telefon = rs.getString("telefon");

                // gecici array listemizi doldurmak.. (Uye referansıyla)
                gecici.add(new Uye(id, ad, soyad, brans, telefon));

            }

//listeyi dön
            return gecici;

        } catch (SQLException e) {
            //hata olursa null dön...
            return null;
        }

    }

    /**
     *
     * @param ad
     * @param soyad
     * @param brans
     * @param telefon
     */
    public void uyeEkle(String ad, String soyad, String brans, String telefon) {

        try {
            String query = "INSERT INTO uyeler (ad,soyad,brans,telefon) VALUES (?,?,?,?)";

            preparedStatement = con.prepareStatement(query);

            preparedStatement.setString(1, ad);
            preparedStatement.setString(2, soyad);
            preparedStatement.setString(3, brans);
            preparedStatement.setString(4, telefon);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
        }

    }

    public void uyeGuncelle(int id, String ad, String soyad, String brans, String telefon) {

        try {
            String query = "UPDATE uyeler SET ad=? , soyad=? , brans=? , telefon=? where id=? ";
            preparedStatement = con.prepareStatement(query);
            preparedStatement.setString(1, ad);
            preparedStatement.setString(2, soyad);
            preparedStatement.setString(3, brans);
            preparedStatement.setString(4, telefon);
            //idsi istediğim olan değerde bu işlemleri yap..
            preparedStatement.setInt(5, id);

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
        }

    }

    public void uyeSil(int id) {

        try {

            String sorgu = "Delete From uyeler where id=?";

            preparedStatement = con.prepareStatement(sorgu);

            preparedStatement.setInt(1, id);

            preparedStatement.execute();

        } catch (SQLException e) {

        }

    }

    public void egitmenEkle(String adi, String soyAdi, String calismaSaati, String telefonNo) {

        egitmenler.add(new PartTimeEgitmen(adi, soyAdi, calismaSaati, telefonNo));

    }

    public ArrayList<PartTimeEgitmen> egitmenGetir() {
        
        return egitmenler;
    }

}
