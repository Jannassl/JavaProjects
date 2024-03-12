package Entity;
import jakarta.persistence.*;
@Entity
@Table(name="currencies")
public class Converter {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
@Column(name = "abbreviation")
    private String abbreviation;
@Column(name = "name")
    private String name;
@Column(name = "conversion_rate")
    private double conversion_rate;

    public Converter(String abbreviation, String name, double Conversion_rate) {
        super();
        this.abbreviation = abbreviation;
        this.name = name;
        this.conversion_rate = Conversion_rate;
    }
    public Converter(){

    }

    public String getAbbreviation() {
        return abbreviation;
    }
    public void setAbbreviation(String abbreviation) {
            this.abbreviation = abbreviation;
        }

    public String getName() {
            return name;
        }

    public void setName(String name) {
            this.name = name;
        }

    public double getConversion_rate() {
            return conversion_rate;
        }

    public void setConversion_rate(double Conversion_rate) {
            this.conversion_rate = Conversion_rate;
        }
}