package uscs;
public class Main {

    public static void main(String[] args) {
        
        //Criar um trigulo
        Triangulo x = new Triangulo(4,12,3);
        
        if (x.formaTriangulo()== 0)
        {
            System.out.println("Os Valores não formam um triangulo");
        }
        else
        {
            System.out.println ("Os valores formam um triangulo");
            x.mostraTipo(x.ladoa, x.ladob, x.ladoc);
            x.perimetro(x.ladoa, x.ladob, x.ladoc);
            
        }
        
        
        
    }
    
}
