public class Test {
    public static void main(String[] args) {
        BankAccount savings = new BankAccount("jjyan01", 1234, 1000, "pass");

        System.out.println(savings);

        System.out.println(savings.logIn("jjyan01", "pass"));
        System.out.println(savings.getBalance()); //calling the method
        System.out.println(savings.withdraw(1001));
    }
} 