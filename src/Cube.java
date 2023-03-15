public class Cube
{

    private int side;
    public Cube()
    {
        this.side = 1;
    }
    public Cube(int side) {
        if (side < 1)
        {
            throw new IllegalArgumentException("A cube’s side length cannot be less than 1!");
        }
        else
        {
            this.side = side;
        }
    }

    public int getSide()
    {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getSurfaceArea()
    {
        int area = this.getSide()*this.getSide();
        area = area *6;
        return area;
    }

    public int getVolume()
    {
        int volume = (this.getSide())* (this.getSide()) * (this.getSide());
        return volume;
    }

    @Override
    public String toString() {
        return "Cube{" +
                "side=" + side +
                '}';
    }
}
