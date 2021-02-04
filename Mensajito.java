/**
 * 
 */

/**
 * @author ehv80
 *
 */
public class Mensajito {

	String msg;
	/**
	 * 
	 */
	public Mensajito(String msg) {
		this.msg = msg;
		// TODO Auto-generated constructor stub
	}

	public String toString(){
		return this.msg;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Mensajito este = new Mensajito("LA PUCHA DIJO GERARDO!");
		System.out.println(este.toString());
		System.out.println("ESO ES TODO AMIGOS!");
		// TODO Auto-generated method stub
	}

}
