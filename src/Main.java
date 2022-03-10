import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

// x, y, width, height

public class Main
{   
    static JFrame frame1 = new JFrame("Money Manager");
    static JFrame frame = new JFrame("Money Manager");
    
    public static void main(String[] args) {
        openUI();
        frame.hide();
    }
    
    public static void openUI() {
        // Components
        
        JButton start;
        JButton close;
        
        // Components settings
        
        start = new JButton("Start");
        close = new JButton("Beenden");
        
        // Bounds of components
        start.setBounds(250, 100, 200, 40);
        close.setBounds(250, 160, 200, 40);
        
        // Window listeners
        
        frame1.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                if (JOptionPane.showConfirmDialog(frame1,
                    "Bist du sicher, dass du die Anwendung beenden willst?", "Anwendung beenden?",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });
        
        // Action listeners
        
        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainApplication();
            }
        });
        
        close.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                close_operation();
            }
        });
        
        frame1.add(start);
        frame1.add(close);
        frame1.setSize(700, 500);
        frame1.setLayout(null);
        frame1.setVisible(true);
    }
    
    public static void mainApplication() {
        // Close other window
        
        frame1.hide();
        frame.show();
        
        // Components
        
        
        
        // Window listeners
        
        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                if (JOptionPane.showConfirmDialog(frame1,
                    "Bist du sicher, dass du die Anwendung beenden willst?", "Anwendung beenden?",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });
        
        // Frame settings
        
        frame.setSize(700, 500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    
    static void close_operation() {
        if (JOptionPane.showConfirmDialog(frame1,
            "Bist du sicher, dass du die Anwendung beenden willst?", "Anwendung beenden?",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                System.exit(0);
        }
    }
}
