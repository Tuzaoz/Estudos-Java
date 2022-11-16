package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Products{
    private LocalDate manufLocalDate;

    public UsedProduct(String name, Double price, LocalDate manufLocalDate) {
        super(name, price);
        this.manufLocalDate = manufLocalDate;
    }

    public LocalDate getManufLocalDate() {
        return manufLocalDate;
    }

    public void setManufLocalDate(LocalDate manufLocalDate) {
        this.manufLocalDate = manufLocalDate;
    }
    
    @Override
    public String priceTag() {
        return this.getName() + " (usado) R$" + this.getPrice() + " (Data de Fabricação: "+ manufLocalDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))+ ")";
        
    }
}
