package com.kitri.pos.sales;

import java.nio.channels.MembershipKey;
import java.sql.*;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;

import com.kitri.pos.sales.PosDto;
import com.kitri.pos.db.DBManager;

/*
	StatDao : 통계 DB 관련 메소드 정의
*/

public class SalesDao {

	// DB연결된 상태(세션)을 담은 객체
	Connection conn = null;

	// 쿼리문에 사용하는 state객체
	PreparedStatement ps = null;

	Statement st = null;
	ResultSet rs = null;

	// 쿼리문 결과 (1행) 담을 PosDto 객체
	PosDto posDto = null;

//	 멤버십 전체 정보를 불러오는 메소드
	public Vector<PosDto> searchAll() {
		// 쿼리문 결과 (여러 행) 담을 PosDto 객체
		Vector<PosDto> list = new Vector<PosDto>();

		try {
			// DB 연결
			conn = DBManager.getConnection();

			// 쿼리문 세팅
			String query = "select * from membership\r\n" + "order by membership_id asc";
			ps = conn.prepareStatement(query);

			// 쿼리문 실행
			rs = ps.executeQuery();
			// 결과 저장
			while (rs.next()) {

				posDto = new PosDto();

				posDto.setMembershipId(rs.getString(1));
				posDto.setMemberName(rs.getString(2));
				posDto.setPhone(rs.getString(3));
				posDto.setPoint(rs.getInt(4));

				list.add(posDto);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				// DB 연결 종료
				DBManager.dbClose(rs, ps, conn);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		// 결과 리턴
		return list;
	}

//	name만 입력하고 멤버십 조회하는 메소드
	public Vector<PosDto> search(String name) {
		// 쿼리문 결과 (여러 행) 담을 PosDto 객체

		Vector<PosDto> list = new Vector<PosDto>();

		try {
			// DB 연결
			conn = DBManager.getConnection();

			// 쿼리문 세팅
			String query = "select membership_id, name, phone, point\r\n" + "from membership\r\n" + "where name = ?";
			ps = conn.prepareStatement(query);

			ps.setString(1, name);

			// 쿼리문 실행
			rs = ps.executeQuery();
			// 결과 저장

			while (rs.next()) {

				posDto = new PosDto();

				posDto.setMembershipId(rs.getString(1));
				posDto.setMemberName(rs.getString(2));
				posDto.setPhone(rs.getString(3));
				posDto.setPoint(rs.getInt(4));

				list.add(posDto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				// DB 연결 종료
				DBManager.dbClose(rs, ps, conn);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		// 결과 리턴
		return list;
	}

//	phone만 입력하고 조회하는 메소드
	public Vector<PosDto> search1(String cellphone) {
		// 쿼리문 결과 (여러 행) 담을 PosDto 객체

		Vector<PosDto> list = new Vector<PosDto>();

		try {
			// DB 연결
			conn = DBManager.getConnection();

			// 쿼리문 세팅
			String query = "select membership_id, name, phone, point\r\n" + "from membership\r\n" + "where phone = ?";
			ps = conn.prepareStatement(query);

			ps.setString(1, cellphone);

			// 쿼리문 실행
			rs = ps.executeQuery();
			// 결과 저장

			while (rs.next()) {

				posDto = new PosDto();

				posDto.setMembershipId(rs.getString(1));
				posDto.setMemberName(rs.getString(2));
				posDto.setPhone(rs.getString(3));
				posDto.setPoint(rs.getInt(4));

				list.add(posDto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				// DB 연결 종료
				DBManager.dbClose(rs, ps, conn);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		// 결과 리턴
		return list;
	}

//		name, phone 전부로 조회하는 메소드
	public Vector<PosDto> search2(String name, String cellphone) {
		// 쿼리문 결과 (여러 행) 담을 PosDto 객체

		Vector<PosDto> list = new Vector<PosDto>();

		try {
			// DB 연결
			conn = DBManager.getConnection();

			// 쿼리문 세팅
			String query = "select membership_id, name, phone, point\r\n" + "from membership\r\n" + "where name = ?"
					+ "and phone = ?";
			ps = conn.prepareStatement(query);

			ps.setString(1, name);
			ps.setString(2, cellphone);

			// 쿼리문 실행
			rs = ps.executeQuery();
			// 결과 저장

			while (rs.next()) {

				posDto = new PosDto();

				posDto.setMembershipId(rs.getString(1));
				posDto.setMemberName(rs.getString(2));
				posDto.setPhone(rs.getString(3));
				posDto.setPoint(rs.getInt(4));

				list.add(posDto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				// DB 연결 종료
				DBManager.dbClose(rs, ps, conn);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		// 결과 리턴
		return list;
	}

//		회원정보를 입력하는 메소드	
	public int register(String name, String cellphone) {
		int result = 0;

		try {
			// DB 연결
			conn = DBManager.getConnection();

			// 쿼리문
			String query = "insert into membership values((MEMBERSHIP_ID_SEQ.NEXTVAL), ?, ?, 0)";

			// 쿼리문 실행
			ps = conn.prepareStatement(query);
			ps.setString(1, name);
			ps.setString(2, cellphone);

			// 3)쿼리문 결과

			System.out.println("쿼리문 실행");
			result = ps.executeUpdate();

			if (result > 0) {
				System.out.println("INSERT 성공");
			} else
				System.out.println("INSERT 실패");

		} catch (SQLException sqle) {
			System.out.println("INSERT");
			sqle.printStackTrace();

		} finally {
			// DB 연결 종료
			try {
				DBManager.dbClose(rs, ps, conn);
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		// 결과 리턴
		return result;
	}

	public int delete(String phone) {
		int result = 0;

		try {
			// DB 연결
			conn = DBManager.getConnection();

			// 쿼리문
			String query = "delete from membership\r\n" + "where membership_id = ?";
			ps = conn.prepareStatement(query);
			ps.setString(1, phone);
			// 쿼리문 실행

			// 3)쿼리문 결과

			result = ps.executeUpdate();
			System.out.println("쿼리문 실행");

			if (result >= 0) {
				System.out.println("DELETE 성공");
			} else
				System.out.println("DELETE 실패");

		} catch (SQLException sqle) {
			System.out.println("DELETE");
			sqle.printStackTrace();

		} finally {
			// DB 연결 종료
			try {
				DBManager.dbClose(rs, ps, conn);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	public void dealCancel() {
//		sales에서 getText한 값과 history_detail 테이블의 sell_id를 비교해서 같은 것을 delete
//		history_detail에 기록된 상품 종류와 수량 재고에 update
//		history와 연결된 membership 테이블의 point를 제거
//		sell_id를 바탕으로 history도 delete
//		

	}

	public static void clearRows(int rowCount, DefaultTableModel tmodel) {
		if (rowCount > 0) {
			for (int i = rowCount - 1; i >= 0; i--) {
				tmodel.removeRow(i);
			}
		}
	}
	
//*************************HS폐기관리 폐기처리5일전목록디비에서 연동**********************************************************************
	public Vector<PosDto> showAllDisuse5() {
		// 쿼리문 결과 (여러 행) 담을 PosDto 객체
		Vector<PosDto> list = new Vector<PosDto>();

		try {
			// DB 연결
			conn = DBManager.getConnection();

			// 쿼리문 세팅
			String query = "select product_code, to_char(in_date,'yyyy-mm-dd'), product_name, price, real_exp, volume\r\n" + 
					"from stocks\r\n" + 
					"where real_exp - in_date >= 5 and volume !=0";

			st = conn.createStatement();

			// 쿼리문 실행
			rs = st.executeQuery(query);
			// 결과 저장
			while (rs.next()) {

				posDto = new PosDto();

				posDto.setProductCode(rs.getString(1));
				posDto.setInDate(rs.getString(2));
				posDto.setProductName(rs.getString(3));
				posDto.setPrice(rs.getInt(4));
				posDto.setRealExp(rs.getString(5));
				posDto.setVolume(rs.getInt(6));

				list.add(posDto);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				// DB 연결 종료
				DBManager.dbClose(rs, ps, conn);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		// 결과 리턴
		return list;
	}
//폐기 처리 삭제를 수량0으로 수정하는 방식으로(제약조건? 때문인지 삭제를 하고싶은데 안됌. 그래서 수정update으로 수량을 0 으로 하고 수량이 0 이되면 화면단에서 안보이게 바꿈.)
	public int deleteDisuse(String productCode, String inDate) {
		int result = -1;

		try {
			// DB 연결
			conn = DBManager.getConnection();
			
			// 쿼리문						수정을한다. 수량을 0으로. 상품코드와 입고일자가 선택한 리스트와 일치한다면. 
			String query = "update stocks\r\n" + 
					"set volume = 0\r\n" + 
					"where product_code = ?\r\n" + 
					"and in_date = to_date(?)";
			ps = conn.prepareStatement(query);
			ps.setString(1, productCode);
			ps.setString(2, inDate);

			
			// 쿼리문 실행
			result = ps.executeUpdate();

			// 3)쿼리문 결과
			System.out.println("쿼리문 실행");

			if (result >= 0) {
				System.out.println("수량을 0으로 UPDATE 성공");
			} else
				System.out.println("UPDATE 실패");

		} catch (SQLException sqle) {
			System.out.println("UPDATE 오류");
			sqle.printStackTrace();

		} finally {
			// DB 연결 종료
			try {
				DBManager.dbClose(rs, ps, conn);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
//**********************************************************************************************************
	
	

}
