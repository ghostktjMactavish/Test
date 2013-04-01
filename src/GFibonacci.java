
public class GFibonacci {
	public void fibo(){
		int beg=0,next=1,sum;
			System.out.println(beg);
			System.out.println(next);
				for(int i=0;i<8;i++){
					sum=beg+next;
						System.out.println(sum);
							beg=next;
							next=sum;
		}
	}
}
