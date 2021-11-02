import java.util.Scanner;

class RunApplication {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Please enter 1 if you are a customer and 2 if you are an owner:- ");
        int role  = s.nextInt();
        if(role == 1){
            System.out.println("Please enter the quantities of the items you want to buy?");
            System.out.println("Enter quantity of Candy , 0 for not buying:");
            Candy candy = new Candy(s.nextInt());
            System.out.println("Enter quantity of Cookie , 0 for not buying:");
            Cookie cookie = new Cookie(s.nextInt());
            System.out.println("Enter quantity of IceCream , 0 for not buying:");
            IceCreame iceCreame = new IceCreame(s.nextInt());

            double totalcost = candy.getCost()+cookie.getCost()+iceCreame.getCost();

            System.out.println("Your payment is "+totalcost+"$");



        }else if(role == 2){
            System.out.println("What you want to refill in the shop storage " +
                    "select 1 for candies " +
                    "select 2 for cookies" +
                    "select 3 for icecreams ");

            int choice = s.nextInt();

            switch(choice){
                case 1:
                    Candy c = new Candy();
                    System.out.println("Number of Candies ?");
                    c.setQuantity(s.nextInt());
                    System.out.println("Price of per candy");
                    c.setPrizeOfCandy(s.nextInt());
                    System.out.println(c);
                    break;
                case 2:
                    Cookie cookie= new Cookie();
                    System.out.println("Number of packets of cookies ?");
                    cookie.setNoOfpacks(s.nextInt());
                    System.out.println("Price of per packet ?");
                    cookie.setPriceperpack(s.nextInt());
                    System.out.println(cookie);
                    break;
                case 3:
                    IceCreame ic= new IceCreame();
                    System.out.println("Number of Icecream ?");
                    ic.setQuantiy(s.nextInt());
                    System.out.println("Price of per Icecream ?");
                    ic.setPriceperIcecream(s.nextInt());
                    System.out.println(ic);
                    break;

                default:
                    System.out.println("Enter the correct choice .");
                    break;
            }


        }
        else{
            System.out.println("Please enter a valid choice.");
        }

    }
}

public abstract class DessertItem {



    public abstract int getCost();
}

class Candy extends DessertItem {

    final int TAX_CANDY = 10;
    private int quantity;
    private int prizeOfCandy = 5;

    // to store the number of candies in the shop storage.

    public Candy(int quantity ) {
        this.quantity = quantity;
    }

    public Candy() {
        this.quantity = 0;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrizeOfCandy() {
        return prizeOfCandy;
    }

    public void setPrizeOfCandy(int prizeOfCandy) {
        this.prizeOfCandy = prizeOfCandy;
    }

    @Override
    public int getCost() {
        int dollar = (getQuantity()*getPrizeOfCandy() + TAX_CANDY) / 60;
        return dollar;
    }

    @Override
    public String toString() {
        return "Candy{" +
                "Totalquantity=" + quantity +
                '}';
    }
}




class Cookie extends DessertItem {
    final int TAX_COOKIE = 20;
    private int noOfpacks;
    private int priceperpack = 50;


    public Cookie() {
        this.noOfpacks = 0;

    }

    public Cookie(int noOfpacks) {

        this.noOfpacks = noOfpacks;
    }

    public int getNoOfpacks() {
        return noOfpacks;
    }

    public void setNoOfpacks(int noOfpacks) {
        this.noOfpacks = noOfpacks;
    }

    public int getPriceperpack() {
        return priceperpack;
    }

    public void setPriceperpack(int priceperpack) {
        this.priceperpack = priceperpack;
    }

    @Override
    public int getCost() {
        int dollar = (getNoOfpacks()*getPriceperpack() + TAX_COOKIE) / 60;
        return dollar;
    }

    @Override
    public String toString() {
        return "Cookie{" +
                "Totalpacks=" + noOfpacks + '}';
    }
}






class IceCreame extends DessertItem {
    final int TAX_ICECREAM = 15;

    private int quantiy;
    private int priceperIcecream = 25;

    public IceCreame() {
        this.quantiy=0;
    }

    public IceCreame(int quantiy) {
        this.quantiy = quantiy;
    }

    public int getQuantiy() {
        return quantiy;
    }

    public void setQuantiy(int quantiy) {
        this.quantiy = quantiy;
    }

    public int getPriceperIcecream() {
        return priceperIcecream;
    }

    public void setPriceperIcecream(int priceperIcecream) {
        this.priceperIcecream = priceperIcecream;
    }

    @Override
    public int getCost() {
        int dollar = (getQuantiy()*getPriceperIcecream() + TAX_ICECREAM) / 60;
        return dollar;
    }

    @Override
    public String toString() {
        return "IceCreame{" +
                "Totalquantiy=" + quantiy + '}';
    }
}
