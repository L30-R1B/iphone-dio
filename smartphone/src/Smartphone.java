
public class Smartphone {
    private boolean ligado;
    private boolean conectadoInternet;
    private byte estacaoRadioAtual;
    private byte volume;

    public Smartphone() {
        this.volume = 50;
        this.estacaoRadioAtual = 1;
        this.ligado = false;
        this.conectadoInternet = false;
    }

    public void liga() {
        this.ligado = true;
    }

    public void desliga() {
        this.ligado = false;
    }

    public void conecta() {
        this.conectadoInternet = true;
    }

    public void desconecta() {
        this.conectadoInternet = false;
    }

    public void aumentaVolume() {
        this.volume += 10;
    }

    public void diminuiVolume() {
        this.volume -= 10;
    }

    public void avancaEstacaoRadio() {
        if (this.estacaoRadioAtual == 100) {
            this.estacaoRadioAtual = 0;
        } else {
            this.estacaoRadioAtual++;
        }
    }

    public void fazerLigacao(String numero) {
        if (this.ligado) {
            System.out.println("Ligação feita para " + numero);
        } else {
            System.out.println("Ligue o dispositivo primeiro");
        }
    }

    public void atenderLigacao(String numero) {
        if (this.ligado) {
            System.out.println("Ligação atendida de " + numero);
        } else {
            System.out.println("Ligue o dispositivo primeiro");
        }
    }

    public void pesquisaInternet(String pesquisa) {
        if (!this.ligado) {
            System.out.println("Ligue o dispositivo primeiro");
        } else if (!this.conectadoInternet) {
            System.out.println("Verifique sua conexão com a internet");
        } else {
            System.out.println("Pesquisa: <" + pesquisa + "> encontrada");
        }
    }

    public void exibeEstado() {
        System.out.println("\tLigado: " + this.ligado);
        System.out.println("\tConectado à Internet: " + this.conectadoInternet);
        System.out.println("\tEstação de Rádio Atual: " + this.estacaoRadioAtual);
        System.out.println("\tVolume: " + this.volume);
    }
}
