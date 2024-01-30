package View;

// Imports
import javax.swing.*;

import javax.swing.border.Border;

import java.awt.*;


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
    private JLabel vazio13;
    private JLabel vazio14;
    private JLabel vazio15;
    private JLabel vazio16;
    private JLabel vazio17;
    private JLabel vazio18;
    private JLabel vazio19;

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
    GridLayout grid = new GridLayout(9, 4); // 9 linhas x 2 colunas
    mainPanel.setLayout(grid);

    // Definindo os botões
    floor6Btn = new JButton("🔥");
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
    vazio13 = new JLabel(" ");
    vazio14 = new JLabel(" ");
    vazio15 = new JLabel(" ");
    vazio16 = new JLabel(" ");
    vazio17 = new JLabel(" ");
    vazio18 = new JLabel(" ");
    vazio19 = new JLabel(" ");


    Border borda = BorderFactory.createLineBorder(Color.BLACK);

    floor6Lab.setBorder(borda);
    floor5Lab.setBorder(borda);
    floor4Lab.setBorder(borda);
    floor3Lab.setBorder(borda);
    floor2Lab.setBorder(borda);
    floor1Lab.setBorder(borda);
    floorTLab.setBorder(borda);
    floorSub1Lab.setBorder(borda);
    floorSub2Lab.setBorder(borda);

    vazio.setBorder(borda);
    vazio1.setBorder(borda);
    vazio2.setBorder(borda);
    vazio3.setBorder(borda);
    vazio4.setBorder(borda);
    vazio5.setBorder(borda);
    vazio6.setBorder(borda);
    vazio7.setBorder(borda);
    vazio8.setBorder(borda);
    vazio9.setBorder(borda);

    vazio10.setBorder(borda);
    vazio11.setBorder(borda);
    vazio12.setBorder(borda);
    vazio13.setBorder(borda);
    vazio14.setBorder(borda);
    vazio15.setBorder(borda);
    vazio16.setBorder(borda);
    vazio17.setBorder(borda);
    vazio18.setBorder(borda);
    vazio19.setBorder(borda);


    // Add
    mainPanel.add(floor6Lab);
    mainPanel.add(vazio1);
    mainPanel.add(vazio10);
    mainPanel.add(floor6Btn);

    mainPanel.add(floor5Lab);
    mainPanel.add(vazio2);
    mainPanel.add(vazio11);
    mainPanel.add(floor5Btn);

    mainPanel.add(floor4Lab);
    mainPanel.add(vazio3);
    mainPanel.add(vazio12);
    mainPanel.add(floor4Btn);

    mainPanel.add(floor3Lab);
    mainPanel.add(vazio4);
    mainPanel.add(vazio13);
    mainPanel.add(floor3Btn);

    mainPanel.add(floor2Lab);
    mainPanel.add(vazio5);
    mainPanel.add(vazio14);
    mainPanel.add(floor2Btn);

    mainPanel.add(floor1Lab);
    mainPanel.add(vazio6);
    mainPanel.add(vazio15);
    mainPanel.add(floor1Btn);

    mainPanel.add(floorTLab);
    mainPanel.add(vazio7);
    mainPanel.add(vazio16);
    mainPanel.add(floorTBtn);

    mainPanel.add(floorSub1Lab);
    mainPanel.add(vazio8);
    mainPanel.add(vazio17);
    mainPanel.add(floorSub1Btn);

    mainPanel.add(floorSub2Lab);
    mainPanel.add(vazio9);
    mainPanel.add(vazio18);
    mainPanel.add(floorSub2Btn);



    //setFrame
    //this.pack();
    this.setDefaultCloseOperation(2);
    this.setVisible(true);
    this.setBounds(300, 300, 300, 300);
    }
}
