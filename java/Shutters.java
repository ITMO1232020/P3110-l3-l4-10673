import java.util.Objects;

public class Shutters {
    private String name;
    private SubjectType subjectType;

    public Shutters(String name, SubjectType subjectType) {
        this.name = name;
        this.subjectType = subjectType;
    }

    public class TreesMakingOf {
        private String name;
        private SubjectType subjectType;

        public TreesMakingOf(String name, SubjectType subjectType) {
            this.name = name;
            this.subjectType = subjectType;
        }

        public String getName() {
            return name;
        }

        public SubjectType getSubjectType() {
            return subjectType;
        }
    }

    public String getName() {
        return name;
    }

    public SubjectType getSubjectType() {
        return subjectType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shutters shutters = (Shutters) o;
        return Objects.equals(name, shutters.name) &&
                subjectType == shutters.subjectType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, subjectType);
    }
}
