
package appsparkir;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class DBHelper {
    //String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    String DB_URL = "jdbc:mysql://localhost/apsparkir";
    String USER = "root";
    String PASS = "";
    Connection koneksi;
    Statement stmt;
    DataMobil i = new DataMobil();
    String sql = i.QInput();
    String sql2 = i.QInputBT();
    String sql3 = i.QInputMT();
    String getData1 = i.QOutputMB();
    String getData2 = i.QOutputBT();
    String getData3 = i.QOutputMT();
    String upData1 = i.QUpdateMB();
    String upData2 = i.QUpdateBT();
    String upData3 = i.QUpdateMT();
    public void addMobilMasuk(String sql) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = DriverManager.getConnection(DB_URL, USER, PASS);
            String query = sql;
            stmt = koneksi.createStatement();
            stmt.executeUpdate(query);
            stmt.close();
            koneksi.close();
             JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Driver Tidak Ditemukan");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data gagal ditambahkan");
        }
    }
    public void addMobilBesarMasuk(String sql2) {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = koneksi.createStatement();
            stmt.executeUpdate(sql2);
            stmt.close();
            koneksi.close();
             JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Driver Tidak Ditemukan");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data gagal ditambahkan");
        }
    }
    public void addMotor(String sql3) {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = koneksi.createStatement();
            stmt.executeUpdate(sql3);
            stmt.close();
            koneksi.close();
             JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Driver Tidak Ditemukan");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data gagal ditambahkan");
        }
    }
     public String[][] getDataMobil() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = DriverManager.getConnection(DB_URL, USER, PASS);
            String query = getData1;
            stmt = koneksi.createStatement();

            ResultSet hasilQuery = stmt.executeQuery(query);
            String[][] data = new String[500][8];
            int i = 0;
            while (hasilQuery.next()) {
                data[i][0] = hasilQuery.getString("no_tiket");
                data[i][1] = hasilQuery.getString("nopol");
                data[i][2] = hasilQuery.getString("tgl");
                data[i][3] = hasilQuery.getString("jam_masuk");
                data[i][4] = hasilQuery.getString("jam_Keluar");
                data[i][5] = hasilQuery.getString("tarif");
                i++;
            }

            koneksi.close();
            stmt.close();
            hasilQuery.close();
            return data;
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return null;
    }
      public String[][] getDataMobilBesar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = DriverManager.getConnection(DB_URL, USER, PASS);
            String query = getData2;
            stmt = koneksi.createStatement();

            ResultSet hasilQuery = stmt.executeQuery(query);
            String[][] data = new String[500][8];
            int i = 0;
            while (hasilQuery.next()) {
                data[i][0] = hasilQuery.getString("no_tiket");
                data[i][1] = hasilQuery.getString("nopol");
                data[i][2] = hasilQuery.getString("tgl");
                data[i][3] = hasilQuery.getString("jam_masuk");
                data[i][4] = hasilQuery.getString("jam_Keluar");
                data[i][5] = hasilQuery.getString("tarif");
                i++;
            }

            koneksi.close();
            stmt.close();
            hasilQuery.close();
            return data;
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return null;
    }
      public String[][] getDataMotor() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = DriverManager.getConnection(DB_URL, USER, PASS);
            String query = getData3;
            stmt = koneksi.createStatement();
            ResultSet hasilQuery = stmt.executeQuery(query);
            String[][] data = new String[500][8];
            int i = 0;
            while (hasilQuery.next()) {
                data[i][0] = hasilQuery.getString("no_tiket");
                data[i][1] = hasilQuery.getString("nopol");
                data[i][2] = hasilQuery.getString("tgl");
                data[i][3] = hasilQuery.getString("jam_masuk");
                data[i][4] = hasilQuery.getString("jam_Keluar");
                data[i][5] = hasilQuery.getString("tarif");
                i++;
            }

            koneksi.close();
            stmt.close();
            hasilQuery.close();
            return data;
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return null;
    }
      public void MobilKeluar(String upData1) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = koneksi.createStatement();
            stmt.executeUpdate(upData1);
            stmt.close();
            koneksi.close();
            JOptionPane.showMessageDialog(null, "Tagihan Anda Sebesar Rp. 5.000,-");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Driver Tidak Ditemukan");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,  "data gagal di UPDATE");
        }
    }
      public void BusOrTruckKeluar(String upData2) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = koneksi.createStatement();
            stmt.executeUpdate(upData2);
            stmt.close();
            koneksi.close();
            JOptionPane.showMessageDialog(null, "Tagihan Anda Sebesar Rp. 10.000,-");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Driver Tidak Ditemukan");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,  "data gagal di UPDATE");
        }
    }
      public void motorKeluar(String upData3) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = koneksi.createStatement();
            stmt.executeUpdate(upData3);
            stmt.close();
            koneksi.close();
            JOptionPane.showMessageDialog(null, "Tagihan Anda Sebesar Rp. 2.000,-");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Driver Tidak Ditemukan");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,  "data gagal di UPDATE");
        }
    }
      
     
}
