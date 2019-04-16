package com.kitri.pos.sales;

import java.awt.*;
import java.awt.event.*;
import java.util.Vector;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.kitri.pos.sales.SalesDao;

public class Sales extends JFrame implements ActionListener {

	SalesDao salesDao = new SalesDao();
	private JPanel contentPane;
	private JTextField notice;
	private JPanel pMonitor;

//	카드 레이아웃에 붙일 패널
	ViewSalesCustomer viewSalesCustomer = new ViewSalesCustomer();
	ViewSalesDisuse viewSalesDisuse = new ViewSalesDisuse();//HS
	ViewSalesInput viewSalesInput = new ViewSalesInput();
	ViewSalesChange viewSalesChange = new ViewSalesChange();

	DealCancel dealCancel = new DealCancel();

	Payment_1 payment_1 = new Payment_1();
	Payment_2 payment_2 = new Payment_2();
	Payment_3 payment_3 = new Payment_3();
	Payment_4 payment_4 = new Payment_4();
	Receipt receipt = new Receipt();
//	카드레이아웃 다른 클래스에서 쓰기 위해 전역 변수로 지정
	CardLayout cardLayout = new CardLayout();
//	카드레이아웃에 사용할 버튼 전역 변수 지정
//	판매 오른쪽 파란색 하늘색 기본 버튼들 
	JButton sBtnCustomer;
	JButton sBtnDisuse;//HS
	JButton sBtnPdInput;
	JButton sBtnPdChange;
	JButton sBtnPdCancel;
	JButton sBtnPdHold;
	JButton sBtnPay;
	JButton sBtnCancel;

//	회원 조회 버튼  ViewCustomer
	JButton enroll;
	JButton search;
	JButton delete;

//	결제창 버튼	
	JButton btnP1Before;
	JButton btnP1Next;

//	결제 2
	JButton btnP2Before;
	JButton btnP2Next;
	JButton btnP2Cancel;
	JButton btnP2Register;
	JButton btnP2Save;
	JButton btnP2Apply;

//	결제 4
	JButton btnP4Before;
	JButton btnP4Next;
	JButton btnP4Cancel;

//	결제3
	JButton btnP3Before;
	JButton btnP3Cancel;
	JButton btnP3Payment;
	JButton btnP3PrintReceipt;

//	영수증

	JButton cancel;
	JButton print;

//	결제취소

