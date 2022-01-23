class BadBankingException extends Exception { 
    public BadBankingException(String s) {
        super(s);
    }
}

class Account {
    String name;
    int currentMoney;

    public Account(String name, int currentMoney) {
        this.name = name;
        this.currentMoney = currentMoney;
    }

    public void withdraw(int money) throws BadBankingException {
        if(currentMoney < money ) {
            throw new BadBankingException("잔액이 부족합니다.");
        }
        currentMoney -= currentMoney;
    }

    public String toString() {
        return "Account [name=" + name + ", currentMoney=" + currentMoney + "]";
    }
}

public class CustomExceptionTest {
    public static void main(String[] args) {
        try {
            Account LeeAcount = new Account("이동훈", 1000);
            LeeAcount.withdraw(1500);
            System.out.println(LeeAcount.toString());
        } catch (BadBankingException e) {
            System.out.println(e.getMessage());
        }
    }
}