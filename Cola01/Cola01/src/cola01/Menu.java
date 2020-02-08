package cola01;
import javax.swing.JOptionPane;
public class Menu {
   private int opc;
   private Cola c=new Cola();
   public void mostrarMenu(){ 
      opc=Integer.parseInt(JOptionPane.showInputDialog(null,
              "****MENU PRINCIPAL***\n"
                      + "\n1.Agregar elemento"
                      + "\n2.Extraer elemento"
                      + "\n3.Mostrar elementos"
                      + "\n4.Salir"
                      + "\n\nDigite su opción:"));
      switch(opc){
          case 1:{
             c.encolar();
             mostrarMenu();
             break;
          }
          case 2:{
             c.desencolar();
             mostrarMenu();
             break;
          }
          case 3:{
             c.mostrarElementos();
             mostrarMenu();
             break;
          }
          case 4:{
             System.exit(0);
             break;
          }
          default:{
             JOptionPane.showMessageDialog(null,"Opción incorrecta!");
          }
      }
   }
}
 
