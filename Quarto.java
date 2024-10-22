public class Quarto {
    private int numeroQuarto;
    private String tipoQuarto;
    private double preco;
    private String disponibilidade;
    private String periodo;

    public Quarto(double preco, int numeroQuarto, String tipoQuarto, String disponibilidade, String periodo) {
        this.preco = preco;
        this.numeroQuarto = numeroQuarto;
        this.tipoQuarto = tipoQuarto;
        this.disponibilidade = disponibilidade;
        this.periodo = periodo;
    }

    @Override
    public String toString() {
        return "Quarto{" +
                "numeroQuarto=" + numeroQuarto +
                ", tipoQuarto='" + tipoQuarto + '\'' +
                ", preco=" + preco +
                ", disponibilidade='" + disponibilidade + '\'' +
                ", periodo='" + periodo + '\'' +
                '}';
    }
}
