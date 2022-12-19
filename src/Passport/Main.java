package Passport;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Passport> passports = new HashSet<>();
        passports.add(
                new Passport("1111222222", "Артем", "Артеменко", "Артемович", LocalDate.now().minusYears(40)));
        passports.add(
                new Passport("1111000000", "Виктор", "Викторов", "Викторович", LocalDate.now().minusYears(15)));
        passports.add(
                new Passport("0000222222", "Борис", "Борисенко", "Борисович", LocalDate.now().minusYears(10)));
        PassportList passportList = new PassportList(passports);
        passports.add(new Passport("2222333333", "Oz", "Bee", "", LocalDate.now().minusYears(48)));
        System.out.println(passportList);
    }
}
