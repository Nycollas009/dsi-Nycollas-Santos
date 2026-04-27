public class Explicação_de_operadores {
    public static void main(String[] args) {
    int a = 5;  //O mais simples é o sinal de igual, está basicamente dizendo que o valor da direita afora pertence a variável da esquerda.
    System.out.println(a); //  Imprime o valor de a (5)

    int b = 10; 
        b += 5; // Soma e atribui o resultado a b, equivalente a b = b + 5
    System.out.println(b); // Imprime o valor de b (15)

    int c = 20;
        c -= 3; // Subtrai 3 de c e atribui o resultado a c
    System.out.println(c); // Imprime o valor de c (17)

    int d = 4;
        d *= 2; // Multiplica d por 2 e atribui o resultado a d, equivalente a d = d * 2
    System.out.println(d); // Imprime o valor de d (8)

    int e = 16;
        e /= 4; // Divide e por 4 e atribui o resultado a e, equivalente a e = e / 4
    System.out.println(e); // Imprime o valor de e (4)

        int f = 10;
            f %= 3; // Calcula o resto da divisão de f por 3 e atribui o resultado a f, equivalente a f = f % 3
    System.out.println(f); // Imprime o valor de f (1)

        int g = 5;
        g &= 3; // E lógico, compara os bits e só mantém o "1" se ambos forem 1
    System.out.println(g); // Imprime o valor de g (1)

    int h = 5;
        h |= 3; // OU lógico, compara os bits e mantém o "1" se pelo menos um for 1
    System.out.println(h); // Imprime o valor de h (7)

        int i = 5;
            i ^= 3; // XOR lógico, compara os bits e mantém o "1" se forem diferentes
    System.out.println(i); // Imprime o valor de i (6)

    int j = 43; 
        j >>= 2; // "Empurra" os bits para a direita, (economiza espaço ou divide por potências de 2), equivalente a j = j >> 2
    System.out.println(j); // Imprime o valor de j (10)

    int k = 43; 
        k <<= 2; // "Empurra" os bits para a esquerda, (economiza espaço ou multiplica por potências de 2), equivalente a k = k << 2
    System.out.println(k); // Imprime o valor de k (172)
  }
}
