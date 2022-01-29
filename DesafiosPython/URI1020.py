Idias = int(input())

anos = Idias // 365
Idias = Idias - anos*365
meses = Idias // 30
Idias = Idias - meses*30
dias = Idias // 1
Idias = Idias - dias*1

print(f'{anos} ano(s)')
print(f'{meses} mes(es)')
print(f'{dias} dia(s)')
