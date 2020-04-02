import com.company.Lista;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random r;
        int d;
        int k;
        final int Mx = 999;
        Lista listadb;
        r = new Random(1);
        listadb = new Lista();
        k = 29;
        for (; k > 0; k--) {
            d = r.nextInt(Mx) + 1;
            listadb.ordenMenMay(d);
        }
        System.out.println("Elementos de la lista generados al azar");
        listadb.visualizar();
        System.out.println("");
        System.out.println("Elementos de la lista eliminados");
        listadb.Eliminar(106);
        listadb.visualizar();
    }
}


