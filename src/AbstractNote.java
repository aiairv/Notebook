import java.time.LocalDate;

public abstract class AbstractNote {
    String text;
    LocalDate LocalDate;
    NoteType noteType;

    public AbstractNote() {
    }

    public AbstractNote(String text, java.time.LocalDate localDate, NoteType noteType) {
        this.text = text;
        LocalDate = localDate;
        this.noteType = noteType;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public java.time.LocalDate getLocalDate() {
        return LocalDate;
    }

    public void setLocalDate(java.time.LocalDate localDate) {
        LocalDate = localDate;
    }

    public NoteType getNoteType() {
        return noteType;
    }

    public void setNoteType(NoteType noteType) {
        this.noteType = noteType;
    }
}

