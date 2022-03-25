package textprocessor;

import jakarta.enterprise.inject.Produces;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferReaderProducer {

    @Produces
    BufferedReader getBufferedReader(){
        return new BufferedReader(new InputStreamReader(System.in));
    }
}
