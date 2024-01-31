package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.*;

public class Elevator extends JFrame {
    private Elevador elevador1;
    private Elevador elevador2;
    private JLabel labelAndar;
    private JLabel labelElevador1;
    private JLabel labelElevador2;

    public Elevator() {
        elevador1 = new Elevador();
        elevador2 = new Elevador();

        // set do frame
        setTitle("Elevator");
        setSize(400, 200);
        setDefaultCloseOperation(2);
        setLayout(new BorderLayout());
        setVisible(true);

        labelAndar = new JLabel("Andar: Térreo");
        add(labelAndar, BorderLayout.CENTER);

        labelElevador1 = new JLabel("Elevador 1: Térreo");
        labelElevador2 = new JLabel("Elevador 2: Térreo");
        JPanel elevadoresPanel = new JPanel();
        elevadoresPanel.setLayout(new GridLayout(2, 1));
        elevadoresPanel.add(labelElevador1);
        elevadoresPanel.add(labelElevador2);
        add(elevadoresPanel, BorderLayout.EAST);

        JPanel botoesPanel = new JPanel();
        for (int i = -2; i <= 6; i++) {
            JButton btnAndar = new JButton(Integer.toString(i));
            btnAndar.addActionListener(new BotaoAndarListener(i));
            botoesPanel.add(btnAndar);
        }

        add(botoesPanel, BorderLayout.SOUTH);
    }

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
                int elevadorMaisProximo = calcularElevadorMaisProximo(andarDestino);
                if (elevadorMaisProximo == 1) {
                    elevador1.irParaAndar(andarDestino);
                    labelAndar.setText("Andar: " + andarDestino);
                    labelElevador1.setText("Elevador 1: Andar " + andarDestino);
                } else {
                    elevador2.irParaAndar(andarDestino);
                    labelAndar.setText("Andar: " + andarDestino);
                    labelElevador2.setText("Elevador 2: Andar " + andarDestino);
                }
            }
        }
    }

    private int calcularElevadorMaisProximo(int andarDestino) {
        int distanciaElevador1 = Math.abs(elevador1.getAndarAtual() - andarDestino);
        int distanciaElevador2 = Math.abs(elevador2.getAndarAtual() - andarDestino);

        if (distanciaElevador1 < distanciaElevador2) {
            return 1; 
        } else {
            return 2;
        }
    }
    

    public static void main(String[] args) {
            Elevator elevador = new Elevator();
            elevador.setVisible(true);
    }
}

