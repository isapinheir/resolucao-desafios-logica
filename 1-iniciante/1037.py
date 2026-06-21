# Intervalo
# 19/06/26

val = float(input())

if 0 <= val <= 25:
    print("Intervalo [0,25]")
elif 25 < val <= 50:
    print("Intervalo (25,50]")
elif 50 < val <= 75:
    print("Intervalo (50,75]")
elif 75 < val <= 100:
    print("Intervalo (75,100]")
else:
    print("Fora de intervalo")