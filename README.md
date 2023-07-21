# :bookmark: Beecrowd

Resolução de execícios disponibilizados no site <a href='https://www.beecrowd.com.br/judge/pt/categories'> Beecrowd </a>

## :bricks: Estrutura

```
-- Nivel dificuldade
---- Linguagem utilizada
------- Nome exercício
------- Descrição exercício
```

## :bar_chart: Rodando os Exercícios

O teste dos execícios são realizados pelo site Beecrowd podendo retornar os seguintes status:

### :label: IN QUEUE

A sua submissão está na fila para ser julgada.

### :label: ACCEPTED

A submissão passou por todos os casos de teste.

### :label: COMPILATION ERROR

O código-fonte foi submetido com erro de compilação. A(s) linha(s) com erro aparecerão ressaltadas na visualização do código-fonte, para isto, basta clicar sobre o ID da submissão. Ali você também encontrará um maior detalhamento do erro.

### :label: RUNTIME ERROR

Erro típico quando você define um vetor ou array com menos capacidade do que o necessário para o problema, ou quando você tenta acessar uma de memória inválida.

### :label: TIME LIMIT EXCEEDED

A solução que você submeteu demorou mais tempo do que o permitido para rodar todos os testes dos juízes. Se o timelimit for 2 segundos, por exemplo, e seu programa demorar 2.3 segundo para rodar todos os casos de teste, você receberá "Time Limit Exceeded". É importante cuidar a técnica utilizada para resolver o problema. Uma solucão O(n log2 n) pode dar tempo de 0.3 segundos enquanto uma solução mais simples de implementar, mas com complexidade O(n2) pode levar mais de 100 segundos para rodar. 

### :label: PRESENTATION ERROR

Se a sua solução receber "Presentation  Error", isto é, erro de apresentação, na verdade ela já está praticamente correta, apenas há erro na quantidade de espaços ou letras inversão de letras maiúsculas / minúsculas. 

Por exemplo, se a saída correta para o problema for:

```
"X = 5"
```

E seu programa apresentar qualquer uma das saídas abaixo:

```
"X =  5"
"x = 5"
"x  =  5"
"X=5"
"X = 5 "
```

A resposta será "Presentation Error"...

### :label: WRONG ANSWER

Sua solução não apresenta o resultado esperado para todos os casos de testes dos juízes. Lembre-se que o seu programa também é testado com outras entradas além das fornecidas na descrição do problema, porém sempre respeitando as restrições do mesmo. O valor mostrado junto a resposta indica o quanto por cento sua saída está diferente do esperado. Por exemplo, se sua submissão retornou Wrong Answer (90%) isto signfica que sua saída está 90% diferente das saídas corretas. Note também que o valor mostrado em porcentagem foi arredondado para a dezena superior, isto é, se a divergência foi de 3.5% você irá visualizar 10%.

### :label: POSSIBLE RUNTIME ERROR

Se a sua solução recebeu "Possible Runtime Error" um dos seguintes problemas pode ter acontecido:

- Sua classe em Java não foi nomeada corretamente. Ele sempre deve ser nomeada como Main;
- Você está utilizando pacotes;
- Você está utilizando bibliotecas gráficas, como o Swing, ou bibliotecas de rede;
- Você não está lendo a entrada conforme a descrição do problema. Por exemplo, se o problema informar que a linha seguinte contém vários números e você os ler como se estivessem apresentados um por linha, provavelmente seu código lançará uma exceção e você receberá como resposta "Possible Runtime Error";
- Você não definiu o Locale padrão e tentou ler valores de moeda com vírgula ao invés de ponto. Lembre-se sempre de setar o Locale na primeira linha do método main:

```
public static void main(String[] args){
   Locale.setDefault(Locale.US);
   ...
}
```

Lembre-se que você pode visualizar maiores detalhes sobre o erro ao clicar sobre o ID da submissão na lista das suas submissões.

### :label: THINKING...

A submissão está sendo re-julgada devido a casos de teste ou especificação incorreta.

### :label: CLOSED

Houve um problema com esta submissão. Provavelmente não recebemos o código-fonte, por isso ela foi finalizada.

### :label: MEMORY LIMIT EXCEEDED

Se a sua solução recebeu esta resposta, significa que seu código tentou alocar mais memória do que o máximo permitido para o problema. Isso pode ocorrer porque você está utilizando um vetor ou uma estrutura de dados muito grande.