package ExercExternos.Exerc06;

public class RelogioAmericano extends Relogio{
    private boolean isPM;

    public RelogioAmericano(int hora, int minuto, int segundo, boolean isPM) {
        super(hora, minuto, segundo);
        this.isPM = isPM;
    }

    @Override
    public void ajustarHorario(Relogio outro) {
        int h = outro.getHora();
        if (h >= 12) {
            this.isPM = true;
            this.hora = (h == 12) ? 12 : h - 12;
        } else {
            this.isPM = false;
            this.hora = (h == 0) ? 12 : h;
        }
        this.minuto = outro.getMinuto();
        this.segundo = outro.getSegundo();
    }

    @Override
    public String getHoraFormatada() {
        String sufixo = isPM ? "PM" : "AM";
        return String.format("%02d:%02d:%02d %s", hora, minuto, segundo, sufixo);
    }

}
