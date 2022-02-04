/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciojavaadn;

/**
 *
 * @author esmer
 */
public class EjercicioJavaADN {

    private int costeErroresADN(String uno, String dos) {
        char[] caracter = uno.toCharArray();
        char[] caracter1 = dos.toCharArray();
        int contador = 0;
        for (int i = 0; i < uno.length(); i++) {
            if ((caracter[i] == 'G' && (caracter1[i] == 'T' || caracter1[i] == 'A' || caracter1[i] == 'G'))
                    || (caracter[i] == 'C' && (caracter1[i] == 'T' || caracter1[i] == 'A' || caracter1[i] == 'C'))
                    || (caracter[i] == 'A' && (caracter1[i] == 'C' || caracter1[i] == 'G' || caracter1[i] == 'A'))
                    || (caracter[i] == 'T' && (caracter1[i] == 'C' || caracter1[i] == 'G' || caracter1[i] == 'T'))) {
                contador++;
            }
            if(caracter[i]=='-' || caracter1[i]=='-'){
                contador++;
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        String uno = "ACGT";
        String dos = "TGCA";
        String uno1= "A-C-G-T-ACGT";
        String dos1= "TTGGCCAATGCA";
        String uno2= "AAAAAAAA";
        String dos2= "TTTATTTT";
        String uno3= "GATTACA";
        String dos3= "CTATT-T";
        String uno4= "CAT-TAG-ACT";
        String dos4= "GTATATCCAAA";
        String uno5= "--------";
        String dos5= "ACGTACGT";
        String uno6= "TAATAA";
        String dos6= "ATTATT";
        String uno7= "GGGA-GAATATCTGGACT";
        String dos7= "CCCTACTTA-AGACCGGT";
        

        EjercicioJavaADN ejercicios = new EjercicioJavaADN();
        System.out.println(ejercicios.costeErroresADN(uno, dos));
        System.out.println(ejercicios.costeErroresADN(uno1, dos1));
        System.out.println(ejercicios.costeErroresADN(uno2, dos2));
        System.out.println(ejercicios.costeErroresADN(uno3, dos3));
        System.out.println(ejercicios.costeErroresADN(uno4, dos4));
        System.out.println(ejercicios.costeErroresADN(uno5, dos5));
        System.out.println(ejercicios.costeErroresADN(uno6, dos6));
        System.out.println(ejercicios.costeErroresADN(uno7, dos7));
    }

}
