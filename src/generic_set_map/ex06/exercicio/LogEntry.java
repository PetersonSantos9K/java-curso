package generic_set_map.ex06.exercicio;

import org.jetbrains.annotations.NotNull;

import java.util.Date;
import java.util.Objects;

public class LogEntry implements Comparable<LogEntry>{

    private String userName;
    private Date moment;

    public LogEntry(String userName, Date moment) {
        this.userName = userName;
        this.moment = moment;
    }

    public String getUserName() {
        return userName;
    }

    public Date getMoment() {
        return moment;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        LogEntry logEntry = (LogEntry) o;
        return Objects.equals(userName, logEntry.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(userName);
    }

    @Override
    public int compareTo(@NotNull LogEntry o) {
        return userName.compareTo(o.userName);
    }
}
