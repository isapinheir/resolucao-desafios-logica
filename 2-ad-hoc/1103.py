# Alarme Despertador
# 21/06/26

while True:
    caso = input()
    if(caso == "0 0 0 0"):
        break
    horario = caso.split()

    h1 = int(horario[0])
    m1 = int(horario[1])
    h2 = int(horario[2])
    m2 = int(horario[3])
    
    inicio = (h1 * 60) + m1
    fim = (h2 * 60) + m2

    if(inicio < fim):
        dormir = fim - inicio
    else:
        dormir = (1440 - inicio) + fim

    print(dormir)