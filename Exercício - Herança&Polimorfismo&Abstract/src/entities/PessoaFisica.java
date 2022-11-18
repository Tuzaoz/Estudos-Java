package entities;

public class PessoaFisica extends Contribuinte {
    private Double gastosaudeDouble;

    public PessoaFisica() {
    }

    public PessoaFisica(String name, Double renda, Double gastosaudeDouble) {
        super(name, renda);
        this.gastosaudeDouble = gastosaudeDouble;
    }

    public Double getGastosaudeDouble() {
        return gastosaudeDouble;
    }

    public void setGastosaudeDouble(Double gastosaudeDouble) {
        this.gastosaudeDouble = gastosaudeDouble;
    }

    @Override
    public Double impostoPagoDouble() {
        Double imposto = 0.0;
        if (this.getRenda()<20000) {
            imposto = this.getRenda()*0.15 - this.getGastosaudeDouble()*0.5;
        } else {
            imposto = this.getRenda()*0.25 - this.getGastosaudeDouble()*0.5;
        }
        return imposto;
    }
    
    
}
