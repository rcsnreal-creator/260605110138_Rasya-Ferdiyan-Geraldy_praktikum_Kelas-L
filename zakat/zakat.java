public class zakat {
	public static void main (String [] args){
		int [] penghasilan =
{1000000,1200000,1400000,1600000,1800000,2000000,2200000,2400000,2600000,2800000,3000000,3200000};
		int [] pengeluaran =
{900000,1100000,1300000,1500000,1700000,1900000,2100000,2300000,2500000,2700000,2900000,3100000};
		int totalhasil = 0;
		int totalkeluar = 0;

		for (int i = 0; i < 12; i++) {
			totalhasil += penghasilan[i];
			totalkeluar += pengeluaran[i];
		}
		
		int surplus = totalhasil - totalkeluar;
		System.out.println("Total Penghasilan : " + totalhasil);
		System.out.println("Total Pengeluaran : " + totalkeluar);
		System.out.println("Surplus           : " + surplus);

		double nisab = 2605000*0.025;
		System.out.println("Nisab             : " + nisab);

		if (surplus >= nisab) {
			double zakat = surplus * 0.025;
			System.out.println("kategori : MUZAKKI (KAYA)");
			System.out.println("Zakat : " + zakat);
		}

		else {
		System.out.println("Kategori : MUSTAHIK (MISKIN)");
		System.out.println("Zakat    : 0");
		}
	}
}