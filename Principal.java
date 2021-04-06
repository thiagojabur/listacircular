package listaCircular;

public class Principal {

	public static void main(String[] args) {
		
        //criando um node
        Node obj;
		CircleList lista1 = new CircleList();
        
        for (int index = 1; index <=5; index++) {
        	obj = new Node("Elemento " + index);
        	System.out.println("Adicionando o " + index);
        	lista1.add(obj);
        }
                
        System.out.println("Removeu o " + lista1.remove().getElement());
        
        System.out.println("Imprimindo os elementos \n" + lista1);
	}

}
