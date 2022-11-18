package entities;

public class PessoaJuridica extends Contribuinte{
    private Integer nfuncInteger;

    public PessoaJuridica(String name, Double renda, Integer nfuncInteger) {
        super(name, renda);
        this.nfuncInteger = nfuncInteger;
    }

    public Integer getNfuncInteger() {
        return nfuncInteger;
    }

    public void setNfuncInteger(Integer nfuncInteger) {
        this.nfuncInteger = nfuncInteger;
    }

    @Override
    public Double impostoPagoDouble() {
        Double imposto = 0.0;
        if (this.getNfuncInteger()>10) {
            imposto = this.getRenda()*0.14;
        } else {
            imposto = this.getRenda()*0.16;
        }
        return imposto;
    }
}
