
package aa_10_ej_2;

public class MenuNinos extends Menu {
    
    private double valorHelado;
    private double valorPastel;

    public MenuNinos(String nombrePlato, double valorInicial, double valorHelado, double valorPastel) {
        super(nombrePlato, valorInicial);
        this.valorHelado = valorHelado;
        this.valorPastel = valorPastel;
        calcularValorMenu();
    }

    public void calcularValorMenu() {
        valorMenu = valorInicial + valorHelado + valorPastel;
    }

    public String toString() {
        return super.toString() + String.format("Valor Helado: %.2f\nValor Pastel: %.2f\n",
                                                valorHelado, valorPastel);
    }
}
