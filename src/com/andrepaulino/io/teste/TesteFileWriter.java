package com.andrepaulino.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class TesteFileWriter {
    public static void main(String[] args) throws IOException {
        // FileWriter fw = new FileWriter("lorem_writer.txt");
        // fw.write("Et malesuada fames ac turpis egestas integer.");
        // fw.write(System.lineSeparator());
        // fw.write("Aliquet eget sit amet tellus cras adipiscing. Sed velit dignissim
        // sodales ut.");
        // fw.close();

        BufferedWriter bw = new BufferedWriter(new FileWriter("lorem_writer.txt", StandardCharsets.UTF_8));
        bw.write("Et malesuada fames ac turpis egestas integer.");
        bw.newLine();
        bw.write("Aliquet eget sit amet tellus cras adipiscing. Sed velit dignissim sodales ut.");

        bw.close();
    }
}
