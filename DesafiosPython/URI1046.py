data = input().split(' ')
dinit = int(data[0])
dfinal = int(data[1])

if dinit < dfinal:
    horas = dfinal - dinit
else:
    horas = (24 - dinit) + dfinal
print(f'O JOGO DUROU {horas} HORA(S)')
