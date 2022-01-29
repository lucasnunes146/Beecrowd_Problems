vezes = 0
media = 0
while vezes < 2:
    nota = float(input())
    if nota >= 0 and nota <= 10:
        vezes += 1
        media = media + nota
    if nota < 0 or nota > 10:
        print('nota invalida')
media = media / 2
print(f'media = {media:.2f}')
