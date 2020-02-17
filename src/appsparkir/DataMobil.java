package appsparkir;

public class DataMobil {
    private String No_Tiket, NoPol, Tgl, JamMasuk, JamKeluar;
    private String query, query2, query3;
    private String sqlGetData1, sqlGetData2, sqlGetData3; 
    private String mobilkeluar, mobilbesarkeluar, motorkeluar;
    public void setNoTiket(String No_Tiket){
        this.No_Tiket = No_Tiket;
    }
    private String getNoTiket(){
        return No_Tiket;
    }
    public void setNoPol(String NoPol){
        this.NoPol = NoPol;
    }
    private String getNoPol(){
        return NoPol;
    }
    public void setTGL(String Tgl){
        this.Tgl = Tgl;
    }
    private String getTGL(){
        return Tgl;
    }
    public void setJamMasuk(String JamMasuk){
        this.JamMasuk = JamMasuk;
    }
    private String getJamMasuk(){
        return JamMasuk;
    }
    public void setJamKeluar(String JamKeluar){
        this.JamKeluar = JamKeluar;
    }
    private String getJamKeluar(){
        return JamKeluar;
    }
    public String QInput(){
        query = "insert into mobil values ('"+ getNoTiket() +"','"+ getNoPol() +"','"+ getTGL() +"','"+ getJamMasuk() +"','Baru Masuk','5000')";
        return query;
    }
    public String QInputBT(){
        query2 = "insert into mobilbesar values ('"+ getNoTiket() +"','"+ getNoPol() +"','"+ getTGL() +"','"+ getJamMasuk() +"','Baru Masuk','10000')";
        return query2;
    }
    public String QInputMT(){
        query3 = "insert into motor values ('"+ getNoTiket() +"','"+ getNoPol() +"','"+ getTGL() +"','"+ getJamMasuk() +"','Baru Masuk','2000')";
        return query3;
    }
    public String QOutputMB(){
        sqlGetData1 = "select * from mobil";
        return sqlGetData1;
    }
    public String QOutputBT(){
        sqlGetData2 = "select * from mobilbesar";
        return sqlGetData2;
    }
    public String QOutputMT(){
        sqlGetData3 = "select * from motor";
        return sqlGetData3;
    }
    public String QUpdateMB(){
        mobilkeluar = "UPDATE mobil SET jam_keluar = '"+ getJamKeluar() +"' WHERE nopol = '"+ getNoPol() +"'";
        return mobilkeluar;
    }
    public String QUpdateBT(){
        mobilbesarkeluar = "UPDATE mobilbesar SET jam_keluar = '"+ getJamKeluar() +"' WHERE nopol = '"+ getNoPol() +"'";
        return mobilbesarkeluar;
    }
    public String QUpdateMT(){
        motorkeluar = "UPDATE motor SET jam_keluar = '"+ getJamKeluar() +"' WHERE nopol = '"+ getNoPol() +"'";
        return motorkeluar;
    }

}
