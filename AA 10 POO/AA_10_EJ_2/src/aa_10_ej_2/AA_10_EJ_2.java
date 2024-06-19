
package aa_10_ej_2;


public class AA_10_EJ_2 {

    public static void main(String[] args) {
        
        MenuNinos menuNinos1 = new MenuNinos("Pollo Infantil", 5.0, 1.5, 2.0);
        MenuNinos menuNinos2 = new MenuNinos("Hamburguesa Infantil", 4.0, 1.0, 1.5);
        MenuEconomico menuEconomico = new MenuEconomico("Arroz con Pollo", 6.0, 10.0);
        MenuDia menuDia = new MenuDia("Plato del Día", 7.0, 1.5, 2.0);
        MenuCarta menuCarta = new MenuCarta("Bistec a la Carta", 10.0, 3.0, 2.0, 10.0);

        Cuenta cuenta = new Cuenta("Daniel Ludena", 12);

        cuenta.agregarMenu(menuNinos1);
        cuenta.agregarMenu(menuNinos2);
        cuenta.agregarMenu(menuEconomico);
        cuenta.agregarMenu(menuDia);
        cuenta.agregarMenu(menuCarta);
        System.out.println(cuenta);
    }
}