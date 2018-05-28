package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Application;

import java.io.IOException;

/**
 * Created by Laurent on 26-05-18.
 */
public class AccueilController {
    @FXML
    private Button demarrer_commande;

    @FXML
    public void pressdemarrer_commande(ActionEvent event) {
    try {

        Parent root = FXMLLoader.load(getClass().getResource("Commande.fxml"));
        Stage commande = new Stage();
        commande.setTitle("Pizzeria Del Romano");
        //primaryStage.setScene(new Scene(root, 300, 275));
        commande.setScene(new Scene(root));
        commande.setX(100);
        commande.setY(200);
        commande.setResizable(false);


        commande.show();

        final Node source = (Node)event.getSource();
        final Stage stage = (Stage)source.getScene().getWindow();
        stage.close();

    } catch (IOException e){
        e.printStackTrace();
    }


    }

}


