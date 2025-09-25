package ExercExternos.Exerc06;

public class RelogioBrasileiro extends Relogio{
    public RelogioBrasileiro(int hora, int minuto, int segundo) {
        super(hora, minuto, segundo);
    }

    @Override
    public void ajustarHorario(Relogio outro) {
        this.hora = outro.getHora();
        this.minuto = outro.getMinuto();
        this.segundo = outro.getSegundo();
    }
}
