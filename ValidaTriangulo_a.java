public class ValidaTriangulo_a {
     public int formaTriangulo(int ladoA, int ladoB, int ladoC){
         if(ladoA < ladoB + ladoC && ladoB < ladoA + ladoC && ladoC < ladoA + ladoB)
             return 0;
         else
             return 1;
     } 
     public void tipoTriangulo(int ladoA, int ladoB, int ladoC){
         if(ladoA == ladoB && ladoA == ladoC)
             System.out.println("triângulo equilátero");
         else{
             if(ladoA == ladoB || ladoA == ladoC || ladoB == ladoC)
                 System.out.println("triângulo isósceles");
             else
                 System.out.println("triângulo escaleno");
         }
     } 
}
