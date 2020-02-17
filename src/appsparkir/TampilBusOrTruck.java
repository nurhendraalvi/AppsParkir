package appsparkir;

import javax.swing.*;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;

public class TampilBusOrTruck extends JFrame {
    JTable tabel;
    JScrollPane scrollPane;
    
    DefaultTableModel model;

    public TampilBusOrTruck() {
        String[] kolom = {"No Tiket", "No. Polisi ", "Tanggal Masuk", "Jam Masuk", "Jam Keluar", "Tarif"};
        DBHelper b = new DBHelper();
        model = new DefaultTableModel(b.getDataMobilBesar(), kolom);
        
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
