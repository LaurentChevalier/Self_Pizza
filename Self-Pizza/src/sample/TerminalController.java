package sample;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

/**
 * Created by Laurent on 26-05-18.
 */

public class TerminalController {

    public void initialize(){
        terminal.setStyle("-fx-highlight-fill: lightgray; -fx-highlight-text-fill: firebrick; -fx-font-size: 14px;");
        updateTerminal();
    }

    @FXML
    private TextArea terminal;

    public void updateTerminal(){
        for(int i=1; i<=Commande.getINSTANCE().getI(); i++){
            terminal.appendText(Commande.getINSTANCE().getMenu(i)+" ");
            terminal.appendText("("+Commande.getINSTANCE().getQuantité(i)+")--");
            terminal.appendText(Commande.getINSTANCE().getPrix(i)+"€\n");
        }
        terminal.appendText("\n");
        terminal.appendText("\n");
        terminal.appendText("Total: "+Commande.getINSTANCE().getTotal()+"€\n");
        terminal.appendText("Numéro de plaque: "+Commande.getINSTANCE().getPlaque()+"\n");

    }

}
