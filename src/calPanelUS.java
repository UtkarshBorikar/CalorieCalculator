import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class calPanelUS extends JPanel implements MouseListener {
    int screen_height=600;
    int screen_width=800;

    calPanelUS(){
        this.addMouseListener(this);
        this.setPreferredSize(new Dimension(screen_width, screen_height));
        this.setBackground(Color.white);
        this.setVisible(true);
        this.setFocusable(true);
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