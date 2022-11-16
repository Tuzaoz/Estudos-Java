package entities;

public class tercEmployee extends Employee{
    private Double custoAdicional;

    public tercEmployee() {
    }

    public tercEmployee(String name, Integer hours, Double valuePerHour, Double custoAdicional) {
        super(name, hours, valuePerHour);
        this.custoAdicional = custoAdicional;
    }

    public Double getCustoAdicional() {
        return custoAdicional;
    }

    public void setCustoAdicional(Double custoAdicional) {
        this.custoAdicional = custoAdicional;
    }

    @Override
    public Double payment() {
        return super.payment() + this.custoAdicional*1.1;
    }
}
    
