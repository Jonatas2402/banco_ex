## Exercicio encapsulamento
# Exemplo abertura de conta com depósito e saque como operações.

# Enunciado do exercicio.

## Em um banco, para se cadastrar uma conta bancária, é necessário informar o número da conta, o nome do
## titular da conta, e o valor de depósito inicial que o titular depositou ao abrir a conta. Este valor de depósito
## inicial, entretanto, é opcional, ou seja: se o titular não tiver dinheiro a depositar no momento de abrir sua
## conta, o depósito inicial não será feito e o saldo inicial da conta será, naturalmente, zero.
## Importante: uma vez que uma conta bancária foi aberta, o número da conta nunca poderá ser alterado. Já
## o nome do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasião de casamento, por
## exemplo).
## Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para proteger
## isso. O saldo só aumenta por meio de depósitos, e só diminui por meio de saques. Para cada saque
## realizado, o banco cobra uma taxa de $ 5.00.
## Você deve fazer um programa que realize o cadastro de uma conta, dando opção para que seja ou não
## informado o valor de depósito inicial. Em seguida, realizar um depósito e depois um saque, sempre
## mostrando os dados da conta após cada operação.


# Utilidades

## Foi utilizado o conceito de encapsulamento para tratar dados sensíveis como saldo e número da conta.
## poís sua manipulação pode comprometer o funcionamento do programa, segundo o enunciado o único dado que pode ser alterado posteriormente é o nome.
## com isso foram tratados os atributos como private e receberam seus getts e setts para serem manipulados.
## foram adicionados os métodos de saque e depósito para fazer a alteração dos valores da conta, foi adicionado uma funcionalidade para avisar ao usuário quando o saque for maior que o valor na conta. Apresentando uma mensagem de saldo indisponível para operação.
## por fim foi adicionado o toString para mostras todos os dados da conta como pede o enunciado.