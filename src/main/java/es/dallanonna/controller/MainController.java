package es.dallanonna.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;

public class MainController {

    @FXML
    private Label mensajeLabel;

    @FXML
    private void verCarta() {
        mensajeLabel.setText(
                "Próximamente: nuestra carta italiana"
        );
    }

    @FXML
    private void realizarReserva() {

        Alert alerta = new Alert(Alert.AlertType.INFORMATION);

        alerta.setTitle("Dalla Nonna");
        alerta.setHeaderText("Reservas");
        alerta.setContentText(
                "La sección de reservas estará disponible próximamente."
        );

        alerta.showAndWait();
    }
}
