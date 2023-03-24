import java.util.LinkedHashMap;
import java.util.Map;

public class Holidays {

  Map<String, String> holidays = new LinkedHashMap<>();

  public Holidays() {
    this.loadHolidays();
  }

  public void findHoliday(String date) {
    String holidayExist = holidays.get(date);

    if (holidayExist == null) {
      System.out.println("Holiday does not exist with date informed");
      return;
    }

    System.out.println("the date " + date + " refers to the holiday of " + holidayExist);
  }

  public void loadHolidays() {
    holidays.put("01/01/2023", "Confraternização mundial");
    holidays.put("21/02/2023", "Carnaval");
    holidays.put("17/04/2023", "Páscoa");
    holidays.put("21/04/2023", "Tiradentes");
    holidays.put("01/05/2023", "Dia do trabalho");
    holidays.put("08/06/2023", "Corpus Christi");
    holidays.put("07/09/2023", "Independência do Brasil");
    holidays.put("12/10/2023", "Nossa Senhora Aparecida");
    holidays.put("02/11/2023", "Finados");
    holidays.put("15/11/2023", "Proclamação da República");
    holidays.put("25/12/2023", "Natal");
  }

  public void listAllHolidays() {
    holidays.forEach((key, value) -> System.out.println("the date " + key + " refers to the holiday of " + value));
  }

}
