package turntabl.first;

/* LIGHT SOUP PREPARATION */

/* Complex parts */

class Meat {

    public void cutmeat() {
        System.out.println("Meat is been chopped into sizable pieces.");
    }
    public void wash() {
        System.out.println("Wrinsing meat carefully to avoid sand particles.");
    }
    public void steam(String saucepan) {
        System.out.println("Most suitable saucepan based on the quantity of soup you are anticipating is: " + saucepan);
        System.out.println("Meat has been poured into our " + saucepan);
        System.out.println("The onion, garlic, ginger mixture has been added successfully for perfect aroma and taste.");
        System.out.println("A pinch of salt and some pepper dropped in.");
        System.out.println("Small amount of water has been added to enhance boiling.");
        System.out.println(saucepan + " is now on fire with its content.");
        System.out.println("Meat downloading spices: Please wait......");
    }
    public void stir() {
        System.out.println("Intermittent gentle stir ongoing....");
        System.out.println("Meat is well cooked. Next process will begin shortly: Please wait...");
    }
}

class Tomatoes {
    public void tinTomatoes(String type, int numberOfSpoons) {
        System.out.println(numberOfSpoons + " spoons of" + type + "tin tomatoes" + " has been added successfully.");

    }
}

class Extras {

    public void additions() {
        System.out.println("For outstanding soup performance <> a bulb of onion and fresh tomatoes have been dropped into it.");

    }
}

class Water {
    public void moreWater(){
        System.out.println("Extra water has been added to allow proper circulation of meet.");
        System.out.println("Please wait while soup boils majestically...");
        System.out.println("The bulb of onion and fresh tomatoes have been ejected to be blended and poured back into soup.");
        System.out.println("Soup is almost ready: Please wait.....");
        System.out.println("Please note, that the meet you see floating in the soup is all you've got so do not touch it");
        System.out.println("Soup is almost ready: Please wait.....");
        System.out.println("Soup is almost ready: Please wait.....");
        System.out.println();
        System.out.println();
        System.out.println("CONGRATULATIONS!!! Soup preparation is complete! Enjoy a great meal :-)");
    }
}


/* Facade */

class SoupMakerFacade {
    private final  Meat goat;
    private final Tomatoes gino;
    private final  Extras adds;
    private final Water water;

    public SoupMakerFacade() {
        this.goat = new Meat();
        this.gino = new Tomatoes();
        this.adds = new Extras();
        this.water = new Water();
    }

    public void cook() {
        goat.cutmeat();
        goat.wash();
        goat.steam("biggest pot");
        goat.stir();
        gino.tinTomatoes("Gino", 2);
        adds.additions();
        water.moreWater();
    }
}
