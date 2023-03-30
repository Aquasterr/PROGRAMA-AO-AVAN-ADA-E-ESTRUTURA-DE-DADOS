public class TADPilha {
    
    //Atributos
    int dados[];
    int topo;
    int capacidade;
    
    //Construtor
    public TADPilha (int c) {
        capacidade = c;
        topo = -1;
        dados = new int [capacidade];
    }
    
    //Metodos
    public boolean empilha(int x) {
        topo++;
        dados[topo] = x;
        return true;
    }
    
    public void MostraAoContrario() {
        for (int i = topo; i >= 0; i--) {
            System.out.print(dados[i]);
        }
    }
    
    public void Mostra() {
        for (int i = 0; i <= topo; i++) {
            System.out.print(dados[i]);
        }
    }
}
