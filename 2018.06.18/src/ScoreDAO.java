import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
 
public class ScoreDAO {
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost/test?serverTimezone=UTC";
	private static final String USER = "test";
	private static final String PASS = "test";
 
	public Connection getConn() {
		Connection con = null;
		try {
			Class.forName(DRIVER);
			con = DriverManager.getConnection(URL, USER, PASS);
		} catch (Exception e) {
			e.printStackTrace();
		} // try - catch
		return con;
	} // getConn : ���� �޼ҵ� �ۼ�
 
	public int insertScore(ScoreDTO dto) {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		try {
			con = getConn();
			String sql = "insert into score values(?,?,?,?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getName());
			ps.setInt(2, dto.getKor());
			ps.setInt(3, dto.getEng());
			ps.setInt(4, dto.getMat());
			ps.setInt(5, dto.getTot());
			ps.setInt(6, dto.getAve());
			result = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e2) {
					e2.printStackTrace();
				} // ps try - catch
			} // ps if
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e2) {
					e2.printStackTrace();
				} // con try - catch
			} // con if
		} // try - catch - finally
		return result;
	} // insertMember : ȸ�� ������ �����ϴ� �޼ҵ�, ���� ���θ� int�� result �� ��ȯ�Ѵ�.
 
	public Vector getScore() {
		Vector data = new Vector();
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			con = getConn();
			String sql = "select * from score order by name asc";
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
 
			while (rs.next()) {
				String name = rs.getString("name");
				int kor = rs.getInt("kor");
				int eng = rs.getInt("eng");
				int mat = rs.getInt("mat");
				int tot = rs.getInt("tot");
				int ave = rs.getInt("ave");
				Vector row = new Vector();
				row.add(name);
				row.add(kor);
				row.add(eng);
				row.add(mat);
				row.add(tot);
				row.add(ave);
				data.add(row);
			} // while
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e2) {
					e2.printStackTrace();
				} // rs try - catch
			} // rs if
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e2) {
					e2.printStackTrace();
				} // ps try - catch
			} // stmt if
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e2) {
					e2.printStackTrace();
				} // con try - catch
			} // con if
		} // try - catch - finally
		return data;
	} // getScore : ����Ʈ�� �������� �޼���, ��ȸ�ؿ� �����͸� Vector�� data�� ��ȯ�Ѵ�.
 
	public int updateScore(ScoreDTO dto) {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		try {
			con = getConn();
			String sql = "update score set kor=?, eng=?, mat=?, tot=?, ave=? where name=?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, dto.getKor());
			ps.setInt(2, dto.getEng());
			ps.setInt(3, dto.getMat());
			ps.setInt(4, dto.getTot());
			ps.setInt(5, dto.getAve());
			ps.setString(6, dto.getName());
			result = ps.executeUpdate();
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e2) {
					e2.printStackTrace();
				} // ps try - catch
			} // ps if
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e2) {
					e2.printStackTrace();
				} // con try - catch
			} // con if
		} // try - catch - finally
		return result;
	} // updateScore : �� ���ڵ带 �����ϴ� �޼���, ���� ���θ� int�� result �� ��ȯ�Ѵ�.
 
	public int deleteScore(ScoreDTO dto) {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		try {
			con = getConn();
			String sql = "delete from score where name=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getName());
			result = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e2) {
					e2.printStackTrace();
				} // ps try - catch
			} // ps if
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e2) {
					e2.printStackTrace();
				} // con try - catch
			} // con if
		} // try - catch - finally
		return result;
	} // deleteScore : �� ���ڵ带 �����ϴ� �޼���, ���� ���θ� int�� result �� ��ȯ�Ѵ�.
 
} // ScoreDAO : Databse ó��