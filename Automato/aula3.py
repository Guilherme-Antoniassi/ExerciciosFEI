transicao = {}
estados = list(input().split())
inicial = input()
aceitacoes = list(input().split())
alfabeto = list(input().split())

for i in range(0, len(estados)):
    linhas_transicao = list(input().split())
    transicao.update({linhas_transicao[0]: {alfabeto[0]: linhas_transicao[1], alfabeto[1]: linhas_transicao[2]}})

palavras = list(input().split())
atual = inicial

for p in palavras:
    for c in p:
        if c not in alfabeto:
            atual = None
            break
        atual = transicao[atual][atual][c]
    if atual in aceitacoes:
        print("aceita")
    else:
        print("rejeita")
atual=inicial

"""
testes:

a1:
q0 q1 q2
q0
q2
0 1
q0 q1 q0
q1 q1 q2
q2 q1 q0
0001 0101 1010 0011  -> se termina com 01=aceita

a2:
q0 q1 q2 q3 q4
q0
q1 q3
a b
q0 q1 q3
q1 q1 q2
q2 q1 q2
q3 q4 q3
q4 q4 q3
ababa abbab babba baaab ->deve terminar com mesmo simbolo=aceita

a3:
q0 q1 q2 q3
q0
q1 q2
0 1
q0 q3 q1
q1 q2 q2
q2 q3 q1
q3 q3 q3
10101 10110 00000 10100 ->toda posicao impar é 1=aceita

a4:
q0 q1 q2 q3
q0
q0 q1 q2
0 1
q0 q0 q1
q1 q0 q2
q2 q3 q2
q3 q3 q3
11100 10101 11011 11101 ->nao contem 110=aceita

a5:
q0 q1 q2 q3
q0
q2
0 1
q0 q1 q0
q1 q3 q2
q2 q1 q2
q3 q3 q3
110101 010100 00101 11101 ->todo 0 é seguido por pelo menos um 1=aceita

a6:
q0 q1 q2 q3 q4 q5 q6
q0
q3 q6
0 1
q0 q1 q2
q1 q3 q4
q2 q4 q5
q3 q3 q6
q4 q6 q5
q5 q5 q5
q6 q6 q5
01000 00110 01 01001 ->deve ter ao menos um 0 e no maximo um 1=aceita

"""