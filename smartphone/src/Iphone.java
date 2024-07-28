public class Iphone extends Smartphone{
    Smartphone meuSmartphone;
    String nomeDispositivo;
    String meuNumeroTelefone;
    String senha;

    public Iphone(String nomeDispositivo, String meuNumeroTelefone, String senha){
        this.nomeDispositivo = nomeDispositivo;
        this.meuNumeroTelefone = meuNumeroTelefone;
        this.senha = senha;
        this.meuSmartphone = new Smartphone();
    }

    public void exibirEstadoIphone(){
        System.out.println("------------------------------");
        System.out.println("Dispositivo : " + this.nomeDispositivo);
        System.out.println("Telefone : " + this.meuNumeroTelefone);
        System.out.println("Senha : " + this.senha);
        System.out.println("Demais detalhes : ");
        this.meuSmartphone.exibeEstado();
        System.out.println("------------------------------");
    }
}
