PRODUTO_1 = input().split(' ')
PRODUTO_2 = input().split(' ')
cod1 = int(PRODUTO_1[0])
qtd1 = int(PRODUTO_1[1])
preco1 = float(PRODUTO_1[2])
cod2 = int(PRODUTO_2[0])
qtd2 = int(PRODUTO_2[1])
preco2 = float(PRODUTO_2[2])
TOTAL = (qtd1*preco1)+(qtd2*preco2)

print(f'VALOR A PAGAR: R$ {TOTAL:.2f}')
