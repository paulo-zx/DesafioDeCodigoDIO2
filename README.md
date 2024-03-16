# DesafioDeCodigoDIO2

1-----------------------------

Implemente um sistema de registro de alunos que aplique o Princípio da Responsabilidade Única (SRP) do S.O.L.I.D. Neste contexto, você deve criar duas classes: Student e StudentRegistry. A classe Student será responsável apenas por armazenar informações relacionadas ao aluno (nome e ID), enquanto a classe StudentRegistry terá a única responsabilidade de gerenciar operações de registro, como adicionar e remover alunos.

Entrada

O programa deve receber a entrada do usuário contendo o nome e o ID do aluno, separados por vírgula.

Saída

O programa deve imprimir mensagens de sucesso ou erro, de acordo com as operações realizadas. Se um aluno for adicionado com sucesso, exiba a mensagem no formato: {student.name} added. Se o aluno já estiver registrado, a mensagem deve ser: Student already registered.

Exemplos

A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

Entrada	

Carlo, 931

Saída

Carlo adicionado.

Entrada

Mariana, 456

Saída

Mariana adicionado.

Entrada

Joao, 123

Saída

Aluno ja registrado.

2--------------------------------------------

Descrição

Desenvolva uma simulação de um sistema de notificações que utilize o Princípio de Segregação de Interface (ISP) em seu desenvolvimento, criando interfaces separadas para diferentes tipos de notificações, como EmailNotification e SMSNotification.

Entrada

O programa receberá dois parâmetros de entrada: o tipo de notificação (string) - email ou sms, e a mensagem (string) a ser enviada.

Saída 

O programa deve imprimir uma confirmação da notificação enviada (string): {tipo} enviado: {mensagem}.

Se o tipo de notificação não for válido, a mensagem de retorno deve ser: Tipo de notificação inválido.

Exemplos:

Entrada

email, Ola Mundo!
	
Saída	

Email enviado: Ola Mundo!

Entrada

sms, Bem-vindo.

Saída

SMS enviado: Bem-vindo.

Entrada

fax, Rua Dominick
	
Saída

Tipo de notificacao invalido.

5. Observações:

Aplique o Princípio de Segregação de Interface (ISP) criando interfaces específicas para cada tipo de notificação.
Considere a possibilidade de criar exceções ou tratamentos adequados para casos em que ocorram tipos de notificação inválidos.

3-------------------------------

O Princípio Aberto/Fechado (Open/Closed Principle - OCP), juntamente com o Princípio da Responsabilidade Única (Single Responsibility Principle - SRP), faz parte dos fundamentos do design de software que visam promover a flexibilidade e extensibilidade dos sistemas. Esse princípio enfatiza que uma classe ou módulo deve ser aberto para extensões, permitindo a adição de novas funcionalidades, mas fechado para modificações, evitando alterações frequentes em seu código existente.

Seguindo o Princípio Aberto/Fechado, neste desafio você deve criar uma classe base Discount e classes derivadas para diferentes tipos de descontos, como StudentDiscount e MembershipDiscount. Os estudantes recebem um desconto de 10% e os afiliados recebem um desconto de 15%. Ao seguirmos o OCP, criamos sistemas mais fáceis de estender sem comprometer a estabilidade das partes já implementadas, resultando em códigos mais robustos, coesos e adaptáveis, características essenciais para o desenvolvimento de software escalável e de alta qualidade.

Entrada

A entrada é composta pelo tipo de desconto (estudante ou afiliado) e o valor original exibidos em uma linha separada.

Saída

A saída esperada é o valor com desconto aplicado (double).

Exemplos

A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

Entrada	

student
100
	
Saída

90.00

Entrada

membership
100
	
Saída

85.00

Entrada

membership
245
	
Saída

208.25

4-----------------------------------

O Princípio da Substituição de Liskov (LSP), um dos cinco princípios S.O.L.I.D. de design de software propostos por Barbara Liskov, afirma que objetos de uma classe base devem ser substituíveis por objetos de suas classes derivadas sem afetar a integridade do programa. Em outras palavras, se uma classe S é uma subclasse de uma classe T, então um objeto do tipo T pode ser substituído por um objeto do tipo S sem alterar a correção do programa. Isso implica que as subclasses devem herdar comportamentos da classe base e também podem estender esses comportamentos, mas não devem modificar seu contrato original.

No desafio proposto, seguindo os princípios do LSP e utilizando convenções brasileiras para nomes de entrada, crie uma classe base para Polígono e classes para diferentes formas geométricas, Retângulo e Quadrado, que podem ser usadas de forma intercambiável sem quebrar a funcionalidade. Ao aderir ao LSP, os desenvolvedores garantem uma hierarquia de classes coesa e flexível, tornando a manutenção do código mais fácil e promovendo a reutilização. O LSP contribui para a construção de sistemas mais robustos e extensíveis, fornecendo uma base sólida para herança e polimorfismo no desenvolvimento orientado a objetos.

Entrada

Tipo de forma (string): quadrado ou retangulo, e medidas (int): largura e altura para retângulos, lado para quadrados. As informações de entrada são separadas por vírgula.

Saída

A saída deverá ser a Área da forma (int).

Exemplos

A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

Entrada	

retangulo, 7, 7	

Saída

49

Entrada

retangulo, 5, 10

Saída

50

Entrada

quadrado, 4

Saída	

16

5---------------------------------------

Desenvolva um programa para gerenciar colaboradores sob dois regimes de contratação distintos: Pessoa Jurídica (PJ) e Consolidação das Leis do Trabalho (CLT). O programa deve calcular os salários de acordo com o tipo de contrato fornecido pelo usuário e aplicar a lógica adequada para cada caso. Este desafio visa aplicar os princípios SOLID, como Single Responsibility, Open/Closed, Liskov Substitution e Interface Segregation na implementação do sistema, garantindo uma arquitetura flexível e fácil de manter.

Entrada

O programa deve receber como entrada o tipo de contrato (PJ ou CLT) seguido dos valores necessários para o cálculo do salário, conforme o seguinte formato:

Para PJ: o número de horas trabalhadas e o valor da hora, separados por vírgula.
Para CLT: o salário base e o valor das comissões, separados por vírgula.

Saída

A saída deve ser o valor do salário calculado de acordo com o tipo de contrato e os dados fornecidos. Por exemplo: CLT: 5462.0.

Exemplos

A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

Entrada	

CLT
4942,520

Saída	

CLT: 5462.0

Entrada

PJ
40,160	

Saída

PJ: 6400.0

Entrada

CLT
2824.54,300

Saída

CLT: 3124.54

