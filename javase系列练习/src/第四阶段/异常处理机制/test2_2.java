 package 第四阶段.异常处理机制;
//建立银行账户类（Account），类中有变量double balance表示存款，Account类的构造方法能初始化账户余额，Account类中有取款的方法withDrawal(double dAmount)，当取款的数额大于存款时，抛出自定义的**InsufficientFundsException**，当取款数额为负数，抛出自定义的NagativeFundsException。
public class test2_2 {
    public static void main(String[] args) {
            Account a =new Account(100);
            try {
                a.withDrawal(150);
            }catch (Exception e){
                e.printStackTrace();
            }

            try {
                a.withDrawal(-15);
            }catch (Exception e){
                e.printStackTrace();
            }

            a.withDrawal(22);
    }
}
class Account{
        private double balance;
        Account(){

        }

        Account(double balance){
            this.balance=balance;
        }
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    void withDrawal(double dAmount){
            if (dAmount>balance){
                    throw new InsufficientFundsException("你的存款不足");
            }else if(dAmount <0){
                throw new NagativeFundsException("不可输入负数取款");
            }else {
                balance = balance-dAmount;
                System.out.println("你已取出"+dAmount+"元");
            }
    }
}

class InsufficientFundsException extends RuntimeException{
    InsufficientFundsException(){

    }
    InsufficientFundsException(String msg){
        super(msg);
    }
}
class NagativeFundsException extends RuntimeException{
    NagativeFundsException(){

    }
    NagativeFundsException(String msg){
        super(msg);
    }
}