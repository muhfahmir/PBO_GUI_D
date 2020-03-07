package com.praktikum;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        new Menu();
    }
}

class Menu extends JFrame implements ActionListener{
    JLabel ljudul;
    JButton btnLB;
    JButton btnVB;
    JButton btnVT;
    JButton btnExit;

    Menu(){
        ljudul = new JLabel("MENU");
        btnLB = new JButton("1. Luas Balok");
        btnVB = new JButton("2. Volume Balok");
        btnVT = new JButton("3. Volume Tabung");
        btnExit = new JButton("0. Exit");

        btnLB.addActionListener(this);
        btnVB.addActionListener(this);
        btnVT.addActionListener(this);
        btnExit.addActionListener(this);

        setLayout(null);
        add(ljudul);
        add(btnExit);
        add(btnLB);
        add(btnVB);
        add(btnVT);

        ljudul.setBounds(70,10,180,25);
        btnLB.setBounds(70,40,180,25);
        btnVB.setBounds(70,70,180,25);
        btnVT.setBounds(70,100,180,25);
        btnExit.setBounds(70,130,180,25);

        setTitle("MENU UTAMA");
        setSize(330,200);
        ljudul.setHorizontalAlignment(SwingConstants.CENTER);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btnLB){
            //buat object class LB
            setVisible(false);
            new LuasBalok();
        }else if (e.getSource()==btnVB){
            //buat object class VB
            setVisible(false);
            new VolumeBalok();
        }else if (e.getSource()==btnVT){
            // buat object class VT
            setVisible(false);
            new VolumeTabung();
        }else if (e.getSource()==btnExit){
            // kelas exit
            int selectedOption = JOptionPane.showConfirmDialog(null,
                    "Apakah anda akan menutup Aplikasi?", "Tutup Aplikasi", JOptionPane.YES_NO_OPTION);
            if (selectedOption == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        }
    }
}