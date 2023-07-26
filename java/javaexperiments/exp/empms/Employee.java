package exp.empms;

class Employee {
    int id;
    String name;
    double balance;

    double credit(double amount) {
        balance = balance + amount;
        return balance;
    }

    double debit(double amount) {
        balance = balance - amount;
        return balance;
    }

}