	JButton btnRefund;
	JButton btnPrintRefund;
	
//HS
//*****************************************페기처리버튼***************************************
	JButton disuse;
//*****************************************************************************************
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sales frame = new Sales();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Sales() {
		setFont(new Font("맑은 고딕", Font.BOLD, 20));
		setTitle("Force.pos");
		setAlwaysOnTop(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1326, 753);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel pStatusBar = new JPanel();
		pStatusBar.setBackground(new Color(0, 0, 128));
		pStatusBar.setBounds(0, 0, 1308, 51);
		contentPane.add(pStatusBar);
		pStatusBar.setLayout(null);

		JLabel titleLabel = new JLabel("Force. pos");
		titleLabel.setForeground(Color.WHITE);
		titleLabel.setBackground(new Color(0, 0, 128));
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		titleLabel.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		titleLabel.setBounds(14, 8, 241, 31);
		pStatusBar.add(titleLabel);

		notice = new JTextField();
		notice.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		notice.setText("\uC0C1\uD488\uBA85(..)\uB294 \uC720\uD1B5\uAE30\uD55C\uC774 \uC9C0\uB0AC\uC2B5\uB2C8\uB2E4.");
		notice.setHorizontalAlignment(SwingConstants.CENTER);
		notice.setBounds(258, 8, 726, 31);
		pStatusBar.add(notice);
		notice.setColumns(10);

		JLabel dateLabel = new JLabel("2019-04-01 \uC624\uD6C4 5:01");
		dateLabel.setBackground(new Color(0, 0, 128));
		dateLabel.setHorizontalAlignment(SwingConstants.CENTER);
		dateLabel.setForeground(new Color(255, 255, 255));
		dateLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		dateLabel.setBounds(1016, 8, 278, 31);
		pStatusBar.add(dateLabel);

		JPanel pMainBtn = new JPanel();
		pMainBtn.setBackground(new Color(255, 255, 255));
		pMainBtn.setBounds(0, 585, 1144, 120);
		contentPane.add(pMainBtn);
		pMainBtn.setLayout(null);

		JLabel idLabel = new JLabel("\uAD00\uB9AC\uC790");
		idLabel.setBackground(new Color(105, 105, 105));
		idLabel.setHorizontalAlignment(SwingConstants.CENTER);
		idLabel.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		idLabel.setBounds(860, 0, 201, 120);
		pMainBtn.add(idLabel);

		JButton mBtnInven = new JButton("\uC7AC\uACE0");
		mBtnInven.setBackground(new Color(28, 94, 94));
		mBtnInven.setForeground(new Color(255, 255, 255));
		mBtnInven.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		mBtnInven.setBounds(0, 0, 157, 120);
		pMainBtn.add(mBtnInven);

		JButton mBtnSale = new JButton("\uD310\uB9E4");
		mBtnSale.setBackground(new Color(99, 166, 166));
		mBtnSale.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		mBtnSale.setForeground(new Color(255, 255, 255));
		mBtnSale.setBounds(156, 0, 157, 120);
		pMainBtn.add(mBtnSale);

		JButton mBtnCalc = new JButton("\uC815\uC0B0");
		mBtnCalc.setBackground(new Color(28, 94, 94));
		mBtnCalc.setForeground(new Color(255, 255, 255));
		mBtnCalc.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		mBtnCalc.setBounds(313, 0, 157, 120);
		pMainBtn.add(mBtnCalc);

		JButton mBtnStat = new JButton("\uD1B5\uACC4");
		mBtnStat.setBackground(new Color(99, 166, 166));
		mBtnStat.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		mBtnStat.setForeground(new Color(255, 255, 255));
		mBtnStat.setBounds(470, 0, 157, 120);
		pMainBtn.add(mBtnStat);

		JButton mBtnAccount = new JButton("\uACC4\uC815");
		mBtnAccount.setBackground(new Color(28, 94, 94));
		mBtnAccount.setForeground(new Color(255, 255, 255));
		mBtnAccount.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		mBtnAccount.setBounds(626, 0, 157, 120);
		pMainBtn.add(mBtnAccount);

		JPanel pSellFunction = new JPanel();
		pSellFunction.setBackground(new Color(0, 0, 128));
		pSellFunction.setBounds(1144, 50, 164, 655);
		contentPane.add(pSellFunction);
		pSellFunction.setLayout(null);

		sBtnCustomer = new JButton("\uACE0\uAC1D\uAD00\uB9AC");
		sBtnCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		sBtnCustomer.setForeground(new Color(255, 255, 255));
		sBtnCustomer.setBackground(new Color(0, 0, 128));
		sBtnCustomer.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		sBtnCustomer.setBounds(0, 0, 164, 85);
		pSellFunction.add(sBtnCustomer);

		sBtnDisuse = new JButton("\uD3D0\uAE30\uAD00\uB9AC");
		sBtnDisuse.setBackground(new Color(100, 149, 237));
		sBtnDisuse.setForeground(new Color(255, 255, 255));
		sBtnDisuse.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		sBtnDisuse.setBounds(0, 83, 164, 85);
		pSellFunction.add(sBtnDisuse);

// #전역 변수로 선언한 BtnEnroll을 사용해야 합니다#
		sBtnPdInput = new JButton("\uC0C1\uD488\uB4F1\uB85D");

		sBtnPdInput.setBackground(new Color(0, 0, 128));
		sBtnPdInput.setForeground(new Color(255, 255, 255));
		sBtnPdInput.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		sBtnPdInput.setBounds(0, 166, 164, 85);
		pSellFunction.add(sBtnPdInput);

		sBtnPdChange = new JButton("\uC0C1\uD488\uC218\uC815");

		sBtnPdChange.setBackground(new Color(100, 149, 237));
		sBtnPdChange.setForeground(new Color(255, 255, 255));
		sBtnPdChange.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		sBtnPdChange.setBounds(0, 249, 164, 85);
		pSellFunction.add(sBtnPdChange);

		sBtnPdCancel = new JButton("\uC0C1\uD488\uCDE8\uC18C");

		sBtnPdCancel.setBackground(new Color(0, 0, 128));
		sBtnPdCancel.setForeground(new Color(255, 255, 255));
		sBtnPdCancel.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		sBtnPdCancel.setBounds(0, 333, 164, 85);
		pSellFunction.add(sBtnPdCancel);

		sBtnPdHold = new JButton("\uC0C1\uD488\uBCF4\uB958");
		sBtnPdHold.setForeground(Color.WHITE);
		sBtnPdHold.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		sBtnPdHold.setBackground(new Color(100, 149, 237));
		sBtnPdHold.setBounds(0, 416, 164, 85);
		pSellFunction.add(sBtnPdHold);

		sBtnPay = new JButton("\uACB0\uC81C");
		sBtnPay.setForeground(Color.WHITE);
		sBtnPay.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		sBtnPay.setBackground(new Color(255, 51, 0));
		sBtnPay.setBounds(0, 500, 164, 85);
		pSellFunction.add(sBtnPay);

		sBtnCancel = new JButton("\uAC70\uB798\uCDE8\uC18C");
		sBtnCancel.setForeground(Color.WHITE);
		sBtnCancel.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		sBtnCancel.setBackground(new Color(153, 0, 0));
		sBtnCancel.setBounds(0, 570, 164, 85);
		pSellFunction.add(sBtnCancel);

		pMonitor = new JPanel();
		pMonitor.setBackground(new Color(255, 255, 255));
		pMonitor.setBounds(0, 50, 1144, 535);
		contentPane.add(pMonitor);

//		카드레이아웃 지정

		pMonitor.setLayout(cardLayout);

//		패널에 이름 설정 후, 변수명 지정

		pMonitor.add("ViewSalesCustomer", viewSalesCustomer);
		pMonitor.add("ViewSalesDisuse", viewSalesDisuse);//HS
		pMonitor.add("ViewSalesInput", viewSalesInput);
		pMonitor.add("ViewSalesChange", viewSalesChange);

//		처음에 보여줄 패널 설정
		cardLayout.show(pMonitor, "Enroll");

//		각 버튼에 이벤트 등록하기
		sBtnCustomer.addActionListener(this);
		sBtnDisuse.addActionListener(this);
		sBtnPdInput.addActionListener(this);
		sBtnPdChange.addActionListener(this);
		sBtnPdCancel.addActionListener(this);
		sBtnPdHold.addActionListener(this);
		sBtnPay.addActionListener(this);
		sBtnCancel.addActionListener(this);

		viewSalesCustomer.enroll.addActionListener(this);
		viewSalesCustomer.search.addActionListener(this);
		viewSalesCustomer.delete.addActionListener(this);
////	결제1 이벤트 등록
		payment_1.btnP1Before.addActionListener(this);
		payment_1.btnP1Next.addActionListener(this);

//		결제2 이벤트 등록
		payment_2.btnP2Before.addActionListener(this);
		payment_2.btnP2Next.addActionListener(this);
		payment_2.btnP2Cancel.addActionListener(this);
		payment_2.btnP2Register.addActionListener(this);
		payment_2.btnP2Save.addActionListener(this);
		payment_2.btnP2Apply.addActionListener(this);

//		결제3 이벤트 등록
		payment_3.btnP3Before.addActionListener(this);
		payment_3.btnP3Cancel.addActionListener(this);
		payment_3.btnP3Next.addActionListener(this);

//		결제 4 이벤트 등록
		payment_4.btnP4Before.addActionListener(this);
		payment_4.btnP4Payment.addActionListener(this);
		payment_4.btnP4Cancel.addActionListener(this);
		payment_4.btnP4PrintReceipt.addActionListener(this);

//		영수증 이벤트 등록
		receipt.cancel.addActionListener(this);
		receipt.print.addActionListener(this);

//		결제 취소 이벤트 등록

		dealCancel.btnRefund.addActionListener(this);
		
		dealCancel.btnPrintRefund.addActionListener(this);

		
//******HS 폐기처리 이벤트등록**************************************************************		
		viewSalesDisuse.disuse.addActionListener(this);
//***********************************************************************************		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		if (ob == sBtnCancel) {//8거래취소버튼
			dealCancel.setVisible(true);//거래취소화면
		} else if (ob == dealCancel.btnRefund) {//거래취소화면의 환불버튼
			refundProcess();//환불메소드
		} else if (ob == dealCancel.btnPrintRefund) {//거래취소화면의 취소영수중

//************************HS폐기관리오른쪽하늘색버튼누르면**************************************************
		} else if (ob == sBtnDisuse) {	//폐기관리 버튼 
			cardLayout.show(pMonitor, "ViewSalesDisuse"); //카드레이아웃폐기화면
			showAllDisuse5();								//유효기간5일남은것을 보여줘
//**************************************************************************************************			
		} else if (ob == sBtnPdInput) {					//상품등록버튼
			cardLayout.show(pMonitor, "ViewSalesInput");
		} else if (ob == sBtnPdChange) {				//상품수정버튼
			cardLayout.show(pMonitor, "ViewSalesChange");
		}
// 		고객 검색 창 눌렀을 때 이벤트
		else if (ob == sBtnCustomer) {//고객관리버튼
			cardLayout.show(pMonitor, "ViewSalesCustomer");
			showAll();//광규가 만든 쇼올 메소드 

		} else if (ob == sBtnPay) {//결제 버튼
			payment_1.setVisible(true);//결제1 
		}

