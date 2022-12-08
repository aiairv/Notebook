import javax.swing.plaf.synth.SynthDesktopIconUI;
import java.sql.SQLOutput;
import java.time.LocalDate;

public class Note extends AbstractNote implements FileWritable{
    String title;

    public Note() {
    }

    public Note(String text, java.time.LocalDate localDate, NoteType noteType, String title) {
        super(text, localDate, noteType);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void writeNoteIdea() {
        System.out.println(Note.this.getTitle()/n +
                "Тип заметки: " + Note.this.getNoteType() +
                "Дата: " + Note.this.getLocalDate()/n +
                "Содержание: " + Note.this.getText());

    }
    @Override
    public void writeNoteDebt(){
        switch (NoteType.DEBT){
            case DEBT ->
        System.out.println(Note.this.getTitle()/n +
                "Тип заметки: " + Note.this.getNoteType() +
                "Дата: " + Note.this.getLocalDate()/n +
                "Содержание: " + Note.this.getText()/n +
                "Сумма долга: "
                );
    }
}
