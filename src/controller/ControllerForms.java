package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.*;
import model.*;

/**
 *
 * @author jesus
 */
public class ControllerForms implements ActionListener {

    V_init viewInit = new V_init();
    V_CreateSeller viewAddSeller = new V_CreateSeller();

    public ControllerForms(V_init vInit) {
        this.viewInit = vInit;
        //agregando el evento a los botones
        this.viewInit.btnRegisterSeller.addActionListener(this);
        this.viewInit.btnMakeNewSale.addActionListener(this);
        //dandoles un nombre en comando para que se identifique en String
        this.viewInit.btnRegisterSeller.setActionCommand("registerSeller");
        this.viewInit.btnMakeNewSale.setActionCommand("makeNewSell");
    }

    public ControllerForms(V_CreateSeller vAddSeller) {
        this.viewAddSeller = vAddSeller;

        this.viewAddSeller.btnConfirm.addActionListener(this);
        //dandoles un nombre en comando para que se identifique en String
        this.viewAddSeller.btnConfirm.setActionCommand("confirmSeller");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == viewInit.btnRegisterSeller) {
            V_init.frmAddSeller = null;
            if (V_init.frmAddSeller == null) {
                V_init.frmAddSeller = new V_CreateSeller();
                ControllerForms controller = new ControllerForms(V_init.frmAddSeller);
                V_init.frmAddSeller.setLocationRelativeTo(null);
                V_init.frmAddSeller.setSize(507, 600);
                V_init.frmAddSeller.setVisible(true);
            }
        }
        if (e.getSource() == viewAddSeller.btnConfirm) {
            SellerDAO dao = new SellerDAO();
            dao.createSeller(confirmDates());
        }

    
    }
    

    

    private Seller confirmDates() {
        String rut, firstname, lastname, cellnumber, address, email;

        rut = viewAddSeller.txtRut.getText();
        firstname = viewAddSeller.txtName.getText();
        lastname = viewAddSeller.txtLastName.getText();
        cellnumber = viewAddSeller.txtFono.getText();
        address = viewAddSeller.txtAddress.getText();
        email = viewAddSeller.txtEmail.getText();
        Seller new_emp = new Seller(rut, firstname, lastname, cellnumber, address, email);
        clearTxt();//llamo el metodo dentro de otro metodo 
        return new_emp;
    }

    private void clearTxt() {
        // Limpia los campos de texto en tu formulario
        viewAddSeller.txtRut.setText("");
        viewAddSeller.txtName.setText("");
        viewAddSeller.txtLastName.setText("");
        viewAddSeller.txtFono.setText("");
        viewAddSeller.txtAddress.setText("");
        viewAddSeller.txtEmail.setText("");
    }
}
