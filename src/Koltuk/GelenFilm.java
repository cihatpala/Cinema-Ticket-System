/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Koltuk;

import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel; 
import javax.swing.JLabel;

/**
 *
 * @author pala
 */
public class GelenFilm extends JPanel {
    JLabel filmadi,filmseans,filmfoto;
    public String filmAd,filmSeans;
    
    public GelenFilm(String filmAd,String filmSeans) {
        this.filmAd=filmAd;
        this.filmSeans=filmSeans;
        labelDesign();
        fotoEkle();
        setBounds(3, 5, 350, 500);
        setBackground(Color.CYAN);
        setLayout(null);
    }
    
    public void fotoEkle(){
         filmfoto = new JLabel();
         
         if(this.filmAd=="ESARETİN BEDELİ"){
             filmfoto.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("EsaretinBedeli.png")).getImage().getScaledInstance(300, 400, Image.SCALE_DEFAULT)));
             
        }
         if(this.filmAd=="YEŞİL YOL"){
             filmfoto.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("YesilYol.png")).getImage().getScaledInstance(300, 400, Image.SCALE_DEFAULT)));
        }
         if(this.filmAd=="12 ÖFKELİ ADAM"){
             filmfoto.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("OnikiAdam.png")).getImage().getScaledInstance(300, 400, Image.SCALE_DEFAULT)));
        }
         filmfoto.setBounds(20, 35, 300, 400);
         this.add(filmfoto);
    }
    
    public void labelDesign(){
        filmadi = new JLabel();
        filmadi.setText(filmAd);
        filmadi.setBounds(120, 5, 100, 30);
        filmseans = new JLabel();
        filmseans.setText(filmSeans);
        filmseans.setBounds(90, 450, 200, 30);
        
        
        this.add(filmseans);
        this.add(filmadi);
    }

}
