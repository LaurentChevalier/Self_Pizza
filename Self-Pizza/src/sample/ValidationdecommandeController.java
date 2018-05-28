package sample;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Laurent on 26-05-18.
 */

public class ValidationdecommandeController {

    public void initialize(){
        commande.setStyle("-fx-highlight-fill: lightgray; -fx-highlight-text-fill: firebrick; -fx-font-size: 14px;");
        quantite.setStyle("-fx-highlight-fill: lightgray; -fx-highlight-text-fill: firebrick; -fx-font-size: 14px;");
        prix.setStyle("-fx-highlight-fill: lightgray; -fx-highlight-text-fill: firebrick; -fx-font-size: 14px;");
        total.setStyle("-fx-highlight-fill: lightgray; -fx-highlight-text-fill: firebrick; -fx-font-size: 14px;");
        updateCommandetextarea();
        updateQuantitétextarea();
        updatePrixtextarea();
        Commande.getINSTANCE().calculerTotal();
        updateTotal();
    }

    @FXML
    private TextArea commande;

    @FXML
    private TextArea quantite;

    @FXML
    private TextArea prix;

    @FXML
    private TextArea total;

    @FXML
    private Button retouralacarte;

    @FXML
    private Button confirmermacommande;

    @FXML
    private ImageView trash;

    @FXML
    private Button quantitemoins;

    @FXML
    private Button quantiteplus;

    @FXML
    void pressconfirmermacommande(ActionEvent event) {
        try {

            Parent root = FXMLLoader.load(getClass().getResource("Récapitulatif de commande.fxml"));
            Stage recapitulatifcommande = new Stage();
            recapitulatifcommande.setTitle("Self-Pizza");
            //primaryStage.setScene(new Scene(root, 300, 275));
            recapitulatifcommande.setScene(new Scene(root));
            recapitulatifcommande.setX(100);
            recapitulatifcommande.setY(200);
            recapitulatifcommande.setResizable(false);

            recapitulatifcommande.show();

            final Node source = (Node)event.getSource();
            final Stage stage = (Stage)source.getScene().getWindow();
            stage.close();

        } catch (IOException e){
            e.printStackTrace();
        }




    }

    @FXML
    void pressquantitemoins(ActionEvent event) {

    }

    @FXML
    void pressquantiteplus(ActionEvent event) {

    }

    @FXML
    void pressretouralacarte(ActionEvent event) {

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

    @FXML
    void presstrash(MouseEvent event) {

    }

    public void updateCommandetextarea() {
        for(int i=1; i<=Commande.getINSTANCE().getI(); i++){
            commande.appendText(Commande.getINSTANCE().getMenu(i)+"\n");
        }
       //commande.appendText("Bonjour\n");
        //commande.appendText("Bonjour2\n");
    }

    public void updateQuantitétextarea(){
        for(int i=1; i<=Commande.getINSTANCE().getI(); i++){
            quantite.appendText(Commande.getINSTANCE().getQuantité(i)+"\n");
        }

    }

    public void updatePrixtextarea(){
        for(int i=1; i<=Commande.getINSTANCE().getI(); i++){
            prix.appendText(Commande.getINSTANCE().getPrix(i)+"€"+"\n");
        }
    }

    public void updateTotal(){
        total.setText(String.valueOf(Commande.getINSTANCE().getTotal())+"€");
    }

}
