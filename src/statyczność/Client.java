package statyczność;

public class Client {
    Client(String imie){
       this.imie = imie;
       nastepneId++;
       id = nastepneId;
    }
    String imie;
    int id = 0;
    static int nastepneId =0;
}
