/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.Account;
import context.DBContext;
import Entity.Phone;
import Entity.Category;
import Entity.Order;
import Entity.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Phuong Nguyen
 */
public class dao {

    public String status;
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    private HashMap<String, Phone> hmPhone;

    public dao() {
        try {
            con = new DBContext().getConnection();
            status = "Successful";
        } catch (Exception e) {
            status = "ERROR" + e.getMessage();
        }
    }

    public List<Phone> getAll() {
        List<Phone> list = new ArrayList<>();
        String sql = "select * from HE141219_PhuongNL_Phone";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Phone(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getFloat(5),
                        rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9)));

            }
        } catch (Exception e) {
        }

        return list;
    }

    public List<Phone> getPhoneByDate() {
        List<Phone> list = new ArrayList<>();
        String sql = "SELECT * FROM HE141219_PhuongNL_Phone ORDER BY Date DESC";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Phone(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getFloat(5),
                        rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9)));

            }
        } catch (Exception e) {
        }

        return list;
    }

    public Phone getPhoneByID(String phone_ID) {
        List<Phone> list = new ArrayList<>();
        String sql = "select * from HE141219_PhuongNL_Phone\n"
                + "where phone_ID = ?";

        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, phone_ID);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Phone(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getFloat(5),
                        rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9));

            }
        } catch (Exception e) {
        }
        return null;
    }

    public Phone getAmountPhoneByID(String txt) {
        List<Phone> list = new ArrayList<>();
        String sql = "select * from HE141219_PhuongNL_Phone\n"
                + "where Phone_ID = ?";

        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, txt);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Phone(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getFloat(5),
                        rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), 1);

            }
        } catch (Exception e) {
        }
        return null;
    }

    public List<Category> getCategory() {
        List<Category> list = new ArrayList<>();
        String sql = "select * from HE141219_PhuongNL_Category";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Category(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)));

            }
        } catch (Exception e) {
        }

        return list;
    }

    public List<Phone> getPhoneByCategoryID(String cid) {
        List<Phone> list = new ArrayList<>();
        String sql = "select * from HE141219_PhuongNL_Phone\n"
                + "where Category_ID = ?";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, cid);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Phone(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getFloat(5),
                        rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9)));

            }
        } catch (Exception e) {
        }

        return list;
    }

    public Account Login(String username, String pass) {
        String sql = "select * from He141219_PhuongNL_Account\n"
                + "where UseName = ?\n"
                + "and PassWord = ?";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Account(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
            }
        } catch (Exception e) {
        }
        return null;

    }

    public Account CheckAccount(String username) {
        String sql = "select * from He141219_PhuongNL_Account\n"
                + "where UseName = ?";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, username);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Account(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
            }
        } catch (Exception e) {
        }
        return null;

    }

    public void Signup(String username, String pass) {
        String sql = "insert into He141219_PhuongNL_Account\n"
                + "values('Acc_12',?,?,'0')";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, pass);
            ps.executeUpdate();

        } catch (Exception e) {
        }
    }

    public List<Phone> Search(String txt) {
        List<Phone> list = new ArrayList<>();
        String sql = "select * from HE141219_PhuongNL_Phone\n"
                + "where [name] like ?";

        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, "%" + txt + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Phone(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getFloat(5),
                        rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9)));

            }
        } catch (Exception e) {
        }
        return list;
    }

    public void deletePhone(String pid) {
        String sql = "delete from HE141219_PhuongNL_Phone\n"
                + "where Phone_ID = ?";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, pid);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public Phone CheckPhone(String phone_ID) {
        String sql = "select * from HE141219_PhuongNL_Phone\n"
                + "where Phone_ID = ?";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, phone_ID);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Phone(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getFloat(5),
                        rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9));

            }
        } catch (Exception e) {
        }
        return null;
    }

    public void addPhone(String phone_ID, String name, String memory, int quantity, Float price,
            String image, String description, String date, String category) {
        String sql = "INSERT INTO HE141219_PhuongNL_Phone\n"
                + "VALUES(?,?,?,?,?,?,?,?,?)";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, phone_ID);
            ps.setString(2, name);
            ps.setString(3, memory);
            ps.setInt(4, quantity);
            ps.setFloat(5, price);
            ps.setString(6, image);
            ps.setString(7, description);
            ps.setString(8, date);
            ps.setString(9, category);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void editPhone(String name, String memory, int quantity, Float price,
            String image, String description, String date, String category, String phone_ID) {
        String sql = "UPDATE HE141219_PhuongNL_Phone\n"
                + "SET Name = ?,\n"
                + "Memory = ?,\n"
                + "Quantity = ?,\n"
                + "Price = ?,\n"
                + "[Image] = ?,\n"
                + "[Description] = ?,\n"
                + "[Date] = ?,\n"
                + "Category_ID = ?\n"
                + "WHERE Phone_ID = ?;";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, memory);
            ps.setInt(3, quantity);
            ps.setFloat(4, price);
            ps.setString(5, image);
            ps.setString(6, description);
            ps.setString(7, date);
            ps.setString(8, category);
            ps.setString(9, phone_ID);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public List<Phone> pagingPhone(int index) {
        List<Phone> list = new ArrayList<>();
        String sql = "SELECT * FROM HE141219_PhuongNL_Phone ORDER BY Phone_ID\n"
                + "OFFSET ? ROWS FETCH NEXT 8 ROWS ONLY;";

        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, (index - 1) * 8);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Phone(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getFloat(5),
                        rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9)));

            }
        } catch (Exception e) {
        }

        return list;
    }

    public int getNumberOfPhone() {
        String sql = "select count(*) from HE141219_PhuongNL_Phone";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return 0;
    }

    public User LoadUserInfo(String acc_ID) {

        String sql = "SELECT * FROM HE141219_PhuongNL_User\n"
                + "WHERE Acc_ID = ?";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, acc_ID);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new User(rs.getString(1), rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));

            }
        } catch (Exception e) {
        }
        return null;
    }

    public void editProfile(String name, String birthdate, String address,
            String phoneNumber, String email, String acc_ID) {
        String sql = "UPDATE HE141219_PhuongNL_User\n"
                + "SET User_Name = ?,\n"
                + "Birdth_Date = ?,\n"
                + "Address = ?,\n"
                + "Phone_Number = ?,\n"
                + "Email = ?\n"
                + "WHERE Acc_ID = ?;";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, birthdate);
            ps.setString(3, address);
            ps.setString(4, phoneNumber);
            ps.setString(5, email);
            ps.setString(6, acc_ID);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public List<Order> getOrderByAccID(String accID) {
        List<Order> list = new ArrayList<>();
        String sql = "select * from HE141219_PhuongNL_User u join HE141219_PhuongNL_Order o\n"
                + "on u.User_ID=o.User_ID join HE141219_PhuongNL_OrderDetail d on o.OrderDetail_ID = d.OrderDetail_ID\n"
                + "where Acc_ID = ?";

        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, accID);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Order(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
                        rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8),
                        rs.getString(9), rs.getString(10), rs.getString(12), rs.getString(13),
                        rs.getInt(15), rs.getFloat(16), rs.getString(17)));

            }
        } catch (Exception e) {
        }

        return list;
    }

    public void addOrder(int amount, float total, String phoneID) {
        String sql = "insert into HE141219_PhuongNL_OrderDetail\n"
                + "values('OD_10', ?, ?, 'no')\n"
                + "insert into HE141219_PhuongNL_Order\n"
                + "values('O_10', '30-03-2020', 'no', 'U_01', ?, 'OD_10')";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, amount);
            ps.setFloat(2, total);
            //ps.setString(3, userID);
            ps.setString(3, phoneID);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

//    public static void main(String[] args) {
//        dao a = new dao();
//        a.getDB();
//        System.out.println(a.status);
//        System.out.println(a.hmPhone);
//            for (Map.Entry<String, Phone> en : a.getHmPhone().entrySet()) {
//                String key = en.getKey();
//                Phone value = en.getValue();
//                System.out.println(key+value);
//            }
//    }
//    public static void main(String[] args) {
//        dao d = new dao();
//        List<Order> list = d.getOrderByAccID("Acc_01");
//        for (Order o : list) {
//            System.out.println(o);
//        }
//    }
//        public static void main(String[] args) {
//        dao d = new dao();
//        Account c = d.CheckAccount("phuongnl");
//            System.out.println(c);
//    }
}
