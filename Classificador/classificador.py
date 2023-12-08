# Instruções para entrega
# # 1️⃣ Desafio Classificador de nível de Herói

# **O Que deve ser utilizado**

# - Variáveis
# - Operadores
# - Laços de repetição
# - Estruturas de decisões

# ## Objetivo

# Crie uma variável para armazenar o nome e a quantidade de experiência (XP) de um herói, depois utilize uma estrutura de decisão para apresentar alguma das mensagens abaixo:

# Se XP for menor do que 1.000 = Ferro
# Se XP for entre 1.001 e 2.000 = Bronze
# Se XP for entre 2.001 e 5.000 = Prata
# Se XP for entre 6.001 e 7.000 = Ouro
# Se XP for entre 7.001 e 8.000 = Platina
# Se XP for entre 8.001 e 9.000 = Ascendente
# Se XP for entre 9.001 e 10.000= Imortal
# Se XP for maior ou igual a 10.001 = Radiante

# ## Saída

# Ao final deve se exibir uma mensagem:
# "O Herói de nome **{nome}** está no nível de **{nivel}**"


# import random


# nome_heroi = 'Saitama'
# xp_heroi = random.randint(999, 10001)
# nivel = ''
# match xp_heroi:
#     case _ if xp_heroi < 1000:
#         nivel = 'Ferro'
#     case _ if 1000 <= xp_heroi < 2000:
#         nivel = 'Bronze'
#     case _ if 2000 <= xp_heroi < 5000:
#         nivel = 'Prata'
#     case _ if 5000 <= xp_heroi < 7000:
#         nivel = 'Ouro'
#     case _ if 7000 <= xp_heroi < 8000:
#         nivel = 'Platina'
#     case _ if 8000 <= xp_heroi < 9000:
#         nivel = 'Ascendente'
#     case _ if 9000 <= xp_heroi < 10000:
#         nivel = 'Imortal'
#     case _ if xp_heroi >= 10001:
#         nivel = 'Radiante'
    
# print(f'O Herói de nome {nome_heroi} está no nível de {nivel}')


nome_heroi = 'Saitama'
xp_heroi = {999,1000,1999,2000,2999,3000,3999,4000,4999,5000,5999,6000,6999,7000,7999,8000,8999,9000,9999,10000,10001}
nivel = ''
for xp in xp_heroi:
    if xp < 1000:
        nivel = 'Ferro'
    elif 1000 <= xp < 2000:
        nivel = 'Bronze'
    elif 2000 <= xp < 5000:
        nivel = 'Prata'
    elif 5000 <= xp < 7000:
        nivel = 'Ouro'
    elif 7000 <= xp < 8000:
        nivel = 'Platina'
    elif 8000 <= xp < 9000:
        nivel = 'Ascendente'
    elif 9000 <= xp < 10000:
        nivel = 'Imortal'
    elif xp >= 10000:
        nivel = 'Radiante'
    
    print(f'O Herói de nome {nome_heroi} está no nível de {nivel} e xp {xp}' )
