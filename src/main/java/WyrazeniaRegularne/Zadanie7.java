package WyrazeniaRegularne;

public class Zadanie7 {

    public static void main(String[] args) {

        String regexJeden = "^[0-9]{9}$";
        String regexDwa = "^[0-9]{3}-[0-9]{3}-[0-9]{3}$";
        String numerTelefonu1 = "733930904";
        String numerTelefonu2 = "733-930-904";
        String numerTelefonu3 = "733-564-9876";


        System.out.println("Pierwszy wzór numeru telefonu: XXXXXXXXX" + "\n" + "Drugi wzór numeru telefony: XXX-XXX-XXX" );
        System.out.println("Pierwszy numer telefonu: " + numerTelefonu1 + "\n" +
                "Czy pasuje do pierwszego wzoru: " + numerTelefonu1.matches(regexJeden)+ "\n" +
                "Czy pasuje do drugiego wzoru: " + numerTelefonu1.matches(regexDwa));

        System.out.println("Drugi numer telefonu: " + numerTelefonu2 + "\n" +
                "Czy pasuje do pierwszego wzoru: " + numerTelefonu2.matches(regexJeden)+ "\n" +
                "Czy pasuje do drugiego wzoru: " + numerTelefonu2.matches(regexDwa));

        System.out.println("Trzeci numer telefonu: " + numerTelefonu3 + "\n" +
                "Czy pasuje do pierwszego wzoru: " + numerTelefonu3.matches(regexJeden)+ "\n" +
                "Czy pasuje do drugiego wzoru: " + numerTelefonu3.matches(regexDwa));


    }
}
