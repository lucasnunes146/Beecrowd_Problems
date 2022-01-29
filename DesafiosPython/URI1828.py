tentativas = int(input())
for i in range(1, tentativas+1):
    escolhas = input().split(' ', maxsplit=2)
    if escolhas[0] == 'tesoura' and escolhas[1] == 'papel':
        print(f'Caso #{i}: Bazinga!')
    elif escolhas[0] == 'papel' and escolhas[1] == 'pedra':
        print(f'Caso #{i}: Bazinga!')
    elif escolhas[0] == 'pedra' and escolhas[1] == 'lagarto':
        print(f'Caso #{i}: Bazinga!')
    elif escolhas[0] == 'lagarto' and escolhas[1] == 'Spock':
        print(f'Caso #{i}: Bazinga!')
    elif escolhas[0] == 'Spock' and escolhas[1] == 'tesoura':
        print(f'Caso #{i}: Bazinga!')
    elif escolhas[0] == 'tesoura' and escolhas[1] == 'lagarto':
        print(f'Caso #{i}: Bazinga!')
    elif escolhas[0] == 'lagarto' and escolhas[1] == 'papel':
        print(f'Caso #{i}: Bazinga!')
    elif escolhas[0] == 'papel' and escolhas[1] == 'Spock':
        print(f'Caso #{i}: Bazinga!')
    elif escolhas[0] == 'Spock' and escolhas[1] == 'pedra':
        print(f'Caso #{i}: Bazinga!')
    elif escolhas[0] == 'pedra' and escolhas[1] == 'tesoura':
        print(f'Caso #{i}: Bazinga!')
    elif escolhas[0] == escolhas[1]:
        print(f'Caso #{i}: De novo!')
    else:
        print(f'Caso #{i}: Raj trapaceou!')
