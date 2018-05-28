package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by Laurent on 26-05-18.
 */

public class CommandeController {

    int i;

    public void initialize(){
            if(Commande.getINSTANCE().isSauvegarde()){
                numerodeplaque.setText(Commande.getINSTANCE().getPlaque());
                for(int i=0; i<=7;i++){
                    switch (i){
                        case 0:
                            if(Pizza.getINSTANCE().getPizzacommandee(i)!= Pizza.Type.NONE){
                                pizza4fromage.setOpacity(0.3);
                                pizza4fromage.setDisable(true);
                            }
                            break;
                        case 1:
                            if(Pizza.getINSTANCE().getPizzacommandee(i)!= Pizza.Type.NONE){
                                pizzahawai.setOpacity(0.3);
                                pizzahawai.setDisable(true);
                            }
                            break;
                        case 2:
                            if(Pizza.getINSTANCE().getPizzacommandee(i)!= Pizza.Type.NONE){
                                pizzaprosciutto.setOpacity(0.3);
                                pizzaprosciutto.setDisable(true);
                            }
                            break;
                        case 3:
                            if(Pizza.getINSTANCE().getPizzacommandee(i)!= Pizza.Type.NONE){
                                pizzachorizo.setOpacity(0.3);
                                pizzachorizo.setDisable(true);
                            }
                            break;
                        case 4:
                            if(Pizza.getINSTANCE().getPizzacommandee(i)!= Pizza.Type.NONE){
                                pizzamargarita.setOpacity(0.3);
                                pizzamargarita.setDisable(true);
                            }
                            break;
                        case 5:
                            if(Pizza.getINSTANCE().getPizzacommandee(i)!= Pizza.Type.NONE){
                                pizzachampignon.setOpacity(0.3);
                                pizzachampignon.setDisable(true);
                            }
                            break;
                        case 6:
                            if(Pizza.getINSTANCE().getPizzacommandee(i)!= Pizza.Type.NONE){
                                pizzaforestière.setOpacity(0.3);
                                pizzaforestière.setDisable(true);
                            }
                            break;
                        case 7:
                            if(Pizza.getINSTANCE().getPizzacommandee(i)!= Pizza.Type.NONE){
                                pizza4saisons.setOpacity(0.3);
                                pizza4saisons.setDisable(true);
                            }
                            break;


                    }
                }
                for(int i=0;i<=3;i++){
                    switch (i){
                        case 0:
                            if(Pates.getINSTANCE().getPatescommandee(i)!= Pates.Type.NONE){
                                patesbolognaise.setOpacity(0.3);
                                patesbolognaise.setDisable(true);
                            }
                            break;
                        case 1:
                            if(Pates.getINSTANCE().getPatescommandee(i)!= Pates.Type.NONE){
                                patescarbonara.setOpacity(0.3);
                                patescarbonara.setDisable(true);
                            }
                            break;
                        case 2:
                            if(Pates.getINSTANCE().getPatescommandee(i)!= Pates.Type.NONE){
                                patesputtanesca.setOpacity(0.3);
                                patesputtanesca.setDisable(true);
                            }
                            break;
                        case 3:
                            if(Pates.getINSTANCE().getPatescommandee(i)!= Pates.Type.NONE){
                                patesscampi.setOpacity(0.3);
                                patesscampi.setDisable(true);
                            }
                            break;
                    }
                }

            }
    }

    @FXML
    private  ImageView pizza4fromage;

    @FXML
    private ImageView pizzahawai;

    @FXML
    private ImageView pizzaprosciutto;

    @FXML
    private ImageView pizzachorizo;

    @FXML
    private ImageView pizzamargarita;

    @FXML
    private ImageView pizzachampignon;

    @FXML
    private ImageView pizzaforestière;

    @FXML
    private ImageView pizza4saisons;

    @FXML
    private ImageView patesbolognaise;

    @FXML
    private ImageView patescarbonara;

    @FXML
    private ImageView patesputtanesca;

    @FXML
    private ImageView patesscampi;

    @FXML
    private TextField numerodeplaque;

    @FXML
    private Button passermacommande;

