package com.andrepaulino.io.teste;

import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class TestePrintStream {
    public static void main(String[] args) throws IOException {
        PrintStream ps = new PrintStream("lorem_writer.txt", StandardCharsets.UTF_8);
        ps.println("Et magnis dis parturient montes nascetur ridiculus mus mauris vitae.");
        ps.println("Eu volutpat odio facilisis mauris sit amet.");
        ps.close();
    }
}
