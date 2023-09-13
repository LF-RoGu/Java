package AreaFormulas;
class PackageAreaFormulas {
    enum formulaSelector
    {
        C_CIRCLE,
        C_SQUARE,
        C_RECTANGLE
    }
    public double area = 0;

    public double AreaCircle(double radius)
    {
        double pi = 3.1415;
        this.area = pi*radius*radius;

        return area;
    }
    public double AreaSquare(double l)
    {
        this.area = l*l;

        return area;
    }

    public double AreaRectangle(double l, double h)
    {
        this.area = l*h;

        return area;
    }
}
