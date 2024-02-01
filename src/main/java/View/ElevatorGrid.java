package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import Model.*;

public class ElevatorGrid extends JFrame {
    // Defining the elements
    private Elevador elevator1;
    private Elevador elevator2;
    private JLabel labelFloor;
    private JLabel labelElevator1;
    private JLabel labelElevator2;

    public ElevatorGrid() {
        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        elevator1 = new Elevador();
        elevator2 = new Elevador();

        // Set BorderLayout
        setLayout(new BorderLayout());
        this.setBackground(new Color(70, 130, 180));
        // Creating Panel for status of elevators and using 'GridLayout'
        JPanel elevatorsPanel = new JPanel();
        elevatorsPanel.setLayout(new GridLayout(2, 1));
        // Creating Panel for Buttons
        JPanel buttonsPanel = new JPanel(new GridLayout(3,3));

        // Defining the labels
        labelFloor = new JLabel("Current Floor:");
        labelFloor.setFont(new Font("Monospaced", Font.BOLD, 16));

        labelFloor.setBackground(Color.GRAY);
        labelElevator1 = new JLabel("Elevator 1:");
        labelElevator1.setFont(new Font("Monospaced", Font.BOLD, 16));
        labelElevator2 = new JLabel("Elevator 2:");
        labelElevator2.setFont(new Font("Monospaced", Font.BOLD, 16));

        // Adding 'elevator 1 and 2' to the 'elevatorsPanel'
        elevatorsPanel.add(labelElevator1);
        elevatorsPanel.add(labelElevator2);
        // elevatorsPanel.add(labelFloor);

        // Creating the buttons using forloop
        for (int i = -2; i <= 6; i++) {
            JButton btnAndar = new JButton(Integer.toString(i)); // Creating the buttons
            btnAndar.addActionListener(new BotaoAndarListener(i)); // Adding Action to buttons
            buttonsPanel.add(btnAndar); // Adding the buttons on the 'buttonsPanel'
        // Set button properties for a better appearance
  
        btnAndar.setFocusPainted(false);
        btnAndar.setFont(new Font("Calibri", Font.BOLD, 16));
        btnAndar.setBackground(new Color(70, 130, 180));
        btnAndar.setForeground(Color.WHITE);
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
 
    private class BotaoAndarListener implements ActionListener {
        private int andarDestino;
    
        public BotaoAndarListener(int andar) {
            this.andarDestino = andar;
        }
    
        @Override
        public void actionPerformed(ActionEvent e) {
            // Moving elevator to floor clicked
            int elevadorMaisProximo = calculateElevator(andarDestino);
            if (elevadorMaisProximo == 1) {
                elevator1.irParaAndar(andarDestino);
                labelFloor.setText("Current Floor: " + andarDestino);
                labelElevator1.setText("Elevator 1: Floor " + andarDestino);
            } else {
                elevator2.irParaAndar(andarDestino);
                labelFloor.setText("Current Floor: " + andarDestino);
                labelElevator2.setText("Elevator 2: Floor " + andarDestino);
            }
    
            // Perguntar para qual andar o usuário deseja ir
            String[] opcoesAndares = new String[]{"Subsoil 1", "Subsoil 2", "Ground floor", "Floor 1", "Floor 2", "Floor 3",
                    "Floor 4", "Floor 5", "Floor 6"};
            String andarEscolhido = (String) JOptionPane.showInputDialog(null,
                    "Choose which floor you want to go to:",
                    "Floors",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opcoesAndares,
                    opcoesAndares[2]);
    
            // Moving the elevator to the floor chosen
            if (andarEscolhido != null) {
                int novoAndar = getIndexFromFloor(andarEscolhido);
                if (elevadorMaisProximo == 1) {
                    elevator1.irParaAndar(novoAndar);
                    labelFloor.setText("Current Floor: " + novoAndar);
                    labelElevator1.setText("Elevator 1: Floor " + novoAndar);
                } else {
                    elevator2.irParaAndar(novoAndar);
                    labelFloor.setText("Current Floor: " + novoAndar);
                    labelElevator2.setText("Elevator 2: Floor " + novoAndar);
                }
            }
        }
    
        // Método auxiliar para obter o índice do andar a partir do nome
        private int getIndexFromFloor(String floorName) {
            String[] opcoesAndares = new String[]{"Subsoil 1", "Subsoil 2", "Ground floor", "Floor 1", "Floor 2", "Floor 3",
                    "Floor 4", "Floor 5", "Floor 6"};
            for (int i = 0; i < opcoesAndares.length; i++) {
                if (opcoesAndares[i].equals(floorName)) {
                    return i - 2;
                }
            }
            return -1;
        }
    }

    // Calculating the distance to elevators
    private int calculateElevator(int andarDestino) {
        int distanciaElevador1 = Math.abs(elevator1.getAndarAtual() - andarDestino);
        int distanciaElevador2 = Math.abs(elevator2.getAndarAtual() - andarDestino);

        if (distanciaElevador1 < distanciaElevador2) {
            return 1;
        } else {
            return 2;
        }
    }

}
