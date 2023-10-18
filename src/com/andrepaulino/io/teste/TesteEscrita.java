package com.andrepaulino.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class TesteEscrita {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("lorem_writer.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("Et malesuada fames ac turpis egestas integer.");
        bw.newLine();
        bw.write("Aliquet eget sit amet tellus cras adipiscing. Sed velit dignissim sodales ut.");

        bw.close();
    }
}
