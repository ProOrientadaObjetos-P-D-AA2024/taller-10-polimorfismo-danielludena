package aa_10_ej_1;

public class Ejecutor {

    public static void main(String[] args) {
        
        Guerrero guerrero = new Guerrero("Nicolas el Guerrero", 100, 1);
        Mago mago = new Mago("Jeremias el mago", 80, 1);
        Arquero arquero = new Arquero("Teo el Arquero", 90, 1);

        guerrero.atacar(mago);
        mago.atacar(arquero);
        arquero.atacar(guerrero);

        guerrero.subirNivel();
        mago.subirNivel();
        arquero.subirNivel();

        guerrero.habilidad();
        mago.habilidad();
        arquero.habilidad();
    }
}

