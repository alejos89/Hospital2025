import javax.swing.JFrame;
import javax.swing.JLabel;
public class Main {

    public static void main(String[] args) {
        
        // Crear una ventana con JFrame

        JFrame miVentana=new JFrame();

        miVentana.setTitle("Hospital");

        miVentana.setSize(900,900);

        miVentana.setVisible(true);
        
        //Crear un texto con Label

        JLabel texto=new JLabel();
        texto.setText("HOla");

        miVentana.add(texto);
        

    }
}