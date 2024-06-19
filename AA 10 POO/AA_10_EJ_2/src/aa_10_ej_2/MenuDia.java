
package aa_10_ej_2;

public class MenuDia extends Menu {
    
    private double valorPostre;
    private double valorBebida;

    public MenuDia(String nombrePlato, double valorInicial, double valorPostre, double valorBebida) {
        super(nombrePlato, valorInicial);
        this.valorPostre = valorPostre;
        this.valorBebida = valorBebida;
        calcularValorMenu();
    }

    public void calcularValorMenu() {
        valorMenu = valorInicial + valorPostre + valorBebida;
    }

    public String toString() {
        return super.toString() + String.format("Valor Postre: %.2f\nValor Bebida: %.2f\n",
                                                valorPostre, valorBebida);
    }
}
