# Encaixa ou Não II
# 22/06/26

testes = int(input())

for i in range(testes):
    A, B = input().split()
    if A.endswith(B):
        print("encaixa")
    else:
        print("nao encaixa")
