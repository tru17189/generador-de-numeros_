import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import static javax.print.attribute.standard.MediaSize.Engineering.A;


public class MergeSort {


	public static void main(String[] args) {
		MergeSort app = new MergeSort();
		
	    //COMMENT
	    int[] input = app.generateRandomNumbers(3000);
		
	    
	    System.out.println("MERGE SORT");
	    System.out.println("");
	    
	    System.out.println("INITIAL SORT");
	    System.out.println(Arrays.toString(input));
		

	    System.out.println("");
	    System.out.println("FINAL SORT");
	    System.out.println(Arrays.toString(app.mergeSort(input)));
	}
	
	
	private int[] mergeSort(int[] input){
		
		if(input.length == 1){
			return input;
		}
		
		int middle = (int) Math.ceil((double)input.length / 2);
		int[] left = new int[middle];
		
		int rightLength = 0;
		if(input.length % 2 == 0){
			rightLength = middle;
		}
		else{
			rightLength = middle - 1;
		}
		int[] right = new int[rightLength];
		
		int leftIndex = 0; 
		int rightIndex = 0;
		
		for (int i = 0; i < input.length; i++) {
			if(i < middle){
				left[leftIndex] = input[i];
				leftIndex++;
			}
			else{
				right[rightIndex] = input[i];
				rightIndex++;
			}
		}
		
		left = mergeSort(left);
		right = mergeSort(right);
		
		return merge(left, right);
	}
	
	
	private int[] merge(int[] left, int[] right){
		int[] result = new int[left.length + right.length];
		int leftIndex = 0;
		int rightIndex = 0;
		int resultIndex = 0;
		
		while(leftIndex < left.length || rightIndex < right.length){
			if(leftIndex < left.length && rightIndex < right.length){
				if(left[leftIndex] < right[rightIndex]){
					result[resultIndex] = left[leftIndex];
					leftIndex++;
					resultIndex++;
				}
				else{
					result[resultIndex] = right[rightIndex];
					rightIndex++;
					resultIndex++;
				}
			}
			else if(leftIndex < left.length){
				for (int i = resultIndex; i < result.length; i++) {
					result[i] = left[leftIndex];
					leftIndex++;
				}
			}
			else if(rightIndex < right.length){
				for (int i = resultIndex; i < result.length; i++) {
					result[i] = right[rightIndex];
					rightIndex++;
				}
			}
		}
		
		return result;
	}
	
	

	private int[] generateRandomNumbers(int n){
            StringBuffer cadena = new StringBuffer();
            int[] result = new int[n];
	    Random random = new Random();
	try{
              FileWriter fw1=new FileWriter("ArchivoGenerado(Quick)");		
	    for (int i = 0; i < result.length; i++) {
		    result[i] = random.nextInt(n * 10);
	    }
           for (int x=0;x<result.length;x++){
          cadena =cadena.append(result[x]);
          }
            fw1.write(cadena.toString());
            fw1.close(); 
	}catch(IOException e){
            System.out.println("Error E/S: "+e);
        }
            return result;
	}

}