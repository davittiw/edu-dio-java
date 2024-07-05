public class operadores {
    public static void main(String[] args) {
        String  nomeCompleto = "Luccas" + "Java";
        System.out.print(nomeCompleto);

        String concatenar = "?";
        concatenar = 1 + 1 + 1 + "1";
        System.out.print(concatenar);

        concatenar = 1 + "1" + 1 + 1;
        System.out.print(concatenar);

        concatenar = 1+"1"+1+"1";
        System.out.print(concatenar);
    }
}