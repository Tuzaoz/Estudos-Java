package entities;

public class ImportedProduct extends Products {
    private Double taxas;

    public ImportedProduct() {
    }

    public ImportedProduct(String name, Double price, Double taxas) {
        super(name, price);
        this.taxas = taxas;
    }

    public Double getTaxas() {
        return taxas;
    }

    public void setTaxas(Double taxas) {
        this.taxas = taxas;
    }
    @Override
    public String priceTag() {
        return super.priceTag() + " ( Taxas Alfandegárias R$"+ this.taxas +")";
    }


}
