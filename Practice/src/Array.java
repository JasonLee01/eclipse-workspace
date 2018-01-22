
public class Array {
	private int i;
	private String prtK[];
	
	//assign prtK
	public void assignPrtK(int iMax) {
		prtK = new String[iMax];
		for (i=0;i<iMax;i++) {
			prtK[i] = "I am " + i;
		}
	}
	
	//return max i
	public int getMaxI() {
		return this.i;
	}
	
	//return array
	public String[] getArray(){
		return prtK;
		}

}
