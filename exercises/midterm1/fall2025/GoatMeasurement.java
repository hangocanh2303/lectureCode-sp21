package fall2025;

public class GoatMeasurement {
    public String name;
    public double size;

    @Override
    public boolean equals(Object o) {
        if (o instanceof GoatMeasurement otherGoat) {
            return (this.name.equals(otherGoat.name) && Math.abs(this.size - otherGoat.size) <= 0.1);
        }
        return false;
    }
}