    @FXML
    void presspassermacommande(ActionEvent event) {
        boolean errorstatus;
        errorstatus=Commande.getINSTANCE().validadernumeroplaque(numerodeplaque.getText());

        if(errorstatus){
            if(Commande.getINSTANCE().getI()!=0){
                numerodeplaque.setText("");
            }

        }
        else{
            Commande.getINSTANCE().setPlaque(numerodeplaque.getText());
            Commande.getINSTANCE().sauvegarderCarte();
            try {

                Parent root = FXMLLoader.load(getClass().getResource("Validation de commande.fxml"));
                Stage validationcommande = new Stage();
                validationcommande.setTitle("Pizzeria Del Romano");
                //primaryStage.setScene(new Scene(root, 300, 275));
                validationcommande.setScene(new Scene(root));
                validationcommande.setX(100);
                validationcommande.setY(200);
                validationcommande.setResizable(false);

                validationcommande.show();
                final Node source = (Node)event.getSource();
                final Stage stage = (Stage)source.getScene().getWindow();
                stage.close();

            } catch (IOException e){
                e.printStackTrace();
            }
        }

    }
    @FXML
    void presspatesBolognaise(MouseEvent event) {
        i++;
        System.out.println("Pate Bolo");
        Pates.getINSTANCE().setType(Pates.Type.Bolognaise);
        Pates.getINSTANCE().calculpates();
        patesbolognaise.setOpacity(0.3);
        patesbolognaise.setDisable(true);

    }

    @FXML
    void presspatesCarbonara(MouseEvent event) {
        i++;
        System.out.println("Pate Carbo");
        Pates.getINSTANCE().setType(Pates.Type.Carbonara);
        Pates.getINSTANCE().calculpates();
        patescarbonara.setOpacity(0.3);
        patescarbonara.setDisable(true);

    }

    @FXML
    void presspatesPuttanesca(MouseEvent event) {
        i++;
        System.out.println("Pate Putta");
        Pates.getINSTANCE().setType(Pates.Type.Puttanesca);
        Pates.getINSTANCE().calculpates();
        patesputtanesca.setOpacity(0.3);
        patesputtanesca.setDisable(true);

    }

    @FXML
    void presspatesScampis(MouseEvent event) {
        i++;
        System.out.println("Pate Scampi");
        Pates.getINSTANCE().setType(Pates.Type.Scampis);
        Pates.getINSTANCE().calculpates();
        patesscampi.setOpacity(0.3);
        patesscampi.setDisable(true);


    }

    @FXML
    void presspizza4fromage(MouseEvent event) {
        i++;
        System.out.println("4From");
        Pizza.getINSTANCE().setType(Pizza.Type.Fromage);
        Pizza.getINSTANCE().calculprixpizza();
        //Pizza.nouvelleinstancepizza(Pizza.Type.Fromage,i);
        pizza4fromage.setOpacity(0.3);
        pizza4fromage.setDisable(true);

    }
    @FXML
    void presspizza4saisons(MouseEvent event) {
        i++;
        System.out.println("4Saisons");
        Pizza.getINSTANCE().setType(Pizza.Type.Saison);
        Pizza.getINSTANCE().calculprixpizza();
        pizza4saisons.setOpacity(0.3);
        pizza4saisons.setDisable(true);

    }

    @FXML
        void presspizzaChampignon(MouseEvent event) {
        i++;
        System.out.println("Champignons");
        Pizza.getINSTANCE().setType(Pizza.Type.Champignon);
        Pizza.getINSTANCE().calculprixpizza();
        pizzachampignon.setOpacity(0.3);
        pizzachampignon.setDisable(true);

    }

    @FXML
    void presspizzaChorizo(MouseEvent event) {
        i++;
        System.out.println("Chorizo");
        Pizza.getINSTANCE().setType(Pizza.Type.Chorizo);
        Pizza.getINSTANCE().calculprixpizza();
        pizzachorizo.setOpacity(0.3);
        pizzachorizo.setDisable(true);

    }

    @FXML
    void presspizzaForestiere(MouseEvent event) {
        i++;
        System.out.println("Forestiere");
        Pizza.getINSTANCE().setType(Pizza.Type.Forestiere);
        Pizza.getINSTANCE().calculprixpizza();
        pizzaforestière.setOpacity(0.3);
        pizzaforestière.setDisable(true);

    }

    @FXML
    void presspizzaHawai(MouseEvent event) {
        i++;
        System.out.println("Hawai");
        Pizza.getINSTANCE().setType(Pizza.Type.Hawai);
        Pizza.getINSTANCE().calculprixpizza();
        pizzahawai.setOpacity(0.3);
        pizzahawai.setDisable(true);

    }

    @FXML
    void presspizzaMagarita(MouseEvent event) {
        i++;
        System.out.println("Magarita");
        Pizza.getINSTANCE().setType(Pizza.Type.Magaritta);
        Pizza.getINSTANCE().calculprixpizza();
        pizzamargarita.setOpacity(0.3);
        pizzamargarita.setDisable(true);

    }

    @FXML
    void presspizzaProsciutto(MouseEvent event) {
        i++;
        System.out.println("Prosciutto");
        Pizza.getINSTANCE().setType(Pizza.Type.Prosciutto);
        Pizza.getINSTANCE().calculprixpizza();
        pizzaprosciutto.setOpacity(0.3);
        pizzaprosciutto.setDisable(true);

    }




}
