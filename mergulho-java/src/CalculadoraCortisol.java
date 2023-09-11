public class CalculadoraCortisol {
    public static void main(String[] args) {
        double cortisol = 10;

        boolean resultadoNormal = cortisol >= 6.0 && cortisol <= 18.4;
       // boolean resultadoAnormal = !resultadoNormal;
        boolean resultadoAnormal = cortisol < 6.0 || cortisol > 18.4;

//        System.out.println("Cortisol normal: "+resultadoNormal);
//        System.out.println("Cortisol Anormal: "+resultadoAnormal);

//        if(resultadoNormal){
//            System.out.println("Cortisol normal");
//        } else{
//            System.out.println("Cortisol Anormal");
//        }

        if(cortisol >= 6.0 && cortisol <= 18.4){
            System.out.println("Cortisol normal");
        } else if (cortisol > 18.4){
            System.out.println("Cortisol Alto");
        } else {
            System.out.println("Cortisol baixo");
        }
    }
}
