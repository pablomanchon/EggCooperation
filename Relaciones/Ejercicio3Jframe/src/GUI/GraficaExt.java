package GUI;

import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.TransferHandler;

public class GraficaExt extends Grafica{
    ArrayList<JLabel> cartas = new ArrayList();
    
    public void pruebaCartas(){
        cartas.add(copa1);
        cartas.add(copa2);
        cartas.get(0).addMouseListener((MouseListener) new TransferHandler("icon"));
        cartas.get(1).addMouseListener((MouseListener) new TransferHandler("icon"));
        add(copa1);
        add(copa2);
        
    }
}
