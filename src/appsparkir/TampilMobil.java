package appsparkir;

import javax.swing.*;
import javax.swing.JTable;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;

public class TampilMobil extends JFrame {
    JTable tabel;
    JScrollPane scrollPane;
    
    DefaultTableModel model;

    public TampilMobil() {
        String[] kolom = {"No Tiket", "No. Polisi ", "Tanggal Masuk", "Jam Masuk", "Jam Keluar", "Tarif"};
        DBHelper b = new DBHelper();
        model = new DefaultTableModel(b.getDataMobil(), kolom);
        
        tabel = new JTable(model);
        scrollPane = new JScrollPane(tabel);
        
        setTitle("LIHAT DATA");
        setLayout(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(740, 500);
        
        add(scrollPane);
        
        scrollPane.setBounds(10,10,700,500);
        
        setVisible(true);
    }
}
