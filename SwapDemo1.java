
public class SwapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fno=10;int sno=25;
		System.out.println("Before Swapping ");
		System.out.println("Fno : "+fno+"Sno :"+sno);
		//swapping
		fno=fno+sno;
		sno=fno-sno;
		fno=fno-sno;
		System.out.println("After Swapping ");
		System.out.println("Fno : "+fno+"Sno :"+sno);
	}

}
