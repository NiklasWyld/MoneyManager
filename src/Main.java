import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.Font;
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
        frame1.setResizable(false);
        frame1.setVisible(true);
    }
    
    public static void mainApplication() {
        // Close other window
        
        frame1.hide();
        frame.show();
        
        // Components
        
        JTextField money;
        JLabel converted_money;
        JButton euro_to_dollar;
        JButton dollar_to_euro;
        
        JButton home_button;
        
        // Components settings
        
        money = new JTextField();
        converted_money = new JLabel("→ 0");
        
        euro_to_dollar = new JButton("Euro → Dollar");
        dollar_to_euro = new JButton("Dollar → Euro");
        
        home_button = new JButton("HOME");
        
        // Components settings #2
        
        converted_money.setFont(new Font("Serif", Font.PLAIN, 20));
        
        // Components bounds
        
        money.setBounds(20, 10, 100, 40);
        converted_money.setBounds(130, 10, 200, 40);
        
        euro_to_dollar.setBounds(20, 150, 180, 40);
        dollar_to_euro.setBounds(20, 200, 180, 40);
        
        home_button.setBounds(280, 432, 100, 30);
        
        ///////////
        //Actions//
        ///////////
        
        home_button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.hide();
				frame1.show();
			}
		});
        
        euro_to_dollar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String euro_new;
				euro_new = money.getText();
				
				int euro = Integer.parseInt(euro_new);
				
				Integer ergebnis = MoneyConverter.euro_to_dollar(euro);
				
				converted_money.setText("→ " + ergebnis + "$");
				
			}
		});
        
        dollar_to_euro.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String dollar_new;
				dollar_new = money.getText();
				
				int dollar = Integer.parseInt(dollar_new);
				
				Integer ergebnis = MoneyConverter.dollar_to_euro(dollar);
				
				converted_money.setText("→ " + ergebnis + "€");
				
			}
		});
        
        ///////////
        //Actions//
        ///////////
        
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
        
        frame.add(home_button);
        frame.add(money);
        frame.add(converted_money);
        frame.add(dollar_to_euro);
        frame.add(euro_to_dollar);
        frame.setSize(700, 500);
        frame.setLayout(null);
        frame.setResizable(false);
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
