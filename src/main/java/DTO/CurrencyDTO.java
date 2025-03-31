package DTO;


public class CurrencyDTO {
    private Double eur;
    private Double usd;

    public CurrencyDTO(){
    }

    public CurrencyDTO(Double eur, Double usd) {
        this.eur = eur;
        this.usd = usd;
    }

    public Double getEur() {
        return eur;
    }

    public void setEur(Double eur) {
        this.eur = eur;
    }

    public Double getUsd() {
        return usd;
    }

    public void setUsd(Double usd) {
        this.usd = usd;
    }

    @Override
    public String toString() {
        return "CurrencyDTO{" +
                "eur=" + eur +
                ", usd=" + usd +
                '}';
    }
}

