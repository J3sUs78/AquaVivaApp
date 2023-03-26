package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.V_init;
/**
 *
 * @author jesus
 */
public class ControllerForms implements ActionListener {
    
    V_init viewInit = new V_init();
    
    public ControllerForms(V_init vInit){
        this.viewInit = vInit;
        this.viewInit.btnRegisterSeller.addActionListener(this);
        this.viewInit.btnMakeNewSale.addActionListener(this);
        
        this.viewInit.btnRegisterSeller.setActionCommand("registerSeller");
        this.viewInit.btnMakeNewSale.setActionCommand("makeNewSell");
    }
    @Override
    public void actionPerformed(ActionEvent e) {
    
        String buttonName = e.getActionCommand();
        
        switch (buttonName) {
            case "registerSeller" -> JOptionPane.showMessageDialog(null, "hola1");
            case "makeNewSell" -> JOptionPane.showMessageDialog(null, "hola2");
            default -> throw new AssertionError();
        }
    }
        
}
    
