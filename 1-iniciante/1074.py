# Par ou Ímpar
# 24/06/26

testes = int(input())

for i in range(testes):

    num = int(input())
    if num == 0:
        print("NULL")
    else:
        if num % 2 == 0:
            print("EVEN ", end="")
        else:
            print("ODD ", end="")
        if num < 0:
            print("NEGATIVE")
        else:
            print("POSITIVE")
