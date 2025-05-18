
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

        public class Comptage {
            public static void main(String[] args) {

                String fileName = "FichierDeMot.txt";

                try {

                    File file = new File(fileName);
                    Scanner fileScanner = new Scanner(file);


                    String content = "";


                    while (fileScanner.hasNextLine()) {
                        content = content + fileScanner.nextLine() + " ";
                    }


                    String[] words = content.split(" ");
                    int totalWordCount = words.length;


                    System.out.println("Nombre total de mots dans le fichier : " + totalWordCount);


                    fileScanner.close();
                } catch (FileNotFoundException e) {

                    System.out.println("Fichier introuvable : " + fileName);
                    e.printStackTrace();
                }
            }
        }

