package examenrefactcod;

/**
 *
 * @author ggarciaalvarez
 */
public class ExamenRefactCOD {

    /**
     * @param args the command line arguments
     */
    //Codificado por: sAfOrAs
    //LIstar los numeros según el numero de digitos indicado
    //Considero solo hasta numeros menores a 100000 (5 digitos), 
    //por el hecho de k buscar numeros primos a partir de 6 digitos, el proceso se hace muy lento.

    public static boolean p = false;

    public static void main(String arg[]) {
        int gid = 3;
        int gidn = 0;
        if (gid <= 0) {
            Pedirparametro();
        }
        for (int i = 1; i <= 99999; i++) {
            int aux = i;

            int contador = 0;

            while (aux != 0) {
                aux = aux / 10;
                contador++;
            }
            gidn = contador;

            Condicion(gidn, gid, i);
        }
    }

    public static void Condicion(int gidn, int gid, int i) {
        if (gidn == gid) {
            if (i < 4) {
                p = true;
            } else {
                if (i % 2 == 0) {
                    p = false;
                } else {
                    int contador1 = 0;
                    int i1 = 1;
                    int k = (i - 1) / 2;
                    if (k % 2 == 0) {
                        k--;
                    }

                    while (i1 <= k) {
                        if (i % i1 == 0) {
                            contador1++;
                        }
                        i1 += 2;
                        if (contador1 == 2) {
                            i1 = k + 1;
                        }
                    }

                    if (contador1 == 1) {
                        p = true;
                    }
                }
            }

            if (p == true) {
                System.out.println(i);
            }
        }
    }

    public static void Pedirparametro() {
        System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
    }

}
