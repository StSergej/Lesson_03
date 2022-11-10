package document;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        int docKey = 0001;
        int proKey = 1234;
        int expertKey = 5678;


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите ключ доступа: ");
        docKey  = Integer.parseInt(br.readLine());


        if( docKey == proKey){
            System.out.println("Pro version :");
            ProDocumentWorker docPro = new ProDocumentWorker();
            docPro.openDocument();
            docPro.editDocument();
            docPro.saveDocument();
        }
        else if(docKey == expertKey){
            System.out.println("Expert version :");
            ExpertDocumentWorker docExpert = new ExpertDocumentWorker ();
            docExpert.openDocument();
            docExpert.editDocument();
            docExpert.saveDocument();
        } else {
            System.out.println("Free version");
            DocumentWorker document = new DocumentWorker();
            document.openDocument();
            document.editDocument();
            document.saveDocument();
        }
    }
}
