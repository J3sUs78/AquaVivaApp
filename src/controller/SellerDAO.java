package controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import model.Seller;

/**
 *
 * @author jesus
 */
public class SellerDAO {

    private final List<Seller> employees = new ArrayList<>();
    private static boolean titlePrinted = false;
    
    public void createSeller(Seller emp) {
        LocalDate currentDate = LocalDate.now();
        employees.add(emp);
        if (!titlePrinted) {
            System.out.println("Lista de Empleados hoy " + currentDate);
            titlePrinted = true;
        }
        for (Seller e : employees) {
            System.out.println("Nombre: " + e.getFirstname() + " " + e.getLastname() + "\nRUT: " + e.getRut());
        }

    }

}
