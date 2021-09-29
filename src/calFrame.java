import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calFrame extends JFrame implements ActionListener{

    JPanel panelUS = new calPanelUS();
    JPanel panelMetric = new calPanelMetric();
    JPanel buttonPanel = new JPanel();

    JButton usBut = new JButton();
    JButton metricBut = new JButton();

    boolean page = true; //true us false metric

    calFrame() throws InterruptedException {
        this.setTitle("Calorie Calculator");
        this.add(buttonPanel);
        this.add(panelUS);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);

        usBut.addActionListener(this);
        usBut.setText("US Units");
        usBut.setBackground(Color.black);
        usBut.setForeground(new Color(0x808080));
        metricBut.addActionListener(this);
        metricBut.setText("Metric Units");
        metricBut.setBackground(Color.black);
        metricBut.setForeground(new Color(0x808080));
        
        buttonPanel.add(usBut);
        buttonPanel.add(metricBut);
        buttonPanel.setPreferredSize(new Dimension(600, 30));

        FlowLayout layout = new FlowLayout();
        layout.setVgap(0);
        setLayout(layout);
    }

    public void changeMetric() {
        this.remove(panelUS);
        this.add(panelMetric);
        page=false;
    }

    public void changeUS() {
        this.remove(panelMetric);
        this.add(panelUS);
        page=true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == usBut && !page){
            changeUS(); 
            System.out.println("US");
        }
        else if (e.getSource() == metricBut && page){
            changeMetric(); 
            System.out.println("METRIC");
        }
    }

}