package cola01;

import javax.swing.JOptionPane;

public class Cola {
   private Nodo inicio;
   private Nodo fin;
   
   public Cola(){
      this.inicio=null;
      this.fin=null;
   }
   public boolean esVacia(){
      if(inicio==null){
         return true;
      }else{
         return false;
      }
   }
   public void encolar(Dato d){
      Nodo nuevo=new Nodo();
      nuevo.setElemento(d);
      if(esVacia()){
         inicio=nuevo;
         fin=nuevo;
      }else{
         fin.setSiguiente(nuevo);
         fin=nuevo;
      }
   }
   public void desencolar(){
      Nodo aux=inicio;
      if(!esVacia()){
         inicio=inicio.getSiguiente();
         aux.setSiguiente(null);
      }
   }

   private String encontrarDeAtrasHaciaAdelanteRecursivo
        (String elPatron, Nodo elNodoActual) 
    {
        String elResultado = "";
        if (elNodoActual.getSiguiente()!= null)
        {
           elResultado = encontrarDeAtrasHaciaAdelanteRecursivo 
                                (elPatron, elNodoActual.getSiguiente());             
        }
        String elNombreActual = elNodoActual.getElemento().getNombre().toUpperCase();
        if (elNombreActual.contains(elPatron))
        {
            elResultado = elResultado.concat
                    (elNombreActual + "\n");
        }
        return (elResultado);
    }
        
private String encontrarDeAtrasHaciaAdelante(String elPatron) 
{
    String elResultado = "";
    elResultado = encontrarDeAtrasHaciaAdelanteRecursivo(elPatron.toUpperCase(), inicio);
    return (elResultado);
}

   private String encontrarDeAdelanteHaciaAtras (String elPatron)
   {
       String elResultado = "";
       
       Nodo elNodoActual = inicio;
       while (elNodoActual != null)
       {
           String elNombreActual = elNodoActual.getElemento().getNombre();
           if (elNombreActual.contains(elPatron))
               elResultado = elResultado.concat(elNombreActual) + "\n";
       }       
       return elResultado;
       
   }

   public String encontrar (String elPatron, boolean deAdelanteHaciaAtras)
   {
       String elResultado = "";
       
       if (deAdelanteHaciaAtras == true)
       {
           elResultado = encontrarDeAdelanteHaciaAtras(elPatron);
       }
       else
       {
           elResultado = encontrarDeAtrasHaciaAdelante(elPatron);
       }
           
       
       return elResultado;
   }
   public String mostrarElementos(){
      String s="";
      if(!esVacia()){
        Nodo aux=inicio;
        while(aux!=null){
          s=s+aux.getElemento().getNombre()+"-"+
                 aux.getElemento().getSalario()+"←";
          aux=aux.getSiguiente();
        }
      }
      return s;
   }
}
