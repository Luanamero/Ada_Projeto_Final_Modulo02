# Requisitos projeto II
O projeto atual será uma evolução da agenda de contatos, que foi o projeto realizado no módulo anterior.  
Ele deve ser realizado em grupo, mantendo a divisão já realizada pelos alunos.
## Esse projeto tem como requisitos:
### Funcionais
- Adicionar o cadastro de mais algo que deve ser associado a pessoa cadastrada. ( Exemplos: conta corrente, carros, filmes )
- O usuário deve ser capaz de alterar os atributos desse novo item como realizar alguma operação com ele. ( Exemplos: Alugar carro, realizar transferência, dar nota em um filme )
- Esses dados devem ser visualizados na tela assim com os dados cadastrais.

### Não funcionais
- Deve-se criar uma classe para atender os usuários do cadastro contendo seus atributos
- Utilizar do encapsulamento colocando os atributos das classes na menor visibilidade possível. Utilize-se de getters/setters
- Seu programa deve tratar todos os possíveis erros que o programa pode vir a enfrentar tendo uma mensagem clara sobre o que está acontecendo para o usuário.
- Deve-se fazer o uso de pelo menos uma herança nas classes principais, reescrevendo pelo menos um método da classe filha e adicionando pelo menos mais um atributos  

#######################################
# Requisitos Projeto I

Crie uma agenda de contatos, onde pode ser registrados vários contatos e seus dados. A aplicação terá o seguinte formato:
~~~Shell
>>Contatos<<
Id | Nome           | Telefone    | E-mail 
1  | Alex Araujo    | 11977775555 | alex@gmail.com 
2  | Joao Gomes     | 11988887777 | joaogomes@gmail.com 
>>>> Menu Contato <<<< 
1 - Adicionar Contato 
2 - Detalhar Contato 
3 - Editar Contato 
4 - Remover Contato 
5 - Sair
~~~
## Requisitos funcionais
### Regras:
1. Não é permitido armazenar contatos com telefones ja cadastrados;
2. Para realizar as ações(detalhar, editar e remover), será necessário informar o telefone do contato;

### Regras para entrega
1. Projeto deve ser realizados em grupos de 4 a 5 pessoas;
2. Projeto deve ser entregue via github;
3. Todos os integrantes do grupo, tem que ter alguma contribuicao via git;
4. Deve-se entregar também um relatório em um arquivo README.md, na raiz do projeto, contendo as
   seguintes informacoes:
   - Quais foram os desafios no projeto?
   - O que foi mais interessante?
   - O que pode ser melhorado?
5. Deverá ser realizada uma apresentacao do relatorio e do projeto no ultimo dia de aula;
