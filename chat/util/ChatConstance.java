package com.kitri.chat.util;

public class ChatConstance {
	
	public static final int PORT = 9876; //��� 9

	
//	Protocol ����
//	client(��) >> server
//	����				100|��ȭ��
//	������޼���		200|�޼��� 			//�ڱ⸸�� �����尡����.�׷��� �޼������������
//	Ư������޼���		250|�����|�޼���
//	����������			300|�����|�޼���
//	��ȭ����			400|�����Ҵ�ȭ��
//	��������			900|				//��ū�������� |�� �����ϰ� �и����ɰžƴϾ�. | ������������
	public static final int CS_CONNECT = 100; //
	public static final int CS_ALL = 200; //
	public static final int CS_TO = 250; //
	public static final int CS_PAPER = 300; //
	public static final int CS_RENAME = 400; //
	public static final int CS_DISCONNECT = 900; //
	
	
//	server >> client(����â) 
//	����				100|�����ڴ�ȭ��
//	�޼���(��ü)		200|[���������ȭ��]�޼���	// ���������ȭ������ �Ұ��ֳ�? ���� �ϳ�����ū���޾Ƽ� �޼����� �����鳡���ڳ� vector�ٵ�����
//	�޼���(Ư��)		200|�ٺ��������ȭ��ٸ޼��� ��� vector�ȿ��� ������������ �Ұž�. �ΰ��Ȱ����� 200 250 �����ʿ䰡����
//	����������			300|���������ȭ��|�޼��� //��� �����ؾ���. �޼��� ���ߴ�ϱ�
//	��ȭ����			400|��������ȭ��|�����Ҵ�ȭ�� //A>>B�� �����߽��ϴ� �ѷ���߰���. list���� Aã�Ƽ�B�ٲ�ߴ�ϱ� ��ɳ�������.
//	��������			900|�����ڴ�ȭ��	//������������ �������ϴ�. �̰͵� list���� ���� �ؾ���
	public static final int SC_CONNECT = 100; //
	public static final int SC_MESSAGE = 200; //
	public static final int SC_PAPER = 300; //
	public static final int SC_RENAME = 400; //
	public static final int SC_DISCONNECT = 900; //
	
}
