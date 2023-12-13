// Instruções para entrega
// # 3️⃣ Escrevendo as classes de um Jogo

// **O Que deve ser utilizado**

// - Variáveis
// - Operadores
// - Laços de repetição
// - Estruturas de decisões
// - Funções
// - Classes e Objetos

// ## Objetivo:

// Crie uma classe generica que represente um herói de uma aventura e que possua as seguintes propriedades:

// - nome
// - idade
// - tipo (ex: guerreiro, mago, monge, ninja )

// além disso, deve ter um método chamado atacar que deve atender os seguientes requisitos:

// - exibir a mensagem: "o {tipo} atacou usando {ataque}")
// - aonde o {tipo} deve ser concatenando o tipo que está na propriedade da classe
// - e no {ataque} deve seguir uma descrição diferente conforme o tipo, seguindo a tabela abaixo:

// se mago -> no ataque exibir (usou magia)
// se guerreiro -> no ataque exibir (usou espada)
// se monge -> no ataque exibir (usou artes marciais)
// se ninja -> no ataque exibir (usou shuriken)

// ## Saída

// Ao final deve se exibir uma mensagem:

// - "o {tipo} atacou usando {ataque}"
//   ex: mago atacou usando magia
//   guerreiro atacou usando espada


class Heroi {

    private String nome;
    private int idade;
    private String tipo;

    public Heroi(String nome, int idade, String tipo) {
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;

    }
    public void atacar() {
        String ataque;

        switch (tipo) {
            case "mago":
                ataque = "usou magia";
                break;
            case "guerreiro":
                ataque = "usou espada";
                break;
            case "monge":
                ataque = "usou artes marciais";
                break;
            case "ninja":
                ataque = "usou shuriken";
                break;
            default:
                ataque = "um ataque desconhecido";
        }
        System.out.println("o " + tipo + " atacou usando " + ataque);
    }
}
public class ClasseDeHeroi {
    public static void main(String[] args) {

        Heroi mago = new Heroi("Gandalf", 60, "mago");
        mago.atacar();
        Heroi guerreiro = new Heroi("Aquiles", 25, "guerreiro");
        guerreiro.atacar();
        Heroi monge = new Heroi("Dalai Lama", 80, "monge");
        monge.atacar();
        Heroi ninja = new Heroi("Naruto", 17, "ninja");
        ninja.atacar();
        Heroi clerigo = new Heroi("Francisco", 86, "clerigo");
        clerigo.atacar();

        // guerreiro = Heroi('Aquiles', 25, 'guerreiro')
        // guerreiro.atacar()
        // monge = Heroi('Dalai Lama', 80, 'monge')
        // monge.atacar()
        // ninja = Heroi('Naruto', 17, 'ninja')
        // ninja.atacar()

    }

}
