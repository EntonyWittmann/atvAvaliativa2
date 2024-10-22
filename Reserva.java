public class Reserva {
    private String nomeHospede;
    private String dataCheckIn;
    private String dataCheckOut;
    private int quantidadeDeQuartos;
    private String tipoQuarto;
    private String periodoOcupacao;

    public Reserva(String nomeHospede, String dataCheckIn, String dataCheckOut, int quantidadeDeQuartos, String tipoQuarto, String periodoOcupacao) {
        this.nomeHospede = nomeHospede;
        this.dataCheckIn = dataCheckIn;
        this.dataCheckOut = dataCheckOut;
        this.quantidadeDeQuartos = quantidadeDeQuartos;
        this.tipoQuarto = tipoQuarto;
        this.periodoOcupacao = periodoOcupacao;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "nomeHospede='" + nomeHospede + '\'' +
                ", dataCheckIn='" + dataCheckIn + '\'' +
                ", dataCheckOut='" + dataCheckOut + '\'' +
                ", quantidadeDeQuartos=" + quantidadeDeQuartos +
                ", tipoQuarto='" + tipoQuarto + '\'' +
                ", periodoOcupacao='" + periodoOcupacao + '\'' +
                '}';
    }
}
