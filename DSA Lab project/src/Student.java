class Student extends Person {
    private int id;
    private int marks;

    Student(int id, String name, int marks) {
        super(name);
        this.id = id;
        this.marks = marks;
    }
    public int getId() {
        return id;
    }
    @Override
    void show() {
        System.out.println(id + "  " + name + "  " + marks);
    }
}
