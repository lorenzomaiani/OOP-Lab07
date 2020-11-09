package it.unibo.oop.lab.enum1;

import it.unibo.oop.lab.enum1.SportSocialNetworkUserImpl;
import it.unibo.oop.lab.socialnetwork.User;

/**
 * This is going to act as a test for
 * {@link it.unibo.oop.lab.enum1.SportSocialNetworkUserImpl}
 * 
 * 1) Realize the same test as the previous exercise, this time using
 * enumeration Sport
 * 
 * 2) Run it: every test must return true.
 * 
 */
public final class TestSportByEnumeration {

    private TestSportByEnumeration() { }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String... args) {
        /*
         * [TEST DEFINITION]
         * 
         * By now, you know how to do it
         */
        // TODO
    	final SportSocialNetworkUserImpl<User> kelvin = new SportSocialNetworkUserImpl("Kelvin","Oluwada","koluwada",20);
        final SportSocialNetworkUserImpl<User> matteo = new SportSocialNetworkUserImpl("Matteo","Rosati","mrosati",19);
        final SportSocialNetworkUserImpl<User> stefano = new SportSocialNetworkUserImpl("Stefano","Scolari","scola",21);
        
        kelvin.addSport(Sport.BASKET);
        kelvin.addSport(Sport.SOCCER);
        kelvin.addSport(Sport.TENNIS);
        
        System.out.println("Kelvin practices Basket: " + kelvin.hasSport(Sport.BASKET));
        System.out.println("Kelvin does not like F1: " + !kelvin.hasSport(Sport.F1));
        
        stefano.addSport(Sport.F1);
        stefano.addSport(Sport.MOTOGP);
        System.out.println("Stefano likes F1: "
                + stefano.hasSport(Sport.F1));
        System.out.println("Stefano does not like soccer: " + !stefano.hasSport(Sport.SOCCER));
        
        matteo.addSport(Sport.BASKET);
        matteo.addSport(Sport.BIKE);
        System.out.println("Matteo likes Bike: "
                + matteo.hasSport(Sport.BIKE));
        System.out.println("Matteo does love playing also basket: "
                + matteo.hasSport(Sport.BASKET));
        
    }
}
