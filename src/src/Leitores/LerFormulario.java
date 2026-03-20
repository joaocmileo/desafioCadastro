package Leitores;

import java.io.*;

public class LerFormulario {
    private final File file = new File("formulario.txt");

    public void lerFormulario() {
        try(FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr)){

            String texto;
            while ((texto = br.readLine()) != null){
                System.out.println(texto);
            }

        }catch (IOException ex){
            ex.printStackTrace();
        }

    }
}
