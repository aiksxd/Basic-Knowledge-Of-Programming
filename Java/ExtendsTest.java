public class ExtendsTest{
	public static void main(String[] args){
	// ������ͨ�˻�
	Account act = new Account();
	act.setActno("1145141");
	act.setBalance(-114514);
	System.out.println(act.getActno() + "�����" + act.getBalance());

	// ���������˻�
	CreditAccount ca = new CreditAccount();
	ca.setActno("1111111");
	ca.setBalance(10000);
	ca.setCredit(0.99);
	System.out.println(ca.getActno() + "����" + ca.getBalance() + "�������֣�" + ca.getCredit);
	System.out.println(ca);		//������д��toString��������ӡ����ʱ�����Ƕ����ַ�����������·���ִ�еĽ����
	
	// Object����ԣ�
	/* Object����toString����Դ�룺
	public String toString() {
		return getClass() .getName() + "@" + Integer.toHexString(hashCode());
	}
	*/
	AlphaTest et = new AlphaTest();
	System.out.println("���ü̳е�toString������"+et.toString);	//����Ĭ�ϼ̳�Object��AlphaTest����ü̳е�toString����
	System.out.println("��ӡ����ֵ��"+et);		//ֱ�Ӵ�ӡ����ֵ
	//���Է������δ�ӡ�����ͬ��˵����������ӡ����ֵʱ����Ĭ�ϵ��ü̳�Object������toSring����
	//toString������⼴Ϊת�����ַ��������Ｔ������ת�����ַ�����ʽ
	}
}
class Alpha{	//��ʹ�����ǿյģ���Ҳ��Ĭ�ϼ̳�Object�������
}

//�����˻��࣬�˻����԰������˺����
class  Account{
	private String actno;
	private double balance;

	public Account(){
	
	}
	public Account(String actno, double balance){
		this.actno = actno;
		this.balance = balance;
	}

	public void setActno(String actno){
		this.actno  = actno;
	}
	public String getActno(){
		return actno;
	}
	public void setBalance(double balance){
		this.balance = balance;
	}
	public double getBalance(){
		return balance;
	}
}

//�������͵��˻������ÿ��˻����˺š��������ȣ�
class CreditAccount extends Account{	//extends AccountΪ�̳в��֣�ע�͵�������Account���ظ��������ü̳���ߴ��븴���� 
	// private String actno;
	// private double balance;
	private double credit;

	public Account(){
	
	}
	public Account(String actno, double balance){
		this.actno = actno;
		this.balance = balance;
		this.credit = credit;
	}

	// public void setActno(String actno){
	// 	this.actno = actno;
	// }
	// public String getActno(){
	// 	return actno;
	// }
	// public void setBalance(double balance){
	// 	this.balance = balance;
	// }
	// public double getBalance(){
	// 	return balance;
	// }
	public void setCredit(double credit){
		this.credit = credit;
	}
	public double getCredit(){
		return credit;
	}
	//Override�������ǣ�
	public String getActno(){
		return "�û���Ϊ��" + actno;	//ʹ����ͬ����ķ������Ǽ̳и���ľɷ��������ڴ����е���getBalance()����ֻ�������д�ķ����������Ƿ�������(������Ҫ������ͬ�����������岻ͬ���������й�ϵ)
	}
	public void setActno(String actno){	//����Ҫ��ĸ��ӷ���������ͬ��������ͬ�ķ���ֵ���͡�����������ʽ�����б��������η�(����Ȩ�޿��Ը��ߵ����ܸ���)�ȡ�
		this.actno = actno;
		System.out.println("�û����Ѹ�Ϊ��" + actno);
	}
	//toString������д���ԣ�
	public String toString(){
		return "�û�����" + getActno() + "���Ϊ��" + getBalance() + "������Ϊ��" + getCredit());
	}
}