public class UniqueID {
    private static int id;

    public static int generateId() {
        return id++;
    }
}
