public class Principal {
    public static void main(String[] args) {
        int[] lista = { 42, 43, 45, 72, 124, 143, 149, 150, 167, 168,
            178, 186, 188, 192, 212, 221, 228, 230, 233, 238,
            243, 248, 251, 265, 267, 269, 303, 306, 309, 311,
            317, 326, 335, 336, 348, 351, 354, 365, 385, 394,
            396, 404, 411, 413, 415, 420, 424, 428, 432, 441,
            443, 453, 464, 472, 482, 483, 488, 506, 512, 524,
            525, 539, 565, 584, 585, 589, 599, 606, 611, 624,
            626, 628, 634, 644, 662, 688, 691, 700, 703, 711,
            723, 738, 741, 750, 754, 759, 765, 775, 780, 783,
            824, 826, 832, 848, 854, 856, 858, 867, 873, 880
            };

            int numeroA = 824;
            int numeroB = 599;
            int numeroC = 700;
            int numeroD = 858;
            int numeroE = 269;
            int numeroF = 351;
            int numeroG = 42;
            int numeroH = 317;
            int numeroI = 525;
            int numeroJ = 550;  
            int numeroK = 143;
            int numeroL = 421;
            int numeroM = 422;

            AglBuscaBinaria AglbuscaBinaria = new AglBuscaBinaria();
        
                int indice = AglbuscaBinaria.buscaBinaria(lista, numeroA);
                int indiceDois = AglbuscaBinaria.buscaBinaria(lista, numeroB);
                int indiceTres = AglbuscaBinaria.buscaBinaria(lista, numeroC);
                int indiceQuatro = AglbuscaBinaria.buscaBinaria(lista, numeroD);
                int indiceCinco = AglbuscaBinaria.buscaBinaria(lista, numeroE);
                int indiceSeis = AglbuscaBinaria.buscaBinaria(lista, numeroF);
                int indiceSete = AglbuscaBinaria.buscaBinaria(lista, numeroG);
                int indiceOito = AglbuscaBinaria.buscaBinaria(lista, numeroH);
                int indiceNove = AglbuscaBinaria.buscaBinaria(lista, numeroI);
                int indiceDez = AglbuscaBinaria.buscaBinaria(lista, numeroJ);
                int indiceOnze = AglbuscaBinaria.buscaBinaria(lista, numeroK);
                int indiceDoze = AglbuscaBinaria.buscaBinaria(lista, numeroL);
                int indiceTreze = AglbuscaBinaria.buscaBinaria(lista, numeroM);
                

                if(indice != -1){
                    System.out.println("O numero " + numeroA + " Foi encontrada no indice: " +indice);
                    System.out.println("\nO numero " + numeroB + " Foi encontrada no indice: " +indiceDois);
                    System.out.println("\nO numero " + numeroC + " Foi encontrada no indice: " +indiceTres);
                    System.out.println("\nO numero " + numeroD + " Foi encontrada no indice: " +indiceQuatro);
                    System.out.println("\nO numero " + numeroE + " Foi encontrada no indice: " +indiceCinco);
                    System.out.println("\nO numero " + numeroF + " Foi encontrada no indice: " +indiceSeis);
                    System.out.println("\nO numero " + numeroG + " Foi encontrada no indice: " +indiceSete);
                    System.out.println("\nO numero " + numeroH + " Foi encontrada no indice: " +indiceOito);
                    System.out.println("\nO numero " + numeroI + " Foi encontrada no indice: " +indiceNove);
                    System.out.println("\nO numero " + numeroJ + " Foi encontrada no indice: " +indiceDez);
                    System.out.println("\nO numero " + numeroK + " Foi encontrada no indice: " +indiceOnze);
                    System.out.println("\nO numero " + numeroL + " Foi encontrada no indice: " +indiceDoze);
                    System.out.println("\nO numero " + numeroM + " Foi encontrada no indice: " +indiceTreze);

                }
                else{
                    System.out.println("O numero Não foi encontrada no Array");
                }
    }

}
