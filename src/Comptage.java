
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

        public class Comptage {
            public static void main(String[] args) {
                // Nom du fichier dans le même dossier que le programme
                String fileName = "FichierDeMot.txt"; // Remplacez par le nom de votre fichier

                try {
                    // Créer un scanner pour lire le fichier
                    File file = new File(fileName);
                    Scanner fileScanner = new Scanner(file);

                    // Variable pour stocker tout le contenu du fichier
                    String content = "";

                    // Lire le fichier ligne par ligne et concaténer les lignes
                    while (fileScanner.hasNextLine()) {
                        content = content + fileScanner.nextLine() + " ";
                    }

                    // Diviser tout le contenu en mots et les compter
                    String[] words = content.split(" ");
                    int totalWordCount = words.length;

                    // Afficher le nombre total de mots
                    System.out.println("Nombre total de mots dans le fichier : " + totalWordCount);

                    // Fermer le scanner
                    fileScanner.close();
                } catch (FileNotFoundException e) {
                    // Gestion de l'erreur si le fichier n'est pas trouvé
                    System.out.println("Fichier introuvable : " + fileName);
                    e.printStackTrace();
                }
            }
        }

