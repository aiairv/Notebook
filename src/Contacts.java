import java.time.LocalDate;

public class Contacts extends AbstractNote implements FileWritable{
    String phoneNumber;
    String name;
    NumberType numberType;

    public Contacts(String text, java.time.LocalDate localDate, NoteType noteType, String phoneNumber, String name, NumberType numberType) {
        super(text, localDate, noteType);
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.numberType = numberType;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NumberType getNumberType() {
        return numberType;
    }

    public void setNumberType(NumberType numberType) {
        this.numberType = numberType;
    }


    @Override
    public void writeNoteIdea() {
        System.out.println("Тип заметки: " + Contacts.this.getNoteType() + "\n"
                "Дата: " + Contacts.this.getLocalDate() + "\n" +
                "Содержание: " + Contacts.this.getText()); +


    }

    @Override
    public void writeNoteDebt() {
        switch (NoteType.DEBT){
            case DEBT ->
                    System.out.println("Тип заметки: " + Contacts.this.getNoteType() + "\n" +
                            "Дата: " + Contacts.this.getLocalDate() + "\n" +
                            "Содержание: " + Contacts.this.getText());
    }
}
