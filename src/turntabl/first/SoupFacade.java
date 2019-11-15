package turntabl.first;

/* Facade */

public class SoupFacade {

        private final  Meat goat;
        private final Tomatoes gino;
        private final  Extras adds;
        private final Water water;

        public SoupFacade() {
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


