# Projeto Adivinhe se Puder
Projeto realizado pelo aluno Davi que objetiva aplicar os conhecimentos da disciplina de testes de software do Instituto Federal de Campina Grande para obtenção de nota.

# Descrição 
O jogo da forca é um jogo em que o jogador tem que acertar qual é a palavra proposta, tendo como dica o número de letras e o tema ligado à palavra. A cada letra errada, é desenhada uma parte do corpo de um boneco. Se for desenhado todo o corpo, o boneco é enforcado representando que o jogador perdeu a partida. 

Você deve desenvolver a forca que é a nova modinha na internet: [wordlegame](https://wordlegame.org/pt). 

Veja as regras na imagem abaixo:
<img src="https://github.com/DaviDosCompiuter/Adivinhe_Se_Puder/blob/main/doc/imagens/Regras.png" width="400" height="400" />

# Requisitos Funcionais
- RF1: O jogador pode escolher o tamanho da palavra (o mínimo é 2 letras)
- RF1: O jogador pode escolher o tamanho da palavra (o mínimo é 2 letras)
- RF2: A palavra deve ser sorteada da lista que se encontra nesse [link](https://www.ime.usp.br/~pf/dicios/br-utf8.txt)
- RF3: O jogador configura o número total de tentativas, o padrão é 6.
- RF4: Letra descoberta que está no local correto deve ser exibida em caixa alta
- RF5: Letra descoberta mas que não está no local correto deve ser exibida em letra minúscula na lateral da tela.
- RF6: O jogador pode configurar o número máximo de jogadas por dia.

# Requisitos Não-Funcionais
- RNF1: A interface deve ser fácil de usar.
- RNF2: O jogo deve estar disponível para partidas independente do site que contém as palavras. 
- RNF3: O jogo deve ser desenvolvido em Java ou Python.

# Casos de Testes
- Ao iniciar o jogador tem que escolher o tamanho da palavra:
<img src="https://github.com/DaviDosCompiuter/Adivinhe_Se_Puder/blob/main/doc/imagens/T1.png" width="500" height="150" />
- O jogador tem que digitar um tamanho valido entre 2 e 23 letras:
<img src="https://github.com/DaviDosCompiuter/Adivinhe_Se_Puder/blob/main/doc/imagens/T2.png" width="500" height="150" />
- Após digitar o tamanho da palavra, o jogador deve digitar o número de tentativas:
<img src="https://github.com/DaviDosCompiuter/Adivinhe_Se_Puder/blob/main/doc/imagens/T3.png" width="500" height="150" />
- Se o jogador digitar o número 0 tentativas a palavra é revela, pois o jogador não terá nenhuma tentativa:
<img src="https://github.com/DaviDosCompiuter/Adivinhe_Se_Puder/blob/main/doc/imagens/T4.png" width="500" height="100" />
- Se o jogador digitar o número de tentativas que queira, o jogo inicia e o jogador deverá fornecer a palavra desejada:
<img src="https://github.com/DaviDosCompiuter/Adivinhe_Se_Puder/blob/main/doc/imagens/T5.png" width="500" height="150" />
- Ao digitar a palavra, é mostrado o teclado com as letras já utilizadas na cor cinza, as letras não utilizadas na cor branca, as letras que estão em posições erradas na cor vermelho e as letras que estão na posição certa na cor verde:
<img src="https://github.com/DaviDosCompiuter/Adivinhe_Se_Puder/blob/main/doc/imagens/T6.png" width="500" height="150" />
<img src="https://github.com/DaviDosCompiuter/Adivinhe_Se_Puder/blob/main/doc/imagens/T7.png" width="500" height="150" />
- Ao digitar palavras que não estão no dicionario ou palavras maiores que a antes definidas, é mostrado uma mensagem de erro e o jogador poderar jogar novamente:
<img src="https://github.com/DaviDosCompiuter/Adivinhe_Se_Puder/blob/main/doc/imagens/T8.png" width="500" height="150" />
<img src="https://github.com/DaviDosCompiuter/Adivinhe_Se_Puder/blob/main/doc/imagens/T9.png" width="500" height="150" />
<img src="https://github.com/DaviDosCompiuter/Adivinhe_Se_Puder/blob/main/doc/imagens/T10.png" width="500" height="150" />
- Ao esgotar todas as tentativas, a palavra é revelada:
<img src="https://github.com/DaviDosCompiuter/Adivinhe_Se_Puder/blob/main/doc/imagens/T11.png" width="500" height="150" />
- Ao vencer, uma mensagem de vitoria é exibida:
<img src="https://github.com/DaviDosCompiuter/Adivinhe_Se_Puder/blob/main/doc/imagens/T12.png" width="500" height="150" />
<img src="https://github.com/DaviDosCompiuter/Adivinhe_Se_Puder/blob/main/doc/imagens/T13.png" width="500" height="150" />
