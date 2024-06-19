
package aa_10_ej_2;

import java.util.ArrayList;

public class Cuenta {
    
    private String nombreCliente;
    private ArrayList<Menu> menus;
    private double valorTotal;
    private double subtotal;
    private double iva;

    public Cuenta(String nombreCliente, double iva) {
        this.nombreCliente = nombreCliente;
        this.menus = new ArrayList<>();
        this.iva = iva;
        calcularSubtotal();
        calcularValorTotal();
    }

    public void agregarMenu(Menu menu) {
        menus.add(menu);
        calcularSubtotal();
        calcularValorTotal();
    }

    private void calcularSubtotal() {
        subtotal = 0;
        for (Menu menu : menus) {
            subtotal += menu.getValorMenu();
        }
    }

    private void calcularValorTotal() {
        valorTotal = subtotal + (subtotal * iva / 100);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Nombre del Cliente: %s\n", nombreCliente));
        sb.append(String.format("Subtotal: %.2f\n", subtotal));
        sb.append(String.format("IVA: %.2f%%\n", iva));
        sb.append(String.format("Valor Total: %.2f\n", valorTotal));
        sb.append("Menus:\n");
        for (Menu menu : menus) {
            sb.append(menu.toString()).append("\n");
        }
        return sb.toString();
    }
}

