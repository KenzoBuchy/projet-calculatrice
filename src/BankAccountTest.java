import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void createIsGood(){
        BankAccount bank = new BankAccount("Kenzo", 15);
        assertEquals(15, bank.getBalance());
    }

    @Test
    void createIsNotGood(){
        assertThrows(IllegalArgumentException.class, () ->{
            new BankAccount("Kenzo", -15);
        });
    }

    @Test
    void depotIsGood(){
        BankAccount bank = new BankAccount("Kenzo", 15);
        bank.deposit(15);
        assertEquals(30, bank.getBalance());
    }

    @Test
    void depotIsNotGood(){
        BankAccount bank = new BankAccount("Kenzo", 15);
        assertThrows(IllegalArgumentException.class, () ->{
            bank.deposit(0);
        });

        assertThrows(IllegalArgumentException.class, () ->{
            bank.deposit(-15);
        });
    }

    @Test
    void withDrawIsGood(){
        BankAccount bank = new BankAccount("Kenzo", 15);
        bank.withdraw(15);
        assertEquals(0, bank.getBalance());
    }

    @Test
    void withdrawIsNotGood(){
        BankAccount bank = new BankAccount("Kenzo", 15);
        assertThrows(IllegalArgumentException.class, () ->{
            bank.withdraw(0);
        });

        assertThrows(IllegalArgumentException.class, () ->{
            bank.withdraw(25);
        });
    }
}