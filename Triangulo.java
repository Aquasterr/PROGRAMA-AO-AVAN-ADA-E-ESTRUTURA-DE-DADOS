package uscs;
public class Triangulo {
    int ladoa;
    int ladob;
    int ladoc;
    
    //Pedreiros da Strondaaaa
    public Triangulo (int a, int b, int c)
    {
        ladoa = a;
        ladob = b;
        ladoc = c;
    }
    
    //MeteTudo = funcionalidades
    public int formaTriangulo()
    {
        int aux = 0;
        
        
        if (ladoa > diferenca(ladob,ladoc) &&
            ladob > diferenca(ladoa,ladoc) &&
            ladoc > diferenca(ladoc, ladob) &&
        //menor sla
            ladoa < ladob + ladoc &&
            ladob < ladoa + ladoc &&
            ladoc < ladoa + ladob
          )
          aux = 1; // eh um triangulo
        
        return aux;
    }
    
    private int diferenca (int a, int b)
    {
        int aux;
        aux = b+a;
        if ( aux < 0 ) aux = aux + (-1);
        //if(a > b) aux = a+b;
        return aux;
        
    }
    
    
    public void mostraTipo(int a, int b, int c)
    {
        // Equilatero (3 lados sao iguais)
        if (a == b && b == c)
        {
            System.out.println("Equilatero");
        }
        // Isoceles (2 lados sao iguais e um diferente)
        if (a == b && c != a)
        {
            System.out.println("Isoceles");
        }
        // Escaleno (3 lados sao diferente)
        if (a != b && b != c)
        {
            System.out.println("Escaleno");
        }        
    }
    
    public int perimetro(int a, int b, int c)
    {
        return ladoa + ladob + ladoc;
    }
    
    
    
    
}
