package koreait.day08b;

import java.util.Random;
public class GameValue {


	
			
			private String gamer;		//���������� �̸� , �⺻�ʱⰪ null
			private int count; 			//���̸� �õ�Ƚ��, �ʱⰪ 0
			private boolean Success;	//���߱� �������� , �ʱⰪ false
			
			
			//Ŀ���� ������ : gamer �ʱⰪ ���� ->�⺻ ������ ��� ���մϴ�.
			public GameValue(String gamer) {
					this.gamer=gamer;
			}
			
			//��ü�� ����ϴ� �ν��Ͻ� �޼ҵ�
			public void print() {
				System.out.println("gamer : " + gamer + ", �õ�Ƚ�� : " + count + ",���� : " + Success);
			}
			
			
			public String getGamer() {
				return gamer;
			}

			public void setGamer(String gamer) {
				this.gamer = gamer;
			}

			public int getCount() {
				return count;
			}

			public void setCount(int count) {
				this.count = count;
			}
			//boolean Ÿ���� getter �޼ҵ� �̸��� isXXX() �Դϴ�.
			public boolean isSuccess() {
				return Success;
			}

			public void setSuccess(boolean Success) {
				this.Success = Success;
			}

			//static - ��ü�� �ν��Ͻ� �ʵ尪�� ������� �ʴ� ���. ��, ��ü�� ������� �޼ҵ� ����.
			public static int makeNumber(int min, int max) {	//min101~max299 : ������ �ּҰ�,�ִ밪 ���ڷ� �ް� ���� ��ȯ
				Random r = new Random();
				return r.nextInt(max-min+1)+min;    //r.nextInt(199)+101;  -> 0~198 + 101
			}// ���� : r.nextInt(100) ��  0~99 ������ ����


			//getter �� setter 
		
			
			
	}

