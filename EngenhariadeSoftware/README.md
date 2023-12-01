1. Comentários so livro Software Engineering at Google 

Texto: 
We see three critical differences between programming and software engineering: time, scale, and the trade-offs at play. On a software engineering project, engineers need to be more concerned with the passage of time and the eventual need for change.
In a software engineering organization, we need to be more concerned about scale and efficiency, both for the software we produce as well as for the organization that is producing it. Finally, as software engineers, we are asked to make more complex decisions with higher-stakes outcomes,
often based on imprecise estimates of time and growth

Comentários:
tempo: observar a entrega promotida
escalabilidade: seria o quanto uma aplicação comporta de usuários.
trade-off: jogo de perde e ganha. Avaliação das tecnologias a serem usadas para realizar um projeto, levando em consideração o que será ganho e o que será perdido

Texto:
Within Google, we sometimes say, “Software engineering is programming integrated over time.” Programming is certainly a significant part of software engineering: after all, programming is how you generate new software in the first place. If you accept this distinction,
it also becomes clear that we might need to delineate between programming tasks (development) and software engineering tasks (development, modification, maintenance). The addition of time adds an important new dimension to programming. Cubes aren’t squares, distance isn’t velocity. Software engineering isn’t programming.

Comentários:
o texto dois faz uma distinção entre o programador e o engenheiro de software, e a grosso modo, pode-se considerar que a maior diferença está 
nas preocupações de ambos na execução. Um programador é mais limitado na resolução da task pela resolução da task. O engenheiro de software 
realiza a solução com foco não só na resolução do problema, mas na escalabilidade, no tempo, e no trade-off.

2. Três exemplos de trade-offs 

    1. Programa de controle automotivo: Eficiência X Simplicidade

    2. Power Bi: Praticidade X Limitação

    3. App de instituição financeira: Portabilidade X Velocidade


3. Requisito não funcional de usabilidade - avaliar 10 heurísticas 

   #1: Visibility of system status
![1heuris](https://github.com/JulioFreitas07/BERTOTI/assets/127301327/97b74151-46f6-43e9-b973-0d380982d517)

    
    - well applied: Quando fazemos o cadastro de algo, preenchemos algum formulário, e após clicar no botão "enviar" temos um feedback da interface informando que o arquivo foi enviado.
    
    - poorly applied: Gerar/criar exception  sem descrição.

    #2: Match between system and the real world
 
    - well applied: A tela inicial do windows após a primeira configuração é um exemplo perfeito disso, ela exibe mensagens como: "preparando o ambiente para você", "aguarde", "bem vindo". Aleḿ disso, podemos citar as 'pastas' do computador, as quais nos direcionam a presumir que são destinadas á guardar arquivos, semelhante ao que temos no mundo real.

    - poorly applied: A má aplicação dessa heurística traz confusão para o usuário, pois pode sinalizar algo que não faz sentido com o mundo real. 

    #3: User control and freedom

    - well applied: Um exemplo dessa heurística bem aplicada é quando clicamos no download de algum arquivo na web, e durante o download nós temos a opção de parar ele.
    
    - poorly applied: Provalvelmente o backup forçado do  whatsapp é um exemplo de como não aplicar bem essa heurística. Tendo em vista que não temos a opção de parar esse backup, nos tirando a liberdade de escolha naquele momento.

    #4: Consistency and standards

    - well applied: Uma boa aplicação disso é o uso do ícone de uma engrenagem para acessar as configurações do sistema, pois é um padrão.
    - poorly applied: Esse exemplo mal aplicado seria quando o usuário tivesse que entender um novo termo para fazer a mesma coisa, por exemplo, suponha que 'cadastrar' em um sistema fosse 'preencher ficha', em outro fosse 'inserir informações' e em outro fosse 'popular dados'.

    #5: Error prevention
    - well applied: Justamente a criação de um tempo de espera após enviar o email.
    - poorly applied: Podemos citar o envio dos emails antes de criarem a opção de cancelar o envio após 7segundos


    #6: Recognition rather than recall
    - well applied: Podemos notar o reconhecimento por exemplo da interface 'contatos' que vemos quando a acessamos no mobile, na verdades, os iconês dos apps nativos dos celulares são absudamente semelhantes, independente se são IOS ou Android 
    - poorly applied: Essa heuristica mal aplicada seria por exemplo o uso do Linux versus Windows, ao olhar essa diferença, temos poucas correlações na experiência do usuário


    #7: Flexibility and efficiency of use
    - well applied: Os atalhos de teclado durante o uso do Chrome por exemplo. Posso criar uma aba sem ter que usar o mouse, posso acessar a barra do navegador apenas usando Ctrl + L. Vemos isso também na sugestão de palavras no teclado dp whatsapp.
    - poorly applied: Imagino isso em uma interface sem atalhos, e sem sugestões de encurtar processos repetitivos e frenquentes


    #8: Aesthetic and minimalist design
    - well applied: Podemos encontrar isso na tela home do Google, tem apenas um nome 'Google' e uma barra de pesquisa
    - poorly applied: Vemos isso no sistema SAP, o qual é absurdamente poluído com todas as informações imagináveis.


    #9: Help users recognize, diagnose, and recover from errors
    - well applied: Por exemplo, no facebook,  quando queremos deletar nossa conta e ele nos faz escrever uma mensagem somente para confirmar a ação, pois trata-se de um processo cuja ação pode até ser irreversível
    - poorly applied: Seria se algum cadastro deixasse o usuário inserir uma data de nascimento superior à data atual.

    #10: Help and documentation
    - well applied: Podemos aqui citar a documentação do github, a qual é facil e útil ao usuário
    - poorly applied: a falta de documenteção ou ajuda torna a experiência do usuário negativa, pois ele é obrigado a perder tempo para descobrir como resolver o problema que ele está tendo no software, sendo que esse próprio software já poderia ter essa solução.


![DiagramaDeCasoDeUso drawio](https://github.com/JulioFreitas07/BERTOTI/assets/127301327/c067ca14-1c75-4cf4-b637-ed13fd900aa1)
![diagramadeclasses drawio](https://github.com/JulioFreitas07/BERTOTI/assets/127301327/50170bca-0bd6-4329-85d4-1a7156486aa7)


