public class Main {


    public static void main(String[] args) {
        {

            ATM atm = new ATM();
            Hesap hesap = new Hesap("Mustafa Murat","1234",2000);

            atm.calis(hesap);
            System.out.println("");
        }
    }

}
