# Simulador de Iphone 

Este projeto simula as funcionalidades básicas de um iphone, permitindo ligar, desligar, conectar à internet, ajustar volume, avançar estação de rádio, fazer e atender ligações, e pesquisar na internet.

## Funcionalidades

- **Ligar e Desligar o Iphone**
- **Conectar e Desconectar da Internet**
- **Aumentar e Diminuir Volume**
- **Avançar Estação de Rádio**
- **Fazer e Atender Ligações**
- **Pesquisar na Internet**
- **Exibir Estado Atual do Iphone**

## Estrutura do Código

### Classe `Smartphone`

A classe `Smartphone` contém os seguintes atributos e métodos:

#### Atributos

- `boolean ligado`: Indica se o smartphone está ligado ou desligado.
- `boolean conectadoInternet`: Indica se o smartphone está conectado à internet.
- `byte estacaoRadioAtual`: Armazena a estação de rádio atual.
- `byte volume`: Armazena o volume atual do smartphone.

#### Métodos

- `Smartphone()`: Construtor que inicializa os atributos com valores padrão.
- `void liga()`: Liga o smartphone.
- `void desliga()`: Desliga o smartphone.
- `void conecta()`: Conecta o smartphone à internet.
- `void desconecta()`: Desconecta o smartphone da internet.
- `void aumentaVolume()`: Aumenta o volume do smartphone em 10 unidades.
- `void diminuiVolume()`: Diminui o volume do smartphone em 10 unidades.
- `void avancaEstacaoRadio()`: Avança para a próxima estação de rádio.
- `void fazerLigacao(String numero)`: Faz uma ligação para o número especificado.
- `void atenderLigacao(String numero)`: Atende uma ligação do número especificado.
- `void pesquisaInternet(String pesquisa)`: Realiza uma pesquisa na internet.
- `void exibeEstado()`: Exibe o estado atual do smartphone.

### Classe `Iphone`
A classe `Iphone` herda os atributos da classe `Smartphone`.

#### Atributos 

- `String nomeDispositivo`: Nome para o dispositivo.
- `String meuNumeroTelefone`: Número de telefone.
- `String senha`: senha do dispositivo.
- `Smatphone meuSmartphone`: Smartphone com funcionalidades herdadas.

#### Métodos

- `public Iphone(String nomeDispositivo, String meuNumeroTelefone, String senha)`: Construtor
- `public void exibirEstadoIphone()`: Exibe o estado atual do iphone.

### Classe `Main`

A classe `Main` permite ao usuário interagir com o smartphone por meio de um menu interativo.

#### Menu de Opções

1. Ligar o iphone
2. Desligar o iphone
3. Conectar à internet
4. Desconectar da internet
5. Aumentar volume
6. Diminuir volume
7. Avançar estação de rádio
8. Fazer uma ligação
9. Atender uma ligação
10. Pesquisar na internet
11. Exibir estado do iphone
12. Sair

## Como Executar

1. Certifique-se de ter o [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) instalado.
2. Clone este repositório ou baixe os arquivos.
3. Compile a classe `Main`:
   ```bash
   javac Main.java
