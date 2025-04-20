public class Abstract {
    public static void main(String[] a)
    {
        Bank sbi = new SBI();
        Bank hdfc = new HDFC();
        sbi.displayBank();
        System.out.println("Interest is : " + sbi.getInterest() + "%");
        System.out.println();
        hdfc.displayBank();
        System.out.println("Interest is : " + hdfc.getInterest() + "%");
   
    }
}
abstract class Bank {
    String bankName;
    abstract double getInterest();
    void displayBank() {
        System.out.println("Bank: " + bankName);
    }
}
class SBI extends Bank {
    SBI() {
        bankName = "State Bank of India";
    }
    double getInterest() {
        return 6.5;
    }
}
class HDFC extends Bank {
    HDFC() {
        bankName = "HDFC Bank";
    }
    double getInterest() {
        return 7.2;
    }
}


