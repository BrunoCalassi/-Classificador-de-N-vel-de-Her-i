// # Instruções para entrega
// # # 1️⃣ Desafio Classificador de nível de Herói

// # **O Que deve ser utilizado**

// # - Variáveis
// # - Operadores
// # - Laços de repetição
// # - Estruturas de decisões

// # ## Objetivo

// # Crie uma variável para armazenar o nome e a quantidade de experiência (XP) de um herói, depois utilize uma estrutura de decisão para apresentar alguma das mensagens abaixo:

// # Se XP for menor do que 1.000 = Ferro
// # Se XP for entre 1.001 e 2.000 = Bronze
// # Se XP for entre 2.001 e 5.000 = Prata
// # Se XP for entre 6.001 e 7.000 = Ouro
// # Se XP for entre 7.001 e 8.000 = Platina
// # Se XP for entre 8.001 e 9.000 = Ascendente
// # Se XP for entre 9.001 e 10.000= Imortal
// # Se XP for maior ou igual a 10.001 = Radiante

// # ## Saída

// # Ao final deve se exibir uma mensagem:
// # "O Herói de nome **{nome}** está no nível de **{nivel}**"


public class ClassificadorDeHeroi {
    public static void main(String[] args) {
        String nomeDoHeroi = "Batman"; 
        int xpDoHeroi = 1000;
        
        String nivel = "1000 é qual ?";
        
        if (xpDoHeroi < 1000) {
            nivel = "Ferro";
        } else if (xpDoHeroi >= 1001 && xpDoHeroi <= 2000) {
            nivel = "Bronze";
        } else if (xpDoHeroi >= 2001 && xpDoHeroi <= 5000) {
            nivel = "Prata";
        } else if (xpDoHeroi >= 6001 && xpDoHeroi <= 7000) {
            nivel = "Ouro";
        } else if (xpDoHeroi >= 7001 && xpDoHeroi <= 8000) {
            nivel = "Platina";
        } else if (xpDoHeroi >= 8001 && xpDoHeroi <= 9000) {
            nivel = "Ascendente";
        } else if (xpDoHeroi >= 9001 && xpDoHeroi <= 10000) {
            nivel = "Imortal";
        } else if (xpDoHeroi >= 10001) {
            nivel = "Radiante";
        }
        
        System.out.println("O Herói de nome " + nomeDoHeroi + " está no nível de " + nivel);
    }
}

