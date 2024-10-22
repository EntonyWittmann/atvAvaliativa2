import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static List<Quarto> quartosCadastradosManha = new ArrayList<>();
    static List<Quarto> quartosCadastradosTarde = new ArrayList<>();
    static List<Quarto> quartosCadastradosNoite = new ArrayList<>();
    static List<Quarto> quartosCadastradosDiaria = new ArrayList<>();
    static List<Reserva> reservadosManha = new ArrayList<>();
    static List<Reserva> reservadosTarde = new ArrayList<>();
    static List<Reserva> reservadosNoite = new ArrayList<>();
    static List<Reserva> reservadosDiaInteiro = new ArrayList<>();
    static List<Historico> historicoReservas = new ArrayList<>();
    static List<Hotel> hotel = new ArrayList<>();

    public static void main(String[] args) {

        menu();

    }

    public static void menu() {
        System.out.println("Seja bem vindo! Entre com a opção que deseja:");
        System.out.println("1. Cadastrar quarto\n2. Cadastrar uma reserva\n3. Gerenciar check-in/check-out\n4. Acompanhar ocupação de quartos\n5. Historico de reservas\n6. Sair");
        int escolha = sc.nextInt();
        switch (escolha) {
            case 1:
                cadastrarQuarto();
                break;
            case 2:
                cadastrarReserva();
                break;
            case 3:
                gerenciamentoCheck();
                break;
            case 4:
                acompanharOcupacaoDeQuarto();
                break;
            case 5:
                historicoReservas();
                break;
            case 6:
                System.out.println("Saindo do sistema!");
                break;
            default:
                System.out.println("Esta opção não existe!");
                break;
        }
    }

    public static void cadastrarQuarto() {
        System.out.println("Vamos cadastrar seu quarto!\nEntre com o numero do quarto:");
        int numeroQuarto = sc.nextInt();
        System.out.println("Entre com o tipo do quarto:\nSolteiro, casal ou suite.");
        String tipoQuarto = sc.next();
        System.out.println("Entre com o valor da quarto:");
        double preco = sc.nextDouble();
        System.out.println("Qual periodo deseja?\nManha, Tarde, Noite ou o dia inteiro?");
        String periodo = sc.next();
        System.out.println("Este quarto está disponivel?");
        String disponivel = sc.next();

        if (periodo.equalsIgnoreCase("manha")) {
            Quarto quartoManha = new Quarto(preco, numeroQuarto, tipoQuarto, disponivel, periodo);
            quartosCadastradosManha.add(quartoManha);
        }
        else if (periodo.equalsIgnoreCase("tarde")) {
            Quarto quartoTarde = new Quarto(preco, numeroQuarto, tipoQuarto, disponivel, periodo);
            quartosCadastradosTarde.add(quartoTarde);
        }
        else if (periodo.equalsIgnoreCase("noite")) {
            Quarto quartoNoite = new Quarto(preco, numeroQuarto, tipoQuarto, disponivel, periodo);
            quartosCadastradosNoite.add(quartoNoite);
        }
        else {
            Quarto quartoDiaria = new Quarto(preco, numeroQuarto, tipoQuarto, disponivel, periodo);
            quartosCadastradosDiaria.add(quartoDiaria);
        }

        System.out.println("Quarto cadastrado com sucesso!");

        menu();
    }

    public static void cadastrarReserva() {
        System.out.println("Vamos fazer uma reserva!");
        System.out.println("Entre com o nome do cliente:");
        String nomeCliente = sc.next();
        System.out.println("Qual a data de check-in?");
        String dataCheckIn = sc.next();
        System.out.println("Qual a data de Check-out?");
        String dataCheckOut = sc.next();
        System.out.println("Quantos quartos deseja reservar?");
        int quantidadeQuartos = sc.nextInt();
        System.out.println("Qual o tipo de quarto que deseja reservar?\nTemos quartos de solteiro, casal e suite");
        String tipoQuarto = sc.next();
        System.out.println("Qual periodo você deseja reservar?\nManha, Tarde, Noite ou o dia todo?");
        String periodoOcupacao = sc.next();

        if (periodoOcupacao.equalsIgnoreCase("manha")) {
            Reserva reservaManha = new Reserva(nomeCliente, dataCheckIn, dataCheckOut, quantidadeQuartos, tipoQuarto, periodoOcupacao);
            reservadosManha.add(reservaManha);
        } else if (periodoOcupacao.equalsIgnoreCase("tarde")) {
            Reserva reservaTarde = new Reserva(nomeCliente, dataCheckIn, dataCheckOut, quantidadeQuartos, tipoQuarto, periodoOcupacao);
            reservadosTarde.add(reservaTarde);
        } else if (periodoOcupacao.equalsIgnoreCase("noite")) {
            Reserva reservaNoite = new Reserva(nomeCliente, dataCheckIn, dataCheckOut, quantidadeQuartos, tipoQuarto, periodoOcupacao);
            reservadosNoite.add(reservaNoite);
        } else {
            Reserva reservaDiaInteiro = new Reserva(nomeCliente, dataCheckIn, dataCheckOut, quantidadeQuartos, tipoQuarto, periodoOcupacao);
            reservadosDiaInteiro.add(reservaDiaInteiro);
        }

        Historico historico = new Historico(nomeCliente, dataCheckIn, dataCheckOut, quantidadeQuartos, tipoQuarto, periodoOcupacao);
        historicoReservas.add(historico);


        System.out.println("Reserva cadastrada com sucesso!");

        menu();
    }

    public static void gerenciamentoCheck() {
        int quartosOcupados = 0;
        System.out.println("Você deseja fazer um check-in? Vamos lá!");
        System.out.println("Qual periodo você quer fazer check-in?\nManha, tarde, noite ou o dia inteiro?");
        String periodo = sc.next();
        if (periodo.equalsIgnoreCase("manha")) {
            System.out.println("Qual o tipo do quarto?\nSolteiro, casal ou suite?");
                String escolha = sc.next();
                quartosOcupados++;

                Hotel novoCheckIn = new Hotel(quartosOcupados, escolha, periodo);
                hotel.add(novoCheckIn);

            }
            else if (periodo.equalsIgnoreCase("tarde")) {
                System.out.println("Qual o tipo do quarto?");
                String escolha = sc.next();
                quartosOcupados++;

                Hotel novoCheckIn = new Hotel(quartosOcupados, escolha, periodo);
                hotel.add(novoCheckIn);

        }
            else if (periodo.equalsIgnoreCase("noite")) {
                System.out.println("Qual o tipo do quarto?");
                String escolha = sc.next();
                quartosOcupados++;

                Hotel novoCheckIn = new Hotel(quartosOcupados, escolha, periodo);
                hotel.add(novoCheckIn);
        }
            else {
                System.out.println("Qual o tipo do quarto?");
                String escolha = sc.next();
                quartosOcupados++;
                periodo = "diaria";

                Hotel novoCheckIn = new Hotel(quartosOcupados, escolha, periodo);
                hotel.add(novoCheckIn);
        }

        System.out.println("Aqui esta o relatorio de check-in");
        for (Hotel hotel : hotel) {
            System.out.println(hotel);
        }

        menu();
}

    public static void acompanharOcupacaoDeQuarto() {
        System.out.println("Qual periodo você deseja acompanhar?\n1. Manhã\n2. Tarde\n3. Noite");
        int escolha = sc.nextInt();
        switch (escolha) {
            case 1:
                periodoManha();
                break;
            case 2:
                periodoTarde();
                break;
            case 3:
                periodoNoite();
                break;
            case 4:
                diaInteiro();
                break;
            default:
                System.out.println("Opção invalida!");
                acompanharOcupacaoDeQuarto();
                break;
        }
        menu();
    }

    public static void historicoReservas() {
        for (Historico historico : historicoReservas) {
            System.out.println(historico);
        }

        menu();
    }

    public static void periodoManha() {
        for (Reserva reserva : reservadosManha) {
            System.out.println(reserva);
        }

        menu();
    }

    public static void periodoTarde() {
        for (Reserva reserva : reservadosTarde) {
            System.out.println(reserva);
        }

        menu();
    }

    public static void periodoNoite() {
        for (Reserva reserva : reservadosNoite) {
            System.out.println(reserva);
        }

        menu();
    }

    public static void diaInteiro() {
        for (Reserva reserva : reservadosDiaInteiro) {
            System.out.println(reserva);
        }

        menu();
    }

}