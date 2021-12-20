package commonUtil;

import java.util.Objects;

public class Product {

    private int id;
    private String productName;
    private int productPrice;
    private boolean inStockOrNot;

    public Product(int id, String productName, int productPrice, boolean inStockOrNot) {
        this.id = id;
        this.productName = productName;
        this.productPrice = productPrice;
        this.inStockOrNot = inStockOrNot;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public boolean isInStockOrNot() {
        return inStockOrNot;
    }

    public void setInStockOrNot(boolean inStockOrNot) {
        this.inStockOrNot = inStockOrNot;
    }

    @Override
    public String toString() {
        return "Product = { " +
                 "id = " + id +
                 "productName = " + productName +
                 "productPrice = " + productPrice +
                 "inStockOrNot = " + inStockOrNot +
                "}";
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
