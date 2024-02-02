package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import Model.*;
import Controller.ElevatorController;

public class ElevatorGrid extends JFrame {
    // Defining the elements
    private Elevador elevator1;
    private Elevador elevator2;
    private JLabel labelFloor;
    private JLabel labelElevator1;
    private JLabel labelElevator2;

    private ImageIcon elevatorUpIcon;
    private ImageIcon elevatorDownIcon;

    private JLabel labelElevator1Img;
    private JLabel labelElevator2Img;

    private int elevatorIconWidth = 50;
    private int elevatorIconHeight = 50;

    private ElevatorController elevatorController;

    public ElevatorGrid() {
        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        // Instanciando, criando um objeto elevator
        elevator1 = new Elevador();
        elevator2 = new Elevador();

        elevatorController = new ElevatorController(elevator1, elevator2);

        // Carregar as imagens
        elevatorUpIcon = new ImageIcon(getClass().getResource("elevatorImg.png"));
        elevatorDownIcon = new ImageIcon(getClass().getResource("elevatorImg.png"));

        elevatorUpIcon.setImage(elevatorUpIcon.getImage().getScaledInstance(elevatorIconWidth, elevatorIconHeight, Image.SCALE_DEFAULT));
        elevatorDownIcon.setImage(elevatorDownIcon.getImage().getScaledInstance(elevatorIconWidth, elevatorIconHeight, Image.SCALE_DEFAULT));

        // Set BorderLayout
        setLayout(new BorderLayout());
        this.setBackground(new Color(70, 130, 180));
        // Creating Panel for status of elevators and using 'GridLayout'
        JPanel elevatorsPanel = new JPanel();
        elevatorsPanel.setLayout(new GridLayout(2, 1));
        // Creating Panel for Buttons
        JPanel buttonsPanel = new JPanel(new GridLayout(3,3));

        // Defining the labels
        labelFloor = new JLabel("Current Floor: Térreo");
        labelFloor.setFont(new Font("Sanserif", Font.BOLD, 16));

        labelFloor.setBackground(Color.GRAY);
        labelElevator1 = new JLabel("Elevator 1: Térreo");
        labelElevator1.setFont(new Font("Sanserif", Font.BOLD, 16));
        labelElevator2 = new JLabel("Elevator 2: Térreo");
        labelElevator2.setFont(new Font("Sanserif", Font.BOLD, 16));

        // Criar JLabels para exibir as imagens dos elevadores
        labelElevator1Img = new JLabel();
        labelElevator2Img = new JLabel();

        // Adicionar as JLabels ao painel de elevadores
        elevatorsPanel.add(labelElevator1Img);
        elevatorsPanel.add(labelElevator2Img);

        // Adding 'elevator 1 and 2' to the 'elevatorsPanel'
        elevatorsPanel.add(labelElevator1);
        elevatorsPanel.add(labelElevator2);
        // elevatorsPanel.add(labelFloor);

        // Creating the buttons using forloop
        for (int i = -2; i <= 6; i++) {
            JButton btnAndar = new JButton(Integer.toString(i)); // Creating the buttons, index
            btnAndar.addActionListener(new buttonsListener(i)); // Adding Action to buttons
            buttonsPanel.add(btnAndar); // Adding the buttons on the 'buttonsPanel'
        // Set button properties for a better appearance
  
        btnAndar.setFocusPainted(false);
        btnAndar.setFont(new Font("Calibri", Font.BOLD, 16));
        btnAndar.setForeground(Color.BLACK);
        }

        // Adding and defining the main panel using 'BorderLayout'
        add(labelFloor, BorderLayout.NORTH);
        add(elevatorsPanel, BorderLayout.CENTER);
        add(buttonsPanel, BorderLayout.SOUTH);

        // Set Frame
        setSize(400, 200);
        setDefaultCloseOperation(2);
        setVisible(true);
        setBounds(500, 180, 500, 350);
    }
 
    
    // Classe para lidar com os eventos dos buttons
    private class buttonsListener implements ActionListener {
        private int destinationFloor;
    
        public buttonsListener(int andar) {
            this.destinationFloor = andar;
        }
    
        @Override
        public void actionPerformed(ActionEvent e) {
            // Moving elevator to floor clicked
            int nearestElevator = calculateElevator(destinationFloor);
            if (nearestElevator == 1) {
                // elevator1.irParaAndar(destinationFloor);
                labelElevator1Img.setIcon(null); // Limpa a imagem
                elevatorController.moveElevator(1, destinationFloor);
                labelFloor.setText("Current Floor: " + destinationFloor);
                labelElevator1.setText("Elevator 1: Floor " + destinationFloor);
                labelElevator1Img.setIcon(elevatorUpIcon);
            } else {
                // elevator2.irParaAndar(destinationFloor);
                labelElevator2Img.setIcon(null); // Limpa a imagem
                elevatorController.moveElevator(2, destinationFloor);
                labelFloor.setText("Current Floor: " + destinationFloor);
                labelElevator2.setText("Elevator 2: Floor " + destinationFloor);
                labelElevator2Img.setIcon(elevatorUpIcon);
            }

    
            // JOptionPane to ask the user the floor
            String[] floorsOptions = new String[]{"Subsoil 1", "Subsoil 2", "Ground floor", "Floor 1", "Floor 2", "Floor 3",
                    "Floor 4", "Floor 5", "Floor 6"}; // Options 
            String andarEscolhido = (String) JOptionPane.showInputDialog(null,
                    "Choose which floor you want to go to:",
                    "Floors",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    floorsOptions,
                    floorsOptions[2]);
    
            // Moving the elevator to the floor chosen
            if (andarEscolhido != null) {
                int newFloor = getIndex(andarEscolhido);
                if (nearestElevator == 1) {
                    labelElevator1Img.setIcon(null); // Limpa a imagem
                    elevator1.irParaAndar(newFloor);
                    labelFloor.setText("Current Floor: " + newFloor);
                    labelElevator1.setText("Elevator 1: Floor " + newFloor);
                    labelElevator1Img.setIcon(elevatorUpIcon);
                } else {
                    labelElevator2Img.setIcon(null); // Limpa a imagem
                    elevator2.irParaAndar(newFloor);
                    labelFloor.setText("Current Floor: " + newFloor);
                    labelElevator2.setText("Elevator 2: Floor " + newFloor);
                    labelElevator2Img.setIcon(elevatorUpIcon);
                }
            }
        }
    
        // Obtaining the correct index
        private int getIndex(String floorName) {
            String[] floorsOptions = new String[]{"Subsoil 1", "Subsoil 2", "Ground floor", "Floor 1", "Floor 2", "Floor 3",
                    "Floor 4", "Floor 5", "Floor 6"};
            for (int i = 0; i < floorsOptions.length; i++) {
                if (floorsOptions[i].equals(floorName)) {
                    return i - 2;
                }
            }
            return -1;
        }
    }

    // Calculating the distance to elevators
    private int calculateElevator(int destinationFloor) {
        int elevatorDistance1 = Math.abs(elevator1.getAndarAtual() - destinationFloor);
        int elevatorDistance2 = Math.abs(elevator2.getAndarAtual() - destinationFloor);

        if (elevatorDistance1 < elevatorDistance2) {
            return 1;
        } else {
            return 2;
        }
    }

}
