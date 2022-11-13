package cajas;

public class TestCajaCarton {

    public static void main(String[] args) {
        //Declaro el objeto cajaGrande
        CajaCarton cajaGrande = new CajaCarton();

        //Instancio los objetos con los siguientes valores
        cajaGrande.setAncho(250);
        cajaGrande.setAlto(400);
        cajaGrande.setLargo(500);
        cajaGrande.setPeso(200);

        //Declaro el objeto cajaChica
        CajaCarton cajaChica = new CajaCarton();

        //Instancio los objetos con los siguientes valores
        cajaChica.setAncho(25);
        cajaChica.setAlto(30);
        cajaChica.setLargo(15);
        cajaChica.setPeso(17);

        //Muestro los datos utilizando los mnetodos get
        System.out.println(cajaGrande.getAncho());
        System.out.println(cajaGrande.getAlto());
        System.out.println(cajaGrande.getLargo());
        System.out.println(cajaGrande.getPeso());

        //Muestro los datos utilizando los mnetodos get
        System.out.println(cajaChica.getAncho());
        System.out.println(cajaChica.getAlto());
        System.out.println(cajaChica.getLargo());
        System.out.println(cajaChica.getPeso());
        
        
        System.out.println(cajaGrande.toString());
        System.out.println(cajaChica.toString());
        

    }

}
