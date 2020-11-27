import interfaces.Describable;

import java.util.Objects;

public class Action implements Describable {
    private String subject;
    private String action;
    private String description;
    private String object;
    private int check;

    public Action(String subject, String action, String description, String object) {
        this.subject = subject;
        this.action = action;
        this.description = description;
        this.object = object;
        check = 1;
    }

    public Action(String subject, String action, String description) {
        this.subject = subject;
        this.action = action;
        this.description = description;
        check = 2;
    }

    public Action(String action, String description){
        this.action = action;
        this.description = description;
        check = 3;
    }

    @Override
    public String describe() {
        switch (check) {
            case 1: return (description + " " + subject + " " + action + " " + object);
            case 2: return (subject + " " + action + " " + description);
            case 3: return (action + " " + description);
            default: return null;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Action action1 = (Action) o;
        return Objects.equals(subject, action1.subject) &&
                Objects.equals(action, action1.action) &&
                Objects.equals(description, action1.description) &&
                Objects.equals(object, action1.object);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subject, action, description, object);
    }

    @Override
    public String toString() {
        if (object != null) {
            return "Action{" +
                    "subject='" + subject + '\'' +
                    ", action='" + action + '\'' +
                    ", description='" + description + '\'' +
                    ", object='" + object + '\'' +
                    '}';
        } else {
            return "Action{" +
                    "subject='" + subject + '\'' +
                    ", action='" + action + '\'' +
                    ", description='" + description + '\'' +
                    '}';
        }
    }

    public String getSubject() {
        return subject;
    }

    public String getAction() {
        return action;
    }

    public String getDescription() {
        return description;
    }

    public String getObject() {
        return object;
    }
}
