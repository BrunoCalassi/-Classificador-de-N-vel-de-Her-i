# Instruções para entrega
# # 3️⃣ Escrevendo as classes de um Jogo

# **O Que deve ser utilizado**

# - Variáveis
# - Operadores
# - Laços de repetição
# - Estruturas de decisões
# - Funções
# - Classes e Objetos

# ## Objetivo:

# Crie uma classe generica que represente um herói de uma aventura e que possua as seguintes propriedades:

# - nome
# - idade
# - tipo (ex: guerreiro, mago, monge, ninja )

# além disso, deve ter um método chamado atacar que deve atender os seguientes requisitos:

# - exibir a mensagem: "o {tipo} atacou usando {ataque}")
# - aonde o {tipo} deve ser concatenando o tipo que está na propriedade da classe
# - e no {ataque} deve seguir uma descrição diferente conforme o tipo, seguindo a tabela abaixo:

# se mago -> no ataque exibir (usou magia)
# se guerreiro -> no ataque exibir (usou espada)
# se monge -> no ataque exibir (usou artes marciais)
# se ninja -> no ataque exibir (usou shuriken)

# ## Saída

# Ao final deve se exibir uma mensagem:

# - "o {tipo} atacou usando {ataque}"
#   ex: mago atacou usando magia
#   guerreiro atacou usando espada

class Heroi:
    def __init__(self, nome, idade, tipo):
        self.nome = nome
        self.idade = idade
        self.tipo = tipo

    def atacar(self):
        if self.tipo == 'mago':
            print(f'o {self.tipo} atacou usando magia')
        elif self.tipo == 'guerreiro':
            print(f'o {self.tipo} atacou usando espada')
        elif self.tipo == 'monge':
            print(f'o {self.tipo} atacou usando artes marciais')
        elif self.tipo == 'ninja':
            print(f'o {self.tipo} atacou usando shuriken')

mago = Heroi('Gandalf', 60, 'mago')
mago.atacar()
guerreiro = Heroi('Aquiles', 25, 'guerreiro')
guerreiro.atacar()
monge = Heroi('Dalai Lama', 80, 'monge')
monge.atacar()
ninja = Heroi('Naruto', 17, 'ninja')
ninja.atacar()