package dynamic_parameter.buffer;

import java.io.BufferedReader;

@FunctionalInterface
public interface BufferReaderProcess {
	String process(BufferedReader bufferedReader) throws Exception;
}
