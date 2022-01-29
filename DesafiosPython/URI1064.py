soma = 0
positivos = 0
for i in range(1, 7):
    numeros = float(input())
    if numeros > 0:
        positivos = positivos + 1
        soma = soma + numeros
        media = soma / positivos
print(f'{positivos} valores positivos')
print(f'{media:.1f}')
