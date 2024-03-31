public class Principal {
public static void main(String[] args) {
            int[] lista = { 242, 243, 255, 268, 270, 275, 285, 289, 293, 296,
                306, 307, 310, 315, 318, 323, 334, 337, 350, 351,
                355, 359, 361, 369, 373, 376, 379, 383, 387, 390,
                391, 392, 394, 399, 401, 403, 415, 417, 421, 423,
                429, 433, 436, 440, 447, 459, 463, 464, 477, 481,
                483, 484, 486, 487, 490, 495, 496, 499, 500, 501,
                511, 513, 518, 526, 530, 531, 534, 545, 551, 553,
                554, 558, 561, 565, 572, 591, 592, 600, 605, 609,
                613, 616, 623, 624, 625, 626, 632, 643, 645, 647, 
                652, 654, 655, 662, 667, 671, 673, 674, 695, 696,};
                
                int numeroA = 415;
                int numeroB = 545;
                int numeroC = 390;
                int numeroD = 609;
                int numeroE = 296;
        
        
                AglBuscaBinaria AglbuscaBinaria = new AglBuscaBinaria();
        
                int indice = AglbuscaBinaria.buscaBinaria(lista, numeroA);
                int indiceDois = AglbuscaBinaria.buscaBinaria(lista, numeroB);
                int indiceTres = AglbuscaBinaria.buscaBinaria(lista, numeroC);
                int indiceQuatro = AglbuscaBinaria.buscaBinaria(lista, numeroD);
                int indiceCinco = AglbuscaBinaria.buscaBinaria(lista, numeroE);

                if(indice != -1){
                    System.out.println("O numero " + numeroA + " Foi encontrada no indice: " +indice);
                    System.out.println("\nO numero " + numeroB + " Foi encontrada no indice: " +indiceDois);
                    System.out.println("\nO numero " + numeroC + " Foi encontrada no indice: " +indiceTres);
                    System.out.println("\nO numero " + numeroD + " Foi encontrada no indice: " +indiceQuatro);
                    System.out.println("\nO numero " + numeroE + " Foi encontrada no indice: " +indiceCinco);

                }
                else{
                    System.out.println("O numero Não foi encontrada no Array");
                }
            
        }

}
