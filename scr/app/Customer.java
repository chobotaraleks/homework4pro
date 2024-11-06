package app;

public class Customer {
    private final String name;
    private final String phone;

    // Конструктор класу Customer
    public Customer(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    // Геттери
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
}
