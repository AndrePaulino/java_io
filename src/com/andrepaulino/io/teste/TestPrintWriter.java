package com.andrepaulino.io.teste;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TestPrintWriter {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("lorem_writer.txt");
        pw.println(
                "Ut sem viverra aliquet eget sit amet tellus. Eget magna fermentum iaculis eu non diam phasellus vestibulum lorem.");
        pw.println("Tempus egestas sed sed risus pretium quam. Vel turpis nunc eget lorem dolor.");
        pw.close();
    }
}
