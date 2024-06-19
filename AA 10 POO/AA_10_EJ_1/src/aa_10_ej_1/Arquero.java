
package aa_10_ej_1;

public class Arquero extends Personaje {

    public Arquero(String nombre, int puntosVida, int nivel) {
        super(nombre, puntosVida, nivel);
    }

    public void atacar(Personaje otro) {
        int danio = nivel * 3;
        System.out.println(nombre + " dispara una flecha a " + otro.getNombre() + " causando " + danio + " de dano.");
        otro.defender(danio);
    }

    public void defender(int danio) {
        puntosVida -= danio;
        System.out.println(nombre + " recibe " + danio + " de daño. Vida restante: " + puntosVida);
    }

    public void habilidad() {
        System.out.println(nombre + " usa su habilidad especial: Flecha de Fuego");
    }
}