import java.util.Objects;

public class Room extends Building{
    private String name;
    private SubjectType subjectType;
    private LocationPart locationPart1;
    private LocationPart locationPart2;

    public Room(String name, SubjectType subjectType, LocationPart locationPart1, LocationPart locationPart2) {
        super(name);
        this.name = name;
        this.subjectType = subjectType;
        this.locationPart1 = locationPart1;
        this.locationPart2 = locationPart2;
    }

    public String getName() {
        return name;
    }

    public SubjectType getSubjectType() {
        return subjectType;
    }

    public LocationPart getLocationPart1() {
        return locationPart1;
    }

    public LocationPart getLocationPart2() {
        return locationPart2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return Objects.equals(name, room.name) &&
                subjectType == room.subjectType &&
                locationPart1 == room.locationPart1 &&
                locationPart2 == room.locationPart2;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, subjectType, locationPart1, locationPart2);
    }
}
