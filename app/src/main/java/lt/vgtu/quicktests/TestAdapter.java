package lt.vgtu.quicktests;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by aymeric on 05/05/15.
 */
public class TestAdapter extends ArrayAdapter<Test> {

    private List<Test> testList;
    private Context context;

    public TestAdapter(List<Test> testList, Context context) {
        super(context, R.layout.list_item, testList);
        this.testList = testList;
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.list_item, parent, false);
        }
        TextView title = (TextView) convertView.findViewById(R.id.title);
        TextView nClass = (TextView) convertView.findViewById(R.id.nclass);
        TextView teacher = (TextView) convertView.findViewById(R.id.teacher);
        Test t = testList.get(position);

        title.setText(t.getTitle());
        nClass.setText(t.getNameClass());
        teacher.setText(t.getTeacher());

        return convertView;
    }
}
