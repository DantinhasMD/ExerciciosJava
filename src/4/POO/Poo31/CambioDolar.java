package POO.Poo31;

public class CambioDolar extends POO.Poo31.Cambio {
    public CambioDolar(double valorEmReais, double taxaCambio){;
        this.valorEmReais = valorEmReais;
        this.taxaCambio = taxaCambio;
    }
    @Override
    public double converter(){
        return valorEmReais / taxaCambio;
    }
}
