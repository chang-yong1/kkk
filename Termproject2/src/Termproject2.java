import java.util.*;
public class Termproject2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		Random rn=new Random();//����
		
		int a=0;
		int b=0;
		
		System.out.println("������ �������� ������ �Է����ּ���");
		int data_n=sc.nextInt();
		int arr[]=new int[data_n];
		for(int i=0;i<data_n;i++) {
			arr[i]=rn.nextInt();//n���� ������ �ļ�
		}
		System.out.println("�������� ������ ������ ������ �Է����ּ���");
		int range_n=sc.nextInt();
		
		int min = arr[a];
		int max = arr[a];
		int sum =0;
		
		for(int j=0;j<range_n;j++) {
			while(true) {
				a=rn.nextInt(data_n);//���� ������
				b=rn.nextInt(data_n);//���� �� ��
				if(a<=b) break;
			}
			System.out.println(a+"  "+b);
		
			for(int k=a;k<=b;k++) {
				if(min>=arr[k]) min=arr[k];
				if(max<=arr[k]) max=arr[k];
				sum=sum+arr[k];
				}
			System.out.println("�ּڰ�: "+min);
			System.out.println("�ִ�: "+max);
			System.out.println("�հ� :"+sum);
			//11��22��
		}
	}

}
