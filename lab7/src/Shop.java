import java.util.*;

public class Shop {
    private Department department;

    public Shop(String name) {
        this.department = new Department(name);
    }

    public void addService(String name) {
        department.addService(name);
    }

    public void addInfoGood(String name, int price) {
        department.addPrice(name, price);
    }

    private static class DepartmentGoods {
        private Set<String> nameOfGoods;

        public DepartmentGoods() {
            this.nameOfGoods = new HashSet<>();
        }

        public DepartmentGoods(Set<String> nameOfGoods) {
            this.nameOfGoods = nameOfGoods;
        }

        public List<String> getNamesOfGoods() {
            return new ArrayList<>(this.nameOfGoods);
        }
    }

    private class Department {
        private String nameOfDepartment;
        DepartmentGoods goods;
        private ArrayList<String> service;
        private final Map<String, Integer> priceGoods;

        public Department(String name) {
            this.nameOfDepartment = name;
            this.service = new ArrayList<>();
            this.priceGoods = new HashMap<>();
            this.goods = new DepartmentGoods();
        }

        public void setService(ArrayList<String> service) {
            this.service = service;
        }

        public void addService(String service) {
            this.service.add(service);
        }

        public void setNameOfDepartment(String nameOfDepartment) {
            this.nameOfDepartment = nameOfDepartment;
        }

        public void addPrice(String name, int price) {
            if (this.priceGoods.get(name) == null) {
                this.priceGoods.put(name, price);
                goods.nameOfGoods.add(name);
            } else {
                this.priceGoods.replace(name, price);
            }
        }

        public void getService() {
            System.out.println("Services: ");
            for (String iter : service) {
                System.out.println("You can: " + iter + " ");
            }
        }

        public void getTablePrice() {
            List<String> names = goods.getNamesOfGoods();
            System.out.println("Name of department: " + this.nameOfDepartment);
            System.out.println("Info about goods");
            for (String iter : names) {
                System.out.println("name of goods: " + iter + ", price: " + this.priceGoods.get(iter));
            }
        }
    }

    public Info info = new Info() {
        @Override
        public void departmentInfo() {
            department.getTablePrice();
            department.getService();
            System.out.print("Full price of department: " + this.countFullPriseOfDepartment());
        }

        @Override
        public int countFullPriseOfDepartment() {
            int fullPrice = 0;
            for (String iter : department.goods.nameOfGoods) {
                fullPrice += department.priceGoods.get(iter);
            }
            return fullPrice;
        }
    };

}
