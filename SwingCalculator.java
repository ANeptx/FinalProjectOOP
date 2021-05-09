//CHITSANUPONG JUNTAN 6135512056

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.*;

public class SwingCalculator extends JFrame {
    private double operand1;
    private double operand2;
    private String operator = "";
    private boolean isOp2 = false;



    public SwingCalculator() {
        super("Swing Calculator");

        // 1. create components
        JTextField txtResult = new JTextField("");

        JPanel pnlButtons = new JPanel();
        pnlButtons.setLayout(new GridLayout(6, 5, 2, 2));

        JButton[] btnNum = new JButton[10];
        for (int i = 0; i <= 9; i++) {
            btnNum[i] = new JButton(Integer.toString(i));
            btnNum[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    JButton btnThis = (JButton) e.getSource();
                    String number = txtResult.getText() + btnThis.getText();

                    if (!isOp2) {
                        operand1 = Double.parseDouble(number);
                        txtResult.setText(String.valueOf(number));
                    } else {
                        operand2 = Double.parseDouble(number);
                        txtResult.setText(String.valueOf(number));
                    }
                }
            });
        }
        
        JButton btnSin = new JButton("sin");
        btnSin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JButton btnThis = (JButton) e.getSource();
                operator = btnThis.getText();
                isOp2 = true;
                txtResult.setText("");
            }
        });

        JButton btnCos = new JButton("cos");
        btnCos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JButton btnThis = (JButton) e.getSource();
                operator = btnThis.getText();
                isOp2 = true;
                txtResult.setText("");
            }
        });

        JButton btnTan = new JButton("tan");
        btnTan.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JButton btnThis = (JButton) e.getSource();
                operator = btnThis.getText();
                isOp2 = true;
                txtResult.setText("");
            }
        });

        JButton btnLog = new JButton("log");
        btnLog.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JButton btnThis = (JButton) e.getSource();
                operator = btnThis.getText();
                isOp2 = true;
                txtResult.setText("");
            }
        });

        JButton btnLn = new JButton("ln");
        btnLn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JButton btnThis = (JButton) e.getSource();
                operator = btnThis.getText();
                isOp2 = true;
                txtResult.setText("");
            }
        });

        JButton btnPow = new JButton("x^2");
        btnPow.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JButton btnThis = (JButton) e.getSource();
                operator = btnThis.getText();
                isOp2 = true;
                txtResult.setText("");
            }
        });

        JButton btnPowy = new JButton("x^y");
        btnPowy.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JButton btnThis = (JButton) e.getSource();
                operator = btnThis.getText();
                isOp2 = true;
                txtResult.setText("");
            }
        });

        JButton btnExpo = new JButton("e^x");
        btnExpo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JButton btnThis = (JButton) e.getSource();
                operator = btnThis.getText();
                isOp2 = true;
                txtResult.setText("");
            }
        });

        JButton btnRec = new JButton("1/x");
        btnRec.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JButton btnThis = (JButton) e.getSource();
                operator = btnThis.getText();
                isOp2 = true;
                txtResult.setText("");
            }
        });

        JButton btnSqrt = new JButton("sqrt");
        btnSqrt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JButton btnThis = (JButton) e.getSource();
                operator = btnThis.getText();
                isOp2 = true;
                txtResult.setText("");
            }
        });


        JButton btnPlus = new JButton("+");
        btnPlus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JButton btnThis = (JButton) e.getSource();
                operator = btnThis.getText();
                isOp2 = true;
                txtResult.setText("");
            }
        });

        JButton btnMinus = new JButton("-");
        btnMinus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JButton btnThis = (JButton) e.getSource();
                operator = btnThis.getText();
                isOp2 = true;
                txtResult.setText("");
            }
        });

        JButton btnMultiply = new JButton("*");
        btnMultiply.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JButton btnThis = (JButton) e.getSource();
                operator = btnThis.getText();
                isOp2 = true;
                txtResult.setText("");
            }
        });

        JButton btnDivide = new JButton("/");
        btnDivide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JButton btnThis = (JButton) e.getSource();
                operator = btnThis.getText();
                isOp2 = true;
                txtResult.setText("");
            }
        });

        JButton btnDot = new JButton(".");
        btnDot.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e)
        {
            if(txtResult.getText().contains(".")==false)
            txtResult.setText(txtResult.getText()+("."));
        }
        });
        

        JButton btnPi = new JButton("Pi");
        btnPi.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String number = txtResult.getText() + String.valueOf(Math.PI);
                    if (!isOp2) {
                        operand1 = Double.parseDouble(number);
                        txtResult.setText(String.valueOf(number));
                    } else {
                        operand1 = Double.parseDouble(number);
                       txtResult.setText(String.valueOf(number));
                    }
                }
        });
        
        JButton btnEx = new JButton("e");
        btnEx.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String number = txtResult.getText() + String.valueOf(Math.E);
                if (!isOp2) {
                    operand1 = Double.parseDouble(number);
                    txtResult.setText(String.valueOf(number));
                } else {
                    operand1 = Double.parseDouble(number);
                   txtResult.setText(String.valueOf(number));
                }
            }
        });

        JButton btnExecute = new JButton("=");
        btnExecute.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double result = 0;

                if (operator == "+")
                    txtResult.setText(String.valueOf(operand1 + operand2));
                else if (operator == "-")
                    txtResult.setText(String.valueOf(operand1 - operand2));
                else if (operator == "*")
                    txtResult.setText(String.valueOf(operand1 * operand2));
                else if (operator == "/")
                    txtResult.setText(String.valueOf(operand1 / operand2));
                else if (operator == "x^2")
                    txtResult.setText(String.valueOf(Math.pow(operand1,2))); 
                else if (operator == "x^y")
                    txtResult.setText(String.valueOf(Math.pow(operand1,operand2)));
                else if (operator == "1/x")
                    txtResult.setText(String.valueOf(Math.pow(operand1,-1)));
                else if (operator == "e^x")
                    txtResult.setText(String.valueOf(Math.exp(operand1)));
                // else if (operator == "e")
                //     txtResult.setText(String.valueOf(Math.E));
                else if (operator == "sqrt")
                    txtResult.setText(String.valueOf(Math.sqrt(operand1)));
                // else if (operator == "Pi")
                //     txtResult.setText(String.valueOf(Math.PI));
                else if (operator == "log")
                    txtResult.setText(String.valueOf(Math.log10(operand1)));
                else if (operator == "ln")
                    txtResult.setText(String.valueOf(Math.log(operand1)));
                else if (operator == "sin")
                    txtResult.setText(String.valueOf(Math.sin(Math.toRadians(operand1))));
                else if (operator == "cos")
                    txtResult.setText(String.valueOf(Math.cos(Math.toRadians(operand1))));
                else if (operator == "tan")
                    txtResult.setText(String.valueOf(Math.tan(Math.toRadians(operand1))));
                else
                    result = 0;

                
                operand1 = result;
                operand2 = 0;
                isOp2 = false;
            }
        });

        JButton btnDel = new JButton("DEL");
        btnDel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String s = txtResult.getText();
                txtResult.setText("");
                for(int i=0; i<s.length()-1;i++)
                txtResult.setText(txtResult.getText()+s.charAt(i));
            }
        });

        JButton btnClear = new JButton("C");
        btnClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtResult.setText("");
                operand1 = 0;
                operand2 = 0;
                isOp2 = false;
            }
        });

        // 2. place components on layout/panel
        Container c = getContentPane();
        c.add(txtResult, BorderLayout.NORTH);
        c.add(pnlButtons);

        // sin cos tan log ln
        pnlButtons.add(btnSin);
        pnlButtons.add(btnCos);
        pnlButtons.add(btnTan);
        pnlButtons.add(btnLog);
        pnlButtons.add(btnLn);

        // x^2 x^y e^x 1/x sqrt
        pnlButtons.add(btnPow);
        pnlButtons.add(btnPowy);
        pnlButtons.add(btnExpo);
        pnlButtons.add(btnRec);
        pnlButtons.add(btnSqrt);

        // 7 8 9 DEL C
        pnlButtons.add(btnNum[7]);
        pnlButtons.add(btnNum[8]);
        pnlButtons.add(btnNum[9]);
        pnlButtons.add(btnDel);
        pnlButtons.add(btnClear);

        // 4 5 6 * /
        pnlButtons.add(btnNum[4]);
        pnlButtons.add(btnNum[5]);
        pnlButtons.add(btnNum[6]);
        pnlButtons.add(btnMultiply);
        pnlButtons.add(btnDivide);

        // 1 2 3 + -
        pnlButtons.add(btnNum[1]);
        pnlButtons.add(btnNum[2]);
        pnlButtons.add(btnNum[3]);
        pnlButtons.add(btnPlus);
        pnlButtons.add(btnMinus);

        // 0 . π e =
        pnlButtons.add(btnNum[0]);
        pnlButtons.add(btnDot);
        pnlButtons.add(btnPi);
        pnlButtons.add(btnEx);
        pnlButtons.add(btnExecute);

        // 3. event handler + set properties

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new SwingCalculator();
    }
}
