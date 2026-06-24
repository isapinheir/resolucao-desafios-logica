# Lanche
# 24/06/26

cod, qtd = input().split()
cod = int(cod)
qtd = int(qtd)

match cod:
    case 1:
        preco = 4.00
    case 2:
        preco = 4.50
    case 3:
        preco = 5.00
    case 4:
        preco = 2.00
    case 5:
        preco = 1.50
    
total = (preco * qtd)

print(f"Total: R$ {total:.2f}")