public class Main {
    public static void main(String[] args) {
        Shop clothing = new Shop("clothing store");
        clothing.addInfoGood("shirt", 56);
        clothing.addInfoGood("dress", 1000);
        clothing.addInfoGood("coat", 556);
        clothing.addInfoGood("shirt1", 56);
        clothing.addInfoGood("shirt2", 56);
        clothing.addInfoGood("shirt3", 56);
        clothing.addInfoGood("shirt4", 56);
        clothing.addService("buy");
        clothing.addService("return");
        clothing.addService("get a discount");
        clothing.info.departmentInfo();
    }
}
