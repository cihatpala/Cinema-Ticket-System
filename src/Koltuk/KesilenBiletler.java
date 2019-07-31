/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Koltuk;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JPanel;
import javax.swing.JLabel;


/**
 *
 * @author pala
 */
public class KesilenBiletler  extends JPanel{
    public String kesilenkoltuk;
    JEditorPane txtkesilen;
    JLabel   kesilentext , toplamUcretText,toplamUcret;
    JButton biletleriSat ;
    
    public KesilenBiletler() {
 
        labelEkle();
        setBounds(3, 508, 952, 152);
        setBackground(Color.GREEN);
        setLayout(null);
    }
    
    public void labelEkle(){
        kesilentext = new JLabel();
       
        toplamUcretText = new JLabel();
        toplamUcret = new JLabel();
        txtkesilen = new JEditorPane();
        biletleriSat = new JButton();
        
        txtkesilen.setSize(100, 100);
        kesilentext.setBounds(250, 5, 500, 30);
        kesilentext.setText("K       E       S       İ       L       E       N                  B         İ        L         E        T         L          E        R");
        
     
        
        txtkesilen.setBounds(70,40,800,70);
 
        toplamUcretText.setBounds(700, 120, 100, 30);
        toplamUcretText.setText("Toplam Ücret : ");
        
        toplamUcret.setBounds(800, 120, 500, 30);
        toplamUcret.setText("");
        
        biletleriSat.setBounds(370,117 , 130, 30);
        biletleriSat.setText("BİLETLERİ SAT");
        
        this.add(biletleriSat);
        this.add(txtkesilen);
        this.add(toplamUcret);
        this.add(toplamUcretText);
        
        this.add(kesilentext);
        
    }
   
    
}
