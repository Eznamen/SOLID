
public class Purchase {
    int count;
    String title;

    public Purchase(String title, int count) {
        this.title = title.toLowerCase();
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public String getTitle() {
        return title;
    }

}