n = 10
medicoes = [0.0] * n
difMedicoes = [0.0] * n
qDifMedicoes = [0.0] * n
soma = 0
somaDif = 0
media = 0
mediaV = 0
dP = 0
pctg = 0

for i in range(n):
    medicoes[i] = float(input("Digite a medicao " + str(i + 1) + ":"))

for i in range(n):
    print("Medicao " + str(i + 1) + ": " + str(medicoes[i]))
    soma += medicoes[i]

media = soma / n

print("Media:", media)

for i in range(n):
    difMedicoes[i] = medicoes[i] - media
    qDifMedicoes[i] = difMedicoes[i] * difMedicoes[i]
    somaDif += qDifMedicoes[i]

mediaV = somaDif / n

dP = mediaV ** 0.5

print("Desvio Padrão:", dP)

pctg = (10.0 / 100.0) * media

if dP <= pctg:
    print("Multimetro operando normalmente......")
else:
    print("MULTIMETRO QUEBRADO!!!!!!!")
