import exceptions.UncheckedException;

import java.util.Objects;

public class Maze extends Building{
    private String name;
    private SubjectType subjectType1;
    private SubjectType subjectType2;

    public Maze(String name, SubjectType subjectType1, SubjectType subjectType2) {
        super(name);
        this.name = name;
        this.subjectType1 = subjectType1;
        this.subjectType2 = subjectType2;
    }

    public class Windows{
        private String name;
        private SubjectType subjectType;

        public Windows(String name) {
            this.name = name;
        }

        public Windows(String name, SubjectType subjectType) {
            this.name = name;
            this.subjectType = subjectType;
        }

        public String getName() {
            return name;
        }

        public SubjectType getSubjectType() {
            if (subjectType == null)
                try {
                    throw new UncheckedException("SubjectType для объекта не определён!");
                } catch (UncheckedException e) {
                    e.printStackTrace();
                    return SubjectType.NULL;
                }
            return subjectType;
        }
    }

    public String getName() {
        return name;
    }

    public SubjectType getSubjectType1() {
        return subjectType1;
    }

    public SubjectType getSubjectType2() {
        return subjectType2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Maze maze = (Maze) o;
        return Objects.equals(name, maze.name) &&
                subjectType1 == maze.subjectType1 &&
                subjectType2 == maze.subjectType2;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, subjectType1, subjectType2);
    }
}
