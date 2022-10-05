import java.util.Scanner;

public class Converter {

    public double rub_dol (double r) {
        return r / 59.4;
    }

    public double rub_eur (double r) {
        return r / 58.06;
    }
    public double rub_uan (double r) {
        return r / 8.36;
    }
    
     public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("[1]Перевести RUB в DOL\n[2]Перевести RUB в EUR\n[3]Перевести RUB в UAN\n[0]Выход\nВыберете действие:");
        int choose = in.nextInt();


        switch (choose) {
            case 1: {
                System.out.println("Введите кол-во RUB: ");
                double num = in.nextDouble();
                System.out.println("DOL: "+rub_dol(num));
                break;
            }
            case 2: {
                System.out.println("Введите кол-во RUB: ");
                double num = in.nextDouble();
                System.out.println("EUR: "+rub_eur(num));
                break;
            }
            case 3: {
                System.out.println("Введите кол-во RUB: ");
                double num = in.nextDouble();
                System.out.println("UAN: "+rub_uan(num));
                break;
            }

        }

    }

}
