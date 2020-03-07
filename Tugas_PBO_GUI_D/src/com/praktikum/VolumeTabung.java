package com.praktikum;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VolumeTabung extends JFrame {
    JLabel lRadius,lTinggi,lJudul,lHasil,loperator,tfHasil;
    JTextField tfRadius,tfTinggi;
    JButton btnHasil,btnKembali,btnReset;
    VolumeTabung(){
        lJudul = new JLabel("Hitung Volume Tabung");
        lRadius = new JLabel("Radius ");
        lTinggi = new JLabel("Tinggi ");
        lHasil = new JLabel("Volume Tabung = ");
        tfHasil = new JLabel();
        loperator = new JLabel();

        tfRadius = new JTextField();
        tfTinggi = new JTextField();

        btnHasil = new JButton("Hasil");
        btnKembali = new JButton("Kembali");
        btnReset = new JButton("Reset");

        setTitle("Volume Tabung");
        setSize(320,260);
        lJudul.setHorizontalAlignment(SwingConstants.CENTER);
        lHasil.setHorizontalAlignment(SwingConstants.LEFT);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        setLayout(null);
        add(lJudul);
        add(lRadius);
        add(lTinggi);
        add(loperator);
        add(lJudul);
        add(tfRadius);
        add(tfTinggi);
        add(btnHasil);
        add(btnKembali);
        add(btnReset);
        add(lHasil);
        add(tfHasil);

        lJudul.setBounds(50,10,150,25);
        lRadius.setBounds(50,50,100,25);
        tfRadius.setBounds(100,50,100,25);
        lTinggi.setBounds(50,90,100,25);
        tfTinggi.setBounds(100,90,100,25);
//        lTinggi.setBounds(50,130,100,25);
//        tfTinggi.setBounds(100,130,100,25);
        btnReset.setBounds(80,160,100,25);
        btnKembali.setBounds(30,130,100,25);
        btnHasil.setBounds(140,130,100,25);
        lHasil.setBounds(50,190,120,25);
        tfHasil.setBounds(155,190,150,25);

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
                tfRadius.setText(kosong);
                tfTinggi.setText(kosong);
                tfHasil.setText(kosong);
            }
        });

    }
    private void btnHasilactionListener(){
        String radius = tfRadius.getText();
        String tinggi = tfTinggi.getText();

        // string to double
        double r = Double.valueOf(radius);
        double pi;
        if (r % 7 ==0){
            pi = 22/7;
        }else{
            pi = 3.14;
        }
        double t = Double.valueOf(tinggi);

        double hasil = pi*r*r*t;

        String hasil2 = String.valueOf(hasil);
        tfHasil.setText(hasil2);
    }
}
