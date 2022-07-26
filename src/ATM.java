import java.util.Scanner;

public class ATM {

    public void calis(Hesap hesap) {

        Login login = new Login();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bankamıza Hoşgeldiniz");

        System.out.println("******************");

        System.out.println("Kullanici girişi");

        System.out.println("******************");

        int giris_hakki = 3;

        while (true ) {
            if (login.login(hesap)) {
                System.out.println("Giriş başarili");

                break;

            }
            else {
                System.out.println("Giriş basarisiz");
                giris_hakki -=1;
                System.out.println("Kalan giris hakki " + giris_hakki);

            }
            if (giris_hakki == 0) {
                System.out.println("Giris Hakkınız Bitti ");

                return;
            }
        }
        System.out.println("*******************");
        String islemler = "1. Bakiye Görüntüle\n"
                + "2. Para Yatirma\n"
                + "3. Para Çekme\n"
                + "Çıkış için q'ya basin";
        System.out.println(islemler);

        while (true) {
            System.out.println("İşlemi Seçiniz ");
            String islem = scanner.next();

            if (islem.equals("q")) {
                break;
            }
            else if (islem.equals("1")) {
                System.out.println("Bakiyeniz : " + hesap.getBakiye());
            }
            else if (islem.equals("2")) {
                System.out.println("Yatirmak istediğiniz Tytar : ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraYatir(tutar);
            }
            else if (islem.equals(3)) {
                System.out.println("Cekmek istediğiniz tutar : ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraCek(tutar);
            }
            else {
                System.out.println("Gecersiz bir işlem");
            }

        }



    }
}
