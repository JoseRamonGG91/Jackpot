package jackpot;

public class premios {
    static final int SIETE = 4, ORO = 3, TREBOL = 2, CAMPANA = 1, CEREZA = 0, INDEFINIDO = -1; 
    public static int[][] combinaciones = {{SIETE,SIETE,SIETE},
                                            {ORO,ORO,SIETE},
                                            {ORO,ORO,ORO},
                                            {TREBOL, TREBOL, SIETE},
                                            {TREBOL,TREBOL,TREBOL},
                                            {CAMPANA,CAMPANA,CAMPANA},
                                            {CAMPANA,CAMPANA,SIETE},
                                            {CEREZA,CEREZA,INDEFINIDO},
                                            {CEREZA,INDEFINIDO,INDEFINIDO}
                                           };
   public static int[] premios = {100,20,20,15,15,10,10,5,1};
   
   static int Comprobar(int[] tirada) {
       
       if (tirada[0] == CEREZA && tirada[1] == CEREZA)
           return premios[7];
       if (tirada[0] == CEREZA)
           return premios[8];
       for (int i = 0; i < premios.length - 2; i++) {
           if (combinaciones[i][0] == tirada[0] && combinaciones[i][1] == tirada[1] && combinaciones[i][2] == tirada[2])
               return premios[i];
       }
       return 0;
   }
}
