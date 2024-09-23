package Lab_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Main a = new Main();
        List<Customer> customers;
        List<Customer> listByName;
        List<Customer> listByCreditCard;
        List<Customer> listByBalance = new ArrayList<>();
        int numberOfDebtors;
        customers = a.CreateList();
        listByName = listByName(customers);
        System.out.println("Список покупців за ім'ям: ");
        PrintList(listByName);
        listByCreditCard = ListByCreditCard(customers);
        System.out.println("список покупців, у яких номер кредитної картки знаходиться в заданому інтервалі: ");
        PrintList(listByCreditCard);
        numberOfDebtors = ListByBalance(customers, listByBalance);
        System.out.println("К-сть покупців з заборгованістю: " + numberOfDebtors);
        System.out.println("Список покупців за заборгованістю: ");
        PrintList(listByBalance);
    }

    public List<Customer> CreateList(){
        Scanner scanner = new Scanner(System.in);
        List<Customer> customers = new ArrayList<>();

        System.out.print("Введіть к-сть покупців для вводу: ");
        int customersCount = scanner.nextInt();scanner.nextLine();

        for (int i = 0; i < customersCount; i++) {
            Customer buffer = new Customer();
            buffer.SetValue();
            customers.add(buffer);
        }

        return customers;
    }

    public static List<Customer> listByName(List<Customer> customers){
        List<Customer> listByName = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть ім'я(для створення списку): ");
        String name = scanner.nextLine();

        for (Customer el: customers){
            if(el.get_name().equals(name)){
                listByName.add(el);
            }
        }

        return listByName;
    }

    public static List<Customer> ListByCreditCard(List<Customer> customers){
        List<Customer> listByCreditCard = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть інтервал(для створення списку) ");
        System.out.print("Введіть початок інтервалу: ");
        long start = scanner.nextLong();scanner.nextLine();
        System.out.print("Введіть кінець інтервалу: ");
        long end = scanner.nextLong();scanner.nextLine();

        for (Customer el: customers){
            if(el.get_creditCard() >= start && el.get_creditCard() <= end){
                listByCreditCard.add(el);
            }
        }

        return listByCreditCard;
    }

    public static int ListByBalance(List<Customer> customers, List<Customer> listByBalance){
        int count = 0;

        for (Customer el: customers){
            if (el.get_balance() < 0){
                count++;
                listByBalance.add(el);
            }
        }

        return count;
    }

    public static void PrintList(List<Customer> customers){
        for (Customer element: customers){
            System.out.println(element.toString());
        }
    }
}