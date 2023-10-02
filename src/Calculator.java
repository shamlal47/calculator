import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Calculator implements ActionListener {
    JFrame jf;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, beq, bpl, bmi, bmu, bdi, bDot, bClear;
    JLabel displayLabel;
    String math, oldVal;


    Calculator() {
        jf = new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(600, 600);
        displayLabel = new JLabel();

        displayLabel.setBounds(30, 10, 560, 100);
        displayLabel.setBackground(Color.gray);
        displayLabel.setOpaque(true);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setForeground(Color.white);


        b7 = ButtonFunction("7", 30, 130, 80, 80, jf);

        b8 = ButtonFunction("8", 130, 130, 80, 80, jf);

        b9 = ButtonFunction("9", 230, 130, 80, 80, jf);

        b6 = ButtonFunction("6", 230, 230, 80, 80, jf);

        b5 = ButtonFunction("5", 130, 230, 80, 80, jf);


        b4 = ButtonFunction("4", 30, 230, 80, 80, jf);

        b3 = ButtonFunction("3", 230, 330, 80, 80, jf);

        b2 = ButtonFunction("2", 130, 330, 80, 80, jf);

        b1 = ButtonFunction("1", 30, 330, 80, 80, jf);


        b0 = ButtonFunction("0", 80, 430, 350, 80, jf);

        bDot = ButtonFunction(".", 30, 230, 80, 80, jf);

        bClear = ButtonFunction("clear", 330, 130, 80, 80, jf);

        bmi = ButtonFunction("-", 330, 230, 80, 80, jf);


        bpl = ButtonFunction("+", 330, 330, 80, 80, jf);

        beq = ButtonFunction("=", 430, 330, 80, 80, jf);


        bdi = ButtonFunction("/", 430, 130, 80, 80, jf);


        bmu = ButtonFunction("*", 430, 230, 80, 80, jf);


        jf.setLocation(300, 150);
        jf.add(displayLabel);


        jf.setVisible(true);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }

    public static void main(String[] args) {
        new Calculator();


    }

    JButton ButtonFunction(String name, int x, int y, int width, int height, JFrame frame) {

        JButton button = new JButton(name);
        button.setBounds(x, y, width, height);
        frame.add(button);
        button.addActionListener(this);
        return button;

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String labelText = displayLabel.getText();
        if (e.getSource() == b7) {
            displayLabel.setText(labelText + "7");
        } else if (e.getSource() == b8) {
            displayLabel.setText(labelText + "8");
        } else if (e.getSource() == b9) {
            displayLabel.setText(labelText + "9");
        } else if (e.getSource() == b6) {
            displayLabel.setText(labelText + "6");
        } else if (e.getSource() == b5) {
            displayLabel.setText(labelText + "5");
        } else if (e.getSource() == b4) {
            displayLabel.setText(labelText + "4");
        } else if (e.getSource() == b3) {
            displayLabel.setText(labelText + "3");
        } else if (e.getSource() == b2) {
            displayLabel.setText(labelText + "2");
        } else if (e.getSource() == b1) {
            displayLabel.setText(labelText + "1");
        } else if (e.getSource() == b0) {
            displayLabel.setText(labelText + "0");
        } else if (e.getSource() == beq) {
            float oldValue = Float.parseFloat(oldVal);

            if (math.equals("+")){
                float crrntValue = Float.parseFloat(labelText.replace("+",""));

                float ans =oldValue+crrntValue;

                displayLabel.setText(ans+"");


            }
            else if (math.equals("-")){

                float Current = Float.parseFloat(labelText.replace("-",""));
                displayLabel.setText((oldValue-Current)+"");
            }
            else if (math.equals("*")){

                float Current = Float.parseFloat(labelText.replace("*",""));
                displayLabel.setText((oldValue*Current)+"");
            }
            else if (math.equals("/")){

                float Current = Float.parseFloat(labelText.replace("/",""));
                displayLabel.setText((oldValue/Current)+"");
            }









        } else if (e.getSource() == bmi) {
            if (!labelText.equals("+")) {
                oldVal= labelText;
                displayLabel.setText("+");
                math="+";
            }

        } else if (e.getSource() == bpl) {
            if (!labelText.equals("+")) {
                oldVal= labelText;
                displayLabel.setText("+");
                math="+";
            }
        } else if (e.getSource() == bdi) {

        } else if (e.getSource() == bmu) {

        } else if (e.getSource() == bClear) {
            displayLabel.setText("");
        } else if (e.getSource() == bDot) {
            displayLabel.setText(labelText + ".");
        }

    }
}
