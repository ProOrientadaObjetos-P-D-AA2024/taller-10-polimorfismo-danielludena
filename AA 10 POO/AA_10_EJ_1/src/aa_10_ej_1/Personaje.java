package aa_10_ej_1;

public abstract class Personaje {

    protected String nombre;
    protected int puntosVida;
    protected int nivel;

    public Personaje(String nombre, int puntosVida, int nivel) {
        this.nombre = nombre;
        this.puntosVida = puntosVida;
        this.nivel = nivel;
    }

    public abstract void atacar(Personaje otro);

    public abstract void defender(int danio);

    public void subirNivel() {
        nivel++;
        puntosVida += 10;
        System.out.println(nombre + " ha subido al nivel " + nivel);
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public int getNivel() {
        return nivel;

    }
}
