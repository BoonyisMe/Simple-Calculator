import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class App implements ActionListener {
    JFrame Calculator;
    JLabel Field;
    JPanel buttons;
    JPanel math;
    JPanel mainPanel;
    boolean opactiv = false;
    boolean err = false;
    boolean temp = false;
    int n1, n2;
    String operator;

    public static void main(String[] args) {
        new App();
    }

    public  App() {
        Calculator = new JFrame("Calculator");
        mainPanel  = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        Field = new JLabel();
        math = new JPanel();
       math.setPreferredSize(new Dimension(400,
       100));
       math.setMaximumSize(new Dimension(400,
       100));
        buttons = new JPanel();
        buttons.setLayout(new GridLayout(4, 4));
            JButton b9 = new JButton(new AbstractAction("9"){
                @Override
                public void actionPerformed(ActionEvent e){
                    temp = false;
                    if (opactiv||err){ 
                        Field.setText("");
                        
                        err = false;
                }
                    Field.setText(Field.getText() + "9");
                }
            });
            b9.addActionListener(this);
            JButton b8 = new JButton(new AbstractAction("8"){
                @Override
                public void actionPerformed(ActionEvent e){
                    temp = false;
                    if (opactiv||err) { 
                        Field.setText("");
                        
                        err = false;
                }
                    Field.setText(Field.getText() + "8");
                }
            });
            JButton b7 = new JButton(new AbstractAction("7"){
                @Override
                public void actionPerformed(ActionEvent e){
                    temp = false;
                    if (opactiv||err) { 
                        Field.setText("");
                        
                        err = false;
                }
                    Field.setText(Field.getText() + "7");
                }
            });
            JButton b6 = new JButton(new AbstractAction("6"){
                @Override
                public void actionPerformed(ActionEvent e){
                    temp = false;
                    if (opactiv||err) { 
                        Field.setText("");
                        
                        err = false;
                }
                    Field.setText(Field.getText() + "6");
                }
            });
            JButton b5 = new JButton(new AbstractAction("5"){
                @Override
                public void actionPerformed(ActionEvent e){
                    temp = false;
                    if (opactiv||err) { 
                        Field.setText("");
                        
                        err = false;
                }
                    Field.setText(Field.getText() + "5");
                }
            });
            JButton b4 = new JButton(new AbstractAction("4"){
                @Override
                public void actionPerformed(ActionEvent e){
                    temp = false;
                    if (opactiv||err) { 
                        Field.setText("");
                        
                        err = false;
                }
                    Field.setText(Field.getText() + "4");
                }
            });
            JButton b3 = new JButton(new AbstractAction("3"){
                @Override
                public void actionPerformed(ActionEvent e){
                    temp = false;
                    if (opactiv||err) { 
                        Field.setText("");
                        
                        err = false;
                }
                    Field.setText(Field.getText() + "3");
                }
            });
            JButton b2 = new JButton(new AbstractAction("2"){
                @Override
                public void actionPerformed(ActionEvent e){
                    temp = false;
                    if (opactiv||err){ 
                        Field.setText("");
                        
                        err = false;
                }
                    Field.setText(Field.getText() + "2");
                }
            });
            JButton b1 = new JButton(new AbstractAction("1"){
                @Override
                public void actionPerformed(ActionEvent e){
                    temp = false;
                    if (opactiv||err) { 
                        Field.setText("");
                        
                        err = false;
                }
                    Field.setText(Field.getText() + "1");
                }
            });
            JButton b0 = new JButton(new AbstractAction("0"){
                @Override
                public void actionPerformed(ActionEvent e){
                    temp = false;
                    if (opactiv||err) { 
                        Field.setText("");
                        
                        err = false;
                }
                    Field.setText(Field.getText() + "0");
                }
            });
            JButton clear = new JButton(new AbstractAction("c"){
                @Override
                public void actionPerformed(ActionEvent e){
                    temp = false;
                    operator ="";
                    opactiv = false;
                    err = false;
                    Field.setText("");
                }
            });
            JButton equals = new JButton(new AbstractAction("="){
                @Override
                public void actionPerformed(ActionEvent e){
                    n2 = Integer.parseInt(Field.getText());
                    if (opactiv){
                    switch(operator){
                        case "+":n1+=n2;
                                break;
                        case "-":n1-=n2;
                                break;
                        case "*":n1*=n2;
                                break;
                        case "/":if(n2==0){
                            Field.setText("Divide by Zero Error");
                            err = true;
                                }
                                else
                                n1/=n2;
                                break;
                        default: break;
                            }
                        }
                    opactiv = false;
                    if(temp){
                        switch(operator){
                            case "+":n1+=n1;
                                    break;
                            case "-":n1-=n1;
                                    break;
                            case "*":n1*=n1;
                                    break;
                            case "/":if(n1==0){
                                Field.setText("Divide by Zero Error");
                                err = true;
                                    }
                                    else
                                    n1/=n1;
                                    break;
                            default: break;
                        }
                    }
                    temp = true;
                        
                
                    Field.setText(Integer.toString(n1));
                }
            });
            JButton plus = new JButton(new AbstractAction("+"){
                @Override
                public void actionPerformed(ActionEvent e){
                    if(opactiv){
                        n1 +=  Integer.parseInt(Field.getText());
                        n2 = Integer.parseInt(Field.getText());
                        operator = "+";
                    }
                    else{
                    opactiv = true;
                    n1 = Integer.parseInt(Field.getText());
                    operator = "+";
                    }
                }
            });
            JButton minus = new JButton(new AbstractAction("-"){
                @Override
                public void actionPerformed(ActionEvent e){
                    if(opactiv){
                        n1-= Integer.parseInt(Field.getText());
                        n2 = Integer.parseInt(Field.getText());
                        operator = "-";
                    }
                    else{
                    opactiv = true;
                    n1 = Integer.parseInt(Field.getText());
                    operator = "-";
                    }
                }
            });
            JButton multiply = new JButton(new AbstractAction("*"){
                @Override
                public void actionPerformed(ActionEvent e){
                    if(opactiv){
                        n1 *= Integer.parseInt(Field.getText());
                        n2 = Integer.parseInt(Field.getText());
                        operator = "*";
                    }
                    else{
                    opactiv = true;
                    n1 = Integer.parseInt(Field.getText());
                    operator = "*";
                    }
                }
            });
            JButton divide = new JButton(new AbstractAction("/"){
                @Override
                public void actionPerformed(ActionEvent e){
                    if(opactiv){
                        int i = Integer.parseInt(Field.getText());
                        if(i==0) {
                            Field.setText("Divide by Zero Error");
                            err = true;
                        }
                        else
                        n1/=Integer.parseInt(Field.getText());
                        n2 = Integer.parseInt(Field.getText());
                        operator = "/";
                    }
                    else{
                    opactiv = true;
                    n1 = Integer.parseInt(Field.getText());
                    operator = "/";
                    }
                }
            });
            
        math.add (Field);
        buttons.add(b9);
        buttons.add(b8);
        buttons.add(b7);
        buttons.add(plus);
        buttons.add(b6);
        buttons.add(b5);
        buttons.add(b4);
        buttons.add(minus);
        buttons.add(b3);
        buttons.add(b2);
        buttons.add(b1);
        buttons.add(multiply);
        buttons.add(clear);
        buttons.add(b0);
        buttons.add(equals);
        buttons.add(divide);

        Calculator.setSize(400,500);//400 width and 500 height  
        mainPanel.add(math);
        mainPanel.add(buttons);
        Calculator.add(mainPanel);
        Calculator.setVisible(true);//making the frame visible  
        Calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }
}

