public class Hotel {
    private int quartosOcupados;
    private String tipoDeQuarto;
    private String periodo;

    public Hotel(int quartosOcupados, String tipoDeQuarto, String periodo) {
        this.quartosOcupados = quartosOcupados;
        this.tipoDeQuarto = tipoDeQuarto;
        this.periodo = periodo;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "quartosOcupados=" + quartosOcupados +
                ", tipoDeQuarto='" + tipoDeQuarto + '\'' +
                ", periodo='" + periodo + '\'' +
                '}';
    }
}
