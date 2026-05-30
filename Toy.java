public class Toy{
    public String name;
    public String brand;
    public double price;
    public int quantity;
 /* this 
    * is 
    * a
    * multi
    * line
    * comment
    */


   /*  set the amount of toy to the argument example setPrice(1000)*/
    void setPrice(double price){
        this.price = price;
    }
    //psvm - public static void main(String[] args) {}
    public static void main(String[] args) {
        //sout System.out.println("hello java trainees");
        System.out.println("hello java trainees");
        Toy toy1 = new Toy();
        Toy toy2 = new Toy();
        System.out.println(toy1.name);
    }

}