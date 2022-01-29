salario_habit = float(input())


if salario_habit >= 0.00 and salario_habit <= 2000.00:
    print('Isento')
elif salario_habit <= 3000.00:
    total = (salario_habit - 2000.00)*0.08
    print(f'R$ {total:.2f}')
elif salario_habit <= 4500.00:
    total = ((salario_habit - 3000.00)*0.18) + 1000.00*0.08
    print(f'R$ {total:.2f}')
else:
    total = (((salario_habit - 4500.00)*0.28)) + \
        1000.00*0.08 + 1500.00*0.18
    print(f'R$ {total:.2f}')
