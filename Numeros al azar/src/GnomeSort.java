

import static java.awt.PageAttributes.MediaType.A;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import static javax.print.attribute.standard.MediaSize.Engineering.A;

public class GnomeSort {

	public static void main(String[] args) throws IOException {
		int A[] = new int[3000];
		populateArray(A);
		System.out.println("INITIAL SORT");
		printArray(A);
		// sort the array
		insertionSort(A);
		System.out.println("\nFINAL SORT");
		printArray(A);
	}


	private static void insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int valueToSort = arr[i];
			int j = i;
			while (j > 0 && arr[j - 1] > valueToSort) {
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = valueToSort;
		}
	}

	public static void printArray(int[] B) {
            int[] S; 
            S = B; 
		System.out.println(Arrays.toString(B));
        }
            
           

	public static void populateArray(int[] B) throws IOException {
           StringBuffer cadena = new StringBuffer();

	 try{
              FileWriter fw=new FileWriter("ArchivoGenerado(Gnome)");
            for (int i = 0; i < B.length; i++) {
			B[i] = (int) (Math.random() * 1000);
		}
                       for (int x=0;x<B.length;x++){
          cadena =cadena.append(B[x]);
          }
            fw.write(cadena.toString());
            fw.close(); 
	}catch(IOException e){
            System.out.println("Error E/S: "+e);
        }
}
        }
        