public class Pokemon {

    /**
     * Generar el pokemon rival y el del jugador
     */


    private String nombre;
    private String tipo;
    private int nivel;
    private int aguante;

// Añada los constructores********************

    public  Pokemon( String queNombre, String tipoPokemon){

        this.nombre = queNombre;
        this.tipo = tipoPokemon;
        nivel = 1;
        actualizarStats();

    }
    public Pokemon (String queNombre, String tipoPokemon,int queNivel){
        this.nombre = queNombre;
        this.tipo = tipoPokemon;
        this.nivel = queNivel;
        actualizarStats();
    }






// ******************************************

    public int getAguante() {
        return aguante;
    }

    public void setAguante(int aguante) {
        this.aguante = aguante;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int calcularPoder(Pokemon contrincante) {
        // Completa el método calcularPoder...
        int poder = 0;

        if (nivel >= 1) {
            switch (nivel) {
                case 1:
                    return (int) (Math.random() * 3) + 8;
                break;
                case 2:
                    return (int) (Math.random() * 6) + 15;
                break;
                case 3:
                    return (int) (Math.random() * 9) + 22;
                break;
                case 4:
                    return (int) (Math.random() * 12) + 29;
                break;
            }
        } else
            System.out.println("No se puede nivel negativo");

        if (contrincante.tipo.equals("Fuego") && tipo.equals("Agua")) {
            poder = this.nivel = nivel + 2;

        } else if (contrincante.tipo.equals("Agua") && tipo.equals("Fuego")) {
            poder = this.nivel = contrincante.nivel - 2;

        } else if (tipo.equals("Tierra") && contrincante.tipo.equals("Agua")) {
            poder = contrincante.nivel = contrincante.nivel -2;

        } else if (tipo.equals("Tierra") && contrincante.tipo.equals("Fuego")){
            poder = contrincante.nivel = contrincante.nivel -2;

        }else if (tipo.equals("Agua") && contrincante.tipo.equals("Tierra")){
            poder = contrincante.nivel = contrincante.nivel -2;

        } else {
            System.out.println("f");
        }

        return;




    }

    public void subirNivel(){
        this.nivel++;
        this.actualizarStats();
    }

    public void actualizarStats(){
        this.aguante = (int) Math.round(nivel * 2.5);
    }

    public void disminuirAguante(){
        this.aguante--;
    }

    public String toString(){
        return "Nombre: " + this.nombre +
                "\n tipo: " + this.tipo +
                "\n nivel: " + this.nivel +
                "\n aguante " + this.aguante;
    }

}
