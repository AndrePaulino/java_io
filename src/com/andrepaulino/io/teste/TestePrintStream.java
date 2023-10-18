package com.andrepaulino.io.teste;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class TestePrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("lorem_writer.txt");
        ps.println("Et magnis dis parturient montes nascetur ridiculus mus mauris vitae.");
        ps.println("Eu volutpat odio facilisis mauris sit amet.");
        ps.close();
    }
}
