package comp5216.sydney.edu.au.assignment_one;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class ToDoItemAdapter extends BaseAdapter {
    private List<ToDoItem> mData;//定义数据。
    private LayoutInflater mInflater;//定义Inflater,加载我们自定义的布局。

    public ToDoItemAdapter(List<ToDoItem> mData, LayoutInflater mInflater) {
        this.mData = mData;
        this.mInflater = mInflater;
    }

    @Override
    public int getCount() {
        return this.mData.size();
    }

    @Override
    public Object getItem(int position) {
        return this.mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        //获得ListView中的view
        View viewToDoItem = mInflater.inflate(R.layout.view_todo_item,null);
        //获得ListItem对象
        ToDoItem toDoItem = mData.get(position);
        //获得自定义布局中每一个控件的对象。
        TextView text = (TextView) viewToDoItem.findViewById(R.id.textview_text);
        TextView dateTimeCreation = (TextView) viewToDoItem.findViewById(R.id.textview_creation_datetime);
        TextView datetimeLastEdited = (TextView) viewToDoItem.findViewById(R.id.textview_last_edited_datetime);
        //将数据一一添加到自定义的布局中。
        text.setText(toDoItem.getToDoItemName());
        dateTimeCreation.setText(toDoItem.getToDoItemCreationDateTime());
        datetimeLastEdited.setText(toDoItem.getToDoItemLastEditDateTime());
        return viewToDoItem;
    }
}
