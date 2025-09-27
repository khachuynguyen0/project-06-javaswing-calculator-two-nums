import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {
    
    private JTextField firstNumberField;
    private JTextField secondNumberField;
    private JTextField resultField;
    private JButton addButton;
    private JButton subtractButton;
    private JButton multiplyButton;
    private JButton divideButton;
    private JButton clearButton;
    
    public Calculator() {
        initializeGUI();
    }
    
    private void initializeGUI() {
        setTitle("Two Numbers Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        
        // Create components
        firstNumberField = new JTextField(15);
        secondNumberField = new JTextField(15);
        resultField = new JTextField(15);
        resultField.setEditable(false);
        resultField.setBackground(Color.LIGHT_GRAY);
        
        addButton = new JButton("+");
        subtractButton = new JButton("-");
        multiplyButton = new JButton("×");
        divideButton = new JButton("÷");
        clearButton = new JButton("Clear");
        
        // Add action listeners
        addButton.addActionListener(this);
        subtractButton.addActionListener(this);
        multiplyButton.addActionListener(this);
        divideButton.addActionListener(this);
        clearButton.addActionListener(this);
        
        // Layout components
        gbc.insets = new Insets(5, 5, 5, 5);
        
        // First number
        gbc.gridx = 0; gbc.gridy = 0;
        add(new JLabel("First Number:"), gbc);
        gbc.gridx = 1; gbc.gridy = 0;
        add(firstNumberField, gbc);
        
        // Second number
        gbc.gridx = 0; gbc.gridy = 1;
        add(new JLabel("Second Number:"), gbc);
        gbc.gridx = 1; gbc.gridy = 1;
        add(secondNumberField, gbc);
        
        // Operation buttons
        gbc.gridx = 0; gbc.gridy = 2;
        add(addButton, gbc);
        gbc.gridx = 1; gbc.gridy = 2;
        add(subtractButton, gbc);
        
        gbc.gridx = 0; gbc.gridy = 3;
        add(multiplyButton, gbc);
        gbc.gridx = 1; gbc.gridy = 3;
        add(divideButton, gbc);
        
        // Result
        gbc.gridx = 0; gbc.gridy = 4;
        add(new JLabel("Result:"), gbc);
        gbc.gridx = 1; gbc.gridy = 4;
        add(resultField, gbc);
        
        // Clear button
        gbc.gridx = 0; gbc.gridy = 5;
        gbc.gridwidth = 2;
        add(clearButton, gbc);
        
        pack();
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String firstText = firstNumberField.getText().trim();
            String secondText = secondNumberField.getText().trim();
            
            if (e.getSource() == clearButton) {
                firstNumberField.setText("");
                secondNumberField.setText("");
                resultField.setText("");
                return;
            }
            
            if (firstText.isEmpty() || secondText.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter both numbers!", 
                    "Input Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            double firstNumber = Double.parseDouble(firstText);
            double secondNumber = Double.parseDouble(secondText);
            double result = 0;
            
            if (e.getSource() == addButton) {
                result = firstNumber + secondNumber;
            } else if (e.getSource() == subtractButton) {
                result = firstNumber - secondNumber;
            } else if (e.getSource() == multiplyButton) {
                result = firstNumber * secondNumber;
            } else if (e.getSource() == divideButton) {
                if (secondNumber == 0) {
                    JOptionPane.showMessageDialog(this, "Cannot divide by zero!", 
                        "Division Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                result = firstNumber / secondNumber;
            }
            
            // Format the result to remove unnecessary decimal places
            if (result == (long) result) {
                resultField.setText(String.valueOf((long) result));
            } else {
                resultField.setText(String.format("%.6g", result));
            }
            
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers!", 
                "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Calculator().setVisible(true);
        });
    }
}