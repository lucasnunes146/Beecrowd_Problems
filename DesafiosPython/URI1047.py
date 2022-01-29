hora = input().split(' ')
hi = int(hora[0])
mi = int(hora[1])
hf = int(hora[2])
mf = int(hora[3])
mti = int(hi*60+mi)
mtf = int(hf*60+mf)

if mti >= mtf:
    hf = hf+24
    mti = hi*60+mi
    mtf = hf*60+mf
    mtf = mtf - mti
    h = mtf // 60
    m = mtf % 60
    print(f'O JOGO DUROU {h} HORA(S) E {m} MINUTO(S)')
else:
    mtf = mtf-mti
    h = mtf // 60
    m = mtf % 60
    print(f'O JOGO DUROU {h} HORA(S) E {m} MINUTO(S)')
