class Ques2{

public static void main(String[] args){

     // Question- 2
        System.out.println("-------Question-2---------");

        Order o1 = new Order(4000,"DECLINE");
        Order o2 = new Order(5000000,"COMPLETED");
        Order o3 = new Order(6000000,"DECLINE");
        Order o4 = new Order(100000,"ACCEPTED");
        Order o5 = new Order(7000,"COMPLETED");

        List<Order> orderList = new ArrayList<>();
        orderList.add(o1);
        orderList.add(o2);
        orderList.add(o3);
        orderList.add(o4);
        orderList.add(o5);

        orderList.stream()
                .filter((x) -> x.getOrderPrice()>10000 &&
                        (x.getOrderStatus().equals("ACCEPTED") ||
                                x.getOrderStatus().equals("COMPLETED"))).forEach(System.out::println);


}


}
class Order {

    private int orderPrice;
    private String orderStatus;

    public Order(int orderPrice, String orderStatus) {
        this.orderPrice = orderPrice;
        this.orderStatus = orderStatus;
    }

    public int getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(int orderPrice) {
        this.orderPrice = orderPrice;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderPrice=" + orderPrice +
                ", orderStatus='" + orderStatus + '\'' +
                '}';
    }
}
