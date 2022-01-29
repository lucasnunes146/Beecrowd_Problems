notas = input().split(' ')
n1 = float(notas[0])
n2 = float(notas[1])
n3 = float(notas[2])
n4 = float(notas[3])
media = ((n1*2)+(n2*3)+(n3*4)+(n4*1))/10
print(f'Media: {media:.1f}')

if media >= 7.0:
    print('Aluno aprovado.')
elif media < 5:
    print('Aluno reprovado.')
elif media >= 5 and media < 7.0:
    print('Aluno em exame.')
    if media >= 5 and media < 7.0:
        exame = float(input())
        print(f'Nota do exame: {exame:.1f}')
        nota_final = (exame+media)/2
        if nota_final >= 5.0:
            print('Aluno aprovado.')
        else:
            print('Aluno reprovado.')
    print(f'Media final: {nota_final:.1f}')
