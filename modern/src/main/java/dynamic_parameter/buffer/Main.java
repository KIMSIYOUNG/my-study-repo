package dynamic_parameter.buffer;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader bufferedReader = new BufferedReader();
		String oneLine =
			bufferedReader.processFile(br -> br.readLine());
		String twoLine =
			bufferedReader.processFile(br -> br.readLine()+ br.readLine());
		List<Integer> list = Arrays.asList(1,2,3,4);
	}
}
