public class ForEach {
    public static void main(String[] args) {
        String name = "Rahul";
        char []arr = new char[name.length()];

        for (int i = 0; i < name.length(); i++) {
            arr[i] = name.charAt(i);
        }

        for (char i: arr) {
            System.out.println(i);
        }
    }
}
