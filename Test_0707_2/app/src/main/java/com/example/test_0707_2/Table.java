package com.example.test_0707_2;

import java.util.ArrayList;
import java.util.List;

public class Table {
    public static List<Row> getData() {
        List<Row> result = new ArrayList();
        result.add(new Row("刘德华", R.drawable.liu));
        result.add(new Row("张学友", R.drawable.zhang));
        result.add(new Row("蔡依林", R.drawable.cai));
        result.add(new Row("周杰伦", R.drawable.zhouj));
        result.add(new Row("成龙", R.drawable.cheng));
        result.add(new Row("周华健", R.drawable.zhouhj));
        result.add(new Row("郎朗", R.drawable.lang));
        result.add(new Row("汤唯", R.drawable.tang));
        result.add(new Row("周冬雨", R.drawable.zhoud));
        result.add(new Row("董卿", R.drawable.dong));
        result.add(new Row("赵薇", R.drawable.zhaow));
        return result;
    }

    public static List<Row> getData_grid() {
        List<Row> result = new ArrayList();
        result.add(new Row("刘德华_fanclub", R.drawable.liu));
        result.add(new Row("张学友_fanclub", R.drawable.zhang));
        result.add(new Row("蔡依林_fanclub", R.drawable.cai));
        result.add(new Row("周杰伦_fanclub", R.drawable.zhouj));
        result.add(new Row("成龙_fanclub", R.drawable.cheng));
        result.add(new Row("周华健_fanclub", R.drawable.zhouhj));
        result.add(new Row("郎朗_fanclub", R.drawable.lang));
        result.add(new Row("汤唯_fanclub", R.drawable.tang));
        result.add(new Row("周冬雨_fanclub", R.drawable.zhoud));
        result.add(new Row("董卿_fanclub", R.drawable.dong));
        result.add(new Row("赵薇_fanclub", R.drawable.zhaow));
        return result;
    }

}
