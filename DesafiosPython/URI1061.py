from datetime import datetime

dia1 = input()
horario1 = input()
full_date1 = datetime.strptime(dia1+' - '+horario1, 'Dia %d - %H : %M : %S')
dia2 = input()
horario2 = input()
full_date2 = datetime.strptime(dia2+' - '+horario2, 'Dia %d - %H : %M : %S')
result = full_date2-full_date1
hours = result.seconds//3600
minute = (result.seconds//60) % 60
seconds = result.seconds - hours*3600 - minute*60
print(f'{result.days} dia(s)')
print(f'{hours} hora(s)')
print(f'{minute} minuto(s)')
print(f'{seconds} segundo(s)')
