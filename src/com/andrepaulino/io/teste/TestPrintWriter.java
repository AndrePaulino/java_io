package com.andrepaulino.io.teste;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class TestPrintWriter {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter("lorem_writer.txt", StandardCharsets.UTF_8);
        pw.println(
                "Ut sem viverra aliquet eget sit amet tellus. Eget magna fermentum iaculis eu non diam phasellus vestibulum lorem.");
        pw.println("Tempus egestas sed sed risus pretium quam. Vel turpis nunc eget lorem dolor.");
        pw.close();
    }
}
