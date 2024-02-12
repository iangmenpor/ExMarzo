package com.IanG.BancoApp.features.customer.data;

import com.IanG.BancoApp.features.customer.domain.Customer;
import com.IanG.BancoApp.features.customer.domain.CustomerRepository;

import java.util.ArrayList;

public class CustomerDataRepository implements CustomerRepository {

    /*SINGLETON*/
    private static CustomerDataRepository instance;
    public static CustomerDataRepository newInstance(){
        if (instance == null ){
            instance = new CustomerDataRepository();
        }
        return instance;
    }
    public void initData(){
       customers.add (new Customer("1234567T","Ian","Mendoza", "Av.Inmaculada", "Avila", "0505"));
    }
    private CustomerDataRepository(){
        initData();
    }
    ArrayList<Customer> customers = new ArrayList<>();


    @Override
    public Customer getCustomer(String dni) {
        for (Customer customerList : customers){
            if (customerList.dni.equals(dni)){
                System.out.println("->Cliente: "+ customerList.toString());
                return customerList;
            }
        }
        System.err.println("->Err_: ese cliente no existe");
        return null;
    }

    @Override
    public void createCustomer(Customer customer) {
        customers.add(customer);

    }

    @Override
    public void deleteCustomer(String id) {
        for (int i=0; i<customers.size(); i++){
            if (customers.get(i).dni.equals(id)){
                customers.remove(i);
                return;
            }
        }
        System.err.println("->Err: CLIENTE NO ENCONTRADO");
    }

    @Override
    public ArrayList<Customer> getCustomers() {
        ArrayList<Customer> customers1 = new ArrayList<>();
        for (Customer clientes: customers){
            System.out.println("->Cliente: "+ clientes.toString());
            customers1.add(clientes);
        }
        return customers1;
    }

    @Override
    public void updateCustomer(Customer customer) {
        for (int i=0; i< customers.size(); i++){
            Customer customer1 = customers.get(i);
            if (customer.dni.equals(customer1.dni)){
                customers.set(i, customer1);
                System.out.println("->CLIENTE ACTUALIZADO: "+ customer1.dni);
                System.out.println("->Datos actualizados: "+ customer1.toString());
            }
        }
    }
}
