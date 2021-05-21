public class Main {
    public static void main(String[] args) {
        Version version = new Version(1);
        UpdateCenter updateCenter = new UpdateCenter();
        updateCenter.addObserver(new Phone());
        updateCenter.setVersions(version);
    }
}