		else if (ob == viewSalesCustomer.search) {//고객관리의  조회 버튼

//			회원 검색할 때 조건
			String name;
			String cellphone;
			name = viewSalesCustomer.name.getText().trim();
			cellphone = viewSalesCustomer.cellphone.getText().trim();

			if (name.equals("") && cellphone.equals("")) {
				JOptionPane.showMessageDialog(viewSalesCustomer, "회원 이름이나 전화번호를 입력해주세요", "회원 조회 오류",
						JOptionPane.INFORMATION_MESSAGE);
			} else if (name.contentEquals("")) {
				searchNameProcess1();

			} else if (cellphone.contentEquals("")) {
				searchNameProcess();
			} else {
				searchNameProcess2();
			}

			
//						
			
		} else if (ob == sBtnPay) {				// 결제 1창 연결
			payment_1.setVisible(true);
		} else if (ob == payment_1.btnP1Before) {
			payment_1.setVisible(false);
			payment_2.setVisible(false);
			payment_4.setVisible(false);
			payment_3.setVisible(false);
		} else if (ob == payment_1.btnP1Next) {
			payment_1.setVisible(false);
			payment_2.setVisible(true);
		} else if (ob == payment_2.btnP2Before) {// 결제2 창 연결
			payment_1.setVisible(true);
			payment_2.setVisible(false);
			payment_3.setVisible(false);
			payment_4.setVisible(false);
		} else if (ob == payment_2.btnP2Next) {
			payment_3.setVisible(true);
			payment_2.setVisible(false);
		} else if (ob == payment_2.btnP2Cancel) {// 결제4창 연결
			payment_2.setVisible(false);
		} else if (ob == payment_3.btnP3Before) {
			payment_1.setVisible(false);
			payment_4.setVisible(false);
			payment_3.setVisible(false);
			payment_2.setVisible(true);

		} else if (ob == payment_3.btnP3Next) {
			payment_3.setVisible(false);
			payment_4.setVisible(true);
		} else if (ob == payment_4.btnP4Cancel) {// 결제 3창 연결
			payment_4.setVisible(false);
		} else if (ob == payment_4.btnP4Before) {
			payment_3.setVisible(true);
			payment_1.setVisible(false);
			payment_2.setVisible(false);
			payment_4.setVisible(false);
		} else if (ob == payment_4.btnP4Cancel) {
			payment_4.setVisible(false);
		} else if (ob == payment_4.btnP4Payment) {

		} else if (ob == payment_4.btnP4PrintReceipt) {
			receipt.setVisible(true);
		} else if (ob == receipt.cancel) {
			receipt.setVisible(false);
		} else if (ob == receipt.print) {
			receipt.setVisible(false);
			
//			고객관리의 등록 버튼을 누른다면
			
		} else if (ob == viewSalesCustomer.enroll) {
			enrollprocess();//등록메소드 실행!
			showAll();//다보여줘.
			
		} else if (ob.equals(viewSalesCustomer.delete)) {
			int choose = JOptionPane.showConfirmDialog(viewSalesCustomer, "회원을 삭제하시겠습니까?", "회원 삭제",
					JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
			if (choose == 0) {//확인누르면 
				deleteprocess();// 삭제 실행!
				showAll();// 다보여줘
			}
		} 
		
		
//***************************HS 폐기관리에서 폐기처리 버튼을 누른다면********************************************
		else if ( ob.equals(viewSalesDisuse.disuse)) {
			int choose = JOptionPane.showConfirmDialog(viewSalesDisuse, "폐기 처리 하시겠습니가?", "폐기 처리",
					JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
			if (choose == 0) {//확인누르면 
				deleteDisuseProcess();// 삭제 실행!
			}
		}
//*****************************************************************************************
	}

	
	
	private void refundProcess() {
		String sellId;
		sellId = dealCancel.Sell_id.getText().trim();
		salesDao.dealCancel();//Dao의 거래취소 메소드
		
	}
//광규꺼
	private void deleteprocess() {
		int row = viewSalesCustomer.tableResult.getSelectedRow();
		String phone = null;
		phone = String.valueOf((viewSalesCustomer.tmodel.getValueAt(row, 0)));
		
		salesDao.delete(phone); 
	}
	
//따라하기**************************************HS폐기프로세스******************************************
	private void deleteDisuseProcess() {
		int row = viewSalesDisuse.tableResult.getSelectedRow();//선택된 행을 담아
		
		//상품코드랑 입고날짜를 인자값으로 받아서 (재고에 입고날짜만 다른 같은상품들은 상품코드가 같아도 따로 나와야함)
		String productCode = null;//
		productCode = String.valueOf((viewSalesDisuse.tmodel.getValueAt(row, 0)));
		String inDate = null;
		//
		inDate = String.valueOf((viewSalesDisuse.tmodel.getValueAt(row, 1)));
		//
		
		int result = salesDao.deleteDisuse(productCode,inDate); 
		if(result>0) {
			showAllDisuse5();// 유통기한 5일남은 것들 리스트에 보여줘
		} 
	}
//*************************************************************************************************
	private void enrollprocess() {
		SalesDao.clearRows(viewSalesCustomer.tmodel.getRowCount(), viewSalesCustomer.tmodel);
		String name;
		String cellphone;
		name = viewSalesCustomer.name.getText().trim();
		cellphone = viewSalesCustomer.cellphone.getText().trim();
		if (!name.equals("") && !cellphone.equals("")) {
			salesDao.register(name, cellphone);
			viewSalesCustomer.name.setText("");
			viewSalesCustomer.cellphone.setText("");
			JOptionPane.showMessageDialog(viewSalesCustomer, "새로운 회원이 등록되었습니다.", "회원 등록 완료",
					JOptionPane.INFORMATION_MESSAGE);

		} else {
			JOptionPane.showMessageDialog(viewSalesCustomer, "회원 이름과 전화번호를 입력해주세요", "회원 등록 오류",
					JOptionPane.INFORMATION_MESSAGE);
		}

	}

	private void searchNameProcess() {

		SalesDao salesDao = new SalesDao();
		SalesDao.clearRows(viewSalesCustomer.tmodel.getRowCount(), viewSalesCustomer.tmodel);
		Vector<PosDto> results = new Vector<PosDto>();
		String name;

		name = viewSalesCustomer.name.getText().trim();
		results = salesDao.search(name);
		int size = results.size();
		if (size == 0) {
			JOptionPane.showMessageDialog(viewSalesCustomer, "존재하지 않는 회원입니다.", "회원 조회 오류",
					JOptionPane.INFORMATION_MESSAGE);
			return;
		}

		for (int i = 0; i < size; i++) {
			Vector<String> rows = new Vector<String>(); // 행

			rows.addElement(results.get(i).getMembershipId());
			rows.addElement(results.get(i).getMemberName());
			rows.addElement(results.get(i).getPhone());
			rows.addElement(Integer.toString(results.get(i).getPoint()));
			viewSalesCustomer.tmodel.addRow(rows);
		}

	}

	private void searchNameProcess1() {

		SalesDao salesDao = new SalesDao();
		SalesDao.clearRows(viewSalesCustomer.tmodel.getRowCount(), viewSalesCustomer.tmodel);
		Vector<PosDto> results = new Vector<PosDto>();
		String cellphone;

		cellphone = viewSalesCustomer.cellphone.getText().trim();
		results = salesDao.search1(cellphone);
		int size = results.size();
		if (size == 0) {
			JOptionPane.showMessageDialog(viewSalesCustomer, "존재하지 않는 회원입니다.", "회원 조회 오류",
					JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		for (int i = 0; i < size; i++) {
			Vector<String> rows = new Vector<String>(); // 행

			rows.addElement(results.get(i).getMembershipId());
			rows.addElement(results.get(i).getMemberName());
			rows.addElement(results.get(i).getPhone());
			rows.addElement(Integer.toString(results.get(i).getPoint()));

			viewSalesCustomer.tmodel.addRow(rows);

		}

	}

	private void searchNameProcess2() {

		SalesDao salesDao = new SalesDao();
		SalesDao.clearRows(viewSalesCustomer.tmodel.getRowCount(), viewSalesCustomer.tmodel);
		Vector<PosDto> results = new Vector<PosDto>();
		String name;
		String cellphone;

		name = viewSalesCustomer.name.getText().trim();
		cellphone = viewSalesCustomer.cellphone.getText().trim();
		results = salesDao.search2(name, cellphone);
		int size = results.size();
		if (size == 0) {
			JOptionPane.showMessageDialog(viewSalesCustomer, "존재하지 않는 회원입니다.", "회원 조회 오류",
					JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		for (int i = 0; i < size; i++) {
			Vector<String> rows = new Vector<String>(); // 행
			rows.addElement(results.get(i).getMembershipId());
			rows.addElement(results.get(i).getMemberName());
			rows.addElement(results.get(i).getPhone());
			rows.addElement(Integer.toString(results.get(i).getPoint()));
			viewSalesCustomer.tmodel.addRow(rows);

		}

	}
//광규꺼 
	private void showAll() {

		SalesDao salesDao = new SalesDao();//show all에서 쓸 dao생성
		SalesDao.clearRows(viewSalesCustomer.tmodel.getRowCount(), viewSalesCustomer.tmodel);
		//이게 뭘까? 									이데이터테이블의 행의 숫자를 가져온다.    
		Vector<PosDto> results = new Vector<PosDto>();//results 에  차곡차곡 담을꺼야.
		results = salesDao.searchAll();//모든조회를 결과에 담는다. 

		int size = results.size();

		for (int i = 0; i < size; i++) {
			Vector<String> rows = new Vector<String>(); // 행
			rows.addElement(results.get(i).getMembershipId());
			rows.addElement(results.get(i).getMemberName());
			rows.addElement(results.get(i).getPhone());
			rows.addElement(Integer.toString(results.get(i).getPoint()));
			viewSalesCustomer.tmodel.addRow(rows);
		}
	}	
//따라하기****************HS 유통기한5일 남은것들 보여줘**************************************************
	private void showAllDisuse5() {

		SalesDao salesDao = new SalesDao();
		SalesDao.clearRows(viewSalesDisuse.tmodel.getRowCount(), viewSalesDisuse.tmodel);
//		?이게머징									이데이터테이블의 행의 숫자를 가져온다.    
		Vector<PosDto> results = new Vector<PosDto>();//results 에  차곡차곡 담을꺼야.
		results = salesDao.showAllDisuse5();//모든조회를 결과에 담는다. 

		int size = results.size();

		for (int i = 0; i < size; i++) {
			Vector<String> rows = new Vector<String>(); // 행
			rows.addElement(results.get(i).getProductCode());
			rows.addElement(results.get(i).getInDate());
			rows.addElement(results.get(i).getProductName());
			rows.addElement(Integer.toString(results.get(i).getPrice()));
			rows.addElement(results.get(i).getRealExp());
			rows.addElement(Integer.toString(results.get(i).getVolume()));
			viewSalesDisuse.tmodel.addRow(rows);
		}
	}
//**************************************************************************************
		
		
		
}	
	
	
	

