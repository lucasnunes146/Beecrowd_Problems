qte = int(input())
lista = list(map(int, input().split()))

posicao = 0
menor = lista[0]
count = 0
for v in lista:
    if(v < menor):
        menor = v
        posicao = count
    count += 1

print(f'Menor valor: {menor}')
print(f'Posicao: {posicao}')
