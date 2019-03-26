package other.model;

import android.content.Context;
import android.widget.Toast;

public class OtherModel {


    public String getdata(Context context){
        Toast.makeText(context,"model 整合数据",Toast.LENGTH_LONG).show();
        return "Other 数据模拟";
    }
}
