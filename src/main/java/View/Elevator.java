package View;

// Imports
import javax.swing.*;

import java.awt.GridLayout;

public class Elevator extends JFrame {
    // Atributos

    // JLabel
    private JLabel floor6Lab;
    private JLabel floor5Lab;
    private JLabel floor4Lab;
    private JLabel floor3Lab;
    private JLabel floor2Lab;
    private JLabel floor1Lab;
    private JLabel floorTLab;
    private JLabel floorSub1Lab;
    private JLabel floorSub2Lab;

    private JLabel el1;
    private JLabel el2;

    private JLabel vazio;
    private JLabel vazio1;
    private JLabel vazio2;
    private JLabel vazio3;
    private JLabel vazio4;
    private JLabel vazio5;
    private JLabel vazio6;
    private JLabel vazio7;
    private JLabel vazio8;
    private JLabel vazio9;

    private JLabel vazio10;
    private JLabel vazio11;
    private JLabel vazio12;


    // JButton - floors
    private JButton floor6Btn;
    private JButton floor5Btn;
    private JButton floor4Btn;
    private JButton floor3Btn;
    private JButton floor2Btn;
    private JButton floor1Btn;
    private JButton floorTBtn;
    private JButton floorSub1Btn;
    private JButton floorSub2Btn;

    // Constructor
    public Elevator() {
    super("Elevator");

    // JPanel
    JPanel mainPanel = new JPanel();
    this.add(mainPanel);

    // Layout
    GridLayout grid = new GridLayout(10,4); // 9 linhas x 2 colunas
    mainPanel.setLayout(grid);

    // Definindo os botões
    floor6Btn = new JButton("C");
    floor5Btn = new JButton("C");
    floor4Btn = new JButton("C");
    floor3Btn = new JButton("C");
    floor2Btn = new JButton("C");
    floor1Btn = new JButton("C");
    floorTBtn = new JButton("C");
    floorSub1Btn = new JButton("C");
    floorSub2Btn = new JButton("C");

    floor6Lab = new JLabel("6");
    floor5Lab = new JLabel("5");
    floor4Lab = new JLabel("4");
    floor3Lab = new JLabel("3");
    floor2Lab = new JLabel("2");
    floor1Lab = new JLabel("1");
    floorTLab = new JLabel("Térreo");
    floorSub1Lab = new JLabel("Sub 1");
    floorSub2Lab = new JLabel("Sub 2");

    el1 = new JLabel("Elev 1");
    el2 = new JLabel("Elev 2");

    vazio = new JLabel(" ");
    vazio1 = new JLabel(" ");
    vazio2 = new JLabel(" ");
    vazio3 = new JLabel(" ");
    vazio4 = new JLabel(" ");
    vazio5 = new JLabel(" ");
    vazio6 = new JLabel(" ");
    vazio7 = new JLabel(" ");
    vazio8 = new JLabel(" ");
    vazio9 = new JLabel(" ");

    vazio10 = new JLabel(" ");
    vazio11 = new JLabel(" ");
    vazio12 = new JLabel(" ");



    // Add
    mainPanel.add(vazio);
    mainPanel.add(el1);
    mainPanel.add(el2);
    mainPanel.add(vazio10);

    mainPanel.add(floor6Lab);
    mainPanel.add(vazio1);
    mainPanel.add(floor6Btn);

    mainPanel.add(floor5Lab);
    mainPanel.add(vazio2);
    mainPanel.add(floor5Btn);

    mainPanel.add(floor4Lab);
    mainPanel.add(vazio3);
    mainPanel.add(floor4Btn);

    mainPanel.add(floor3Lab);
    mainPanel.add(vazio4);
    mainPanel.add(floor3Btn);

    mainPanel.add(floor2Lab);
    mainPanel.add(vazio5);
    mainPanel.add(floor2Btn);

    mainPanel.add(floor1Lab);
    mainPanel.add(vazio6);
    mainPanel.add(floor1Btn);

    mainPanel.add(floorTLab);
    mainPanel.add(vazio7);
    mainPanel.add(floorTBtn);

    mainPanel.add(floorSub1Lab);
    mainPanel.add(vazio8);
    mainPanel.add(floorSub1Btn);

    mainPanel.add(floorSub2Lab);
    mainPanel.add(vazio9);
    mainPanel.add(floorSub2Btn);



    //setFrame
    //this.pack();
    this.setDefaultCloseOperation(2);
    this.setVisible(true);
    this.setBounds(300, 300, 300, 300);
    }
}
