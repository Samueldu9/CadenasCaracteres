
package cadena;

public class Cadena {
    
    public static void main(String[] args) {
        //Cadenas
        String [] articulos = {"el ","un ","algún ","ningún "};
        String [] sustantivo = {"niño","niña","perro","ciudad","auto"};
        String [] verbo = {" manejo"," salto "," corrió "," camino "," omitió "};
        String [] preposicion = {"a ","desde ","encima de ","debajo de ","sobre "};
        //Aleatorios
        int aleatorioart = (int)(Math.random()*4+1);
        if (aleatorioart == 4)
        {
            aleatorioart = 0;
        }
        int aleatoriosus = (int)(Math.random()*5+1);
        if (aleatoriosus == 5)
        {
            aleatoriosus = 0;
        }
        int aleatoriover = (int)(Math.random()*5+1);
        if (aleatoriover == 5)
        {
            aleatoriover = 0;
        }
        int aleatorioprep = (int)(Math.random()*5+1);
        if (aleatorioprep == 5)
        {
            aleatorioprep = 0;
        }
        int aleatorioart2 = (int)(Math.random()*4+1);
        if (aleatorioart2 == 4)
        {
            aleatorioart2 = 0;
        }
        int aleatoriosus2 = (int)(Math.random()*5+1);
        if (aleatoriosus2 == 5)
        {
            aleatoriosus2 = 0;
        }
        
        String a = articulos[aleatorioart];
        String b = sustantivo[aleatoriosus];
        String c = verbo[aleatoriover];
        String d = preposicion[aleatorioprep];
        String e = articulos[aleatorioart2];
        String f = sustantivo[aleatoriosus2];
        
        String uno = a.concat(b);
        String dos = uno.concat(c);
        String tres = dos.concat(d);
        String cuatro = tres.concat(e);
        String cinco = cuatro.concat(f);
        
        String[] mayus = cinco.split("");
        mayus [0] = mayus[0].toUpperCase();
        
        for (int i=0;i<=cinco.length()-1;i++)
        {
        System.out.printf("%s",mayus[i]);
        }
        System.out.printf(". \n");
         
    }
    
}
