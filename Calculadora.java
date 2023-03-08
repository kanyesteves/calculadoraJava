import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame {
    private JButton seven;
    private JButton eight;
    private JButton nine;
    private JButton four;
    private JButton six;
    private JButton one;
    private JButton two;
    private JButton three;
    private JButton five;
    private JButton zero;
    private JButton comma;
    private JButton operatorEqual;
    private JButton operatorDivision;
    private JButton operatorMultiplication;
    private JButton operatorSubtraction;
    private JButton operatorSum;
    private JTextField textDisplay;
    private JButton btnClearAll;
    private JButton btnClear;
    private JPanel pnlCalc;

    double valor1;
    double valor2;
    String operator;

    public Calculadora() {
        initComponents();
        addListeners();
    }

    private void initComponents() {
        JPanel calc = new JPanel();
        setSize(500, 350);
        setContentPane(pnlCalc);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setVisible(true);
    }

    private void addListeners() {
        zero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + "0");
            }
        });

        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + "1");
            }
        });

        two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + "2");
            }
        });

        three.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + "3");
            }
        });

        four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + "4");
            }
        });

        five.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + "5");
            }
        });

        six.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + "6");
            }
        });

        seven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + "7");
            }
        });

        eight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + "8");
            }
        });

        nine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + "9");
            }
        });

        operatorSum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor1 = Double.parseDouble(textDisplay.getText());
                textDisplay.setText("");
                operator = "+";
            }
        });

        operatorSubtraction.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor1 = Double.parseDouble(textDisplay.getText());
                textDisplay.setText("");
                operator = "-";
            }
        });

        operatorMultiplication.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor1 = Double.parseDouble(textDisplay.getText());
                textDisplay.setText("");
                operator = "*";
            }
        });

        operatorDivision.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor1 = Double.parseDouble(textDisplay.getText());
                textDisplay.setText("");
                operator = "/";
            }
        });

        operatorEqual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor2 = Double.parseDouble(textDisplay.getText());

                switch (operator) {
                    case "+":
                        textDisplay.setText(String.valueOf(valor1 + valor2));
                        break;
                    case "-":
                        textDisplay.setText(String.valueOf(valor1 - valor2));
                        break;
                    case "*":
                        textDisplay.setText(String.valueOf(valor1 * valor2));
                        break;
                    case "/":
                        textDisplay.setText(String.valueOf(valor1 / valor2));
                        break;
                    default:
                        break;
                }
            }
        });

        btnClearAll.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText("");
                operator = "";
            }
        });
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
   }
}
