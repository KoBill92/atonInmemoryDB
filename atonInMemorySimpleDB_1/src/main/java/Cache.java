
import java.util.*;


public class Cache  {

    private Map<Long, Note> notesCache;

    public Cache() {
        this.notesCache = new TreeMap<>();
    }

    // add notes
    public void addNote(Note note) {
        if (note != null) {
            notesCache.put(note.getAccount(), note);
        }
    }

    //read notes finds by id
    public Note readById(long noteAccount) {
        return notesCache.get(noteAccount);
    }

    //edit notes
    public void update(Long accountId, String name, Double value) {
        Note note = notesCache.get(accountId);
        note.setName(name);
        note.setValue(value);
        notesCache.put(accountId, note );
        System.out.println(note);

    }

    //delete note
    public void delete(long noteAccount) {
        notesCache.remove(noteAccount);
        System.out.println("note was deleted");
    }

    //all notes
    public List<Note> allNotes() {
        List<Note> list = new ArrayList<>();
        list.addAll(notesCache.values());
        return list;
    }

    public List<Note> searchNotes(String fieldType, String value) {
        List<Note> list = new ArrayList<>();
        for (Note note : notesCache.values()) {
            switch (fieldType.toLowerCase()) {
                case "account":
                    if (note.getAccount() == Long.parseLong(value)) {
                        list.add(note);
                    }
                    break;
                case "name":
                    if (note.getName().equalsIgnoreCase(value)) {
                        list.add(note);
                    }
                    break;
                case "value":
                    if (note.getValue() == Double.parseDouble(value)) {
                        list.add(note);
                    }
                    break;
                default:
                    System.out.println("Not found");
            }
        }
        return list;
    }
}