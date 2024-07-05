# Aprendendo a sintaxe java

**" "**

## Anatomia das Classes

*importante: nomear classes requer que elas sejam intuitivas e coerentes com a ideia do código, exemplo: um programa que realize operações matemáticas, melhor nome para classe ‘’calculadora’’.

*importante: o nome da classe deve ser a mesma que o nome do arquivo

***camel case**: toda variável deve ser escrita com letra minúscula, se a palavra for composta, a primeira letra da palavra posterior deve ser maiúscula. Ex.: *calculadoraCientífica.java, meuPrimeiroJogo.java*

Classe executável significa que tem a capacidade de inicializar o projeto: **public static void main (String [] args)**

**void** ⇒ somente executará o método e não irá retornar nada

**args** ⇒ argumentos, parametros 

**System.out.print()**

**system** ⇒ input e output

**()** ⇒ método executável que necessita de um parametro

**final** String NOME_VARIÁVEL = **"**valor**";**

**final** ⇒ indica que o valor da variável nunca poderá ser alterado

*importante: o nome deve ser escrito em uppercase e palavras compostas devem ser separadas por underline

# Regras de declaração de variáveis

- Deve conter apenas letras, underline, $ ou números de 0 a 9
- Deve se iniciar por uma letra, underline ou $ mas jamais com número
- Deve iniciar com uma letra minúscula
- Não deve conter espaços
- Não deve usar palavras-chave da linguagem
- O nome deve ser único dentro de um escopo

```php
// Declaração Inválidas //
- int chaves&chaveiros = 1;
- int 10numeros = 1;
- string Meu Nome = Luccas;
- int long = seila;
```

### Declarando variáveis e métodos

```php
// Seguinte estrutura na delcaração de variável //
Tipo NomeDefinido = AtribuiçãoValor

//Exemplos//
int idade = 23;
double altura = 1.65;
String meuNome = **" ";
boolean verdade = false;**
```

**boolean** ⇒ valor lógico (sim ou não/verdadeira ou falsa)

```php
// Seguinte estrutura na declaração de métodos //
TipoRetorno NomeObjetoInfinitivo Parametro (s)

//Exemplos//
int somar (int numeroUm, int numeroDois)
String formatarCep (long cep)
```

*importante: nome dos métodos preferencialmente no infinito. Ex.: somas, adicionar, formatar.

## Aplicação de método e variável

```php
public static void main (String [] args) {
        String primeiroNome = "Luccas"; //variável//
        String segundoNome = "Davi"; //variável//
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome) //método//
    }
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
```

**.concat()** ⇒ primeira forma de concatenação

**‘’+’’** ⇒ segunda forma de concatenação

Leitura do código:  return primeiroNome.concat(" ").concat(segundoNome);

‘’Retorne a variável primeiroNome concatenada com o parâmetro ( ) e também concatene esse parâmetro com a variável segunoNome’’

### Identação

*importante: identação é a forma de escrever o código de modo hierárquico.

```php
// SEM IDENTAÇÃO //
public class boletimEstudantil {
    public static void main(String[] args) {
    int mediaFinal = 6;
	  if(mediaFinal<6)
		System.out.print(**"Reprovado");
		else if(mediaFinal==6)
		System.out.print("Recuperação");
		else
		System.out.print("Aprovado");**
    }
}
```

```php
// COM IDENTAÇÃO //
public class boletimEstudantil {
    public static void main(String[] args) {
        int mediaFinal = 6;
	      if(mediaFinal<6)
		       System.out.print(**"Reprovado");
				elseif(mediaFinal==6)
						System.out.print("Recuperação");
				else
						System.out.print("Aprovado");**
    }   
}
```

### Pontuando uma variável

- Variável deve ser clara, sem abreviações ou definição sem sentido;
- Variável é sempre no singular, exceto quando se referir a um array ou coleção;
- Definir idioma único para todas as variáveis.

```php
// Tipos de variáveis não recomendadas //
double salMedio = 1500.12; //abreviações//
String emails = 'aluno@escola.com'; //plural//
String myName = 'antônio'; //idioma variável//
```

# Tipos e variáveis
⇒ existem algumas palavras reservadas para a representação dos tipos de dados básicos que precisam ser manipulados para a construção de programas (tipos primitivos).

- byte (-128) - 1 byte
- short (-32.768) - 2 bytes
- int (-2.147.483.648) - 4 bytes
- long (-9.223.372.036.854.775.808) - 8 bytes

