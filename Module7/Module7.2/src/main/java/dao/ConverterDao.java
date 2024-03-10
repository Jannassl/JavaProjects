package dao;
import model.Converter;

import java.io.IOException;
import java.sql.*;
import datasource.MariaDbConnection;

import javax.xml.transform.Result;
import java.util.*;

public class ConverterDao {
    public double getCurrency(String abbreviation) {
        Connection conn = MariaDbConnection.getConnection();
        String sql = "SELECT conversion_rate from currencies WHERE abbreviation=?";
        double result = 0.0;


        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,abbreviation);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                result = rs.getDouble("Conversion_rate");

            }

        }catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
    public List<String> getAllCurrencies(){
        Connection conn = MariaDbConnection.getConnection();
        String sql = "SELECT abbreviation FROM currencies";
        List<String> currencies = new ArrayList<>();

        try {
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery(sql);
            while(rs.next()){
                String currency = rs.getString(1);
                currencies.add(currency);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return currencies;
    }
}
