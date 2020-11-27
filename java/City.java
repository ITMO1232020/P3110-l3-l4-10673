import interfaces.Describable;

import java.util.Objects;

public class City {
    private String name;

    public City(String name) {
        this.name = name;
    }

    public class GiantWall{
        private String name;
        private SubjectType subjectType;
        public GiantWall(String name, SubjectType subjectType){
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

    public class Camp{
        private String name;

        public Camp(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public class Creators{
        private String name;

        public Creators(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public class Ruins{
        private String name;
        private SubjectType subjectType1;
        private SubjectType subjectType2;

        public Ruins(String name, SubjectType subjectType1, SubjectType subjectType2) {
            this.name = name;
            this.subjectType1 = subjectType1;
            this.subjectType2 = subjectType2;
        }

        Describable beLikeCastle = new Describable() {
            @Override
            public String describe() {
                return " вроде повстречавшейся нам первой крепости";
            }
        };

        public String getName() {
            return name;
        }

        public SubjectType getSubjectType1() {
            return subjectType1;
        }

        public SubjectType getSubjectType2() {
            return subjectType2;
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return Objects.equals(name, city.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
