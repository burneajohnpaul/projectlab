
package Main;


class EmployeeDependent extends Person {
    private final String relationship;

    public EmployeeDependent(String name, String category, String relationship) {
        super(name, category);
        this.relationship = relationship;
    }

    public String getRelationship() {
        return relationship;
    }
}