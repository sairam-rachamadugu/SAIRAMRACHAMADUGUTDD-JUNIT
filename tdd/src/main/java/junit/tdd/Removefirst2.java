package junit.tdd;

public class Removefirst2 {

	public static void main(String args[]) {
		Removefirst2 r=new Removefirst2();
		System.out.print(r.remove("BACD"));
	}
	

	public String remove(String string) {
		
		// TODO Auto-generated method stub
		char f1=string.charAt(0);
		char f2=string.charAt(1);
		if(f1=='A'&f2=='A') {
			return string.substring(2,string.length());
		}
		else if(f1=='A') {
			return string.substring(1,string.length());

		}
		else if(f2=='A') {
			StringBuilder stringbuilder=new StringBuilder();
			stringbuilder.append(string.charAt(0));
			return (stringbuilder.append(string.substring(2,string.length()))).toString();

		}
		else {
			return string;
		}
		
	
	}
}
