package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    /**
     * Méthode d'initialisation de l'application
     */
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Accueil.fxml"));
       primaryStage.setTitle("Pizzeria Del Romano");
        //primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.setScene(new Scene(root));
        primaryStage.setX(100);
        primaryStage.setY(200);
        primaryStage.setResizable(false);
        primaryStage.show();

        Pizza.getINSTANCE();
        Pizza.getINSTANCE().setType(Pizza.Type.NONE);
        Pizza.getINSTANCE().calculprixpizza();
        System.out.println(Pizza.getINSTANCE().getType());
        System.out.println(Pizza.getINSTANCE().getPrixPizza(0));

        Pates.getINSTANCE().setType(Pates.Type.NONE);
        Pates.getINSTANCE().calculpates();
        System.out.println(Pates.getINSTANCE().getType());
        System.out.println(Pates.getINSTANCE().getPrixpates(0));

    }


    public static void main(String[] args) {
        launch(args);
    }
}
