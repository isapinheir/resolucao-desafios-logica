# Frequência de Números
# 22/06/26

qtd = int(input())
x = [0] * 2001

for i in range(qtd):
    n = int(input())
    x[n] += 1

for i in range(len(x)):
    if (x[i] != 0):
        print(f"{i} aparece {x[i]} vez(es)")