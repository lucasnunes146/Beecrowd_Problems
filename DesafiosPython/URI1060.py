positivos = 0
for numeros in range(1, 7):
    numeros = float(input())
    if numeros > 0:
        positivos = positivos + 1
print(f'{positivos} valores positivos')
