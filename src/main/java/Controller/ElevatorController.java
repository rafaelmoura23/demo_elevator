package Controller;

import Model.Elevador;

public class ElevatorController {
    // Atributes
    private Elevador elevator1;
    private Elevador elevator2;

    // Constructor
    public ElevatorController(Elevador elevator1, Elevador elevator2) {
        this.elevator1 = elevator1;
        this.elevator2 = elevator2;
    }

    // Method movement elevator
    public void moveElevator(int elevatorNumber, int destinationFloor) {
        Elevador selectedElevator = (elevatorNumber == 1) ? elevator1 : elevator2;
        selectedElevator.irParaAndar(destinationFloor);
    }
}


