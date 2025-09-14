package POO.Poo31;

public class CambioEuro extends POO.Poo31.Cambio {
    public CambioEuro(double valorEmReais, double taxaCambio){
        this.valorEmReais = valorEmReais;
        this.taxaCambio = taxaCambio;
    }
    @Override
    public double converter(){
        return valorEmReais / taxaCambio;
    }
}
