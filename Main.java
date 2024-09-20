//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Date;
public class Main {
    public static void main(String[] args) {
        Produit po = new Produit();
        po.Afficher();
        Produit po1 = new Produit(1021,"lait","Delice");
        po1.Afficher();
        Produit po2 = new Produit(2510, "Yaourt" ," Vitalait");
        po2.Afficher();
        Produit po3 = new Produit(3250,"tomate","Sicam",1.200);
        po3.Afficher();

        po1.prix = 700;
        po1.Afficher();
        po2.prix = 800;
        po2.Afficher();

        System.out.println(po1.toString());
        System.out.println(po2.toString());
        System.out.println(po3.toString());

        Date expirationDate = new Date(2030,5,22);
        po1.dateexp= expirationDate;
        po2.dateexp= expirationDate;
        po3.dateexp= expirationDate;
        System.out.println(po1.toString());
        System.out.println(po2.toString());
        System.out.println(po3.toString());


    }
    }
