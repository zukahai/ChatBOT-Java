package Model;

public class StringChain {
	int a[][] = new int[1000][1000];
	
	public int LengthChain(String s, String p) {
		s = " " + s;
		p = " " + p;
		int n = s.length();
		int m = p.length();
		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++)
				a[i][j] = 0;
		for (int i = 1; i < n; i++)
			for (int j = 1; j < m; j++)
				if (s.charAt(i) == p.charAt(j)) {
					a[i][j] = a[i - 1][j - 1] + 1;
				} else
					a[i][j] = Math.max(a[i - 1][j], a[i][j - 1]);
		return a[n - 1][m - 1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringChain chain = new StringChain();
		System.out.println(chain.LengthChain("Hai Phan", "Phan Hai"));
	}

}
