package shop;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Repository repository = new Repository();
        Scanner scanner = new Scanner(System.in);
        Menu.mainMenu();

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Danh sách sản phẩm");
                repository.showProduct();
                break;
            case 2:
                System.out.println("Các sản phẩm có giá trên 10000: ");
                repository.filterProductByPrice();
                break;
            case 3:
                repository.countProductByAmountSale();
                break;

            case 4:
                Menu.chooseCategory();
                int choice2 = scanner.nextInt();
                switch (choice2) {
                    case 1:
                        repository.showProductByCategory(Category.FOOD);
                        break;
                    case 2:
                        repository.showProductByCategory(Category.HOUSEWARE);
                        break;
                    case 3:
                        repository.showProductByCategory(Category.COSMETICS);
                        break;
                    case 4:
                        repository.showProductByCategory(Category.FASHION);
                        break;

                }
                break;
            case 5:
                repository.showProductListAmountSale();
                System.out.println("Sản phẩm sau khi sắp xếp: ");
                repository.showProduct();
                break;
            case 6:
                System.out.println("Sản phẩm bán chạy nhất: ");
                repository.getProductAmountSaleMax();
                break;
            case 7:
                repository.sortProductByName();
                System.out.println("Sản phẩm sau khi sắp xếp: ");
                repository.showProduct();
                break;
            case 0:
                System.exit(0);
                break;
        }
    }
}
