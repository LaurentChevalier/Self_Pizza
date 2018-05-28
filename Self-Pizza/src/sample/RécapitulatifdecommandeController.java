package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Laurent on 26-05-18.
 */

public class RécapitulatifdecommandeController {

    /*boolean close;

    static Timer timer = new Timer();

    void Chrono() {
        timer.schedule(new fermeture(),10000);
    }

    class fermeture extends TimerTask {
        int nbrRepetitions = 1;

        public void run() {
            if (nbrRepetitions > 0) {
                System.out.println("Ca bosse dur!");
                close=true;
                nbrRepetitions--;
            } else {
                System.out.println("Terminé!");
                close=true;
                timer.cancel();
            }
        }
    }
*/

    public void initialize(){
        resumedelacommande.setStyle("-fx-highlight-fill: lightgray; -fx-highlight-text-fill: firebrick; -fx-font-size: 14px;");
        montantapayer.setStyle("-fx-highlight-fill: lightgray; -fx-highlight-text-fill: firebrick; -fx-font-size: 14px;");
        updateResumedelacommande();
        updateMontantapayer();
    }

    @FXML
    private TextArea resumedelacommande;

    @FXML
    private TextArea montantapayer;

    @FXML
    private Button validermacommande;

    @FXML
    void pressvalidermacommande(ActionEvent event) {
        try {

            Parent root = FXMLLoader.load(getClass().getResource("Accueil.fxml"));
            Stage accueil = new Stage();
            accueil.setTitle("Pizzeria Del Romano");
            //primaryStage.setScene(new Scene(root, 300, 275));
            accueil.setScene(new Scene(root));
            accueil.setX(100);
            accueil.setY(200);
            accueil.setResizable(false);

            accueil.show();

            final Node source = (Node)event.getSource();
            final Stage stage = (Stage)source.getScene().getWindow();
            stage.close();


            Parent rootn = FXMLLoader.load(getClass().getResource("Terminal.fxml"));
            Stage terminal = new Stage();
            terminal.setTitle("Pizzeria Del Romano");
            //primaryStage.setScene(new Scene(root, 300, 275));
            terminal.setScene(new Scene(rootn));
            terminal.setX(1000);
            terminal.setY(200);
            terminal.setResizable(false);

            terminal.show();
            resetCommande();


        } catch (IOException e){
            e.printStackTrace();
        }

    }

    public void updateResumedelacommande(){
        for(int i=1; i<=Commande.getINSTANCE().getI(); i++){
            resumedelacommande.appendText(Commande.getINSTANCE().getQuantité(i)+" ");
            resumedelacommande.appendText(Commande.getINSTANCE().getMenu(i)+" ");
            resumedelacommande.appendText(Commande.getINSTANCE().getPrix(i)+"€"+"\n");
        }
    }

    public void updateMontantapayer(){
        montantapayer.setText(String.valueOf(Commande.getINSTANCE().getTotal())+"€");
    }

    public void resetCommande(){
        for(int i=1; i<=Commande.getINSTANCE().getI(); i++){
            Commande.getINSTANCE().setPrix("0",i);
            Commande.getINSTANCE().setQuantité("",i);
            Commande.getINSTANCE().setMenu("",i);
        }
        Commande.getINSTANCE().setPlaque("");
        Commande.getINSTANCE().setTotal(0);
        Commande.getINSTANCE().setI(0);
        Commande.getINSTANCE().supprimersauvegardeCarte();
    }

}
