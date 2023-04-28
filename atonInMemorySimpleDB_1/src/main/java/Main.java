public class Main {
    public static void main(String[] args) {
        Cache cache = new Cache();
        Note note1 = new Note(1, "hello", 54);
        Note note2 = new Note(12, "hi", 55.0);
        Note note3 = new Note(123, "hello", 54);
        Note note4 = new Note(1234, "hello", 54);

        cache.addNote(note1);
        cache.addNote(note2);
        cache.addNote(note3);
        cache.addNote(note4);

//        System.out.println("--------------");
//        System.out.println(cache.allNotes());
//        System.out.println("--------------");

//        System.out.println("--------------");
        System.out.println(cache.allNotes());
//        System.out.println("--------------");

//        cache.delete(11222);

//        System.out.println("--------------");
//        System.out.println(cache.searchNotes("value", "54"));
//        System.out.println("--------------");

        System.out.println("--------------");

        cache.update(1L, "world", 123.0);

//        cache.delete(1);
        System.out.println("--------------");

        System.out.println(cache.allNotes());
    }
}
