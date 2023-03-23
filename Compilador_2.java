import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author MaxNoriega
 */
public class CompiladorenJava {
    public static void main(String[] args) {
        String ruta = "C:\\Users\\Ryzen 5\\Desktop\\AnalisisLexico compilador\\AnalisisLexico.txt";
         try {
            // Crear objeto File con la ruta del archivo
            File archivo = new File(ruta);

            // Crear objeto FileReader y BufferedReader para leer el archivo
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            int  LongitudBuffer = (br.readLine().length());
            int x,edo=0,col,valorCel,NumRenglon=1;
            int caracter = 0;
            String lexema = "";
            boolean errorEncontrado = false;
            
             int matriz [][] = {
                           // L   @   _   D   +   -   *   /   ^   <   >    =    !    &    |    (    )    {    }    ,    ;    "   EB  TAB   NL  .   EOF  OC
                           // 0   1   2   3   4   5   6   7   8   9   10   11   12   13   14   15   16   17   18   19   20   21  22   23   24  25  26   27
                   /*0*/{     1,  1,  1,  1,  2,  103,104,5,  107,8,  9,   10,  11,  12,  13,  117, 118, 119, 120, 124, 125, 14, 0,   0,   0,  505,505, 505},      
                   /*1*/{     1,  1,  1,  1,  100,100,100,100,100,100,100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100,100, 100, 100,100,100, 100},
                   /*2*/{     101,101,101,1,  2,  101,101,101,101,101,101, 101, 101, 101, 101, 101, 101, 101, 101, 101, 101, 101,101, 101, 101,3,  101, 101},
                   /*3*/{     500,500,500,4,  500,500,500,500,500,500,500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500,500, 500, 500,500,500, 500},
                   /*4*/{     102,102,102,4,  102,102,102,102,102,102,102, 102, 102, 102, 102, 102, 102, 102, 102, 102, 102, 102,102, 102, 102,102,102, 102},
                   /*5*/{     106,106,106,106,106,6,  106,106,106,106,106, 106, 106, 106, 106, 106, 106, 106, 106, 106, 106, 106,106, 106, 106,106,106, 106},
                   /*6*/{     6,  6,  6,  6 , 6,  6,  7,  6,  6,  6,  6,   6,   6 ,  6,   6,   6,   6,   6 ,  6 ,  6,   6,   6,  6,   6,   6,  6,  507, 6},
                   /*7*/{     6,  6,  6,  6,  6,  6,  6,  0,  6,  6,  6,   6,   6,   6,   6,   6,   6,   6,   6,   6,   6,   6,  6,   6,   6,  6,  6,   6},
                   /*8*/{     108,108,108,108,108,108,108,108,108,108,108, 110, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108,108, 108, 108,108,108, 108},
                   /*9*/{     109,109,109,109,109,109,109,109,109,109,109, 111, 109, 109, 109, 109, 109, 109, 109, 109, 109, 109,109, 109, 109,109,109, 109},
                   /*10*/{    123,123,123,123,123,123,123,123,123,123,123, 112, 123, 123, 123, 123, 123, 123, 123, 123, 123, 123,123, 123, 123,123,123, 123},
                  /*11*/{     116,116,116,116,116,116,116,116,116,116,16,  113, 116, 116, 116, 116, 116, 116, 116, 116, 116, 116,116, 116, 116,116,116, 116},
                  /*12*/{     502,502,502,502,502,502,502,502,502,502,502, 502, 502, 114, 502, 502, 502, 502, 502, 502, 502, 502,502, 502, 502,502,502, 502},
                  /*13*/{     503,503,503,503,503,503,503,503,503,503,503, 503, 503, 503, 115, 503, 503, 503, 503, 503, 503, 503,503, 503, 503,503,503, 503},
                  /*14*/{     14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14,  14,  14,  14,  14,  14,  14,  14,  14,  14,  14,  122,14,  14,  504,14, 14,  14}};
            

            // Cerrar los objetos BufferedReader y FileReader
            br.close();
            fr.close();

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }  
    }