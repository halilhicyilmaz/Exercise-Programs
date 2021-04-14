package academy.learnprogramming;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public String getName() {
        return name;
    }

    public boolean newCustomer(String name, double initialTransaction){
        if (findCustomer(name)==null){
            this.customers.add(new Customer(name,initialTransaction));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String name, double transaction){
        Customer existingCustomer = findCustomer(name);
        if (existingCustomer != null){
            existingCustomer.addTransaction(transaction);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String name){
        for(int i = 0; i<this.customers.size();i++){
            Customer checkedCustomer = this.customers.get(i);
            if(checkedCustomer.getName().equals(name))
            {
                return checkedCustomer;
            }
        }
        return null;
    }

}
