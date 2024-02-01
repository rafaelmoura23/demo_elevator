package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.*;

public class ElevatorGrid extends JFrame {
    // Defining the elements
    private Elevador elevator1;
    private Elevador elevator2;
    private JLabel labelFloor;
    private JLabel labelElevator1;
    private JLabel labelElevator2;

    public ElevatorGrid() {
        elevator1 = new Elevador();
        elevator2 = new Elevador();

        // Set BorderLayout
        setLayout(new BorderLayout());
        // Creating Panel for status of elevators and using 'GridLayout'
        JPanel elevatorsPanel = new JPanel();
        elevatorsPanel.setLayout(new GridLayout(2, 1));

        // set frame
        setTitle("Elevator");
        setSize(400, 200);
        setDefaultCloseOperation(2);
        setVisible(true);

        // Defining the labels
        labelFloor = new JLabel("Andar: Térreo");
        labelElevator1 = new JLabel("Elevador 1: Térreo");
        labelElevator2 = new JLabel("Elevador 2: Térreo");

        // Adding 'elevator 1 and 2' to the 'elevatorsPanel'
        elevatorsPanel.add(labelElevator1);
        elevatorsPanel.add(labelElevator2);

        // Adding and defining the main panel using 'BorderLayout'
        add(labelFloor, BorderLayout.CENTER);
        add(elevatorsPanel, BorderLayout.EAST);
        

        JPanel botoesPanel = new JPanel();
        for (int i = -2; i <= 6; i++) {
            JButton btnAndar = new JButton(Integer.toString(i));
            btnAndar.addActionListener(new BotaoAndarListener(i));
            botoesPanel.add(btnAndar);
        }
        add(botoesPanel, BorderLayout.SOUTH);
    }


    // Buttons actions
    private class BotaoAndarListener implements ActionListener {
        private int andarDestino;

        public BotaoAndarListener(int andar) {
            this.andarDestino = andar;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String[] opcoesAndares = new String[]{"Térreo", "Subsolo 1", "Subsolo 2", "Andar 1", "Andar 2", "Andar 3", "Andar 4", "Andar 5", "Andar 6"};
            String andarEscolhido = (String) JOptionPane.showInputDialog(null,
                    "Escolha para Qual andar desejar ir:",
                    "Andares",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opcoesAndares,
                    opcoesAndares[0]);

            if (andarEscolhido != null) {
                int elevadorMaisProximo = calculateElevator(andarDestino);
                if (elevadorMaisProximo == 1) {
                    elevator1.irParaAndar(andarDestino);
                    labelFloor.setText("Andar: " + andarDestino);
                    labelElevator1.setText("Elevador 1: Andar " + andarDestino);
                } else {
                    elevator2.irParaAndar(andarDestino);
                    labelFloor.setText("Andar: " + andarDestino);
                    labelElevator2.setText("Elevador 2: Andar " + andarDestino);
                }
            }
        }
    }


    private int calculateElevator(int andarDestino) {
        int distanciaElevador1 = Math.abs(elevator1.getAndarAtual() - andarDestino);
        int distanciaElevador2 = Math.abs(elevator2.getAndarAtual() - andarDestino);

        if (distanciaElevador1 < distanciaElevador2) {
            return 1; 
        } else {
            return 2;
        }
    }
    

    public static void main(String[] args) {
            ElevatorGrid elevador = new ElevatorGrid();
            elevador.setVisible(true);
    }
}

