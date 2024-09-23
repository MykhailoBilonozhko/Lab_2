package Lab_2;

import java.util.Scanner;

public class Customer
{
    private long _creditCard;
    private int _id, _balance;
    private String _surname, _name, _middlename, _address;

    public Customer(){}

    public Customer(int id, int balance, long creditCard, String surname,
                    String name, String middlename, String address)
    {
        _address = address;
        _balance = balance;
        _id = id;
        _creditCard = creditCard;
        _surname = surname;
        _name = name;
        _middlename = middlename;
    }
    public void SetValue()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть дані покупця");
        System.out.print("Введіть id : ");
        _id = scanner.nextInt();scanner.nextLine();
        System.out.print("Введіть прізвище: ");
        _surname = scanner.nextLine();
        System.out.print("Введіть ім'я: ");
        _name = scanner.nextLine();
        System.out.print("Введіть по-батькові: ");
        _middlename = scanner.nextLine();
        System.out.print("Введіть адресу: ");
        _address = scanner.nextLine();
        System.out.print("Введіть номер кредитної картки: ");
        _creditCard = scanner.nextLong();scanner.nextLine();
        System.out.print("Введіть баланс: ");
        _balance = scanner.nextInt();scanner.nextLine();
    }

    public void set_creditCard(long _creditCard) {
        this._creditCard = _creditCard;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public void set_balance(int _balance) {
        this._balance = _balance;
    }

    public void set_surname(String _surname) {
        this._surname = _surname;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public void set_middlename(String _middlename) {
        this._middlename = _middlename;
    }

    public void set_address(String _address) {
        this._address = _address;
    }

    public int get_id() {
        return _id;
    }

    public int get_balance() {
        return _balance;
    }

    public long get_creditCard() {
        return _creditCard;
    }

    public String get_surname() {
        return _surname;
    }

    public String get_name() {
        return _name;
    }

    public String get_middlename() {
        return _middlename;
    }

    public String get_address() {
        return _address;
    }

    @Override
    public String toString() {
        return "Покупець: \n" +
                "ID: " + _id + "\n" +
                "Прізвище: " + _surname + "\n" +
                "Ім'я: " + _name + "\n" +
                "По-батькові: " + _middlename + "\n" +
                "Адреса: " + _address + "\n" +
                "Номер кредитної картки: " + _creditCard + "\n" +
                "Баланс: " + _balance + "\n";
    }
}