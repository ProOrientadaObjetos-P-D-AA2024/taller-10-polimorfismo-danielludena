
package aa_10_ej_2;

public class MenuEconomico extends Menu {
    
    private double porcentajeDescuento;

    public MenuEconomico(String nombrePlato, double valorInicial, double porcentajeDescuento) {
        super(nombrePlato, valorInicial);
        this.porcentajeDescuento = porcentajeDescuento;
        calcularValorMenu();
    }

    public void calcularValorMenu() {
        valorMenu = valorInicial - (valorInicial * porcentajeDescuento / 100);
    }

    public String toString() {
        return super.toString() + String.format("Porcentaje Descuento: %.2f%%\n",
                                                porcentajeDescuento);
    }
}
