package control.server.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "control")
public class Control {
//hibernate.hbm2ddl.auto = validate
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long id;

   /* @Column (name = "NFCTags", nullable = false, length = 20)
    private long nfc;*/

    @Column(name = "Фамилия", nullable = false, length = 50)
    private String surname;

    @Column(name = "Имя", nullable = false, length = 50)
    private String first_name;

    @Column(name = "Должность", nullable = false, length = 50)
    private String position;

    @Column(name = "ДатаПрихода", nullable = false)
    //@Temporal(TemporalType.TIMESTAMP)
    private String timeIn;

    @Column(name = "ДатаУхода", nullable = false)
   // @Temporal(TemporalType.TIMESTAMP)
    private String timeOut;

    public Control() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

  /*  public long getNfc() {
        return nfc;
    }

    public void setNfc(long nfc) {
        this.nfc = nfc;
    }
*/
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getTimeIn() {
        return timeIn;
    }

    public void setTimeIn(String timeIn) {
        this.timeIn = timeIn;
    }

    public String getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(String timeOut) {
        this.timeOut = timeOut;
    }
}
