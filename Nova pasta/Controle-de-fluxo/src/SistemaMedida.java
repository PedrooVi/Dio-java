public class SistemaMedida {
    public static void main(String[] args) {
        String sigla = "A";

        switch (sigla) {
            case "P":{
                System.out.println("PEQUENO");
                break;
            }
            case "M":{
                System.out.println("MÉDIO");
                break;
            } 
            case "G":{
                System.err.println("GRANDE");
                break;
            }   
            default:{
                System.err.println("INDEFINIDO");
            }
        }
    }   
}
