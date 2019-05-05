import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;



public class main {

	public static void main(String[] args) {
		
		ArrayList<Depositos> dep=new ArrayList<Depositos>();
		/*
		 * forma 1
		 */
	/*	dep.add(new Depositos("dp1", 50, 20, 40));
		dep.add(new Depositos("dp2", 30, 20, 20));
		dep.add(new Depositos("dp3", 20, 30, 30));
		dep.add(new Depositos("dp4", 10, 20, 30));
		dep.add(new Depositos("dp5", 20, 20, 20));*/
		
		/*
		 * forma 2
		 */
		
		Depositos dp1=new Depositos("dp1", 50, 20, 40);
		Depositos dp2=new Depositos("dp2", 30, 20, 20);
		Depositos dp3=new Depositos("dp3", 20, 30, 30);
		Depositos dp4=new Depositos("dp4", 10, 20, 30);
		Depositos dp5= new Depositos("dp5", 20, 20, 20);
		
		dep.add(dp1);
		dep.add(dp2);
		dep.add(dp3);
		dep.add(dp4);
		dep.add(dp5);
		
		Collections.sort(dep);

		Iterator<Depositos> it=dep.iterator();
        while(it.hasNext()) {
          Depositos depo =it.next();
        System.out.println(depo.getNombre());
        	
        }
	}

}
