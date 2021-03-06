public class Deadline extends Task {

    protected String by;

    public Deadline(String description, String by) {
        super(description);
        this.by = by;
    }

    /*@Override
    public String toString() {
        return "[D]" + description + " (by: " + by + ")";
    }*/

    @Override
    public String getDescription() {
        return description + " (by: " + by + ")";
    }
}