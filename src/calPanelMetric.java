import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class calPanelMetric extends JPanel implements MouseListener {
    int screen_height=600;
    int screen_width=800;

    calPanelMetric(){
        this.addMouseListener(this);
        this.setPreferredSize(new Dimension(screen_width, screen_height));
        this.setBackground(Color.gray);
        this.setVisible(true);
        this.setFocusable(true);
        repaint();    
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }
    public void draw(Graphics g) {
        g.setColor(new Color(0xFFFFFF));
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(3));
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}