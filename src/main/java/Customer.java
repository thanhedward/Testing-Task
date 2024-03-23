//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Customer {
    public String typeCustomer;
    public String sex;
    public boolean openAccount;
    public Customer() {
    }

    public Customer(String customer) {
        this.typeCustomer = customer;
    }
    public Customer(String customer, boolean open) {
        this.typeCustomer = customer;
        this.openAccount = open;
    }

    public Customer(String customer, String typeSex, boolean open) {
        this.typeCustomer = customer;
        this.openAccount = open;
        this.sex = typeSex;
    }
    public void setTypeCustomer(String customer) {
        this.typeCustomer = customer;
    }
    public String getTypeCustomer() {
        return typeCustomer;
    }
    public void setSex(String typeSex) {
        this.sex = typeSex;
    }
    public String getSex() {
        return sex;
    }
    public void setOpenAccount(boolean open) {
        this.openAccount = open;
    }
    public boolean getOpenAccount() {
        return openAccount;
    }
    public int outputGift() {
        if(typeCustomer.equals("VIP")) {
            if(openAccount) {
                if(sex.equals("Female")) return 550;
                else return 500;
            } else return 300;
        } else
        if(typeCustomer.equals("Normal")) {
            if(openAccount) {
                if(sex.equals("Female")) return 300;
                else return 250;
            } else return 150;
        } else if (typeCustomer.equals("None")) { return 50; }
        else {
            return 0;
        }
    }
    public static void main(String[] args) {
        Customer customer = new Customer("VIP", "Male", true);
        int discount = customer.outputGift();
        System.out.println(discount);
    }
}