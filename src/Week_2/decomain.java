package Week_2;

import Week_2.concrete_components.OublieHoorntje;
import Week_2.concrete_components.SorbetIjs;
import Week_2.concrete_decorators.DiscoDip;
import Week_2.concrete_decorators.Oreo;
import Week_2.concrete_decorators.Slagroom;

public class decomain {
    public static void main(String[] args) {
        IceCream iceCream = new Slagroom(new DiscoDip(new OublieHoorntje()));

        System.out.println(iceCream.getDescription());
        System.out.println("cost: " + iceCream.getCost());
        System.out.println();

        IceCream sorbet = new Slagroom(new DiscoDip(new Oreo(new SorbetIjs())));

        System.out.println(sorbet.getDescription());
        System.out.println(sorbet.getCost());

        System.out.println("------------");
        System.out.println("total: " + (iceCream.getCost() + sorbet.getCost()));


    }
}
