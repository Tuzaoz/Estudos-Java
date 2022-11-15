package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
    private LocalDateTime moment;
    private OrderStatus status;
    private List<OrderItem> orderItems = new ArrayList<>();
    private Client client;
    private static final DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyy hh:mm");
    public Order(LocalDateTime localDateTime, OrderStatus status, Client client) {
        this.moment = localDateTime;
        this.status = status;
        this.client = client;
    }
    public LocalDateTime getMoment() {
        return moment;
    }
    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }
    public OrderStatus getStatus() {
        return status;
    }
    public void setStatus(OrderStatus status) {
        this.status = status;
    }
    public List<OrderItem> getOrderItems() {
        return orderItems;
    }
    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }
    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }
    public void addItem(OrderItem item) {
        orderItems.add(item);
    }
    public void removeItem(OrderItem item) {
        orderItems.remove(item);
    }

    public double total () {
        double total = 0;
        for (OrderItem orderItem : orderItems) {
            total += orderItem.subTotal();
        }
        return total;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Momento do pedido: "+ moment.format(fmt1) + "\n");
        sb.append("Status do Pedido: "+ status + "\n");
        sb.append("Cliente: "+ client + "\n");
        sb.append("Itens do pedido: \n");
        for (OrderItem orderItem : orderItems) {
            sb.append(orderItem  +"\n");
        }
        sb.append("Total: R$ "+ total());
        return sb.toString();
    }
    
}
