/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vizyondakiler;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import Koltuk.KoltukSecimi;
import Koltuk.GelenFilm;
import java.awt.Color;

/**
 *
 * @author pala
 */
public class SeansSalon extends JFrame {
    KoltukSecimi ks;
    GelenFilm gf;
    
    JButton seans1,seans2,seans3,seans4;
    JLabel gelenfilm,filmad;
    public String alinanfilm;
    public String alinanseans;
    
    public SeansSalon(String alinanfilm){
        seans1 = new JButton();
        seans2 = new JButton();
        seans3 = new JButton();
        seans4 = new JButton();
        gelenfilm = new JLabel();
        filmad = new JLabel();
        this.alinanfilm=alinanfilm;
        this.add(filmad);
        this.add(gelenfilm);
        this.add(seans1);
        this.add(seans2);
        this.add(seans3);
        this.add(seans4);
 
        setTitle("Seans - Salon");
        setLayout(null);
        setVisible(true);
        setBounds(350,160,700,450);
        
        gelenfilm.setVisible(true);
        gelenfilm.setBounds(50,50,250,300);
        if(this.alinanfilm=="ESARETİN BEDELİ"){
             gelenfilm.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("EsaretinBedeli.png")).getImage().getScaledInstance(250, 300, Image.SCALE_DEFAULT)));
        }
        
        else if (this.alinanfilm=="YEŞİL YOL"){
             gelenfilm.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("YesilYol.png")).getImage().getScaledInstance(250, 300, Image.SCALE_DEFAULT)));
        }
        
        else if(this.alinanfilm =="12 ÖFKELİ ADAM"){
             gelenfilm.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("OnikiAdam.png")).getImage().getScaledInstance(250, 300, Image.SCALE_DEFAULT)));
        }

        filmad.setText(this.alinanfilm);
        filmad.setBounds(120,20,100,20);
        
        seans1.setFont(new Font("Tahoma", 3, 17));
        seans1.setText("Salon 1 :   12.00 - 15.00");
        seans1.setBounds(350,50,250,50);
        seans2.setFont(new Font("Tahoma", 3, 17));
        seans2.setText("Salon 2 :   13.00 - 16.00");
        seans2.setBounds(350,133,250,50);
        seans3.setFont(new Font("Tahoma", 3, 17));
        seans3.setText("Salon 3 :   14.00 - 17.00");
        seans3.setBounds(350,218,250,50);
        seans4.setFont(new Font("Tahoma", 3, 17));
        seans4.setText("Salon 4 :   15.00 - 18.00");
        seans4.setBounds(350,300,250,50);
        butonEkle();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    public void butonEkle(){
        seans1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seans1ActionPerformed(evt);
            }
        });
        seans2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seans2ActionPerformed(evt);
            }
        });
        seans3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seans3ActionPerformed(evt);
            }
        });
        seans4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seans4ActionPerformed(evt);
            }
        });
    }
    
    private void seans1ActionPerformed(java.awt.event.ActionEvent evt) {
        alinanseans="Salon 1 :   12.00 - 15.00";
        ks = new KoltukSecimi(alinanfilm,alinanseans);
        this.dispose();  
    }
    private void seans2ActionPerformed(java.awt.event.ActionEvent evt) { 
        alinanseans="Salon 2 :   13.00 - 16.00";
        ks = new KoltukSecimi(alinanfilm,alinanseans);
        this.dispose();  
    }
    private void seans3ActionPerformed(java.awt.event.ActionEvent evt) { 
        alinanseans="Salon 3 :   14.00 - 17.00";
        ks = new KoltukSecimi(alinanfilm,alinanseans);
        this.dispose();  
    }
    private void seans4ActionPerformed(java.awt.event.ActionEvent evt) { 
        alinanseans="Salon 4 :   15.00 - 18.00";
        ks = new KoltukSecimi(alinanfilm,alinanseans);
        this.dispose();  
    }
    
    
}
