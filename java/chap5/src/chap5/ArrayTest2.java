package chap5;

public class ArrayTest2 {

	public static void main(String[] args) {
		
		int scores [] = new int[5];

		for(int i=0; i<scores.length; i++) {
			scores[i] = (int)(Math.random()*100)+1;
			System.out.print(scores[i]+" ");			
		}
		
		System.out.println();
	
		for(int i=0; i<scores.length; i++) {
			for(int j=i+1; j<scores.length; j++) {
				if(scores[j]<scores[i]) {
					int temp = scores[j];
					scores[j]=scores[i];
					scores[i]=temp;
				}
			}
			System.out.print(scores[i]+" ");
		}

	}
}

