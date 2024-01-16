

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab_Exercise_9 extends JFrame {

    private JTextField gameIdField;
    private JTextField customerIdField;
    private JButton rentButton;

    public Lab_Exercise_9() {
        setTitle("Game Rental Store");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        initComponents();
    }

    private void initComponents() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        JLabel gameIdLabel = new JLabel("Game ID:");
        gameIdField = new JTextField();

        JLabel customerIdLabel = new JLabel("Customer ID:");
        customerIdField = new JTextField();

        rentButton = new JButton("Rent Game");

        panel.add(gameIdLabel);
        panel.add(gameIdField);
        panel.add(customerIdLabel);
        panel.add(customerIdField);
        panel.add(rentButton);

        rentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rentGame();
            }
        });

        getContentPane().add(panel);
    }

    private void rentGame() {
        // Add your logic here to handle game rental
        int gameId = Integer.parseInt(gameIdField.getText());
        int customerId = Integer.parseInt(customerIdField.getText());

        // Add logic to process the rental

        // For now, just show a message
        JOptionPane.showMessageDialog(this, "Game rented successfully!");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Lab_Exercise_9().setVisible(true);
            }
        });
    }
}
