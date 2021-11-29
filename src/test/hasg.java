package test;



public class hasg {

	public static void main(String[] args) {

		int n = 11;
		String password= "#hackerrank";
		int response=numberPass(n,password);		
		if(n<6) {
			if(response == 0) {
				System.out.println(6-n);
			}else {
				int res=n+response;
				if(res<6) {
					System.out.println(res-response);
				}
			}
		}else {
			if(response == 0) {
				int res=0;
				System.out.println(res);;
			}else {
				System.out.println(response);
			}
		}
	}
	
	static int numberPass(int n, String pass) {
		
		String numbers = "0123456789";
		String lower = "abcdefghijklmnopqrstuvwxyz";
		String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String special = "!@#$%^&*()-+";
		int wn,wl,wu,ws, response;
		
		if(checkConst(n,pass,numbers)) {
			wn=0;
		}else {
			wn=1;
			System.out.println("1 in numbers");
		}
		if(checkConst(n,pass,lower)) {
			wl=0;
		}else {
			wl=1;
			System.out.println("1 in lower");
		}
		if(checkConst(n,pass,upper)) {
			wu=0;
		}else {
			wu=1;
			System.out.println("1 in upper");
		}
		if(checkConst(n,pass,special)) {
			ws=0;
		}else {
			ws=1;
			System.out.println("1 in special");
		}
		
		response=wn+wl+wu+ws;
		
		return response;
	}
	
	
	static Boolean checkConst(int n,String pass, String rule) {
		
		Boolean flag=false;
		int c=0;
		
		for(int pi=0; pi < n; pi++) {
			for(int ri=0; ri < rule.length(); ri++) {
				if(pass.charAt(pi) == rule.charAt(ri)) {
					c++;
				}
			}
		}
		if(c!=0) {flag=true;}
		return flag;
	}

	
	
	
}
