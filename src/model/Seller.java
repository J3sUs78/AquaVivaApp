
package model;

/**
 *
 * @author jesus
 */
public class Seller {
    
    private String rut, firstname, lastname, cellnumber, address, email;

    public Seller() {
    }

    public Seller(String rut, String firstname, String lastname, String cellnumber, String address, String email) {
        this.rut = rut;
        this.firstname = firstname;
        this.lastname = lastname;
        this.cellnumber = cellnumber;
        this.address = address;
        this.email = email;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getCellnumber() {
        return cellnumber;
    }

    public void setCellnumber(String cellnumber) {
        this.cellnumber = cellnumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
    
}
