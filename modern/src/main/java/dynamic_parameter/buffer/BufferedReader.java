package dynamic_parameter.buffer;

import java.io.FileReader;

public class BufferedReader {
	public String processFile(BufferReaderProcess b) throws Exception{
		try (java.io.BufferedReader br = new java.io.BufferedReader(new FileReader("data.txt"))){
			return b.process(br);
		}
	}
}
