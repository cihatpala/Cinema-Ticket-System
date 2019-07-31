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

/**
 *
 * @author pala
 */
public class Perde extends JPanel{
    
    public String tiklanan;
    
    
    JLabel a,b,c,perde;
    JButton ka1,ka2,ka3,ka4,ka5;
    JButton kb1,kb2,kb3,kb4,kb5;
    JButton kc1,kc2,kc3,kc4,kc5;
    JButton beyaz,gri,kirmizi;
    JLabel beyazLabel,griLabel,kirmiziLabel;
    
    public Perde() {
 
        labelEkle();
        butonEkle();
        butonAksiyonlari();
        setBounds(355, 5, 600, 500);
        setBackground(Color.orange);
        setLayout(null);
    }
    
    public void labelEkle(){
        a = new JLabel(); b = new JLabel(); c = new JLabel(); perde = new JLabel();
        perde.setText("P               E                R                D               E");
        perde.setBounds(270, 20, 250, 30);
        this.add(perde);
        a.setBounds(130,110,20,30);  a.setText("A"); this.add(a);
        b.setBounds(130,190,20,30);  b.setText("B"); this.add(b);
        c.setBounds(130,270,20,30);  c.setText("C"); this.add(c);
        
    }
    
    public void butonEkle(){
        
        ka1 = new JButton(); ka2 = new JButton(); ka3 = new JButton(); ka4 = new JButton(); ka5 = new JButton();
        kb1 = new JButton(); kb2 = new JButton(); kb3 = new JButton(); kb4 = new JButton(); kb5 = new JButton();
        kc1 = new JButton(); kc2 = new JButton(); kc3 = new JButton(); kc4 = new JButton(); kc5 = new JButton();
        beyaz = new JButton(); gri = new JButton(); kirmizi = new JButton();
        beyazLabel = new JLabel(); griLabel = new JLabel(); kirmiziLabel = new JLabel();
        
        //A BLOĞU
        ka1.setBounds(150,100 , 50, 50); ka1.setText("1"); this.add(ka1); ka1.setBackground(Color.white);
        ka2.setBounds(230,100 , 50, 50); ka2.setText("2"); this.add(ka2); ka2.setBackground(Color.white);
        ka3.setBounds(310,100 , 50, 50); ka3.setText("3"); this.add(ka3); ka3.setBackground(Color.white);
        ka4.setBounds(390,100 , 50, 50); ka4.setText("4"); this.add(ka4); ka4.setBackground(Color.white);
        ka5.setBounds(470,100 , 50, 50); ka5.setText("5"); this.add(ka5); ka5.setBackground(Color.white);
        
        //B BLOĞU
        kb1.setBounds(190,180 , 50, 50); kb1.setText("1"); this.add(kb1); kb1.setBackground(Color.white);
        kb2.setBounds(270,180 , 50, 50); kb2.setText("2"); this.add(kb2); kb2.setBackground(Color.white);
        kb3.setBounds(350,180 , 50, 50); kb3.setText("3"); this.add(kb3); kb3.setBackground(Color.white);
        kb4.setBounds(430,180 , 50, 50); kb4.setText("4"); this.add(kb4); kb4.setBackground(Color.white);
        kb5.setBounds(510,180 , 50, 50); kb5.setText("5"); this.add(kb5); kb5.setBackground(Color.white);
        
        //C BLOĞU
        kc1.setBounds(150,260 , 50, 50); kc1.setText("1"); this.add(kc1); kc1.setBackground(Color.white);
        kc2.setBounds(230,260 , 50, 50); kc2.setText("2"); this.add(kc2); kc2.setBackground(Color.white);
        kc3.setBounds(310,260 , 50, 50); kc3.setText("3"); this.add(kc3); kc3.setBackground(Color.white);
        kc4.setBounds(390,260 , 50, 50); kc4.setText("4"); this.add(kc4); kc4.setBackground(Color.white);
        kc5.setBounds(470,260 , 50, 50); kc5.setText("5"); this.add(kc5); kc5.setBackground(Color.white);
        
        beyaz.setBounds(120,370,50,50); beyaz.setBackground(Color.white); beyaz.setEnabled(false); this.add(beyaz);
        gri.setBounds(280,370,50,50); gri.setBackground(Color.gray); gri.setEnabled(false); this.add(gri);
        kirmizi.setBounds(440,370,50,50); kirmizi.setBackground(Color.red); kirmizi.setEnabled(false); this.add(kirmizi);
        
        
        beyazLabel.setBounds(115,425,100,30); beyazLabel.setText("Boş Koltuk"); this.add(beyazLabel);
        griLabel.setBounds(270,425,100,30); griLabel.setText("Seçili Koltuk"); this.add(griLabel);
        kirmiziLabel.setBounds(435,425,100,30); kirmiziLabel.setText("Dolu Koltuk"); this.add(kirmiziLabel);
               
    }
    
