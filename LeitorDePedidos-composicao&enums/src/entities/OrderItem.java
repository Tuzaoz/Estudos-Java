package entities;

public class OrderItem {
    private Product product;
    private Integer quantity;
    private Double price;
    public OrderItem(Integer quantity, Double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }
    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    public Double getPrice() {
        return this.price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }
    public Double subTotal() {
        return this.quantity*this.price;
    }
    @Override
    public String toString() {
        return product.getName()+ ", Quantidade: "+ quantity + ", Subtotal: R$ " + subTotal();
    }
   

    
}

