package ejerciciosArraylist;

public class Moto {
    private String placa;
    private String color;

    public Moto(String placa, String color){
        this.placa=placa;
        this.color = color;
    }

    @Override
    public String toString(){
        return "Moto{"+"placa="+placa+",color="+color+'}';
    }
}
