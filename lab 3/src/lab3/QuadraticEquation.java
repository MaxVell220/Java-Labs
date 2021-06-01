package lab3;

import java.util.ArrayList;

public class QuadraticEquation {
    private double squaredFactor;
    private double coefficientX;
    private double freeCoefficient;

    public QuadraticEquation(double squaredFactor, double coefficientX, double freeCoefficient) {
        this.squaredFactor = squaredFactor;
        this.coefficientX = coefficientX;
        this.freeCoefficient = freeCoefficient;
    }

    public QuadraticEquation() {
        this.squaredFactor = 0;
        this.coefficientX = 0;
        this.freeCoefficient = 0;
    }

    public double getSquaredFactor() {
        return squaredFactor;
    }

    public void setSquaredFactor(double squaredFactor) {
        this.squaredFactor = squaredFactor;
    }

    public double getCoefficientX() {
        return coefficientX;
    }

    public void setCoefficientX(double coefficientX) {
        this.coefficientX = coefficientX;
    }

    public double getFreeCoefficient() {
        return freeCoefficient;
    }

    public void setFreeCoefficient(double freeCoefficient) {
        this.freeCoefficient = freeCoefficient;
    }

    @Override
    public String toString() {
        if (coefficientX >= 0 && freeCoefficient >= 0) {
            return squaredFactor + "x^2 + " + coefficientX
                    + "x + " + freeCoefficient + " = 0\n";
        } else if (coefficientX < 0) {
            return squaredFactor + "x^2 - " + (-1) * coefficientX
                    + "x + " + freeCoefficient + " = 0\n";
        } else if (freeCoefficient < 0) {
            return squaredFactor + "x^2 + " + coefficientX
                    + "x - " + (-1) * freeCoefficient + " = 0\n";
        } else {
            return squaredFactor + "x^2 - " + (-1) * coefficientX
                    + "x - " + (-1) * freeCoefficient + " = 0\n";
        }
    }

    public QuadraticEquation add(QuadraticEquation other) {
        return new QuadraticEquation(other.squaredFactor + this.squaredFactor, other.coefficientX + this.coefficientX, other.freeCoefficient + this.freeCoefficient);
    }

    public QuadraticEquation subtract(QuadraticEquation other) {
        return new QuadraticEquation(other.squaredFactor - this.squaredFactor, other.coefficientX - this.coefficientX, other.freeCoefficient - this.freeCoefficient);
    }

    public ArrayList<Double> findRoot() {
        ArrayList<Double> root = new ArrayList<>();
        double discriminant;
        discriminant = coefficientX * coefficientX - 4 * squaredFactor * freeCoefficient;
        if (discriminant > 0) {
            root.add((-coefficientX + Math.sqrt(discriminant)) / (2 * squaredFactor));
            root.add((-coefficientX - Math.sqrt(discriminant)) / (2 * squaredFactor));
            return root;
        } else if (discriminant == 0) {
            root.add((-coefficientX) / (2 * squaredFactor));
            return root;
        } else {
            return root;
        }
    }


    private QuadraticEquation derivative() {
        return new QuadraticEquation(0, this.squaredFactor * 2, this.coefficientX);
    }

    public double findExtremum() {
        QuadraticEquation derivative = this.derivative();
        return -derivative.freeCoefficient / derivative.coefficientX;
    }

    private double findValue(double numb) {
        return squaredFactor * (numb * numb) + coefficientX * numb + freeCoefficient;
    }

    public String findIntervalsOfMonotony(double extremum) {
        if ((findValue(extremum) - findValue(extremum - 0.5)) > 0) {
            return ("Maximum: " + extremum + "\nAscending interval (-Inf, " + extremum + "), " +
                    "Descending interval (" + extremum + ", +Inf)");
        } else {
            return ("Minimum: " + extremum + "\nDescending interval (-Inf, " + extremum + "), " +
                    "Ascending interval (" + extremum + ", +Inf)");
        }
    }

    public void findIntervalsOfMonotony() {
        double extremum = this.findExtremum();
        if ((findValue(extremum) - findValue(extremum - 0.5)) > 0) {
            System.out.println("Maximum: " + extremum + "\nAscending interval (-Inf, " + extremum + "), " +
                    "Descending interval (" + extremum + ", +Inf)");
        } else {
            System.out.println("Minimum: " + extremum + "\nDescending interval (-Inf, " + extremum + "), " +
                    "Ascending interval (" + extremum + ", +Inf)");
        }
    }
}
