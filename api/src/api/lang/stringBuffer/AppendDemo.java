package api.lang.stringBuffer;
/*
 StringBuffer Ŭ����
 - String Ŭ������ �������� �ν��Ͻ� ������
   ���ڿ��� �ٲ� �� �ְ� ������ �ִ�.
 */
/*
 java.lang.StringBuffer �޼ҵ���
 append() �� �Ķ���ͷ� ���� String ����
 ���� ���ڿ��� �ڿ� ���δ�.
 */
public class AppendDemo {
	public static void main(String[] args) {
		StringBuffer buf = new StringBuffer();
		StringBuffer buf1 = new StringBuffer("A B C");
		StringBuffer buf2 = buf1.append("D E F");    //buf1�� �ٿ�����
		String msg;
		// concat�� String�� ��� ���� ���̴� ���̱� ������ �޸𸮰� ��������.
		// �ݸ�, ���۸� ����ϸ� ������ �޸𸮿� �ƹ��� �ٿ��� �޸𸮴� �����ϴ�.
		if(buf1 == buf2){
			msg = "buf1 == buf2";
		}else{
			msg = "buf1 != buf2"; 
		}
		System.out.println(msg);
		System.out.println(buf1.toString());
		System.out.println(buf2.toString());
		/*
		 buf2 �� ���Ӱ� �����Ǿ� ���޵� ��ü�� �ƴϸ�
		 buf1 �� ���������� �����Ǿ� ���� �������ν�
		 ������ �ּҰ��� �����Ѵ�.
		 
		 StringBuffer Ŭ������ String Ŭ������ �ٸ���
		 ���к��ϰ� ��ü ������ ���� �ʴ´�.
		 �׸���, ���� ������ �� �ִ� �������� Ư¡�� �ִ�.
		 �׷��Ƿ� ������ ���ڿ� ���� �۾��� �ʿ��� ���
		 String Ŭ���� ���� StringBuffer Ŭ������ �� �����ϴ�.
		 
		 ��뿹 : ���忡�� ���ڸ� ���� �� ������� ���ٰ�
		 �ٽ� ����� ���ۼ��ؼ� ������ ��찡 ��ǥ���̴�.
		 �� buffer �� �����Ű�ٰ� ����ڰ� �������� ���͸�
		 ������ �۾��� buffer ���� ��ü�� ��������
		 ������ �ó������� ����ȴ�.
		 */
		
		// �Խù����� ����ϴ°��� StringBuffer �̴�.
	}
}