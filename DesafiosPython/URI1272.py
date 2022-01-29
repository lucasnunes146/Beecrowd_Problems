total = int(input())

for i in range(total):
    texto = input().split("·")
    texto2 = []
    for x in texto:
        if x != "":
            texto2.append(x[0])
    print(''.join(texto2))
