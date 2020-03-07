package com.praktikum;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VolumeBalok extends JFrame{
    JLabel lPanjang,lLebar,lTinggi,lJudul,lHasil,loperator,tfHasil;
    JTextField tfPanjang,tfLebar,tfTinggi;
    JButton btnHasil,btnKembali,btnReset;

    VolumeBalok(){
        lJudul = new JLabel("Hitung Volume Balok");
        lPanjang = new JLabel("Panjang ");
        lLebar = new JLabel("Lebar ");
        lTinggi = new JLabel("Tinggi ");
        lHasil = new JLabel("Volume Balok = ");
        tfHasil = new JLabel();
        loperator = new JLabel();

        tfPanjang = new JTextField();
        tfLebar = new JTextField();
        tfTinggi = new JTextField();

        btnHasil = new JButton("Hasil");
        btnKembali = new JButton("Kembali");
        btnReset = new JButton("Reset");

        setTitle("Volume Balok");
        setSize(300,300);
        lJudul.setHorizontalAlignment(SwingConstants.CENTER);
        lHasil.setHorizontalAlignment(SwingConstants.CENTER);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        setLayout(null);
        add(lJudul);
        add(lPanjang);
        add(lLebar);
        add(lTinggi);
        add(loperator);
        add(lJudul);
        add(tfPanjang);
        add(tfLebar);
        add(tfTinggi);
        add(btnHasil);
        add(btnKembali);
        add(btnReset);
        add(lHasil);
        add(tfHasil);

        lJudul.setBounds(50,10,150,25);
        lPanjang.setBounds(50,50,100,25);
        tfPanjang.setBounds(100,50,100,25);
        lLebar.setBounds(50,90,100,25);
        tfLebar.setBounds(100,90,100,25);
        lTinggi.setBounds(50,130,100,25);
        tfTinggi.setBounds(100,130,100,25);
        btnReset.setBounds(80,200,100,25);
        btnKembali.setBounds(30,170,100,25);
        btnHasil.setBounds(140,170,100,25);
        lHasil.setBounds(50,230,160,25);
        tfHasil.setBounds(200,230,100,25);

        btnHasil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnHasilactionListener();
            }
        });

        btnKembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new Menu();
            }
        });

        btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String kosong="";
                tfPanjang.setText(kosong);
                tfLebar.setText(kosong);
                tfTinggi.setText(kosong);
                tfHasil.setText(kosong);
            }
        });

    }
    private void btnHasilactionListener(){
        String panjang = tfPanjang.getText();
        String lebar = tfLebar.getText();
        String tinggi = tfTinggi.getText();

        // string to double
        double p = Double.valueOf(panjang);
        double l = Double.valueOf(lebar);
        double t = Double.valueOf(tinggi);

        double hasil = p*l*t;

        String hasil2 = String.valueOf(hasil);
        tfHasil.setText(hasil2);
    }
}
