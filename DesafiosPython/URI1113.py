n1 = 0
n2 = 1
while n1 != n2:
    n1, n2 = list(map(int, input().split(' ')))
    if n1 > n2:
        print('Decrescente')
    elif n1 < n2:
        print('Crescente')
    else:
        break
