        /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Koltuk;

import Vizyondakiler.Vizyondakiler;
import java.awt.Color;
import javax.swing.*;


/**
 *
 * @author pala
 */
public class KoltukSecimi {
    public String filmAd,filmSeans;
    JFrame frame;
    JPanel jp;
    GelenFilm gelenFilm;
    Perde perde;
    BiletKriter biletKriter;
    KesilenBiletler kesilenBiletler;

    
    public KoltukSecimi(String filmAd,String filmSeans) {
        this.filmAd=filmAd; this.filmSeans=filmSeans;
        frameOlustur();
        getJp().add(getGelenFilm());
        getJp().add(getPerde());
        getJp().add(getKriter());
        getJp().add(getKesilenBiletler());
        frameOlustur().setVisible(true);
        
        
        
    }

    public JFrame frameOlustur() {
        if (frame == null) {
            frame = new JFrame();  
            frame.setLocation(-7, 0);
            frame.setSize(1380, 700);
            frame.setContentPane(getJp());
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        
        return frame;
    }

    public JPanel getJp() {
        if (jp == null) {
            jp = new JPanel();
            jp.setLayout(null);
            jp.setBackground(Color.DARK_GRAY);
        }
        return jp;

    }

    public GelenFilm getGelenFilm() {
        if (gelenFilm== null) {
            gelenFilm = new GelenFilm(filmAd,filmSeans);
        }
        return gelenFilm;
    }
    
    public Perde getPerde() {
        if (perde == null) {
            perde = new Perde();
            
        }
        return perde;
    }
    
    public BiletKriter getKriter() {
        if (biletKriter ==null) {
            biletKriter = new BiletKriter();
            
            biletKriter.biletkes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                biletkesActionPerformed(evt);
            }
        });
            biletKriter.temizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temizleActionPerformed(evt);
            }
        });
            biletKriter.geri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temizleActionPerformed(evt); 
                Vizyondakiler vz = new Vizyondakiler();
                vz.setVisible(true);
                frame.dispose();
            }
        });
            
        }
        return biletKriter;
    }
    
    public KesilenBiletler getKesilenBiletler() {
        if (kesilenBiletler ==null) {
            kesilenBiletler = new KesilenBiletler();
            
            kesilenBiletler.biletleriSat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                biletleriSatActionPerformed(evt);
            }
        });
        }
        return kesilenBiletler;
    }

    public String getKoltukNosu(){
        return perde.tiklanan;
    }
    
    public String getKriteri(){
        return biletKriter.kriter;
    }
    public int getUcretler(){
        return biletKriter.tamFiyat;
    }
    public String getFilmAdi(){
        return gelenFilm.filmadi.getText();
    }
   public String getFilmSeans(){
        return gelenFilm.filmseans.getText();
    }
    public int toplam=0;
    public int koltukSayisi=0;
    public String fistekiler="";
     private void biletleriSatActionPerformed(java.awt.event.ActionEvent evt) {                                              
        kesilenBiletler.txtkesilen.setText("");
        kesilenBiletler.toplamUcret.setText("-");
        JOptionPane op = new JOptionPane();
        op.setMessage( "                          "+getFilmAdi()+"\n"+" Seans :      "+getFilmSeans()+"\n"+" "+koltukSayisi+" Adet bilet için  "+toplam+"TL alınmıştır. \n"+fistekiler);
        JDialog dg = op.createDialog("BİLET FİŞİ");
        dg.setVisible(true);

        toplam=0;
        koltukSayisi=0;
        fistekiler="";
    }
    private void temizleActionPerformed(java.awt.event.ActionEvent evt) {
        //A BLOĞU
        perde.ka1.setBackground(Color.white); perde.ka1.setEnabled(true);
        perde.ka2.setBackground(Color.white); perde.ka2.setEnabled(true);
        perde.ka3.setBackground(Color.white); perde.ka3.setEnabled(true);
        perde.ka4.setBackground(Color.white); perde.ka4.setEnabled(true);
        perde.ka5.setBackground(Color.white); perde.ka5.setEnabled(true);
        //B BLOĞU
        perde.kb1.setBackground(Color.white); perde.kb1.setEnabled(true);
        perde.kb2.setBackground(Color.white); perde.kb2.setEnabled(true);
        perde.kb3.setBackground(Color.white); perde.kb3.setEnabled(true);
        perde.kb4.setBackground(Color.white); perde.kb4.setEnabled(true);
        perde.kb5.setBackground(Color.white); perde.kb5.setEnabled(true);
        //C BLOĞU
        perde.kc1.setBackground(Color.white); perde.kc1.setEnabled(true);
        perde.kc2.setBackground(Color.white); perde.kc2.setEnabled(true);
        perde.kc3.setBackground(Color.white); perde.kc3.setEnabled(true);
        perde.kc4.setBackground(Color.white); perde.kc4.setEnabled(true);
        perde.kc5.setBackground(Color.white); perde.kc5.setEnabled(true);
        
        toplam=0;
        koltukSayisi=0;
        fistekiler="";
        
        kesilenBiletler.toplamUcret.setText("-");
        kesilenBiletler.txtkesilen.setText("");       
        biletKriter.kesilecekBilet.setText("");
    }
    
    private void biletkesActionPerformed(java.awt.event.ActionEvent evt) {                                              
        biletKriter.kesilecekBilet.setText(" ");
        fistekiler = fistekiler +"  1 Adet "+getKriteri()+"  >> "+getKoltukNosu()+"  Ücret : "+getUcretler()+"TL \n";
        kesilenBiletler.txtkesilen.setText(kesilenBiletler.txtkesilen.getText()+" 1 Adet "+getKriteri()+"  >> "+getKoltukNosu()+" Ücret : "+getUcretler()+"TL "+" , "); 
        toplam=toplam+getUcretler();
        kesilenBiletler.toplamUcret.setText(String.valueOf(toplam));
        
        //A BLOĞU
        
        if(getKoltukNosu()=="Koltuk A - 1"){   perde.ka1.setBackground(Color.red); koltukSayisi++;  } 
        if(perde.ka1.getBackground()==Color.red){  perde.ka1.setEnabled(false);    }
 
        if (getKoltukNosu()=="Koltuk A - 2"){  perde.ka2.setBackground(Color.red); koltukSayisi++;  }
        if(perde.ka2.getBackground()==Color.red){   perde.ka2.setEnabled(false);   }

        if (getKoltukNosu()=="Koltuk A - 3"){  perde.ka3.setBackground(Color.red); koltukSayisi++;  }
        if(perde.ka3.getBackground()==Color.red){   perde.ka3.setEnabled(false);   }
        
        if (getKoltukNosu()=="Koltuk A - 4"){  perde.ka4.setBackground(Color.red); koltukSayisi++;  }
        if(perde.ka4.getBackground()==Color.red){   perde.ka4.setEnabled(false);   }
        
        if (getKoltukNosu()=="Koltuk A - 5"){  perde.ka5.setBackground(Color.red); koltukSayisi++;  }
        if(perde.ka5.getBackground()==Color.red){   perde.ka5.setEnabled(false);   }
        
        //B BLOĞU
        
        if (getKoltukNosu()=="Koltuk B - 1"){  perde.kb1.setBackground(Color.red); koltukSayisi++;  }
        if(perde.kb1.getBackground()==Color.red){   perde.kb1.setEnabled(false);   }
        
        if (getKoltukNosu()=="Koltuk B - 2"){  perde.kb2.setBackground(Color.red); koltukSayisi++;  }
        if(perde.kb2.getBackground()==Color.red){   perde.kb2.setEnabled(false);   }
        
        if (getKoltukNosu()=="Koltuk B - 3"){  perde.kb3.setBackground(Color.red); koltukSayisi++;  }
        if(perde.kb3.getBackground()==Color.red){   perde.kb3.setEnabled(false);   }
        
        if (getKoltukNosu()=="Koltuk B - 4"){  perde.kb4.setBackground(Color.red); koltukSayisi++;  }
        if(perde.kb4.getBackground()==Color.red){   perde.kb4.setEnabled(false);   }
        
        if (getKoltukNosu()=="Koltuk B - 5"){  perde.kb5.setBackground(Color.red); koltukSayisi++;  }
        if(perde.kb5.getBackground()==Color.red){   perde.kb5.setEnabled(false);   }
        
        //C BLOĞU
        
        if (getKoltukNosu()=="Koltuk C - 1"){  perde.kc1.setBackground(Color.red); koltukSayisi++;  }
        if(perde.kc1.getBackground()==Color.red){   perde.kc1.setEnabled(false);   }
        
        if (getKoltukNosu()=="Koltuk C - 2"){  perde.kc2.setBackground(Color.red); koltukSayisi++;  }
        if(perde.kc2.getBackground()==Color.red){   perde.kc2.setEnabled(false);   }
        
        if (getKoltukNosu()=="Koltuk C - 3"){  perde.kc3.setBackground(Color.red); koltukSayisi++;  }
        if(perde.kc3.getBackground()==Color.red){   perde.kc3.setEnabled(false);   }
        
        if (getKoltukNosu()=="Koltuk C - 4"){  perde.kc4.setBackground(Color.red); koltukSayisi++;  }
        if(perde.kc4.getBackground()==Color.red){   perde.kc4.setEnabled(false);   }
        
        if (getKoltukNosu()=="Koltuk C - 5"){  perde.kc5.setBackground(Color.red); koltukSayisi++;  }
        if(perde.kc5.getBackground()==Color.red){   perde.kc5.setEnabled(false);   }
        
        
    }
    
    
}
