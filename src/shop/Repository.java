package shop;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Repository {
    List<Product> products= new ArrayList<>();

    public Repository() {
        products.add(new Product("01","Bánh Doremon 3 vị",Category.FOOD,100,3500,57));
        products.add(new Product("02","Xúc xích sườn non",Category.FOOD,150,3500,12));
        products.add(new Product("03","Thanh cua",Category.FOOD,100,5000,85));
        products.add(new Product("04","Bánh khoai môn",Category.FOOD,200,42000,78));
        products.add(new Product("05","Thùa ăn cơm inox mạ vàng",Category.HOUSEWARE,50,8000,5));
        products.add(new Product("06","Bát đựng gia vị",Category.HOUSEWARE,100,4000,44));
        products.add(new Product("07","Nước hoa hồng Soothing",Category.COSMETICS,100,92000,88));
        products.add(new Product("08","Combo gội xả HAIRBURST",Category.COSMETICS,100,639000,7));
        products.add(new Product("09","Tính chất dưỡng ẩm sâu Klairs ",Category.COSMETICS,100,249000,24));
        products.add(new Product("10","Kem dưỡng thee Paula's ",Category.COSMETICS,60,71000,63));
        products.add(new Product("11","Aó thun TSUN",Category.FASHION,250,320000,146));


    }

    public void showProduct(){
        for(Product p : products){
            System.out.println(p);
        }
    }

    public void sortProductByName(){
        products.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }
    public void filterProductByPrice(){
        for(Product p : products){
            if(p.getPrice()>10000){
                System.out.println(p);
            }
        }
    }

    public void countProductByAmountSale(){
        long count = products.stream()
                .filter(product -> product.getPrice()>10000)
                .count();
        System.out.println("Số lượng sản phẩm bán đưuọc từ 50 trở lên là: "+count);
    }


    public void showProductByCategory(Category category){
        for (Product p : products) {
            if (p.getCategory()== category){
                System.out.println(p);
            }
        }
    }

    public void showProductListAmountSale(){
        products.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return Integer.compare((int) o1.getAmountSale(), (int) o2.getAmountSale());
            }
        });
    }

    public void getProductAmountSaleMax(){
        long max = 0;
        for (Product product : products) {
            if (product.getAmountSale() > max) {
                max = product.getAmountSale();
            }
        }
        for (Product p : products) {
            if (p.getAmountSale() == max){
                System.out.println(p);
            }
        }
    }
}
