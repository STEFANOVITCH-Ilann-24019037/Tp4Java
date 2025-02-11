package tp3exosYaip5;

public class Cylindre {
    private Circle base;   
    private double height;

    public Cylindre(double radius, double height) {
        this.base = new Circle(radius);  // Construction du cercle comme base du cylindre
        this.height = height;
    }

    // Calcul du volume du cylindre
    public double getVolume() {
        return base.getArea() * height;
    }

    // Méthodes pour obtenir la hauteur et d'autres informations
    public double getHeight() {
        return height;
    }

    public double getBaseArea() {
        return base.getArea();  // Utilisation de la méthode getArea() de Circle
    }




    public static void main(String[] args) {
        // Création d'un cylindre avec un rayon de 5.0 et une hauteur de 10.0
        Cylindre cylindre1 = new Cylindre(5.0, 10.0);

        // Affichage des informations
        System.out.println("Rayon de la base du cylindre : " + cylindre1.base.getRadius());
        System.out.println("Aire de la base du cylindre : " + cylindre1.getBaseArea());
        System.out.println("Hauteur du cylindre : " + cylindre1.getHeight());
        System.out.println("Volume du cylindre : " + cylindre1.getVolume());
    }
}
