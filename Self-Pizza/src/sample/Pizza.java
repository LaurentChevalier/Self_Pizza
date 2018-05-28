package sample;

/**
 * Created by Laurent on 27-05-18.
 */
public class Pizza {
    int prixPizza[]={0,0,0,0,0,0,0,0};

    public enum Type {NONE,Fromage,Hawai,Prosciutto,Chorizo,Magaritta,Champignon,Forestiere,Saison}
    Type type;
    static Type pizzacommandee[]={Type.NONE,Type.NONE,Type.NONE,Type.NONE,Type.NONE,Type.NONE,Type.NONE,Type.NONE};


    public static void main(String[] A){
        int i=1;
        System.out.println("Test unitaire de la pizza");
        /**
         * Instanciation de l'objet Pizza
         */
        Pizza newPizza = new Pizza();
        newPizza.setType(Type.Fromage);
        newPizza.calculprixpizza();

        System.out.println(newPizza.getPrixPizza(0));
        System.out.println(newPizza.getType());
        System.out.println(newPizza.getPizzacommandee(0));

    }

    public void calculprixpizza(){

        switch (this.type){
            case Fromage:
                Commande.getINSTANCE().i++;
                this.setPrixPizza(10,0);
                this.setPizzacommandee(Type.Fromage,0);
                Commande.getINSTANCE().setMenu("Pizza 4 Fromages",Commande.getINSTANCE().getI());
                Commande.getINSTANCE().setQuantité("1",Commande.getINSTANCE().getI());
                Commande.getINSTANCE().setPrix(String.valueOf(this.getPrixPizza(0)),Commande.getINSTANCE().getI());
                break;
            case Hawai:
                Commande.getINSTANCE().i++;
                this.setPrixPizza(8,1);
                this.setPizzacommandee(Type.Hawai,1);
                Commande.getINSTANCE().setMenu("Pizza Hawaï",Commande.getINSTANCE().getI());
                Commande.getINSTANCE().setQuantité("1",Commande.getINSTANCE().getI());
                Commande.getINSTANCE().setPrix(String.valueOf(this.getPrixPizza(1)),Commande.getINSTANCE().getI());
                break;
            case Prosciutto:
                Commande.getINSTANCE().i++;
                this.setPrixPizza(8,2);
                this.setPizzacommandee(Type.Prosciutto,2);
                Commande.getINSTANCE().setMenu("Pizza Prosciutto",Commande.getINSTANCE().getI());
                Commande.getINSTANCE().setQuantité("1",Commande.getINSTANCE().getI());
                Commande.getINSTANCE().setPrix(String.valueOf(this.getPrixPizza(2)),Commande.getINSTANCE().getI());
                break;
            case Chorizo:
                Commande.getINSTANCE().i++;
                this.setPrixPizza(9,3);
                this.setPizzacommandee(Type.Chorizo,3);
                Commande.getINSTANCE().setMenu("Pizza Chorizo",Commande.getINSTANCE().getI());
                Commande.getINSTANCE().setQuantité("1",Commande.getINSTANCE().getI());
                Commande.getINSTANCE().setPrix(String.valueOf(this.getPrixPizza(3)),Commande.getINSTANCE().getI());
                break;
            case Magaritta:
                Commande.getINSTANCE().i++;
                this.setPrixPizza(7,4);
                this.setPizzacommandee(Type.Magaritta,4);
                Commande.getINSTANCE().setMenu("Pizza Magarita",Commande.getINSTANCE().getI());
                Commande.getINSTANCE().setQuantité("1",Commande.getINSTANCE().getI());
                Commande.getINSTANCE().setPrix(String.valueOf(this.getPrixPizza(4)),Commande.getINSTANCE().getI());
                break;
            case Champignon:
                Commande.getINSTANCE().i++;
                this.setPrixPizza(8,5);
                this.setPizzacommandee(Type.Champignon,5);
                Commande.getINSTANCE().setMenu("Pizza Champignon",Commande.getINSTANCE().getI());
                Commande.getINSTANCE().setQuantité("1",Commande.getINSTANCE().getI());
                Commande.getINSTANCE().setPrix(String.valueOf(this.getPrixPizza(5)),Commande.getINSTANCE().getI());
                break;
            case Forestiere:
                Commande.getINSTANCE().i++;
                this.setPrixPizza(12,6);
                this.setPizzacommandee(Type.Forestiere,6);
                Commande.getINSTANCE().setMenu("Pizza Forestière",Commande.getINSTANCE().getI());
                Commande.getINSTANCE().setQuantité("1",Commande.getINSTANCE().getI());
                Commande.getINSTANCE().setPrix(String.valueOf(this.getPrixPizza(6)),Commande.getINSTANCE().getI());
                break;
            case Saison:
                Commande.getINSTANCE().i++;
                this.setPrixPizza(10,7);
                this.setPizzacommandee(Type.Saison,7);
                Commande.getINSTANCE().setMenu("Pizza 4 Saisons",Commande.getINSTANCE().getI());
                Commande.getINSTANCE().setQuantité("1",Commande.getINSTANCE().getI());
                Commande.getINSTANCE().setPrix(String.valueOf(this.getPrixPizza(7)),Commande.getINSTANCE().getI());
                break;

        }

        System.out.println(Commande.getINSTANCE().i);
        System.out.println(this.getPizzacommandee(0));
        System.out.println(this.getPizzacommandee(1));
        System.out.println(this.getPizzacommandee(2));
        System.out.println(this.getPizzacommandee(3));
        System.out.println(this.getPizzacommandee(4));
        System.out.println(this.getPizzacommandee(5));
        System.out.println(this.getPizzacommandee(6));
        System.out.println(this.getPizzacommandee(7));

    }

    public int getPrixPizza(int i) {
        return this.prixPizza[i];
    }

    public void setPrixPizza(int prixPizza, int i) {
        this.prixPizza[i] = prixPizza;
    }
    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
    public  Type getPizzacommandee(int i) {
        return this.pizzacommandee[i];
    }

    public void setPizzacommandee(Type pizzacommandee,int i) {
        this.pizzacommandee[i] = pizzacommandee;
    }

    private Pizza(){}

    private static Pizza INSTANCE = new Pizza();

    public static Pizza getINSTANCE(){
        return INSTANCE;
    }
}
