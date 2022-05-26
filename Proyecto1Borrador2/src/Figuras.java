/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kensh
 */
public class Figuras {

    Figura[] vectorFiguras;

    public Figuras() {
        this.vectorFiguras = new Figura[7]; //vector que almacena las figuras de 7 posiciones
    }

    public Figura[] getVectorFiguras() {
        return vectorFiguras;
    }

    public void setVectorFiguras(Figura[] vectorFiguras) {
        this.vectorFiguras = vectorFiguras;
    }
    
    /**
     * Metodo que se encarga de recibir como parametro un objeto Figura
     * se recorre el vector y se le va agregando la figura, mediante el constructor
     * de la figura se le asignan los datos los datos para las posiciones
     * @param f
     * @return 
     */
    public Figura vectorFiguras(Figura f) {
        for (int i = 0; i < vectorFiguras.length; i++) {
            vectorFiguras[i] = f = new Figura(f.getX1(), f.getY1(),f.getX2(), f.getY2(), 
                    f.getX3(), f.getY3(), f.getX4(), f.getY4());
        }
        return null; //arreglar el metodo de retorno porque tiene que retornar el objeto
    }

}
