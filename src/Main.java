public class Main {
    public static void main(String[] args) {
        coche micoche = new coche();
        micoche.ponerPuerta();
        System.out.println(micoche.puertas);
    }
}
    class coche {
        public int puertas = 4;

        public void ponerPuerta() {
            this.puertas++;
        }
    }