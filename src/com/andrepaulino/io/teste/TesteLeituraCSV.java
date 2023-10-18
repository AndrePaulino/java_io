package com.andrepaulino.io.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeituraCSV {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("contas.csv"));

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            Scanner lineScanner = new Scanner(line);
            lineScanner.useLocale(Locale.US);
            lineScanner.useDelimiter(",");

            String accountType = lineScanner.next();
            Integer accountNumber = lineScanner.nextInt();
            Integer agencyNumber = lineScanner.nextInt();
            String ownerName = lineScanner.next();
            Double accountBalance = lineScanner.nextDouble();

            String formattedOutput = String.format("%s - %d-%d, %s: $%.2f", accountType, accountNumber,
                    agencyNumber, ownerName, accountBalance);
            System.out.println(formattedOutput);

            lineScanner.close();
        }
        scanner.close();
    }
}
