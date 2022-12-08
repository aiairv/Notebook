import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws IOException {

        Note[] notes = new Note[3];
        Debt debt = new Debt(3435345);
        Note note1 = new Note("Создать план на 5 лет", LocalDate.now(), NoteType.IDEA,"Планирование");
        Note note2 = new Note("Отдать долг", LocalDate.now(), NoteType.DEBT,"Долг");
        Note note3 = new Note("Создать задачи на день", LocalDate.now(), NoteType.IDEA, "Задачи");

        Contacts contact1 = new Contacts("Записать контакт", LocalDate.now(),NoteType.IDEA, "Контакт", \
                 "9999999999","Aidai", NumberType.MOBILE_NUMBER);
        try{
        FileWriter fileWriter = new FileWriter("NoteBook.txt",true);
        fileWriter.write(note1.writeNoteIdea());
            fileWriter.close();

    }
        catch (IOException){
            System.out.println("Ошибка");
        }
}
