
package aa_10_ej_2;

public abstract class Menu {
    protected String nombrePlato;
    protected double valorMenu;
    protected double valorInicial;

    public Menu(String nombrePlato, double valorInicial) {
        this.nombrePlato = nombrePlato;
        this.valorInicial = valorInicial;
    }

    public abstract void calcularValorMenu();

    public String getNombrePlato() {
        return nombrePlato;
    }

    public double getValorMenu() {
        return valorMenu;
    }

    public String toString() {
        return String.format("Plato: %s\nValor Inicial: %.2f\nValor del Menu: %.2f\n",
                              nombrePlato, valorInicial, valorMenu);
    }
}

