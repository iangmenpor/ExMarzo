package com.IanG.BancoApp.features.customer.presentation;

import com.IanG.BancoApp.features.customer.data.CustomerDataRepository;
import com.IanG.BancoApp.features.customer.domain.*;

import java.util.Scanner;

public class CustomerMain {

    public static void CustomerMenu(String [] args){

    Scanner sc = new Scanner(System.in);

    CustomerRepository customerRepository = CustomerDataRepository.newInstance();
    CreateCustomerUseCase crear = new CreateCustomerUseCase(customerRepository);
    DeleteCustomerUseCase borrar = new DeleteCustomerUseCase(customerRepository);
    GetCustomerUseCase cliente = new GetCustomerUseCase(customerRepository);
    GetCustomersUseCase clientes = new GetCustomersUseCase(customerRepository);
    UpdateCustomerUseCase actualizar = new UpdateCustomerUseCase(customerRepository);

    int answer1 = 0;
    String answer2;

        System.out.println("</--------MENU DE CLIENTES---------/> \n  (1).Crear Cliente \n  (2).Borrar Cliente  \n  (3).Obtener lista de Clientes \n  (4).Obtener Cliente en concreto  \n  (5).Actualizar Cliente \n  (6).Salir");
        System.out.print("-> Por favor seleccione: ");
        answer1 = sc.nextInt();

    // Buffer bug fix
        sc.nextLine();

        while (answer1 != 6) {
        switch (answer1) {
            case 1:
                //-ejemplo
                Customer customer = new Customer("01229304", "Persona2", "Apellido2", "dirección2", "Ciudad2", "correo2");
                crear.execute(customer);
                break;

            case 2:
                System.out.print("-> Introduce el código del cliente que deseas eliminar : ");
                answer2 = sc.nextLine();
                borrar.execute(answer2);
                break;

            case 3:
                clientes.execute();
                break;

            case 4:
                System.out.print("-> Introduce el código del cliente que deseas Obtener : ");
                answer2 = sc.nextLine();
                cliente.execute(answer2);
                break;

            case 5:
                System.out.print("-> Introduce el código del Cliente que deseas Actualizar : ");
                answer2=sc.nextLine();
                Customer customerUpdate = new Customer(answer2, "NameUpdate", "surnameUpdate", "AddressUpdate", "CityUpdate", "MailingUpdate");
                actualizar.execute(customerUpdate);
                break;

            default:
                System.out.println("Error: Por favor seleccione las opciones disponibles.");
        }

        System.out.println("</--------MENU---------/> \n  (1).Crear Cliente \n  (2).Borrar Cliente \n  (3).Obtener lista de Clientes  \n  (4).Obtener Cliente en concreto \n  (5).Actualizar cliente \n  (6).Salir");
        System.out.print("-> Por favor seleccione: ");
        answer1 = sc.nextInt();

        sc.nextLine();
    }
        System.out.println("->Volviendo...");
        sc.close();
}
}