⇒ se tornou desnecessário utilizar os tipos **short** e **byte**, pois não precisamos nos preocupar tanto assim com o espaço de memória reduzida.

- float (-3,40228E + 38) - 4 bytes
- double (-1,7976E + 308) - 8 bytes
- boolean
- char

⇒ apesar do tipo **float** ocupar metade da memória consumida do que um tipo double, ele é menos utilizado. ele sofre de uma limitação que compromete seu uso em determindadas situações: somente mantém uma precisão decimal entre 6 e 7 dígitos.

```php
// estrutura padrão de declaração de variável //
<tipo> <nomeVariável> <atribuiçãoDeValorOpcional>
```

*importante: no java, para representarmos números grandes, se torna desnecessário o uso de virgulas ou pontos, porém, quando devemos adicionar vírgula no idioma português convencional, usamos o ponto. Ex.: Representar o número 2340 (java) = 2,340 (comum) // 2.5 (java) = 2,5 (comum)

## Variáveis e Constantes
*importante: uma constante são valores armazenados em memória que não podem ser modificados depois de declarados. No java, esses valores são representados pela palavra reservada **final**, seguida de um tipo definido. Por convenção, as constantes são escritas em **uppercase**.

```php
// utilizando final ///
final double NUMEROPI = 3.14;
```

## Operadores
são símbolos especiais que tem um significado próprio para a linguagem e estão associados a determiandas ações.

### Operadores de Atribuição
=> representado pelo símbolo de igualdade **(=)**, utilizado para definir o valor inicial ou sobrescrever o valor de uma variável. 

```php
// exemplos //
String nome (=) "Gleyson";
int idade (=) 22;
double peso (=) 68.5;
```

### Operadores Aritméticos
=> utilizado para realizar operações matemáticas
*importante: o operador de adição (+), quando utilizado em variáveis do tipo texto, realizará a concatenação dos textos.

```php
// exemplos //
double soma = 10.5 + 15.7;
int subtrair = 113 - 40;
int multiplicar = 20 * 7;
int dividir = 15 / 3;
int modulo = 18 % 3;
double resultado = (10*10) + (20/4);    
```

### Operadores unários
=> são aplicados juntamente com um outro operador aritimético. Eles realizam alguns trabalhos básicos como **incrementar, decrementar, inverter** valores numéricos e booleanos.
- (-) Operador unário de valor negativo
- (+) Operador unário de valor positivo
- (++) Operador unário de incremento de valor
- (--) Operador unário de decremento de valor
- (!) Operador unário lógico de negação

```php
// exemplo //
int numero = 5;
System.out.print(- numero); //intenção inicial de tornar a variável negativa//

numero = - numero; //forma correta de torna-la negativa//
numero = numero * -1; //forma de tornar o número positivo novamente//
```
### Operador Ternário
=> definir uma condição e escolher por um valor dentre duas opções. Esse é como se fosse um IF, porém, de uma forma em que toda a sua estrutura estará escrita em uma única linha. **(?:)**

```php
//forma de aplicação//
<Expressão Condicional> ? <caso condição seja true> : <caso condição seja false>

// exemplo //
int notaAluno = 6;
String resultado = (notaAluno >= 6) ? "Aprovado" : "Reprovado";
```
*Legenda: Definir a nota do aluno na variável "notaAluno", criando uma outra variável "resultado" para demonstrar a situação final do aluno. Dizemos: se a notaAluno for maior ou igual a 6, resultado Aprovado, se a notaAluno **não** for maior/igual a 6, resultado Reprovado.

### Operadores Relacionais
=> avaliam a relação entre duas variáveis ou expressões. Mais precisamente, definem se o operando à esquerda é igual, diferente, menor, menor ou igual, maior ou maior ou igual ao da direita, retornando um valor booleano (true ou false) como resultado.
- (==) se é igual
- (!=) se é diferente
- (>) se é maior que
- (>=) se é maior ou igual que
- (<) se é menor que
- (<=) se é menor ou igual que

```php
//exemplo//
int numeroUm = 3;
int numeroDois = 2;

if (numeroUm < numeroDois) {
    System.out.print("Essa condição é falsa.");
} else {
    System.out.print("Essa condição é verdadeira");
}
```
*importante: '.equals' compara se dois **objetos** (não números) são iguais;

### Operadores Lógicos
=> permite criar expressõe lógicas maiores a partir de junção de duas ou mais expressões.
- (&&) = E
- (||) = OU