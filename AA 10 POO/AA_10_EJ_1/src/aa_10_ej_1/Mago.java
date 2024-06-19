package aa_10_ej_1;

public class Mago extends Personaje {

    public Mago(String nombre, int puntosVida, int nivel) {
        super(nombre, puntosVida, nivel);
    }

    public void atacar(Personaje otro) {
        int danio = nivel * 4;
        System.out.println(nombre + " lanza un hechizo a " + otro.getNombre() + " causando " + danio + " de dano.");
        otro.defender(danio);
    }

    public void defender(int danio) {
        puntosVida -= danio;
        System.out.println(nombre + " recibe " + danio + " de dano. Vida restante: " + puntosVida);
    }

    public void habilidad() {
        System.out.println(nombre + " usa su habilidad especial: rayo debilitador");
    }
}
