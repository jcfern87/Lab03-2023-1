package linked;

import list.EstruturaElementar;

public class ListaLigada implements EstruturaElementar{

    private No cabeca;

    public ListaLigada() {
        cabeca = null;
    }

    @Override
    public boolean buscaElemento(int valor) {
        No obj = this.cabeca;
        while(obj != null){
            if(obj.getValor() == valor){
                return true;
            }
            obj = obj.getProximo();
        }
        return false;    
    }

    @Override
    public int buscaIndice(int valor) {
        No obj = cabeca;
        for(int i = 0; i == valor - 1; i++){
            obj = obj.getProximo();
        }
        return obj.getValor();    
    }

    @Override
    public int minimo() {
        No obj = cabeca;
        int min = obj.getValor();
        while(obj != null){
            if(obj.getValor() < min){
                min = obj.getValor();
            }
            obj = obj.getProximo();
        }
        return min;
    }

    @Override
    public int maximo() {
        No obj = cabeca;
        int max = obj.getValor();
        while(obj != null){
            if(obj.getValor() > max){
                max = obj.getValor();
            }
            obj = obj.getProximo();
        }
        return max;
    }

    @Override
    public int predecessor(int valor) {
        return 2;
    }
        

    @Override
    public int sucessor(int valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sucessor'");
    }

    @Override
    public void insereElemento(int valor) {
        if(cabeca != null){
            No obj = this.cabeca;
            while(obj.getProximo() != null){
                    obj = obj.getProximo();
                }
                obj.setProximo(new No(valor));
        }
        else{
            cabeca = new No(valor);
        }
    }

    @Override
    public void insereElementoPosicao(int valor, int buscaIndice) {
        No obj = cabeca;
        for(int i = 0; i == buscaIndice - 1; i++){
            obj = obj.getProximo();
        }
        No fov = new No(valor);
        fov.setProximo(obj.getProximo());
        obj.setProximo(fov);
    }

    @Override
    public void insereInicio(int valor) {
        if (this.cabeca == null){ 
            this.cabeca = new No(valor); 
        }
        else{
            No n = new No(valor); 
            n.setProximo(this.cabeca); 
            cabeca = n; 
        }
        
    }

    @Override
    public void insereFim(int valor) {
        if(cabeca != null){
            No obj = this.cabeca;
            while(obj.getProximo() != null){
                    obj = obj.getProximo();
                }
                obj.setProximo(new No(valor));
        }
        else{
            cabeca = new No(valor);
        }
    }

    @Override
    public void remove(int valor) {
        if(cabeca.getValor() == valor){
            cabeca = null;
        }
        No obj = cabeca;
        while(obj.getProximo() != null){
            if(obj.getProximo().getValor() == valor && obj.getProximo().getProximo() != null){
                obj.setProximo(obj.getProximo().getProximo());
            }
            else if(obj.getProximo().getValor() == valor && obj.getProximo().getProximo() == null){
                obj.setProximo(null);
            }
        }
    }

    @Override
    public void removeIndice(int indice) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeIndice'");
    }

    @Override
    public void removeInicio() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeInicio'");
    }

    @Override
    public void removeFim() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeFim'");
    }
    
}
