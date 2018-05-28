package sample;

/**
 * Created by Laurent on 27-05-18.
 */
public class Pates {
    int prixpates[]={0,0,0,0};
    public enum Type {NONE,Bolognaise,Carbonara,Puttanesca,Scampis}
    Type type;
    static Type patescommandee[]={Type.NONE,Type.NONE,Type.NONE,Type.NONE};

    public static void main(String[] A){
        System.out.println("Test unitaire des Pates");
        /**
         * Instanciation de l'objet Pates
         */
        Pates newPates = new Pates();
        newPates.setType(Type.Puttanesca);
        newPates.calculpates();

        System.out.println(newPates.getPrixpates(1));
        System.out.println(newPates.getType());
        System.out.println(newPates.getPatescommandee(2));



    }

    public void calculpates(){

        switch (this.type){
            case Bolognaise:
                Commande.getINSTANCE().i++;
                this.setPrixpates(5,0);
                this.setPatescommandee(Type.Bolognaise,0);
                Commande.getINSTANCE().setMenu("Pâtes Bolognaise", Commande.getINSTANCE().getI());
                Commande.getINSTANCE().setQuantité("1",Commande.getINSTANCE().getI());
                Commande.getINSTANCE().setPrix(String.valueOf(this.getPrixpates(0)),Commande.getINSTANCE().getI());
                break;
            case Carbonara:
                Commande.getINSTANCE().i++;
                this.setPrixpates(6,1);
                this.setPatescommandee(Type.Carbonara,1);
                Commande.getINSTANCE().setMenu("Pâtes Carbonara", Commande.getINSTANCE().getI());
                Commande.getINSTANCE().setQuantité("1",Commande.getINSTANCE().i);
                Commande.getINSTANCE().setPrix(String.valueOf(this.getPrixpates(1)),Commande.getINSTANCE().getI());
                break;
            case Puttanesca:
                Commande.getINSTANCE().i++;
                this.setPrixpates(7,2);
                this.setPatescommandee(Type.Puttanesca,2);
                Commande.getINSTANCE().setMenu("Pâtes Puttanesca", Commande.getINSTANCE().getI());
                Commande.getINSTANCE().setQuantité("1",Commande.getINSTANCE().getI());
                Commande.getINSTANCE().setPrix(String.valueOf(this.getPrixpates(2)),Commande.getINSTANCE().getI());
                break;
            case Scampis:
                Commande.getINSTANCE().i++;
                this.setPrixpates(9,3);
                this.setPatescommandee(Type.Scampis,3);
                Commande.getINSTANCE().setMenu("Pâtes Scampis", Commande.getINSTANCE().getI());
                Commande.getINSTANCE().setQuantité("1",Commande.getINSTANCE().getI());
                Commande.getINSTANCE().setPrix(String.valueOf(this.getPrixpates(3)),Commande.getINSTANCE().getI());
                break;
        }

        System.out.println(Commande.getINSTANCE().getI());
        System.out.println(this.getPatescommandee(0));
        System.out.println(this.getPatescommandee(1));
        System.out.println(this.getPatescommandee(2));
        System.out.println(this.getPatescommandee(3));

    }

    public int getPrixpates(int i) {
        return prixpates[i];
    }

    public void setPrixpates(int prixpates, int i) {
        this.prixpates[i] = prixpates;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
    public Type getPatescommandee(int i) {
        return this.patescommandee[i];
    }

    public void setPatescommandee(Type patescommandee,int i) {
        this.patescommandee[i] = patescommandee;
    }


    private Pates(){}

    private static Pates INSTANCE = new Pates();

    public static Pates getINSTANCE(){
        return INSTANCE;
    }
}
