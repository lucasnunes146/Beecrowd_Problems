VENDEDOR = input()
SALARIO = float(input())
TOTAL_VENDA = float(input())
COMISSAO = TOTAL_VENDA*0.15

print(f'TOTAL = R$ {COMISSAO+SALARIO:.2f}')
