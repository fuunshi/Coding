package Lab_7;

public class NameFilter {
    public static void main(String[] args) {
        String[] names = {"Rita", "John", "Ravi", "Emily", "Robert"};

        System.out.println("Names starting with 'R':");
        for (String name : names) {
            if (name.startsWith("R")) {
                System.out.println(name);
            }
        }
    }
}
