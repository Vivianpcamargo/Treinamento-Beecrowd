def exibe_nome(codigo):
    if codigo == 1:
        print('Rolien')
    elif codigo == 2:
        print('Naej')
    elif codigo == 3:
        print('Elehcim')
    elif codigo == 4:
        print('Odranoel')


n_testes = int(input())

cont_testes = 1
while cont_testes <= n_testes:

    n_feedbacks = int(input())

    cont_feedbacks = 1
    while cont_feedbacks <= n_feedbacks:
        codigo_feedback = int(input())
        exibe_nome(codigo_feedback)

        cont_feedbacks += 1

    cont_testes += 1
