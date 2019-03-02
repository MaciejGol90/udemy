package pkginstanceof;

import java.math.BigDecimal;

public class Student extends Osoba{

    @Override
    void pobierzOpis() {
        System.out.println("Jestem Studentem");
        System.out.println("Nazywam się: "+ imie +" "+nazwisko);
    }

    Student(String imie, String nazwisko){
        super(imie,nazwisko);
    }
}
