import java.util.Date;
public  class Produit {

    Date dateexp;
    int day;
    int month;
    int year;
    int ID;
    String libel;
    String marque;
    double prix;

    public Produit(int ID, String libel,String marque, double prix) {
        this.ID = ID;
        this.libel = libel;
        this.marque = marque;
        this.prix = prix;
    }

    public Produit(int ID, String libel,String marque) {
        this.ID = ID;
        this.libel = libel;
        this.marque = marque;
    }

    public Produit(Date dateexp) {
        this.dateexp = dateexp;

    }

    public Produit() {

    }

    public void Afficher(){

        System.out.println("ID = " + ID + " libel = "+ libel + " marque = " +marque +" prix =" + prix + " date d'expiration =" + dateexp);
    }

    @Override
    public String toString() {
        return "ID + "+ ID +" libel = " + libel +" marque = " + marque + " prix = " + prix + " date d'expiration = " + dateexp;
    }
}