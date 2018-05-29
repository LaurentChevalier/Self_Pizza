package sample;

import javafx.scene.control.Alert;

/**
 * Created by Laurent on 27-05-18.
 */
public class Commande {
    static String plaque = new String();
    public String menu[]={"","","","","","","","","","","","",""};
    public String quantité[]={"0","0","0","0","0","0","0","0","0","0","0","0","0"};
    public String prix[]={"0","0","0","0","0","0","0","0","0","0","0","0","0"};
    int total;
    int i;
    boolean sauvegarde;

    public static void main(String[] A){
        System.out.println("Test unitaire de la commmande");
        /**
         * Instanciation de l'objet Commande
         */
        Commande newCommande = new Commande();
        newCommande.setPlaque("1-DBZ-579");

        System.out.println(newCommande.getPlaque());

    }

    public boolean validadernumeroplaque(String text){
        if(text.isEmpty()){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erreur");
            alert.setHeaderText(null);
            alert.setContentText("Veuillez entrer un numéro de plaque valide");
            alert.showAndWait();
            return true;
        }
        if(Commande.getINSTANCE().getI()==0){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erreur");
            alert.setHeaderText(null);
            alert.setContentText("Veuillez sélectionner au moins un plat");
            alert.showAndWait();
            return true;
        }
        else {
            return false;
        }
    }

    public void calculerTotal(){
        int soustotal=0;
        for(int i=1; i<=getI(); i++){
            soustotal+=((Integer.parseInt(getPrix(i))*(Integer.parseInt(getQuantité(i)))));
        }
        this.setTotal(soustotal);
    }

    public void sauvegarderCarte(){
        if (getI()==0){
            setSauvegarde(false);
        }
        else {
            setSauvegarde(true);
        }

    }

    public void supprimersauvegardeCarte(){
        setSauvegarde(false);
        setI(0);
        for(int i=0; i<=7; i++){
            Pizza.getINSTANCE().setPizzacommandee(Pizza.Type.NONE,i);
        }
        for(int i=0; i<=3; i++){
            Pates.getINSTANCE().setPatescommandee(Pates.Type.NONE,i);
        }
    }

    public String getPlaque() {
        return plaque;
    }

    public void setPlaque(String plaque) {
        this.plaque = plaque;
    }

    public String getMenu(int i) {
        return this.menu[i];
    }

    public void setMenu(String menu, int i) {
        this.menu[i] = menu;
    }

    public String getQuantité(int i) {
        return this.quantité[i];
    }

    public void setQuantité(String quantité, int i) {
        this.quantité[i] = quantité;
    }

    public String getPrix(int i) {
        return this.prix[i];
    }

    public void setPrix(String prix, int i) {
        this.prix[i] = prix;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public boolean isSauvegarde() {
        return sauvegarde;
    }

    public void setSauvegarde(boolean sauvegarde) {
        this.sauvegarde = sauvegarde;
    }

    private Commande(){}

    private static Commande INSTANCE = new Commande();

    public static Commande getINSTANCE(){
        return INSTANCE;
    }
}
