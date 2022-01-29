salatual = float(input())

if salatual >= 0 and salatual <= 400.00:
    reajuste = (salatual*0.15)
    novo_salario = salatual+reajuste
    percentual = 15
    print(f'Novo salario: {novo_salario:.2f}')
    print(f'Reajuste ganho: {reajuste:.2f}')
    print(f'Em percentual: {percentual} %')
elif salatual >= 400.01 and salatual <= 800.00:
    reajuste = (salatual*0.12)
    novo_salario = salatual+reajuste
    percentual = 12
    print(f'Novo salario: {novo_salario:.2f}')
    print(f'Reajuste ganho: {reajuste:.2f}')
    print(f'Em percentual: {percentual} %')
elif salatual >= 800.01 and salatual <= 1200.00:
    reajuste = (salatual*0.1)
    novo_salario = salatual+reajuste
    percentual = 10
    print(f'Novo salario: {novo_salario:.2f}')
    print(f'Reajuste ganho: {reajuste:.2f}')
    print(f'Em percentual: {percentual} %')
elif salatual >= 1200.01 and salatual <= 2000.00:
    reajuste = (salatual*0.07)
    novo_salario = salatual+reajuste
    percentual = 7
    print(f'Novo salario: {novo_salario:.2f}')
    print(f'Reajuste ganho: {reajuste:.2f}')
    print(f'Em percentual: {percentual} %')
elif salatual >= 2000.01:
    reajuste = (salatual*0.04)
    novo_salario = salatual+reajuste
    percentual = 4
    print(f'Novo salario: {novo_salario:.2f}')
    print(f'Reajuste ganho: {reajuste:.2f}')
    print(f'Em percentual: {percentual} %')
