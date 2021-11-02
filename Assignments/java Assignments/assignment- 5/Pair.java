class Main2{
    public static void main(String[] args) {
        Pair myObj = new Pair();
        myObj.setKey("13829");
        myObj.setValue("only String value");

        // set the date

        myObj.setKey("Today is ");
        myObj.setValue(new java.util.Date().toString());     // convert to string

        System.out.println(myObj);
    }
}




public class Pair
{
    private String key;
    private String value;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Pair { " + key + " "+ value + " }";
    }
}

