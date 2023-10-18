package com.andrepaulino.io.teste;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacao {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String name = "Vapo Salveson";

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("stringObj.bin"));
        oos.writeObject(name);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("stringObj.bin"));
        var readObj = ois.readObject();
        ois.close();

        System.out.println(readObj);
    }

}
