package pro1.lasColas.veronikaEsparragoza;

public class Cajas {

    private boolean ocupado;
    private int persona;

    public Cajas (){
        this.ocupado = false;
        this.persona = 0;
    }
    public void cambiarEstadoCaja(){
        if(persona > 0){
        this.persona -= 1;
        }
        if(this.persona == 0) {
            this.ocupado = false;
        }
    }
    public boolean getOcupado(){
        return ocupado;
    }
    public int getPersona(){
        return persona;
    }

    public void setPersona(int persona){
        this.ocupado = true;
        this.persona = persona;
    }

}
