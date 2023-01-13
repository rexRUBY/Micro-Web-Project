package todo.dto;

import java.time.LocalDate;


//모델
public class TodoDTO {
    private long tno;
    private String title;
    private LocalDate dueDate;
    private boolean finished;

    public String getTitle() {
        return title;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public boolean isFinished() {
        return finished;
    }

    public long getTno(){
        return tno;
    }

    public void setTno(long tno) {
        this.tno = tno;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    @Override
    public String toString(){
        return "TodoDTO("+
                "tno=" +
                ", title'"+title+'\''+
                ", dueDate="+dueDate+
                ", finished="+finished+
                '}';
    }
}
