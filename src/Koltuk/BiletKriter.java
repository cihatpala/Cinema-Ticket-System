/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Koltuk;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author pala
 */
public class BiletKriter extends JPanel{
    public String kriter;
    
    public int tamFiyat;
    public String koltuk;
    JButton biletkes,temizle,geri;
    JRadioButton yas9,yas65,ogrenci,tam;
    ButtonGroup bg;
    JLabel kesilecek;
    JTextField kesilecekBilet;

    
    public BiletKriter() {

        
        radioEkle();
        kesilecekEkle();
        buttonAksiyonlari();
        setBounds(957, 5, 405, 655);
        setBackground(Color.blue);
        setLayout(null);
        
    }

    public void radioEkle(){
        bg = new ButtonGroup();
        yas9 = new JRadioButton(); yas65 = new JRadioButton(); ogrenci = new JRadioButton(); tam = new JRadioButton();
        bg.add(tam); bg.add(yas9); bg.add(yas65); bg.add(ogrenci); //Radio Butonların aynı grupta tutulması.
        yas9.setBounds(150, 100, 100 , 30);
        yas9.setText("9 YAŞ ALTI");
        yas9.setBackground(Color.blue);
        yas65.setBounds(150, 150, 100 , 30);
        yas65.setText("65 YAŞ ÜSTÜ");
        yas65.setBackground(Color.blue);
        ogrenci.setBounds(150, 200, 100 , 30);
        ogrenci.setText("ÖĞRENCİ");
        ogrenci.setBackground(Color.blue);
        tam.setBounds(150, 250, 120 , 30);
        tam.setText("TAM   (NORMAL)");
        tam.setBackground(Color.blue);
        
        this.add(yas9);
        this.add(yas65);
        this.add(ogrenci);
        this.add(tam);
    }
    
    public void kesilecekEkle(){
         kesilecek = new JLabel();
         kesilecekBilet = new JTextField();
         biletkes = new JButton(); temizle = new JButton(); geri = new JButton();
         
         kesilecek.setBounds(150, 350, 150, 30);
         kesilecek.setText("ŞU AN KESİLEN BİLET");
         
         kesilecekBilet.setBounds(100, 400, 250, 30);
         
         biletkes.setText("BİLETİ KES");
         biletkes.setBounds(170,480,100,30);   
         
         temizle.setText("SEANSI SIFIRLA");
         temizle.setBounds(155,550,130,30);
         
         geri.setText("GERİ DÖN");
         geri.setBounds(270,8,130,30);
         
         this.add(geri);
         this.add(temizle);
         this.add(biletkes);
         this.add(kesilecekBilet);
         this.add(kesilecek);  
    }
    
    public void buttonAksiyonlari(){
        
        yas9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yas9ActionPerformed(evt);          
            }
        });
        
        yas65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yas65ActionPerformed(evt);
            }
        });
        
        ogrenci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ogrenciActionPerformed(evt);
            }
        });
        
        tam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tamActionPerformed(evt);
            }
        });
        
        /*biletkes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                biletkesActionPerformed(evt);
            }
        });*/
        
    }
    
    private void yas9ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        kesilecekBilet.setText("1 ADET 9 YAŞ ALTI");
        kriter="9 YAŞ ALTI";
        tamFiyat = 7;
    }
    private void yas65ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        kesilecekBilet.setText("1 ADET 65 YAŞ ÜSTÜ");
        kriter="65 YAŞ ÜSTÜ";
        tamFiyat = 7;
    }
    private void ogrenciActionPerformed(java.awt.event.ActionEvent evt) {                                              
        kesilecekBilet.setText("1 ADET ÖĞRENCİ");
        kriter="ÖĞRENCİ";
        tamFiyat = 10;
    }
    private void tamActionPerformed(java.awt.event.ActionEvent evt) {                                              
        kesilecekBilet.setText("1 ADET NORMAL (TAM)");
        kriter = "TAM (NORMAL)";
        tamFiyat = 20;
    }
    
    /*private void biletkesActionPerformed(java.awt.event.ActionEvent evt) {                                              
        kesilecekBilet.setText(" ");
        ks = new KoltukSecimi();
        ks.getKriter();
        koltuk=ks.getKoltukNo();
        yas9.setText(koltuk);
    }*/
    
 
}
