package us.mifeng.treelistview;

import android.content.res.AssetManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;

import us.mifeng.treelistview.adapter.TreeViewAdapter;
import us.mifeng.treelistview.bean.JsonBean;
import us.mifeng.treelistview.bean.TestBean;
import us.mifeng.treelistview.utils.JsonUtils;
import us.mifeng.treenodes.Node;
import us.mifeng.treenodes.OnTreeNodeClickListener;

public class MainActivity<T> extends AppCompatActivity {
    private TreeViewAdapter adapter;
    private String[]fileNames = {"json","spinnerjson"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findView();
        loadNetData();
    }

    private void findView() {
        ListView rootView = (ListView) findViewById(R.id.id_tree);
        adapter = new TreeViewAdapter(this,rootView);
        rootView.setAdapter(adapter);
        /*
        * 设置适配的点击事件
        * */
        adapter.setOnTreeNodeClickListener(new OnTreeNodeClickListener() {
            @Override
            public void onClick(AdapterView<?> adapterView, View view, Node node, int i) {
                Toast.makeText(MainActivity.this, node.getName(), Toast.LENGTH_SHORT).show();
            }
        });

    }
    /*
    *当有数据的时候调用
    * adapter.reloadData();此方法用来加载数据
    * */

    public void loadNetData(){
        JsonBean jsonBean = loadAssets();
        adapter.reloadData(jsonBean.getData(),jsonBean.getData().size());

//        TestBean spinnerBean = loadAssets1();
//        adapter.reloadData(spinnerBean.getData(),spinnerBean.getData().size());

    }
    /*
    * 加载assets中的数据
    * */
    public JsonBean loadAssets(){
        AssetManager manager = getAssets();
        StringBuffer sb = new StringBuffer();
        try {
            InputStream open = manager.open(fileNames[0]);
            byte[]by = new byte[1024*4];
            int len = 0;
            while ((len = open.read(by))!=-1){
                sb.append(new String(by,0,len));
            }
            open.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String str = String.valueOf(sb);
        JsonBean jsonBean = JsonUtils.jsonResult(str);
        return jsonBean;
    }

    public TestBean loadAssets1(){
        AssetManager manager = getAssets();
        StringBuffer sb = new StringBuffer();
        try {
            InputStream open = manager.open(fileNames[1]);
            byte[]by = new byte[1024*4];
            int len = 0;
            while ((len = open.read(by))!=-1){
                sb.append(new String(by,0,len));
            }
            open.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String str = sb.toString();
        TestBean jsonBean = JsonUtils.spinnerJsonResult(str);
        return jsonBean;
    }
}


