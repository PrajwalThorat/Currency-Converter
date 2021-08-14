import java.util.Scanner;
public class CurruncyConvertorTask2{
    public static String USD;
    public static String JPY;
    public static String EUR;
    public static String GPB;
    public static String AED;
    public static Scanner sc = new Scanner(System.in);
    
    public static void ConvertUSD() {
        System.out.println("Choose :");
        System.out.println("JPY\nEUR\nGPB\nAED");
        System.out.print("Enter to Convert Currency : ");
        String UserInput = sc.next();
        if(UserInput.equalsIgnoreCase("JPY")){
            System.out.print("Enter the amount : ");
            int jpy = sc.nextInt();
            System.out.println("Your Exchange rate is : " +jpy*0.67+ " JPY");
        }else if(UserInput.equalsIgnoreCase("EUR")){
            System.out.print("Enter the amount : ");
            int eur = sc.nextInt();
            System.out.println("Your Exchange rate is : " +eur*85.37+ " EUR");
        }else if(UserInput.equalsIgnoreCase("GPB")){
            System.out.print("Enter the amount : ");
            int gpb = sc.nextInt();
            System.out.println("Your Exchange rate is : " +gpb*94.5+ " GPB");
        }else if(UserInput.equalsIgnoreCase("AED")){
            System.out.print("Enter the amount : ");
            int aed = sc.nextInt();
            System.out.println("Your Exchange rate is : "+aed*20.25+ " AED");
        }else{
            System.out.println("Enter the Capital letter OR Valid Character !!");
        }
    }
    public static void ConvertJPY(){
        System.out.println("Choose :");
        System.out.println("USD\nEUR\nGPB\nAED");
        System.out.print("Enter to COnvert Currency : ");
        String UserInput = sc.next();
        if (UserInput.equalsIgnoreCase("USD")){
            System.out.print("Enter the amount : ");
            int usd = sc.nextInt();
            System.out.println("Your Exchange rate is : " +usd*74.3+ " USD");
        }else if(UserInput.equalsIgnoreCase("EUR")){
            System.out.print("Enter the amount : ");
            int eur = sc.nextInt();
            System.out.println("Your Exchange rate is : " +eur*85.37+ " EUR");
        }else if(UserInput.equalsIgnoreCase("GPB")){
            System.out.print("Enter the amount : ");
            int gpb = sc.nextInt();
            System.out.println("Your Exchange rate is : " +gpb*94.5+ " GPB");
        }else if(UserInput.equalsIgnoreCase("AED")){
            System.out.print("Enter the amount : ");
            int aed = sc.nextInt();
            System.out.println("Your Exchange rate is : "+aed*20.25+ " AED");
        }else{
            System.out.println("Enter the Capital letter OR Valid Character !!");
        }
    }
    public static void ConvertEUR(){
        System.out.println("Choose :");
        System.out.println("JPY\nUSD\nGPB\nAED");
        System.out.print("Enter to Convert Currency : ");
        String UserInput = sc.next();
        if (UserInput.equalsIgnoreCase("JPY")){
            System.out.print("Enter the amount : ");
            int jpy = sc.nextInt();
            System.out.println("Your Exchange rate is : " +jpy*0.67+ " JPY");
        }else if(UserInput.equalsIgnoreCase("USD")){
            System.out.print("Enter the amount : ");
            int usd = sc.nextInt();
            System.out.println("Your Exchange rate is : " +usd*74.3+ " USD");
        }else if(UserInput.equalsIgnoreCase("GPB")){
            System.out.print("Enter the amount : ");
            int gpb = sc.nextInt();
            System.out.println("Your Exchange rate is : " +gpb*94.5+ " GPB");
        }else if(UserInput.equalsIgnoreCase("AED")){
            System.out.print("Enter the amount : ");
            int aed = sc.nextInt();
            System.out.println("Your Exchange rate is : "+aed*20.25+ " AED");
        }else{
            System.out.println("Enter the Capital letter OR Valid Character !!");
        }
    }

    public static void ConvertGBP(){
        System.out.println("Choose :");
        System.out.println("JPY\nEUR\nGPB\nAED");
        System.out.print("Enter to Convert Currency : ");
        String UserInput = sc.next();
        if (UserInput.equalsIgnoreCase("JPY")){
            System.out.print("Enter the amount : ");
            int jpy = sc.nextInt();
            System.out.println("Your Exchange rate is : " +jpy*0.67+ " JPY");
        }else if(UserInput.equalsIgnoreCase("EUR")){
            System.out.print("Enter the amount : ");
            int eur = sc.nextInt();
            System.out.println("Your Exchange rate is : " +eur*85.37+ " EUR");
        }else if(UserInput.equalsIgnoreCase("USD")){
            System.out.print("Enter the amount : ");
            int usd = sc.nextInt();
            System.out.println("Your Exchange rate is : " +usd*74.3+ " USd");
        }else if(UserInput.equalsIgnoreCase("AED")){
            System.out.print("Enter the amount : ");
            int aed = sc.nextInt();
            System.out.println("Your Exchange rate is : "+aed*20.25+ " AED");
        }else{
            System.out.println("Enter the Capital letter OR Valid Character !!");
        }
    }

    public static void ConvertAED(){
        System.out.println("Choose :");
        System.out.println("JPY\nEUR\nGPB\nAED");
        System.out.print("Enter to COnvert Currency : ");
        String UserInput = sc.next();
        if (UserInput.equalsIgnoreCase("JPY")){
            System.out.print("Enter the amount : ");
            int jpy = sc.nextInt();
            System.out.println("Your Exchange rate is : " +jpy*0.67+ " JPY");
        }else if(UserInput.equalsIgnoreCase("EUR")){
            System.out.print("Enter the amount : ");
            int eur = sc.nextInt();
            System.out.println("Your Exchange rate is : " +eur*85.37+ " EUR");
        }else if(UserInput.equalsIgnoreCase("GPB")){
            System.out.print("Enter the amount : ");
            int gpb = sc.nextInt();
            System.out.println("Your Exchange rate is : " +gpb*94.5+ " GPB");
        }else if(UserInput.equalsIgnoreCase("USD")){
            System.out.print("Enter the amount : ");
            int usd = sc.nextInt();
            System.out.println("Your Exchange rate is : "+usd*74.3+ " USD");
        }else{
            System.out.println("Enter the Capital letter OR Valid Character !!");
        }
    }
    

    public static void main(String[] srgs){
        System.out.println("Denominations    |      USD    |   JPY     |    GBP");
        System.out.println("---------------------------------------------------");
        System.out.println("   1             |     74.3    |  0.67     |   94.5");
        System.out.println("   10            |      743    |   6.7     |    945");
        System.out.println("   20            |     1486    |  13.4     |   1890");
        System.out.println("   50            |     3715    |  33.5     |   4725");
        System.out.println("   100           |     7430    |    67     |   9450");
        System.out.println("---------------------------------------------------");
        System.out.println("1.USD\n2.JPY\n3.GPB\n4.EUR\n5.AED");
        System.out.print("Enter : ");
        int output = sc.nextInt();
        switch(output){
            case 1:
            ConvertUSD();
            break;

            case 2:
            ConvertJPY();
            break;

            case 3:
            ConvertGBP();
            break;

            case 4:
            ConvertEUR();
            break;

            case 5:
            ConvertAED();
            break;

            default :
            System.out.println("Enter the valid Number !!");
            break;

        }

    }
}