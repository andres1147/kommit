import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;

import javax.sound.midi.Soundbank;

public class Program {

	public static void imprimirContenido() throws FileNotFoundException, IOException {
		String linea;
		BufferedReader b = new BufferedReader(new FileReader("D:\\java.txt"));
		while ((linea = b.readLine()) != null) {
			String linea1 = "";
			if (linea.endsWith("#")) {
				linea1 = linea.substring(0, linea.length() - 1).trim();
			} else {
				while (!linea.endsWith("#")) {
					linea1 += linea.trim();
					linea = b.readLine();
				}
			}

			BigInteger numeroPrimo = new BigInteger("13071");
			BigInteger numero = new BigInteger(linea1, 2);
			BigInteger bi3 = numero.mod(numeroPrimo);

			if (bi3.equals(new BigInteger("0")) && !numero.equals(new BigInteger("0"))) {
				System.out.println("SI");
			} else
				System.out.println("NO");
		}
		b.close();
	}

	public static void main(String[] args) throws FileNotFoundException, IOException {
		imprimirContenido();
	}

}
