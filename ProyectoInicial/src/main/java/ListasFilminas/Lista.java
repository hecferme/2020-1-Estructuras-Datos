package lec06;

public class Lista {
Nodo cabeza;

    public void inserta(Persona p) {
            
Nodo aux = cabeza;   

        if (cabeza == null) {
            cabeza = new Nodo(p);
        }else if(p.getId()<cabeza.getDato().getId() ) {
         aux  = new Nodo (p);
        aux.setNext(cabeza);
        cabeza = aux;
        } 
                
                else if (cabeza.getNext()== null) {
            cabeza.setNext(new Nodo(p));
        }

        while(aux.getNext()!= null && aux.getNext().getDato().getId()<p.getId()){
        aux = aux.getNext();
        }
        
        Nodo temp = new Nodo(p);
        temp.setNext(aux.getNext());
        aux.setNext(temp);
    }

    
    public String toString(){
    Nodo aux = cabeza;
    String s = "Listas: ";
    while (aux!= null){
        s+= aux+", ";
        aux.getNext();
        
    }
    
    return s;
    }
    
    
    
    public boolean existe(int id) {
        boolean esta = false;
        return esta;

    }

    
    public void modifica (Persona p){
    
    
    }
    
    public void elimina (int id){
    
    }
    
    public Persona extrae (int id){
    Persona p = null;
    
    return p;
    }
    
}
