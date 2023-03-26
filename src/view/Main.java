package view;
import controller.ControllerForms;
/**
 *
 * @author jesus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        V_init.frmInit = null;
        if (V_init.frmInit  == null) {
            V_init.frmInit  = new V_init();
            ControllerForms controller = new ControllerForms(V_init.frmInit);
            V_init.frmInit .setLocationRelativeTo(null);
            V_init.frmInit .setSize(712, 528);
            V_init.frmInit .setVisible(true);

        }
    }
    
}
