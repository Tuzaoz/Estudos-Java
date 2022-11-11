package entities;

import java.util.ArrayList;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {
    private String name;
    private WorkerLevel level;
    private double baseSalary;
    private Derpartment derpartment;
    private List<HourContract> contracts = new ArrayList<>();
    
    public Worker(String name, WorkerLevel level, double baseSalary, Derpartment derpartment) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.derpartment = derpartment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Derpartment getDerpartment() {
        return derpartment;
    }

    public void setDerpartment(Derpartment derpartment) {
        this.derpartment = derpartment;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    public void addContract(HourContract contract){
        contracts.add(contract);
    }
    
    public void removeContract(HourContract contract) {
        contracts.remove(contract);
    }

    public Double income(int year, int month) {
        double sum = baseSalary;
        
        for (HourContract hourContract : contracts) {
            int c_year = hourContract.getDate().getYear();
            int c_month = hourContract.getDate().getMonthValue();
            if(c_year == year && c_month == month){
                sum += hourContract.totalValue();
            }
        }

        return sum;
    }
}
