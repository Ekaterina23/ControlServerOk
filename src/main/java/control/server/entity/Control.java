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

    @Column(name = "Фамилия", nullable = false, length = 50)
    private String surname;

    @Column(name = "Имя", nullable = false, length = 50)
    private String first_name;

    @Column(name = "Должность", nullable = false, length = 50)
    private String position;

    @Column(name = "Дата", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date conlrolDate;

    public Control() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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

    public Date getConlrolDate() {
        return conlrolDate;
    }

    public void setConlrolDate(Date conlrolDate) {
        this.conlrolDate = conlrolDate;
    }
}
