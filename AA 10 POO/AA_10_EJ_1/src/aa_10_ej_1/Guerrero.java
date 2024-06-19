
package aa_10_ej_1;

public class Guerrero extends Personaje {

    public Guerrero(String nombre, int puntosVida, int nivel) {
        super(nombre, puntosVida, nivel);
    }

    public void atacar(Personaje otro) {
        int danio = nivel * 5;
        System.out.println(nombre + " ataca con una espada a " + otro.getNombre() + " causando " + danio + " de dano.");
        otro.defender(danio);
    }

    public void defender(int danio) {
        puntosVida -= danio;
        System.out.println(nombre + " recibe " + danio + " de dano. Vida restante: " + puntosVida);
    }

    public void habilidad() {
        System.out.println(nombre + " usa su habilidad especial: Golpe legendario");
    }
}