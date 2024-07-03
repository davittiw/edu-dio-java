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
