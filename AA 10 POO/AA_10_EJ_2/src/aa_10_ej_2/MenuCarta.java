
package aa_10_ej_2;

public class MenuCarta extends Menu {
    
    private double valorGuarnicion;
    private double valorBebida;
    private double porcentajeServicio;

    public MenuCarta(String nombrePlato, double valorInicial, double valorGuarnicion, double valorBebida, double porcentajeServicio) {
        super(nombrePlato, valorInicial);
        this.valorGuarnicion = valorGuarnicion;
        this.valorBebida = valorBebida;
        this.porcentajeServicio = porcentajeServicio;
        calcularValorMenu();
    }

    public void calcularValorMenu() {
        valorMenu = valorInicial + valorGuarnicion + valorBebida + (valorInicial * porcentajeServicio / 100);
    }

    public String toString() {
        return super.toString() + String.format("Valor Guarnicion: %.2f\nValor Bebida: %.2f\nPorcentaje Servicio: %.2f%%\n",
                                                valorGuarnicion, valorBebida, porcentajeServicio);
    }
}
