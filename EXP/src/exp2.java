
public class exp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="I am a teacher";
		String repstr ="teacher";
		String newstr = "professor";
		System.out.println("��l�r�ꤺ�e"); 
		System.out.println(str);
		System.out.println("���N�᪺�s���e"); 
		
		while(str.lastIndexOf(repstr)>0) {
			str=str.replace(repstr, newstr);
		}
		System.out.println(str);
	}

}
