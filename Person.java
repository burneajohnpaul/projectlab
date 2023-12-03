package Main;

class Person {
    private final String name;
    private final String category;

    public Person(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Patient{name='" + name + "', category='" + category + "'}";
    }
}