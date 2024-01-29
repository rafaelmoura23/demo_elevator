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
    GridLayout grid = new GridLayout(9,2); // 9 linhas x 2 colunas
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


    // Add
    mainPanel.add(floor6Lab);
    mainPanel.add(floor6Btn);

    mainPanel.add(floor5Lab);
    mainPanel.add(floor5Btn);

    mainPanel.add(floor4Lab);
    mainPanel.add(floor4Btn);

    mainPanel.add(floor3Lab);
    mainPanel.add(floor3Btn);

    mainPanel.add(floor2Lab);
    mainPanel.add(floor2Btn);

    mainPanel.add(floor1Lab);
    mainPanel.add(floor1Btn);

    mainPanel.add(floorTLab);
    mainPanel.add(floorTBtn);

    mainPanel.add(floorSub1Lab);
    mainPanel.add(floorSub1Btn);

    mainPanel.add(floorSub2Lab);
    mainPanel.add(floorSub2Btn);



    //setFrame
    this.pack();
    this.setDefaultCloseOperation(2);
    this.setVisible(true);
    }
}