    public void butonAksiyonlari(){
        
        ka1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ka1ActionPerformed(evt);
            }
        });
        ka2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ka2ActionPerformed(evt);
            }
        });
        ka3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ka3ActionPerformed(evt);
            }
        });
        ka4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ka4ActionPerformed(evt);
            }
        });
        ka5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ka5ActionPerformed(evt);
            }
        });
        kb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kb1ActionPerformed(evt);
            }
        });
        kb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kb2ActionPerformed(evt);
            }
        });
        kb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kb3ActionPerformed(evt);
            }
        });
        kb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kb4ActionPerformed(evt);
            }
        });
        kb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kb5ActionPerformed(evt);
            }
        });
        kc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kc1ActionPerformed(evt);
            }
        });
        kc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kc2ActionPerformed(evt);
            }
        });
        kc3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kc3ActionPerformed(evt);
            }
        });
        kc4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kc4ActionPerformed(evt);
            }
        });
        kc5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kc5ActionPerformed(evt);
            }
        });

    }
    
    //A BLOĞU
    private void ka1ActionPerformed(java.awt.event.ActionEvent evt) { ka1.setBackground(Color.GRAY); tiklanan = "Koltuk A - 1"; }
    private void ka2ActionPerformed(java.awt.event.ActionEvent evt) { ka2.setBackground(Color.GRAY); tiklanan = "Koltuk A - 2"; }   
    private void ka3ActionPerformed(java.awt.event.ActionEvent evt) { ka3.setBackground(Color.GRAY); tiklanan = "Koltuk A - 3"; }
    private void ka4ActionPerformed(java.awt.event.ActionEvent evt) { ka4.setBackground(Color.GRAY); tiklanan = "Koltuk A - 4"; }
    private void ka5ActionPerformed(java.awt.event.ActionEvent evt) { ka5.setBackground(Color.GRAY); tiklanan = "Koltuk A - 5"; }
    
    //B BLOĞU
    private void kb1ActionPerformed(java.awt.event.ActionEvent evt) { kb1.setBackground(Color.GRAY); tiklanan = "Koltuk B - 1"; }
    private void kb2ActionPerformed(java.awt.event.ActionEvent evt) { kb2.setBackground(Color.GRAY); tiklanan = "Koltuk B - 2"; }
    private void kb3ActionPerformed(java.awt.event.ActionEvent evt) { kb3.setBackground(Color.GRAY); tiklanan = "Koltuk B - 3"; }
    private void kb4ActionPerformed(java.awt.event.ActionEvent evt) { kb4.setBackground(Color.GRAY); tiklanan = "Koltuk B - 4"; }
    private void kb5ActionPerformed(java.awt.event.ActionEvent evt) { kb5.setBackground(Color.GRAY); tiklanan = "Koltuk B - 5"; }
    
    //C BLOĞU
    private void kc1ActionPerformed(java.awt.event.ActionEvent evt) { kc1.setBackground(Color.GRAY); tiklanan = "Koltuk C - 1"; }
    private void kc2ActionPerformed(java.awt.event.ActionEvent evt) { kc2.setBackground(Color.GRAY); tiklanan = "Koltuk C - 2"; }
    private void kc3ActionPerformed(java.awt.event.ActionEvent evt) { kc3.setBackground(Color.GRAY); tiklanan = "Koltuk C - 3"; }
    private void kc4ActionPerformed(java.awt.event.ActionEvent evt) { kc4.setBackground(Color.GRAY); tiklanan = "Koltuk C - 4"; }
    private void kc5ActionPerformed(java.awt.event.ActionEvent evt) { kc5.setBackground(Color.GRAY); tiklanan = "Koltuk C - 5"; }
}
