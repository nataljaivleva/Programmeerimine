public class PrintFormat{
    public static void main(String[] args) {
        int amount=10;
        double price=1.24;
        String nameProduct="milk";

        String text=String.format("Product: %s \n\t %.2f \u20ac * %d \n\t Total: %5.2f \u20ac \n",
                                        nameProduct,price,amount,price*amount);
        System.out.println(text);

        System.out.printf("Product: %s \n\t %.2f \u20ac * %d \n\t Total:%5.2f \u20ac \n",
                                        nameProduct,price,amount,price*amount);


        double pi = Math.PI;
        System.out.format("PI = %8.4f\n", pi);
        System.out.format("PI = %-8.4f\n", pi);
        double num=12345678.9876543;
        System.out.format(Locale.FRANCE,"Num = %8.4f\n", num);
    }
}