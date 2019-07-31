/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vizyondakiler;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author pala
 */
public class Vizyondakiler extends JFrame{
    JButton bilet_al_esaret;
    JButton bilet_al_yesilyol;
    JButton bilet_al_adamlar;
    JLabel label_esaret,label_yesil,label_adamlar,label1,label2,label3,label11,label22,label33,esaretad,yesilyolad,adamlarad;
    
    
    
   
    
    public Vizyondakiler(){
        bilet_al_esaret = new JButton();
        bilet_al_yesilyol = new JButton();
        bilet_al_adamlar = new JButton();
        label_esaret = new JLabel();
        label_yesil = new JLabel();
        label_adamlar = new JLabel();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label11 = new JLabel();
        label22 = new JLabel();
        label33 = new JLabel();
        esaretad= new JLabel();
        yesilyolad = new JLabel();
        adamlarad = new JLabel();
        this.add(bilet_al_adamlar);
        this.add(bilet_al_yesilyol);
        this.add(bilet_al_esaret);
        this.add(esaretad);
        this.add(yesilyolad);
        this.add(adamlarad);
        this.add(label11);
        this.add(label22);
        this.add(label33);
        this.add(label1);
        this.add(label2);
        this.add(label3);
        this.add(label_yesil);
        this.add(label_esaret);
        this.add(label_adamlar);
        setTitle("Vizyondakiler");
        setLayout(null);
        setVisible(true);
        setBounds(200,100,1000,500);
        esaretad.setText("ESARETİN BEDELİ");
        esaretad.setBounds(120,8,300,20);
        yesilyolad.setText("YEŞİL YOL");
        yesilyolad.setBounds(470,8,300,20);
        adamlarad.setText("12 ÖFKELİ ADAM");
        adamlarad.setBounds(770,8,300,20);
        label1.setText("Tür : Dram , Gizem , Polisiye");
        label1.setBounds(95,340,300,20);
        label2.setText("Tür : Dram , Fantastik , Suç");
        label2.setBounds(420,340,300,20);
        label3.setText("Tür : Mahkeme Draması , Suç  , Dram");
        label3.setBounds(715,340,300,20);
        label11.setText("Süre : 2 saat 22 dakika");
        label11.setBounds(95,360,300,20);
        label22.setText("Süre : 3 ssat 9 dakika");
        label22.setBounds(420,360,300,20);
        label33.setText("Süre : 1 saat 36 dakika");
        label33.setBounds(715,360,300,20);
        
        fotoEkle();
        
        label_esaret.setVisible(true);
        label_esaret.setBounds(40,30,250,300); 
        label_yesil.setVisible(true);
        label_yesil.setBounds(370,30,250,300); 
        label_adamlar.setVisible(true);
        label_adamlar.setBounds(692,30,250,300);
        
        bilet_al_esaret.setText("BİLET AL");
        bilet_al_esaret.setBounds(130, 390, 90, 20);
        bilet_al_yesilyol.setText("BİLET AL");
        bilet_al_yesilyol.setBounds(455, 390, 90, 20);
        bilet_al_adamlar.setText("BİLET AL");
        bilet_al_adamlar.setBounds(770, 390, 90, 20);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        bilet_al_esaret.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bilet_al_esaretActionPerformed(evt); // aksiyonu çağırıyor.
            }
        });
        
        bilet_al_yesilyol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bilet_al_yesilyolActionPerformed(evt); // aksiyonu çağırıyor.
            }
        });
        
        bilet_al_adamlar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bilet_al_adamlarActionPerformed(evt); // aksiyonu çağırıyor.
            }
        });
    }
    
    private void bilet_al_esaretActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
        this.setVisible(false);
        SeansSalon ss = new SeansSalon("ESARETİN BEDELİ");
        ss.setVisible(true);
        
    }
    
    private void bilet_al_yesilyolActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
        this.setVisible(false);
        SeansSalon ss = new SeansSalon("YEŞİL YOL");
        ss.setVisible(true);
        
    }
    
    private void bilet_al_adamlarActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
        this.setVisible(false);
        SeansSalon ss = new SeansSalon("12 ÖFKELİ ADAM");
        ss.setVisible(true);
        
    }
    
    public void fotoEkle(){
        label_esaret.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("EsaretinBedeli.png")).getImage().getScaledInstance(250, 300, Image.SCALE_DEFAULT)));
        label_yesil.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("YesilYol.png")).getImage().getScaledInstance(250, 300, Image.SCALE_DEFAULT)));
        label_adamlar.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("OnikiAdam.png")).getImage().getScaledInstance(250, 300, Image.SCALE_DEFAULT)));
    }
    
}
