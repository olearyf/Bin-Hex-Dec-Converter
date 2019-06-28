import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainFrame extends JFrame implements ActionListener {

    String[] options = {"Binary", "Decimal", "Hexadecimal"};
    JTextField input, output;
    JButton compute;
    JComboBox optionList, optionList2;
    Converter c = new Converter();

    MainFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setTitle("Bin-Hex-Dec Converter");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int h = (int)screenSize.getHeight();
        int w = (int)screenSize.getWidth();
        setLocation(w/2-200, h/2-150);
        setResizable(false);
        ImageIcon icon = new ImageIcon("C:\\Users\\fraol\\IdeaProjects\\Bin-Hex-Dec-Converter\\icons8-binary-file-50.png");
        setIconImage(icon.getImage());

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));

        optionList = new JComboBox(options);
        optionList2 = new JComboBox(options);
        input = new JTextField(20);
        output = new JTextField(20);
        compute = new JButton("Convert");
        compute.addActionListener(this);

        Box left = Box.createVerticalBox();
        left.add(optionList);
        left.add(input);

        Box right = Box.createVerticalBox();
        right.add(optionList2);
        right.add(output);

        Box center = Box.createHorizontalBox();
        center.add(Box.createVerticalStrut(30));
        center.add(compute);
        center.add(Box.createVerticalStrut(30));

        Box top = Box.createHorizontalBox();
        top.add(Box.createHorizontalStrut(20));
        top.add(left);
        top.add(new JLabel("      =      "));
        top.add(right);
        top.add(Box.createHorizontalStrut(20));

        Box main = Box.createVerticalBox();
        main.add(Box.createVerticalStrut(80));
        main.add(top);
        main.add(Box.createVerticalStrut(60));
        main.add(center);
        main.add(Box.createVerticalStrut(40));

        panel.add(main);
        add(panel);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String in = input.getText();
        String initType = (String)optionList.getSelectedItem();
        String finalType = (String)optionList2.getSelectedItem();

        if(initType == "Binary"){
            if(finalType == "Binary"){
                output.setText(in);
            }
            if(finalType == "Decimal"){
                output.setText("" + c.binToDec(in));
            }
            if(finalType == "Hexadecimal"){
                output.setText(c.binToHex(in));
            }
        }

        if(initType == "Decimal"){
            int decInt = Integer.parseInt(in);
            if(finalType == "Binary"){
                output.setText(c.decToBin(decInt));
            }
            if(finalType == "Decimal"){
                output.setText(in);
            }
            if(finalType == "Hexadecimal"){
                output.setText(c.decToHex(decInt));
            }
        }

        if(initType == "Hexadecimal"){
            if(finalType == "Binary"){
                output.setText(c.hexToBin(in));
            }
            if(finalType == "Decimal"){
                output.setText("" + c.hexToDec(in));
            }
            if(finalType == "Hexadecimal"){
                output.setText(in);
            }
        }

    }
}

