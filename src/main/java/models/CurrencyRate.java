package models;


public class CurrencyRate {
    private Double eur;
    private Double usd;

    public CurrencyRate(){
    }

    public CurrencyRate(Double eur, Double usd) {
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
}
