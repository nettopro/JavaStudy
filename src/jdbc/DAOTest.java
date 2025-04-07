package jdbc;

public class DAOTest {
    public static void main(String[] args) {
        DAO dao = new DAO();

        String sql = "INSERT INTO people (name, id) values (?,?)";
        System.out.println(dao.insert(sql, "Matthew McDouglas", 8));
        System.out.println(dao.insert(sql, "Bob Dolph",9));
        System.out.println(dao.insert(sql, "Jim Jow",10));

        dao.close();
    }
}
