package dynamic_parameter.buffer;


public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader bufferedReader = new BufferedReader();
		String oneLine =
			bufferedReader.processFile((java.io.BufferedReader br) -> br.readLine());
		String twoLine =
			bufferedReader.processFile((java.io.BufferedReader br) -> br.readLine()+ br.readLine());
	}
}
