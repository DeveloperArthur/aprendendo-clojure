Finalizando mais uma leitura✅ e dando meus primeiros passos na programação funcional, de tanto ouvir falar, resolvi estudar Clojure para conhecer e ver como funciona, e tenho alguns pontos sobre esse paradigma, o livro é ótimo, recomendo para quem quer aprender o paradigma ou a linguagem, até usamos TDD lá, super legal, e achei interessante a composição de funções.

Mas admito que minha experiência não foi das melhores, eu não curti, inclusive é a primeira vez que eu preciso utilizar a técnica pomodoro para ler, pois ficava maçante muito rápido, não é culpa do livro, o livro foi muito bem escrito, foi apenas meu relacionamento com o paradigma.

Sei que no ponto de vista arquitetural, pouco importa se eu gosto ou não da linguagem, todas tem vantagens, desvantagens e é nosso dever avaliar trade-offs na hora de escolher uma linguagem como solução, então, por mais que eu não tenha curtido a linguagem, se algum dia Clojure for a melhor escolha para resolver um problema, eu utilizarei 🤷🏻‍♂️

Nisso me bateu a dúvida: "Quando utilizar Clojure?" e eu acabei caindo em uma discussão muito profunda, de pessoas influentes na comunidade defendendo que Clojure é a melhor linguagem para todos os projetos, e outras pessoas apontando algumas qualidades e defeitos da linguagem... Parece que cada um tem uma opinião sobre, e nos meus estudos eu conclui o seguinte:

Como vantagem, Clojure vai te dar mais pontos em Security, Maintainability, ou seja, facilidade de manutenção, testes e legibilidade, eu estranhei a indentação e não achei muito legível, mas com certeza é por falta de costume e experiência na linguagem, com a prática eu iria conseguir notar a legibilidade que a linguagem fornece, e Clojure vai te dar uns pontos em Performance também, pois ele é executado na JVM, que é otimizada para a Performance, e além disso ele tem um compilador que gera código altamente otimizado, com técnicas como inline expansion e eliminação de chamadas de função.

As desvantagens são principalmente curva de aprendizado íngreme, e Performance, por mais que seja considerada uma linguagem de alta Performance, Clojure possui características onde a Performance pode ser afetada, por exemplo: Ele não possui while e for, para loop usaríamos recursão, isso faz com que fiquemos inserindo argumento de função na stack, fazendo operação com registradores que controlam a stack, e no fim acabamos manipulando umas 5 variáveis invés de apenas uma, isso leva a uma maior utilização de memória, impactando a Performance, mas é importante pontuar que o Clojure possui técnicas pra diminuir esse impacto na Performance, são otimizações específicas como o uso de tail call optimization, por exemplo.

Ou seja, se a Performance é crítica, outras linguagens podem ser mais adequadas para o projeto, mas pra maioria dos projetos em que a Performance é uma consideração importante, mas não crítica, Clojure pode ser uma boa escolha.

hashtag#clojure hashtag#programacaofuncional
