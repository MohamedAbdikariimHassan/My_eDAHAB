import java.util.Scanner;

public class EDahabSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        String pinSaxAh = "1234";
        double hanti = 950.00;



        System.out.print("Ku so GaL Lambarka Gaban : ");
        String ussdKoodh = input.next();


        if (ussdKoodh.equals("*111#")) {
            System.out.println(" Ku soo dhawaada eDahab ");


            System.out.println("1. Dollar");
            System.out.println("2. Shilling");
            System.out.print("Dooro: ");
            int dooro = input.nextInt();

            input.nextLine();


            System.out.println(" eDahab Main Menu ");
            System.out.println("1. Xisaabtaada (My Account)");
            System.out.println("2. U Wareeji (Transfer Money)");
            System.out.println("3. Kaarka Hadalka (Airtime)");
            System.out.println("4. Ku Iibso (Buy/Pay)");
            System.out.println("5. Lacag la Bixid (Cash Withdrawal)");
            System.out.println("6. Dahabshiil Akoon (Bank Account)");


            int doorasho = input.nextInt();

            switch (doorasho) {

                case 1:
                    System.out.println("XISAABTAADA ");
                    System.out.print("Fadlan geli PIN-kaaga si aad u aragto haraagaaga: ");
                    String pinHaraaga = input.next();

                    if (pinHaraaga.equals(pinSaxAh)) {
                        System.out.println("Haraagaaga hadda waa: $" + hanti);
                        System.out.println("1. Ka bax");
                    } else {
                        System.out.println("[X] Waan ka xunnahay, PIN-kaagu waa khaldan ujoo!");
                    }
                    break;

                case 2:
                    System.out.println(" U WAREEJI LACAG ");
                    System.out.print("Geli nambarka qaataha: ");
                    String nambar = input.next();
                    System.out.print("Geli lacagta ($): ");
                    double lacagWareejin = input.nextDouble();

                    if (lacagWareejin <= hanti) {
                        System.out.println("Ma hubtaa inaad $" + lacagWareejin + " u wareejiso " + nambar + "?");
                        System.out.println("1. Haa\n2. Maya");
                        System.out.print("Dooro: ");
                        int hubi = input.nextInt();

                        if (hubi == 1) {
                            System.out.print("Fadlan geli PIN-kaaga si aad u xaqiijiso dirista: ");
                            String pinXaqiijin = input.next();

                            if (pinXaqiijin.equals(pinSaxAh)) {
                                hanti -= lacagWareejin;
                                System.out.println("[✔] Gudbiye: Waxaad $" + lacagWareejin + " u wareejisay " + nambar);
                                System.out.println("Haraagaaga cusub waa: $" + hanti);
                            } else {
                                System.out.println("[X] Waan ka xunnahay, PIN-kaagu waa khaldan yahay! Wareejintii waa la baajiyay.");
                            }
                        } else {
                            System.out.println("Waa la baajiyay wareejintii.");
                        }
                    } else {
                        System.out.println("Waan ka xunnahay, haraagaaga kuuma ogola.");
                    }
                    break;

                case 3:
                    System.out.println(" KAARKA HADALKA ");
                    System.out.println("1. Ku shub nambarkaaga");
                    System.out.println("2. Ku shub nambar kale");
                    System.out.print("Dooro: ");
                    int airtimeOption = input.nextInt();

                    if (airtimeOption == 1) {
                        System.out.print("Geli lacagta ($): ");
                        double kuShubo = input.nextDouble();
                        System.out.println("Waxaad $" + kuShubo + " ku shubatay nambarkaaga dhexdiisa.");
                    } else if (airtimeOption == 2) {
                        System.out.print("Geli nambarka kale: ");
                        String nambarKale = input.next();
                        System.out.print("Geli lacagta ($): ");
                        double kuShuboKale = input.nextDouble();
                        System.out.println("Waxaad $" + kuShuboKale + " ugu shubtay nambarka: " + nambarKale);
                    }
                    break;

                case 4:
                    System.out.println(" KU IIBSO (BUY/PAY) ");
                    System.out.print("Geli Aqoonsiga Ganacsiga (Merchant ID): ");
                    String merchantID = input.next();
                    System.out.print("Geli Lacagta ($): ");
                    double lacagIibsi = input.nextDouble();
                    System.out.println("Waxaad $" + lacagIibsi + " siisay ganacsade ID-giisu yahay " + merchantID);
                    break;

                case 5:
                    System.out.println(" LACAG LA BIXID ");
                    System.out.print("Geli Aqoonsiga Wakiilka (Agent ID): ");
                    String agentID = input.next();
                    System.out.print("Geli Lacagta aad bixinayso ($): ");
                    double lacagBixid = input.nextDouble();
                    System.out.println("Codsi ayaa loo diray Wakiilka " + agentID + ". Fadlan ka qaado $" + lacagBixid);
                    break;

                case 6:
                    System.out.println("DAHABSHIIL BANK ");
                    System.out.println("1. Ka soo wareeji Bank -> eDahab");
                    System.out.println("2. Ku wareeji eDahab -> Bank");
                    System.out.print("Dooro: ");
                    int bankOption = input.nextInt();

                    if (bankOption == 1) {
                        System.out.print("Geli lacagta aad soo xaraynayso ($): ");
                        double bankToWallet = input.nextDouble();
                        System.out.println("Waxaad Bank-ga ka soo qaadatay $" + bankToWallet);
                    } else if (bankOption == 2) {
                        System.out.print("Geli lacagta aad Bank-ga u dirayso ($): ");
                        double walletToBank = input.nextDouble();
                        System.out.println("Waxaad Bank-ga u dirtay $" + walletToBank);
                    }
                    break;

                default:
                    System.out.println("Nambar khaldan ayaad riixday!");
                    break;
            }

        } else {

            System.out.println("[X] Connection problem or invalid MMI code.");
        }

        input.close();
    }
}
