// Importa la clase JFrame del paquete javax.swing (para crear la ventana)
import java.awt.BorderLayout;
import javax.swing.*;
import vistas.BannerPanel;
import vistas.LoginView;



public class Main {


    public static void main(String[] args) {
  //Titulo y tamali de la ventana
        JFrame miVentana = new JFrame();
        miVentana.setTitle("Hospital SCL");
        miVentana.setSize(1000,800);
        miVentana.setLayout(new BorderLayout());


        
//BannerPannel
      BannerPanel panelBanner = new BannerPanel();
       miVentana.add(panelBanner.getJPanel(), BorderLayout.WEST);


  
//LoginView
        LoginView panelLogin =new LoginView();
        miVentana.add(panelLogin.getJPanel(), BorderLayout.CENTER);


        
    
        miVentana.setVisible(true);
    }
}        