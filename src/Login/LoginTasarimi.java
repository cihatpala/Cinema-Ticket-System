
package Login;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import Vizyondakiler.Vizyondakiler;
import javax.swing.Icon;
import javax.swing.JPasswordField;

public class LoginTasarimi extends JFrame {
    
    JButton button_login;
    JLabel backgroundlabel,lgId,lgPsw;
    JTextField id;
    JPasswordField sifre;
    
    public LoginTasarimi(){
        LoginEkle();
        button_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_loginActionPerformed(evt); // aksiyonu çağırıyor.
            }
        });
    }
    
    public void LoginEkle(){
        backgroundlabel = new JLabel();
        button_login = new JButton();
        lgId = new JLabel();
        lgPsw = new JLabel();
        id = new JTextField();
        sifre= new JPasswordField();
        Icon loginPic = new ImageIcon(getClass().getResource("loginscreen.png"));
        backgroundlabel.setIcon(loginPic);
        setTitle("Login Ekranı");
        setLayout(null);
        setVisible(true);
        setBounds(400,230,582,337);
        backgroundlabel.setVisible(true);
        backgroundlabel.setBounds(0,0,578,300);
        button_login.setText("Giriş");
        button_login.setVisible(true);
        button_login.setBounds(247,234,80,30);
        lgId.setText("Id");
        lgPsw.setText("Şifre");
        lgId.setBounds(200, 100, 10, 20);
        lgId.setVisible(true);
        lgPsw.setBounds(200, 150, 30, 20);
        lgPsw.setVisible(true);
        id.setBounds(250, 100, 100, 20);
        id.setVisible(true);
        sifre.setBounds(250, 150, 100, 20);
        sifre.setVisible(true);
        this.add(sifre);
        this.add(id);
        this.add(lgId);
        this.add(lgPsw);
        this.add(button_login);
        this.add(backgroundlabel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    // butonun aksiyonu.
    private void button_loginActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
        if(id.getText().equalsIgnoreCase("admin") && sifre.getText().equalsIgnoreCase("1234") ){
            this.setVisible(false);
            Vizyondakiler vz = new Vizyondakiler();
            vz.setVisible(true);
        }
    }
}
