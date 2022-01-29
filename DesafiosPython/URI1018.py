N = int(input())
print(N)
NOTAS = 100.00, 50.00, 20.00, 10.00, 5.00, 2.00, 1.00
qtd100 = int(N // NOTAS[0])
N = N - qtd100*100
qtd50 = int(N // NOTAS[1])
N = N - qtd50*50
qtd20 = int(N // NOTAS[2])
N = N - qtd20*20
qtd10 = int(N // NOTAS[3])
N = N - qtd10*10
qtd5 = int(N // NOTAS[4])
N = N - qtd5*5
qtd2 = int(N // NOTAS[5])
N = N - qtd2*2
qtd1 = int(N // NOTAS[6])
N = N - qtd1*1

print(f'{qtd100} nota(s) de R$ 100,00')
print(f'{qtd50} nota(s) de R$ 50,00')
print(f'{qtd20} nota(s) de R$ 20,00')
print(f'{qtd10} nota(s) de R$ 10,00')
print(f'{qtd5} nota(s) de R$ 5,00')
print(f'{qtd2} nota(s) de R$ 2,00')
print(f'{qtd1} nota(s) de R$ 1,00')
