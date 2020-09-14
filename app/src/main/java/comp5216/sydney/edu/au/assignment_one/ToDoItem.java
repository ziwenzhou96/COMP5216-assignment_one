package comp5216.sydney.edu.au.assignment_one;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.annotation.NonNull;

import java.text.DateFormat;
import java.util.Date;

@Entity(tableName = "todolist")
public class ToDoItem {
    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "toDoItemID")
    private int toDoItemID;

    @ColumnInfo(name = "toDoItemName")
    private String toDoItemName;

    @ColumnInfo(name = "toDoItemCreationDateTime")
    private String toDoItemCreationDateTime;

    @ColumnInfo(name = "toDoItemLastEditDateTime")
    private String toDoItemLastEditDateTime;

    private static DateFormat df = DateFormat.getDateTimeInstance();

    public ToDoItem(String toDoItemName){
        this.toDoItemName = toDoItemName;
        this.toDoItemCreationDateTime = ToDoItem.df.format(new Date());
        this.toDoItemLastEditDateTime = ToDoItem.df.format(new Date());
    }

    public int getToDoItemID() {
        return toDoItemID;
    }

    public void setToDoItemID(int toDoItemID) {
        this.toDoItemID = toDoItemID;
        this.toDoItemLastEditDateTime = df.format(new Date());
    }

    public String getToDoItemName() {
        return toDoItemName;
    }

    public void setToDoItemName(String toDoItemName) {
        this.toDoItemName = toDoItemName;
    }

    public String getToDoItemCreationDateTime() {
        return toDoItemCreationDateTime;
    }

    public void setToDoItemCreationDateTime(String toDoItemCreationDateTime) {
        this.toDoItemCreationDateTime = toDoItemCreationDateTime;
    }

    public String getToDoItemLastEditDateTime() {
        return toDoItemLastEditDateTime;
    }

    public void setToDoItemLastEditDateTime(String toDoItemLastEditDateTime) {
        this.toDoItemLastEditDateTime = toDoItemLastEditDateTime;
    }
}
