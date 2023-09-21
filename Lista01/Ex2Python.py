import random

gerador = random.Random()

dado1 = gerador.randint(1, 6)
dado2 = gerador.randint(1, 6)
ponto = dado1 + dado2
soma = 0

print("Dado 1:", dado1, ", Dado 2:", dado2)
print("Ponto:", ponto)

if ponto == 7 or ponto == 11:
    print("Jogador venceu!!")
elif ponto == 2 or ponto == 3 or ponto == 12:
    print("Jogador perdeu, a banca vence")
else:
    print("Iniciando estágio 2")

    i = 1
    while soma != 7:
        dado1 = gerador.randint(1, 6)
        dado2 = gerador.randint(1, 6)
        soma = dado1 + dado2

        print("Dado 1:", dado1, ", Dado 2:", dado2)
        print("Jogada", i, ":", soma)

        if soma == ponto:
            print("Jogador venceu")
            break
        if soma == 7:
            print("Jogador perdeu")
        i += 1
