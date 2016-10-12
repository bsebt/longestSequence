package testing;

import java.io.PrintStream;
import java.util.Scanner;
import java.util.Stack;

public class longestSequence {

	static Stack<Integer> tester = new Stack<Integer>();

	public static Stack<Integer> listing(int a){
		if (a == 1){
			tester.push(a);
			return tester;
		}else{
			if(a%2 == 0){
				tester.push(a);
				return listing(a/2);
			}else{
				tester.push(a);
				return listing((3*a)+1);
			}
		}
	}

	public static void main(String[] args) {

		PrintStream out = new PrintStream(System.out);
		Scanner in = new Scanner(System.in);

		String input = in.nextLine();
		String[] stringInput = input.split(" ");
		int[] intInput = new int[stringInput.length];

		for (int i=0;i<=stringInput.length-1;i++){
			intInput[i] = Integer.parseInt(stringInput[i]);
		}
		for(int j=1 ; j<=intInput[0] ; j++){
			int max = 0;
			for(int k=1 ; k <= intInput[j] ; k++ ){
				tester = new Stack<>();
				int stackSize = (listing(k).size());
				if(stackSize> max){
					max = stackSize;
				}else{
					max = max;
				}
			}out.println(max);
		}
	}
}
