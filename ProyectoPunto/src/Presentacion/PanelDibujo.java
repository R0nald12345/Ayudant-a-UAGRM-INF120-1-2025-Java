package Presentacion;

import Negocio.ClasePunto;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelDibujo extends JPanel implements MouseListener, MouseMotionListener {
    
    private ClasePunto punto;
    private boolean arrastrando = false;
    
    public PanelDibujo() {
        // Crear un punto inicial en el centro del panel
        punto = new ClasePunto(200,150);
        
        // Registrar los listeners de ratón
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        
        // Configurar el panel
        this.setPreferredSize(new Dimension(400, 300));
        this.setBackground(Color.WHITE);
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // Dibujar el punto
        punto.dibujar(g);
    }
    
    // Implementación de los métodos de MouseListener
    @Override
    public void mousePressed(MouseEvent e) {
        // Verificar si el clic está cerca del punto
        int distanciaX = Math.abs(e.getX() - punto.getX());
        int distanciaY = Math.abs(e.getY() - punto.getY());
        
        if (distanciaX <= punto.getTamano() && distanciaY <= punto.getTamano()) {
            arrastrando = true;
        }
    }
    
    @Override
    public void mouseReleased(MouseEvent e) {
        arrastrando = false;
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        // Si haces doble clic, mover el punto a esa posición
        if (e.getClickCount() == 2) {
            punto.mover(e.getX(), e.getY());
            repaint();
        }
    }
    
    @Override
    public void mouseEntered(MouseEvent e) {}
    
    @Override
    public void mouseExited(MouseEvent e) {}
    
    // Implementación de los métodos de MouseMotionListener
    @Override
    public void mouseDragged(MouseEvent e) {
        if (arrastrando) {
            punto.mover(e.getX(), e.getY());
            repaint();
        }
    }
    
    @Override
    public void mouseMoved(MouseEvent e) {}
    
    // Método principal para probar
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Dibujo de Punto");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        PanelDibujo panel = new PanelDibujo();
        ventana.add(panel);
        
        ventana.pack();
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
}